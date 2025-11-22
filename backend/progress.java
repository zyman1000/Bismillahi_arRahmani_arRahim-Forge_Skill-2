package backend;

import java.util.Set;
import java.util.HashSet;

public class progress {

    private String courseId;
    private Set<String> completedLessons;

    public progress(String courseId) {
        this.courseId = courseId;
        this.completedLessons = new HashSet<>();
    }

    public void completeLesson(String lessonId) {
        completedLessons.add(lessonId);
    }

    public int getCompletedCount() {
        return completedLessons.size();
    }

    public Set getCompletedLessons() {
        return completedLessons;
    }

    public boolean isLessonCompleted(String lessonId) {
        return completedLessons.contains(lessonId);
    }

    public String getCourseId() {
        return courseId;
    }

    public double getProgressPercentage(int totalLessons) {
        if (totalLessons == 0) {
            return 0;
        }
        return (completedLessons.size() * 100.0) / totalLessons;
    }

    public double getProgressPercentagebycourse(Course course) {
        int totalLessons = course.getLessons().size();
        if (totalLessons == 0) {
            return 0;
        }
        return (completedLessons.size() * 100.0) / totalLessons;
    }

}
