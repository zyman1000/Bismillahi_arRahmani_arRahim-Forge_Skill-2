/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;


public class StudentAnswer {
    private Question question;
    private Option selectedOption;    
    
    public StudentAnswer(Question question, Option selectedOption) {
        this.question = question;
        this.selectedOption = selectedOption;
    }

    // Getter & Setter for question
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    // Getter & Setter for selectedOption
    public Option getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(Option selectedOption) {
        this.selectedOption = selectedOption;
    }
}
