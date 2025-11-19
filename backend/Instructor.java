
package backend;
import backend.*;
import java.util.List;
import java.util.*;
public class Instructor extends User {
    private transient List <Course>  courses;

    public Instructor (String id, String name,String email,String pass,List <Course>  courses)
    {
        super(id,name,email,pass, UserService.InstructorRole);
        this.courses =  new ArrayList<>(courses);

    }
    public Instructor (String id, String name,String email,String pass)
    {
        super(id,name,email,pass, UserService.InstructorRole);
        this.courses =  new ArrayList<>();

    }
    //************************************************************************//
    public String getRole()
    {
              return role;
    }
    public List<Course> getCourses()
    {
    return new ArrayList<>(courses); 
    }
    //************************************************************************//
    public void addCourse(Course course) 
    {
        this.courses.add(course);
    }
    public void removeCourse(Course course){
        this.courses.remove(course);
    }

}
