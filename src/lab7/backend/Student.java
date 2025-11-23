
package backend;

import services.UserService;
import java.util.List;
import java.util.*;
public class Student extends User {
      private List<String> courses;
      private List<progress> progressList;
    //  private List<StudentQuizRecord> quizRecords = new ArrayList<>();
      
    //************************************************************************//
   public Student(String id, String name, String email, String pass,List<String> courses, List<progress> progressList) 
    {
        super(id, name, email, pass, UserService.StudentRole);
        this.courses =  new ArrayList<>(courses);
        this.progressList = progressList;
    }
   public Student(String id, String name, String email, String pass) 
    {
        super(id, name, email, pass, UserService.StudentRole);
        this.courses =  new ArrayList<>();
        this.progressList = new ArrayList<>();
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
    
    
    

  /*  public void addQuizRecord(StudentQuizRecord record) {
    quizRecords.add(record);
}
    
    public List<StudentQuizRecord> getQuizRecords() {
    return quizRecords;
}
    
    public int getAttemptsForQuiz(Quiz quiz) {
        int count = 0;
        for (StudentQuizRecord r : quizRecords) {
            if (r.getQuiz().getId() == quiz.getId()) {
                count++;
            }
        }
        return count;
    }*/
}