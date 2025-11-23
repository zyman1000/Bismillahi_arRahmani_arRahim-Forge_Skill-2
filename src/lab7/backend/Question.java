/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;


import java.util.*;
public class Question {
    private int id;
    private String questionText;
    private List<Option> options;
    private int score;
    
    public Question (int id,String q,List<Option> o,int score)
    {
        this.id = id;
        this.options = o;
        this.questionText = q;
        this.score = score;
    }
    
        // Getter & Setter for id,score
    public int getId() {
        return id;
    }
    
    public int getScore() {
        return score;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setScore(int newscore) {
        this.score = newscore;
    }

    // Getter & Setter for questionText
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    // Getter & Setter for options
    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
    
    
    
}
