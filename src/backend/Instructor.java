package backend;

import databaseservice.UserService;
import java.util.List;
import java.util.*;

public class Instructor extends User {

    private transient List<Course> courses;

    public Instructor(String id, String name, String email, String pass, List<Course> courses) {
        super(id, name, email, pass, UserService.InstructorRole);
        this.courses = courses;

    }

    public Instructor(String id, String name, String email, String pass) {
        super(id, name, email, pass, UserService.InstructorRole);
        this.courses = new ArrayList<>();

    }

    //************************************************************************//
    public String getRole() {
        return role;
    }

    public List<Course> getCourses() {
        return courses;
    }

    //************************************************************************//
    public void addCourse(Course course) {
        if (this.courses == null) //on first call, this will be null
        {
            this.courses = new ArrayList<>();
        }
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        this.courses.remove(course);
    }

    public void removeCourse(String courseID) {
        Course remove = null;
        for (Course c : this.courses) {
            if (c.getId().equals(courseID)) {
                remove = c;
                break;
            }
        }
        this.courses.remove(remove);
    }

}
