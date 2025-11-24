/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseservice;

import backend.Certificate;
import backend.Course;
import backend.JsonDataBaseManager;
import backend.Student;
import java.util.Date;
import java.util.List;
/**
 *
 * @author zeyad
 */
public class CertificateService {
    public static Certificate generateCertificate(String courseID, Student student){
        boolean isCompleted = ProgressService.isCourseCompleted(student.getUserId(), courseID);
        if(!isCompleted)
            return null;
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
    public static Certificate getStudentCertificateByID(Student student, String certID){
        List<Certificate> certs = getStudentCertificates(student);
        for(Certificate cert : certs){
            if(cert.getCertificateID().equals(certID))
                return cert;
        }
        return null;
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
}
