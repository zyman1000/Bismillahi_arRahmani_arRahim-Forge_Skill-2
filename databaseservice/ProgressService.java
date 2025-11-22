package databaseservice;

import backend.Course;
import backend.JsonDataBaseManager;
import backend.StudentQuizRecord;
import backend.progress;
import backend.Student;
import backend.User;
import java.util.ArrayList;
import java.util.List;

public class ProgressService {

    ProgressService() {

    }

    public static List<Double> getQuizMarksById(String sid, String cid) {
        List<User> ulist = JsonDataBaseManager.getUsers();
        for (User c : ulist) {
            if (c instanceof Student) {
                Student s = (Student) c;
                if (s.getUserId().equals(sid)) {
                    List<progress> Plist = s.getProgress();
                    for (int i = 0; i < Plist.size(); i++) {
                        progress p = Plist.get(i);
                        if (p.getCourseId().equals(cid)) {
                            return p.getmarks();
                        }
                    }
                }

            }

        }
        return new ArrayList<>();
    }
    
    public static int get_completedlessons_student(String sid , String cid){
         List<User> ulist = JsonDataBaseManager.getUsers();
         for (User c : ulist) {
            if (c instanceof Student) {
                Student s = (Student) c;
                if (s.getUserId().equals(sid)) {
                    List<progress> Plist = s.getProgress();
                    for (int i = 0; i < Plist.size(); i++) {
                        progress p = Plist.get(i);
                        if (p.getCourseId().equals(cid)) {
                            return p.getCompletedCount();
                        }
                    }
                }

            }

        }        
        return 0;
    }

   public static List<Double> getQuizMarks_allstudents_ForLesson(String courseId, String lessonId) {

        List<Double> marks = new ArrayList<>();
        List<User> users = JsonDataBaseManager.getUsers();

        for (User u : users) {

            if (u instanceof Student) {
                Student s = (Student) u;

                List<progress> progressList = s.getProgress();
                if (progressList == null) {
                    continue;
                }

                for (progress p : progressList) {

                    if (p.getCourseId().equals(courseId)) {

                        List<StudentQuizRecord> lessons = p.getLessonProgressList();
                        if (lessons == null) {
                            continue;
                        }

                        for (StudentQuizRecord lp : lessons) {
                            if (lp.getLessonId().equals(lessonId)) {
                                marks.add(lp.getQuizMark());
                            }
                        }

                    }
                }
            }
        }

        return marks;
    }

  public static List<Student> get_enrolled_student(String cid){
      List<User> ulist = JsonDataBaseManager.getUsers();
       List<Student> sss =new ArrayList();
         for (User c : ulist) {
            if (c instanceof Student) {
                Student s = (Student) c;
                List<String> allcourses= s.getCourses();
                    for (int i = 0; i < allcourses.size(); i++) {
                        if (allcourses.get(i).equals(cid)) {
                            sss.add(s);
                        }
                    
                }

        }        
    }
         return sss;
}
 
   public static Course getCoursebyid(String courseId) {
        List<Course> courses = JsonDataBaseManager.getCourses();
        for (Course c : courses) {
            if (c.getId().equals(courseId)) {
                return c;
            }
        }
    
    return null; 
    
    
   }
    
} 