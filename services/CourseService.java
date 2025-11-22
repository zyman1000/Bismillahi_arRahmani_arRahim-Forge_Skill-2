package services;
import backend.*;
import java.util.*;

public class CourseService {

    public void createCourse(String title, String description, Instructor instructor) {
        Course newCourse = new Course();
        newCourse.setTitle(title);
        newCourse.setDescription(description);
        newCourse.setInstructorId(instructor.getUserId());
        if (newCourse.getId() == null || newCourse.getId().isEmpty()) {
            newCourse.setId(java.util.UUID.randomUUID().toString());
        }
        JsonDataBaseManager.addCourse(newCourse);
        instructor.addCourse(newCourse);
    }

    public void editCourse(String courseId, String title, String description) {
        for (Course c : JsonDataBaseManager.getCourses()) {
            if (c.getId().equals(courseId)) {
                c.setTitle(title);
                c.setDescription(description);
                JsonDataBaseManager.updateCourse(c);
                return;
            }
        }
    }
    
    public void deleteLesson(String courseId, String lessonId) {
   
    List<Course> courses = JsonDataBaseManager.getCourses();
    
    for (Course c : courses) {
        if (c.getId().equals(courseId)) { 
            Lesson toRemove = null;
            
            
            for (Lesson l : c.getLessons()) {
                if (l.getId().equals(lessonId)) {
                    toRemove = l;
                    break;
                }
            }
            
            
            if (toRemove != null) {
                c.getLessons().remove(toRemove);
                JsonDataBaseManager.updateCourse(c); 
            }
            return; 
        }
    }
}
    
    public void deleteCourse(String courseId, Instructor instructor){
        JsonDataBaseManager.deleteCourse(courseId);
        instructor.removeCourse(courseId);
    }
    
    public void addLesson(String courseId, Lesson l) {
            if (l.getId() == null || l.getId().isEmpty()) {
        l.setId(java.util.UUID.randomUUID().toString());
              }
        for (Course c : JsonDataBaseManager.getCourses()) {
            if (c.getId().equals(courseId)) {
                c.getLessons().add(l);
                
                JsonDataBaseManager.updateCourse(c);
                return;
            }
        }
    }

    public void editLesson(String courseId, String lessonId, String newTitle, String newContent, List<String> newResources) {
        for (Course c : JsonDataBaseManager.getCourses()) {
            if (c.getId().equals(courseId)) {
                Lesson l = c.getLessonById(lessonId); 
                if (l != null) {
                    l.setTitle(newTitle);
                    l.setContent(newContent);
                    l.setResources(newResources);
                    JsonDataBaseManager.updateCourse(c);
                }
                return;
            }
        }
    }

    public List<Course> getCoursesByInstructor(Instructor instructor) {

        return instructor.getCourses();
    }

    public List<Lesson> getLessonsByCourse(String courseId) {
        for (Course c : JsonDataBaseManager.getCourses()) {
            if (c.getId().equals(courseId)) {
                return c.getLessons();
            }
        }
        return new ArrayList<>();
    }

    public void enrollStudent(String courseId, String studentId) {
        for (Course c : JsonDataBaseManager.getCourses()) {
            if (c.getId().equals(courseId)) {
                if (!c.getStudents().contains(studentId)) {
                    c.getStudents().add(studentId);
                    JsonDataBaseManager.updateCourse(c);
                }
                return;
            }
        }
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
    public static List<Course> getCourseByStatus(String status){
        if(!status.equals(Course.ACCEPTED) && !status.equals(Course.PENDING)){
            System.out.println("invalid course state");
            return null;
        }
        List<Course> courses = JsonDataBaseManager.getCourses();
        List<Course> returnResult = new ArrayList<>();
        for(Course c : courses){
            if(c.getApprovalStatus().equals(Course.PENDING)){
                returnResult.add(c);
            }
        }
        return returnResult;
    }
    private static void modifyCourseStatus(String courseID, String status){
       List<Course> courses = JsonDataBaseManager.getCourses();
       for(Course c : courses){
           if(c.getId().equals(courseID)){
               c.setApprovalStatus(status);
               return;
           }
       }
    }
    public static void AcceptCourse(String courseID){
       modifyCourseStatus(courseID, Course.ACCEPTED);
    }
    public static void rejectCourse(String courseID){
        modifyCourseStatus(courseID, Course.REJECTED); 
    }
}
