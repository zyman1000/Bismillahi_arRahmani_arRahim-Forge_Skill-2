/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.io.*;
import java.util.*;
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

    public boolean isLessonCompleted(String lessonId) {
        return completedLessons.contains(lessonId);
    }

    public double getProgressPercentage(int totalLessons) {
        if (totalLessons == 0) return 0;
        return (completedLessons.size() * 100.0) / totalLessons;
    }
    public String getCourseId(){
        return courseId;
    }
    
    public double getProgressPercentagebycourse(Course course) {
    int totalLessons = course.getLessons().size();
    if (totalLessons == 0) return 0;
    return (completedLessons.size() * 100.0) / totalLessons;
}
    
}
    

