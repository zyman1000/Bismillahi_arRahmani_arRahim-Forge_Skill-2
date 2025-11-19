package backend;

import java.util.*;

public class Lesson extends AbstractDisplay{

    private String content;
private List<String> resources;

    public Lesson() {

        resources = new ArrayList<>();
    }

    //setters w getters

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

