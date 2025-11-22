package databaseservice;

import backend.*;
import java.util.List;
import java.util.*;

public class StudentService {

    private List<Student> studentlist;

    public StudentService(List<Student> studentlist) {
        this.studentlist = new ArrayList<>(studentlist);
    }

    public StudentService() {
        List<User> users = JsonDataBaseManager.getUsers();
        this.studentlist = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof Student) {
                studentlist.add((Student) users.get(i));
            }
        }
    }

  

    public Course getCourseById(Student s, String courseId) {

        if (!s.getCourses().contains(courseId)) {
            System.out.print("NO 127");
            return null;

        }

        return getCoursebyid(courseId);
    }

    public List<Course> getAllAvailableCourses() {
        List<Course> courses = JsonDataBaseManager.getCourses();

        if (courses == null) {
            return new ArrayList<>();
        }

        return new ArrayList<>(courses);
    }

    public Course getCoursebyid(String courseId) {
        List<Course> courses = JsonDataBaseManager.getCourses();
        for (Course c : courses) {
            if (c.getId().equals(courseId)) {
                return c;
            }
        }

        return null;

    }

    public User getStudentbyid(String studentId) {
        List<User> students = JsonDataBaseManager.getUsers();
        for (User c : students) {
            if (c.getUserId().equals(studentId)) {
                return (Student) c;
            }
        }

        return null;

    }

    public progress getProgressByCourseId(List<progress> progressList, String courseId) {
        if (progressList == null || courseId == null) {
            return null;
        }

        for (progress p : progressList) {
            if (p.getCourseId().equals(courseId)) {
                return p;
            }
        }

        return null;
    }

    public static void deletecompletedlesson(String courseid, String lessonid) {
        List<User> ulist = JsonDataBaseManager.getUsers();
        for (User c : ulist) {
            if (c instanceof Student) {       
                Student s = (Student) c;  
                for (progress cc : s.getProgress()) {
                    if (cc.getCourseId().equals(courseid)) {
                        Set<String> completedLessons = cc.getCompletedLessons();
                        completedLessons.removeIf(l -> l.equals(lessonid));
                    }
                }
                
                JsonDataBaseManager.updateUser(s);

            }
        }
    }

    public static void deletecourse(String courseid) {
        List<User> ulist = JsonDataBaseManager.getUsers();
        for (User c : ulist) {
            if (c instanceof Student) {

                Student s = (Student) c;
    
                List<String> courseids = s.getCourses();
                courseids.removeIf(id -> id.equals(courseid));
                s.setCourses(courseids);

                List<progress> progressList = s.getProgress();
                progressList.removeIf(p -> p.getCourseId().equals(courseid));
                s.setProgress(progressList);

                JsonDataBaseManager.updateUser(s);
            }

        }
    }

}
