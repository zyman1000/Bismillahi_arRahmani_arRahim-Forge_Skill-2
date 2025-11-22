package backend;

import java.util.ArrayList;
import java.util.List;

public class progress {

    private String courseId;
    private List<StudentQuizRecord> LPlist;
    
    public progress(String courseId) {
        this.courseId = courseId;
        this.LPlist = new ArrayList<>();
    }

    public String getCourseId() {
        return courseId;
    }

    public List<StudentQuizRecord> getLessonProgressList() {
        return LPlist;
    }

    public void addLessonProgress(String lessonId, Double quizMark, int remainingTrials, boolean isLessonCompleted) {
        LPlist.add(new StudentQuizRecord(lessonId, quizMark, remainingTrials, isLessonCompleted));
    }

    public int getCompletedCount() {
        int count = 0;
        for (StudentQuizRecord lp : LPlist) {
            if (lp.isLessonCompleted()) {
                count++;
            }
        }
        return count;
    }

    public List<Double> getmarks() {
        List<Double> m = new ArrayList<>();
        if (LPlist.isEmpty()) 
            return null;
        for (StudentQuizRecord lp : LPlist) {
            m.add(lp.getQuizMark());
        }
        return m;
    }

}
