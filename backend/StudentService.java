/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.List;
import java.io.*;
import java.util.*;
public class StudentService 
{
    private List <Student> studentlist;
    //************************************************************************//
    public StudentService(List<Student> studentlist)
    {
          this.studentlist = new ArrayList<>(studentlist);
    }
    //************************************************************************//
    public StudentService()
    {
        List<User> users = JsonDataBaseManager.getUsers();
        this.studentlist = new ArrayList<>();
        for(int i = 0; i < users.size(); i++){
            if(users.get(i) instanceof Student){
                studentlist.add((Student) users.get(i));
            }
        }
    }  
    //************************************************************************//
    public int studentEnrollment(Student s, String ID) {
        
    if (s.getCourses().contains(ID)) {  
        return 0;
    }
    Course c = getCoursebyid(ID);
    if (c == null) return -1; 

    List<String> currentCourses = s.getCourses();
    
    currentCourses.add(c.getId());
    
    s.setCourses(currentCourses);

    c.addStudent(s);

    List<progress> progressList = s.getProgress();

    boolean exists = false;
    for (progress p : progressList) {
        if (p.getCourseId().equals(c.getId())) {
            exists = true;
            break;
        }
    }

    if (!exists) {
        progress newProgress = new progress(c.getId());
        progressList.add(newProgress);
        s.setProgress(progressList);
    }

    JsonDataBaseManager.updateUser(s);
    JsonDataBaseManager.updateCourse(c);

    return 1;
}
    //************************************************************************//
public int lessonAccess(Student s, Course c, Lesson l) {

      /*  if (!s.getCourses()) {
             System.out.print("                                        hfgh");
            return 0;
             
        }*/
     
        System.out.print("hfgh");

        progress courseProgress = null;

        for (progress p : s.getProgress()) {
            if (p.getCourseId().equals(c.getId())) {
                courseProgress = p;
                break;
            }
        }

        if (courseProgress == null) {
            return 0;
        }

        courseProgress.completeLesson(l.getId());

        JsonDataBaseManager.updateUser(s);

        return 1;
    }
 //***************************************************************************//
public double getCourseProgressPercentage(Student s, String courseId) {
 
    if (!s.getCourses().contains(courseId)) {
        return 0.0;
    }

    
    List<progress> progressList = s.getProgress();
    progress courseProgress = null;

    for (progress p : progressList) {
        if (p.getCourseId().equals(courseId)) {
            courseProgress = p;
            break;
        }
    }

    if (courseProgress == null) {
        return 0.0;
    }

    int completed = courseProgress.getCompletedCount();

   
    Course c = getCoursebyid(courseId);  

    if (c == null) {
        return 0.0;
    }

    int totalLessons = c.getLessons().size();

    if (totalLessons == 0) {
        return 0.0;
    }

    return (completed * 100.0) / totalLessons;
}
//****************************************************************************//
    
    public Course getCourseById(Student s,String courseId) {
        
    
    if (!s.getCourses().contains(courseId)) {
        System.out.print("NO 127");
        return null; 
       
    }

    
    return getCoursebyid(courseId);  
}
    public List<Course> getAllAvailableCourses() {
    List<Course> courses = JsonDataBaseManager.getCourses();

    if (courses == null)
        return new ArrayList<>();
    
    
    return new ArrayList<>(courses);
}
    
     public Course getCoursebyid(String courseId) {
        List<Course> courses = JsonDataBaseManager.getCourses();
        for (Course c : courses) {
            if (c.getId().equals(courseId)) {
                return c;
            }
        }
    
    return null; 
    
    
    
    
}   
  
     
     public User getStudentbyid(String studentId) {
        List<User> students = JsonDataBaseManager.getUsers();
        for (User c : students) {
            if (c.getUserId().equals(studentId)) {
                return (Student) c;
            }
        }
    
    return null; 
    
    
    
    
}      
     
     
     public progress getProgressByCourseId(List<progress> progressList, String courseId) {
    if (progressList == null || courseId == null) {
        return null;
    }

    for (progress p : progressList) {
        if (p.getCourseId().equals(courseId)) {
            return p;
        }
    }

    return null; 
}
     
    


}
