/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author 20115
 */
public class Option {
    private int id;
    private String option;
    private boolean isCorrect;
    
    public Option(int id,String s,boolean iss)
    {
        this.id = id;
        this.option = s;
        this.isCorrect = iss; 
    }
    
    public Option()
    {
        
    }
    
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    
    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
    
}
