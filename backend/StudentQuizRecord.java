package backend;
import java.util.Set;
import java.util.HashSet;

public class StudentQuizRecord {
    
    
    private Lesson lesson;//want id
    private Quiz quiz;
    private double score;//to double
    private boolean passed;//want as it
    private int passScoreAtAttempt;   
    private int numberOfTryAtAttempt; 
   
    // nprivate Lesson lesson;

    public StudentQuizRecord(Lesson lesson, double score, boolean passed) {
        
        this.lesson = lesson;
        this.quiz = lesson.getQuiz();
        this.score = score;
        this.passed = passed;
        this.passScoreAtAttempt = quiz.getPassScore();
        this.numberOfTryAtAttempt = quiz.getNumberOfTry();
       
    }
    
    
    public StudentQuizRecord(Lesson lesson) {
        this.lesson = lesson;
        this.quiz = lesson.getQuiz();
       
        this.score = -1;
        this.passed = false;
        
        
                this.passScoreAtAttempt = quiz.getPassScore();
        this.numberOfTryAtAttempt = quiz.getNumberOfTry();
        
        
    }

    public String getLessonId() {//tmam bezn allah
        return lesson.getId();
    }
    
    public void complete(int score, boolean passed) {
        this.score = score;
        this.passed = passed;
        
       
    }
    

    public Quiz getQuiz() {
        return quiz;
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

