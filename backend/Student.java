package backend;

import com.google.gson.annotations.SerializedName;
import databaseservice.UserService;
import java.util.List;
import java.util.*;

public class Student extends User {

    private List<String> courses;
    @SerializedName("progress")
    private List<progress> progressList = new ArrayList<>();
    //**********************************************************************//

    public Student(String id, String name, String email, String pass, List<String> courses, List<progress> progressList) {
        super(id, name, email, pass, UserService.StudentRole);
        this.courses = new ArrayList<>(courses);
        this.progressList = progressList;
    }

    public Student(String id, String name, String email, String pass) {
        super(id, name, email, pass, UserService.StudentRole);
        this.courses = new ArrayList<>();
        this.progressList = new ArrayList<>();
    }

    public String getRole() {
        return role;
    }

    public List<String> getCourses() {
        return new ArrayList<>(courses);
    }

    public void setCourses(List<String> courses) {
        this.courses = new ArrayList<>(courses);
    }

    public List<progress> getProgress() {
        return progressList;
    }

    public void setProgress(List<progress> progressList) {
        this.progressList = progressList;
    }
}
