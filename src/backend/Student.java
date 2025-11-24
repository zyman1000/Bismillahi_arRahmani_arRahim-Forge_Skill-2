
package backend;

import databaseservice.UserService;
import java.util.List;
import java.util.*;
public class Student extends User {
      private List<String> courses;
      private List<progress> progressList;
      private List<Certificate> certificates;
      //**********************************************************************//
   public Student(String id, String name, String email, String pass,List<String> courses, List<progress> progressList, List<Certificate> certificates) 
    {
        super(id, name, email, pass, UserService.StudentRole);
        this.courses =  new ArrayList<>(courses);
        this.progressList = progressList;
        this.certificates = certificates;
    }
   public Student(String id, String name, String email, String pass) 
    {
        super(id, name, email, pass, UserService.StudentRole);
        this.courses =  new ArrayList<>();
        this.progressList = new ArrayList<>();
        this.certificates = new ArrayList<>();
    }
    
    public String getRole()
    {
              return role;
    }
    public List<String> getCourses()
    {
        return new ArrayList<>(courses); 
    }
    
    public void setCourses(List<String> courses) 
    {
        this.courses =  new ArrayList<>(courses);
    }   
    public  List<progress> getProgress() 
    {
        return  progressList;
    }
    public void setProgress( List<progress> progressList) 
    {
        this.progressList =  progressList;
}
    public progress getProgressForCourse(String courseId) {
        for (progress p : progressList) {
            if (p.getCourseId().equals(courseId)) {
                return p;
            }
        }
        
        progress newProgress = new progress(courseId);
        progressList.add(newProgress);
        return newProgress;
    }
    public List<Certificate> getCertificates(){
        return this.certificates;
    }
    public void addCertificate(Certificate certificate){
        this.certificates.add(certificate);
    }
}
