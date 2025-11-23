/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import backend.Certificate;
import backend.Course;
import backend.Student;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
        Date today = new Date();
        String current_date = today.toString();
        Certificate result = new Certificate(student.getUserId(), courseID, UserService.generateID(), current_date);
        student.addCertificate(result);
        System.out.println("ok:" + result.getstudentID());
        return result;
    }
    public static List<Certificate> getStudentCertificates(Student student){
        return student.getCertificates();
    }
    public static String[] getCertificateData(Certificate certificate){
//        List<String> result = new ArrayList<>();
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
    public static void savePDF(Certificate certificate, String data[]) throws IOException{
        String courseID = certificate.getcourseID();
        CourseService service = new CourseService();
        Course c = service.getCoursebyid(courseID);
        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);
        PDDocumentInformation pdd = document.getDocumentInformation();
//        PDPageContentStream contentStream = new PDPageContentStream(document, page);
//        contentStream.beginText();
        PDType0Font fontObject = PDType0Font.load(document, new File("fonts/Arial.ttf"));
//        contentStream.setFont(fontObject, 12);
//        contentStream.newLineAtOffset(25, 750);
//        contentStream.showText("This is a certificate!");
//        contentStream.endText();
//        contentStream.close();
        pdd.setAuthor(UserService.getUserByID(c.getInstructorId()).getUsername());
        pdd.setCreator("skill forge certificate service");
        pdd.setProducer("pdfbox library");
        pdd.setSubject("certificate award");
        pdd.setTitle("Certificate award");
        
        //adding image
        PDImageXObject pdImage = PDImageXObject.createFromFile("src/img/certificate.png", document);
        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        contentStream.drawImage(pdImage, 0, 0, 612, 792);
        contentStream.beginText();
        contentStream.setFont(fontObject, 12);
        float pos[] = inchToPoint(3.5, 2.2);
        contentStream.newLineAtOffset(pos[0], pos[1]);
        contentStream.showText("YOOOOOOOOOOOO");
        contentStream.endText();
        contentStream.close();
        document.save("src/test.pdf");
        document.close();
        
    }
    
}
