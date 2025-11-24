/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseservice;

import backend.Certificate;
import backend.Course;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

/**
 *
 * @author zeyad
 */
public class PDFService {
    private static float[] inchToPoint(double x, double y){
        float result[] = new float[2];
        result[0] = (float) x * 72;
        result[1] = 792 - (float) (y + 3.9) * 72;
        return result;
    }
    private static void addPDFLine(PDPageContentStream Stream, PDType0Font fontObject, double x, double y, String text) throws IOException{
        Stream.beginText();
        Stream.setFont(fontObject, 15);
        float pos[] = inchToPoint(x, y);
        Stream.newLineAtOffset(pos[0], pos[1]);
        Stream.showText(text);
        Stream.endText();
    }
    private static String getFilePath(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Where do you want to save the PDF?");
        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String savePath = fileChooser.getSelectedFile().getAbsolutePath();
            String extension = savePath.substring(savePath.length() - 4);
            if(!extension.equals(".pdf"))
                savePath += ".pdf";
            return savePath;
        }
        return null;
    }
    public static void savePDF(Certificate certificate, String data[]) throws IOException{
        String courseID = certificate.getcourseID();
        CourseService service = new CourseService();
        Course c = service.getCoursebyid(courseID);
        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);
        PDDocumentInformation pdd = document.getDocumentInformation();
        PDType0Font fontObject = PDType0Font.load(document, new File("fonts/Arial.ttf"));
        pdd.setAuthor(UserService.getUserByID(c.getInstructorId()).getUsername());
        pdd.setCreator("skill forge certificate service");
        pdd.setProducer("pdfbox library");
        pdd.setSubject("certificate award");
        pdd.setTitle("Certificate award");
        
        //adding image
        PDImageXObject pdImage = PDImageXObject.createFromFile("src/img/certificate.png", document);
        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        contentStream.drawImage(pdImage, 0, 0, 612, 792);
        addPDFLine(contentStream, fontObject, 2.11, 1.17, data[0]);
        addPDFLine(contentStream, fontObject, 3.5, 2.2, data[1]);
        addPDFLine(contentStream, fontObject, 3.5, 2.77, data[2]);
        addPDFLine(contentStream, fontObject, 2.31, 4.55, data[3]);
        addPDFLine(contentStream, fontObject, 3.41, 5.3, data[4]);
        addPDFLine(contentStream, fontObject, 2, 6.6, data[5]);
        contentStream.close();
        String savePath = getFilePath();
        if(savePath != null)
            document.save(savePath);
        document.close();   
    }
}
