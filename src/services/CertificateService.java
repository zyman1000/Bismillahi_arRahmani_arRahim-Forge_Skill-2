/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import backend.Certificate;
import backend.Course;
import backend.JsonDataBaseManager;
import backend.Student;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import org.apache.fontbox.*;
import org.apache.pdfbox.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.PDTrueTypeFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts.FontName;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.xmpbox.*;
/**
 *
 * @author zeyad
 */
public class CertificateService {
    public static Certificate generateCertificate(String courseID, Student student){
        //check if course has been completed
        List<Certificate> certs = getStudentCertificates(student);
        for(Certificate cert : certs){
            if(cert.getstudentID().equals(student.getUserId()) && cert.getcourseID().equals(courseID))
                return cert;
        }
        Date today = new Date();
        String current_date = today.toString();
        Certificate result = new Certificate(student.getUserId(), courseID, UserService.generateID(), current_date);
        student.addCertificate(result);
        JsonDataBaseManager.updateUser(student);
        return result;
    }
    public static List<Certificate> getStudentCertificates(Student student){
        return student.getCertificates();
    }
    public static String[] getCertificateData(Certificate certificate){
        String result[] = new String[6];
        CourseService service = new CourseService();
        Course c = service.getCoursebyid(certificate.getcourseID());
        String InstructorID = c.getInstructorId();
        String studentID = certificate.getstudentID();
        System.out.println(studentID);
        result[0] = UserService.getUserByID(studentID).getUsername();
        result[1] = c.getTitle();
        result[2] = certificate.getcourseID();
        result[3] = UserService.getUserByID(InstructorID).getUsername();
        result[4] = certificate.getissueDate();
        result[5] = certificate.getCertificateID();
        return result;
    }
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
//        document.save("src/test.pdf");
        document.save(savePath);
        document.close();   
    }
}
