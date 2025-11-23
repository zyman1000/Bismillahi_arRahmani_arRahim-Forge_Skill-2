package services;

import backend.*;
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

    public int studentEnrollment(Student s, String ID) {

        if (s.getCourses().contains(ID)) {
            return 0;
        }
        Course c = getCoursebyid(ID);
        if (c == null) {
            return -1;
        }

        List<String> currentCourses = s.getCourses();

        currentCourses.add(c.getId());

        s.setCourses(currentCourses);

        c.addStudent(s);

        List<progress> progressList = s.getProgress();

        boolean exists = false;
        for (progress p : progressList) {
            if (p.getCourseId().equals(c.getId())) {
                exists = true;
                break;
            }
        }

        if (!exists) {
            progress newProgress = new progress(c.getId());
            progressList.add(newProgress);
            s.setProgress(progressList);
        }

        JsonDataBaseManager.updateUser(s);
        JsonDataBaseManager.updateCourse(c);

        return 1;
    }

    public int lessonAccess(Student s, Course c, Lesson l) {

        progress courseProgress = null;
        for (progress p : s.getProgress()) {
            if (p.getCourseId().equals(c.getId())) {
                courseProgress = p;
                break;
            }
        }

        if (courseProgress == null) {
            return 0;
        }

        courseProgress.completeLesson(l.getId());

        JsonDataBaseManager.updateUser(s);

        return 1;
    }

    public double getCourseProgressPercentage(Student s, String courseId) {

        if (!s.getCourses().contains(courseId)) {
            return 0.0;
        }
        List<progress> progressList = s.getProgress();
        progress courseProgress = null;
        for (progress p : progressList) {
            if (p.getCourseId().equals(courseId)) {
                courseProgress = p;
                break;
            }
        }

        if (courseProgress == null) {
            return 0.0;
        }

        int completed = courseProgress.getCompletedCount();

        Course c = getCoursebyid(courseId);

        if (c == null) {
            return 0.0;
        }

        int totalLessons = c.getLessons().size();

        if (totalLessons == 0) {
            return 0.0;
        }

        return (completed * 100.0) / totalLessons;
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
        List<Course> result = new ArrayList<>();
        for(Course c : courses){
            if(c.getApprovalStatus().equals(Course.ACCEPTED)){
                result.add(c);
            }
        }
        return result;
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
