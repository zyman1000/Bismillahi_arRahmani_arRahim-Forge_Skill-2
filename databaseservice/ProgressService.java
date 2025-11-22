package databaseservice;

import backend.JsonDataBaseManager;
import backend.LessonProgress;
import backend.Progress;
import backend.Student;
import backend.User;
import java.util.ArrayList;
import java.util.List;

public class ProgressService {

    ProgressService() {

    }

    public static List<Integer> getQuizMarksById(String studentId, String courseID) {
        List<User> ulist = JsonDataBaseManager.getUsers();
        for (User c : ulist) {
            if (c instanceof Student) {
                Student s = (Student) c;
                if (s.getUserId().equals(studentId)) {
                    List<Progress> Plist = s.getProgress();
                    for (int i = 0; i < Plist.size(); i++) {
                        Progress p = Plist.get(i);
                        if (p.getCourseId().equals(courseID)) {
                            return p.getmarks();
                        }
                    }
                }

            }

        }
        return new ArrayList<>();
    }

    public static List<Integer> getQuizMarks_allstudents_ForLesson(String courseId, String lessonId) {

        List<Integer> marks = new ArrayList<>();
        List<User> users = JsonDataBaseManager.getUsers();

        for (User u : users) {

            if (u instanceof Student) {
                Student s = (Student) u;

                List<Progress> progressList = s.getProgress();
                if (progressList == null) {
                    continue;
                }

                for (Progress p : progressList) {

                    if (p.getCourseId().equals(courseId)) {

                        List<LessonProgress> lessons = p.getLessonProgressList();
                        if (lessons == null) {
                            continue;
                        }

                        for (LessonProgress lp : lessons) {
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
}
