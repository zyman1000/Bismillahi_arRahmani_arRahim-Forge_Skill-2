/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.*;
public class Quiz {
    private int id;
    private List<Question> questions;
   // private Lesson lesson;
    private int passScore;
    private int numberOfTry;
    private String courseId;
    
    public Quiz(int id, List<Question> questions, int passScore, int numberOfTry) {
        this.id = id;
        this.questions = questions;
       ;
        this.passScore = passScore;
        this.numberOfTry = numberOfTry;
    }
    
    
    public Quiz()
    {
        
    }
    public String getCourseId() { return courseId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }
    // Getter & Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter & Setter for questions
    public List<Question> getQuestions() {
        return questions;
    }
    
    
    public void addQuestion(Question q) {
    if (questions == null) {
        questions = new ArrayList<>();
    }
    questions.add(q);
}

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    // Getter & Setter for lesson
  /*  public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }*/

    // Getter & Setter for passScore
    public int getPassScore() {
        return passScore;
    }

    public void setPassScore(int passScore) {
        this.passScore = passScore;
    }

    // Getter & Setter for numberOfTry
    public int getNumberOfTry() {
        return numberOfTry;
    }

    public void setNumberOfTry(int numberOfTry) {
        this.numberOfTry = numberOfTry;
    }
    
}
