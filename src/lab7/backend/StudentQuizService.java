/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.*;
public class StudentQuizService {
    private Student student;
    private Quiz quiz;
    private List<StudentAnswer> answers;
    private double score;
    private boolean passed;
    
   


    // Constructor
    public StudentQuizService(Student student, Quiz quiz, List<StudentAnswer> answers,StudentQuizRecord attempt) {
        this.student = student;
        this.quiz = quiz;
        this.answers = answers;
       
        calculateScore(attempt);
    }

    
   /* public void calculateScore() {
    int totalMarks = 0;
    int correctCount = 0;    
    for (Question q : quiz.getQuestions()) {
        totalMarks += q.getScore(); 
    }
        
       
        for (StudentAnswer ans : answers) {
            if (ans.getSelectedOption().isCorrect()) {
                correctCount = correctCount + ans.getQuestion().getScore();
            }
        }
        score = (correctCount * 100) / totalMarks;
        
        
        passed = score >= quiz.getPassScore();
    }*/
    public void calculateScore(StudentQuizRecord attempt) {
    int totalMarks = 0;
    int correctMarks = 0;

    for (Question q : quiz.getQuestions()) {
        totalMarks += q.getScore();
    }

    for (StudentAnswer ans : answers) {
        if (ans.getSelectedOption().isCorrect()) {
            correctMarks += ans.getQuestion().getScore();
        }
    }

    score = (correctMarks * 100) / totalMarks;

    
    passed = score >= attempt.getPassScoreAtAttempt();
}

    
    
    public double getScore() {
        return score;
    }

    public boolean isPassed() {
        return passed;
    }

  

    public Student getStudent() {
        return student;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public List<StudentAnswer> getAnswers() {
        return answers;
    }
    
}
