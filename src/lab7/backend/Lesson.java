package backend;

import java.util.*;

public class Lesson extends AbstractDisplay {

    private String content;
    private List<String> resources;
    private Quiz quiz;

    public Lesson() {

        resources = new ArrayList<>();
    }

    //setters w getters
    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
    
    
    public boolean hasQuiz() {
        return quiz != null;
    }
    
    
    
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getResources() {
        return resources;
    }

    public void setResources(List<String> resources) {
        this.resources = resources;
    }
}
