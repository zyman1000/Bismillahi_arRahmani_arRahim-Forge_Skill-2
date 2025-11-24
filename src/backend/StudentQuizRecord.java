package backend;
import java.util.Set;
import java.util.HashSet;
import databaseservice.*;
public class StudentQuizRecord {
    
    
  //  private Lesson lesson;//want id
    private String lessonID;
  //  private Quiz quiz;
    private double score;//to double
    private boolean passed;//want as it
    private int passScoreAtAttempt;   
    private int numberOfTryAtAttempt; 
   
    // nprivate Lesson lesson;

    public StudentQuizRecord(Lesson lesson, double score, boolean passed) {
      
        this.lessonID = lesson.getId();
        
    //    this.lesson = lesson;
     //   this.quiz = lesson.getQuiz();
        this.score = score;
        this.passed = passed;
        Quiz quiz = lesson.getQuiz();
        this.passScoreAtAttempt = quiz.getPassScore();
        this.numberOfTryAtAttempt = 0;
       
    }
    
    
    public StudentQuizRecord(Lesson lesson) {
        Quiz quiz = lesson.getQuiz();
     //   this.lesson = lesson;
        this.lessonID = lesson.getId();
        
       
        this.score = -1;
        this.passed = false;
        
        
                this.passScoreAtAttempt = quiz.getPassScore();
        this.numberOfTryAtAttempt = 0;
        
        
    }

    public String getLessonId() {//tmam bezn allah
        return lessonID;
    }
    
    public void complete(Student student,double score, boolean passed) {
        this.score = score;
        this.passed = passed;
           
    
        this.numberOfTryAtAttempt++;
    

   
    JsonDataBaseManager.updateUser(student);
        
       
    }
    
    
 
    

    

    public Quiz getQuiz(String courseID) {
        Lesson lesson = getLesson(courseID);
        return lesson.getQuiz();
    }
    
    public Lesson getLesson(String courseID)
    {
        CourseService courseService = new CourseService();
        Lesson lesson = courseService.getLessonById(courseID, lessonID);
        return lesson;
    }
    
    public double getScore() {//tmam bezn allah
        return score;
    }

    public boolean isPassed() {//tmam bezn allah
        return passed;
    }
    
    public int getPassScoreAtAttempt() {
        return passScoreAtAttempt; 
    }
    
    public int getNumberOfTryAtAttempt() { 
        return numberOfTryAtAttempt; 
    }
    
}

