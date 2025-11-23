package backend;

import java.util.*;

public class progress {

    private String courseId;
    private List<StudentQuizRecord> LPlist;

    public progress(String courseId) {
        this.courseId = courseId;
        this.LPlist = new ArrayList<>();
    }

    // ============================================================
    //          SECTION 1: دوال الكود الثاني الأصلية فقط
    // ============================================================

    // Getter عادي للـ courseId 
    public String getCourseId() {
        return courseId;
    }

    // Getter للـ Lesson Progress List (من الكود الثاني)
    public List<StudentQuizRecord> getLessonProgressList() {
        return LPlist;
    }

    // حساب عدد الدروس المكتملة (طريقة بسيطة - من الكود الثاني)
    public int getCompletedCount() {
        int count = 0;
        for (StudentQuizRecord lp : LPlist) {
            if (lp.isPassed()) {
                count++;
            }
        }
        return count;
    }

    // إرجاع درجات كل المحاولات (من الكود الثاني)
    public List<Double> getmarks() {
        if (LPlist.isEmpty()) 
            return null;

        List<Double> m = new ArrayList<>();
        for (StudentQuizRecord lp : LPlist) {
            m.add(lp.getScore());
        }
        return m;
    }

    // ============================================================
    //          SECTION 2: دوال الكود الأول الأصلية (Progress)
    // ============================================================

    // إرجاع كل الدروس المكتملة (نسخة الكود الأول)
    public Set<String> getCompletedLessons() {
        Set<String> completed = new HashSet<>();

        for (StudentQuizRecord r : LPlist) {
            if (r.isPassed()) {
                completed.add(r.getLesson().getId());
            }
        }
        return completed;
    }

    // هل درس معيّن مكتمل؟
    public boolean isLessonCompleted(String lessonId) {
        for (StudentQuizRecord r : LPlist) {
            if (r.getLesson().getId().equals(lessonId) && r.isPassed()) {
                return true;
            }
        }
        return false;
    }

    // عدد الدروس المكتملة الحقيقي (بدون تكرار)
    private int getPassedLessonsCount() {
        Set<String> completed = new HashSet<>();
        for (StudentQuizRecord r : LPlist) {
            if (r.isPassed()) {
                completed.add(r.getLesson().getId());
            }
        }
        return completed.size();
    }

    // نسبة التقدم بناءً على كائن Course
    public double getProgressPercentagebycourse(Course course) {
        int totalLessons = course.getLessons().size();
        if (totalLessons == 0) return 0;

        return (getPassedLessonsCount() * 100.0) / totalLessons;
    }

    // نسبة التقدم بناءً على عدد الدروس
    public double getProgressPercentage(int totalLessons) {
        if (totalLessons == 0) return 0;

        return (getPassedLessonsCount() * 100.0) / totalLessons;
    }

    // ============================================================
    //          SECTION 3: دوال Attempts (مشتركة)
    // ============================================================

    // إضافة Record جديد
    public void addQuizRecord(StudentQuizRecord record) {
        LPlist.add(record);
    }

    // عدد محاولات Quiz لدرس معيّن
    public int getAttemptsForQuiz(Quiz quiz, Lesson lesson) {
        int count = 0;

        for (StudentQuizRecord r : LPlist) {
            if (r.getQuiz().getId() == quiz.getId()
                && r.getLesson().getId().equals(lesson.getId())
                && r.getScore() >= 0)
            {
                count++;
            }
        }
        return count;
    }

    // عدد المحاولات المتبقية
    public int getRemainingTries(Quiz quiz, Lesson lesson) {
        return quiz.getNumberOfTry() - getAttemptsForQuiz(quiz, lesson);
    }

    // بدء Attempt جديدة
    public StudentQuizRecord startAttempt(Lesson lesson) {
        StudentQuizRecord record = new StudentQuizRecord(lesson);
        LPlist.add(record);
        return record;
    }

    // تحديث Attempt موجودة
    public void updateAttempt(StudentQuizRecord attempt) {
        for (int i = 0; i < LPlist.size(); i++) {
            if (LPlist.get(i).getQuiz().getId() == attempt.getQuiz().getId()) {
                LPlist.set(i, attempt);
                return;
            }
        }
        LPlist.add(attempt);
    }
    
    
    public List<StudentQuizRecord> getQuizRecords() {
    return LPlist;
}

}