  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.util.Set;
import java.util.HashSet;
public class StudentQuizRecord {
    
    
    private Lesson lesson;
    private Quiz quiz;
    private double score;
    private boolean passed;
    private double passScoreAtAttempt;   
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
    
    
    public void complete(double score, boolean passed) {
        this.score = score;
        this.passed = passed;
        
       
    }
    
    public Lesson getLesson()
    {
        return lesson;
    }
    

    public Quiz getQuiz() {
        return quiz;
    }

    public double getScore() {
        return score;
    }

    public boolean isPassed() {
        return passed;
    }
    
    public double getPassScoreAtAttempt() {
        return passScoreAtAttempt; 
    }
    
    public int getNumberOfTryAtAttempt() { 
        return numberOfTryAtAttempt; 
    }
    
}
