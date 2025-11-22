package backend;

import java.util.*;

public class Course extends AbstractDisplay {

    private String description;
    private String instructorId;
    private List<Lesson> lessons;
    private List<String> students;

    public Course() {
        lessons = new ArrayList<>();
        students = new ArrayList<>();
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getInstructorId() { return instructorId; }
    public void setInstructorId(String instructorId) { this.instructorId = instructorId; }

    public List<Lesson> getLessons() { return lessons; }
    public List<String> getStudents() { return students; }
    
    public void addStudent(Student s){ students.add(s.getUserId());}
    public void removeStudent(Student s){ students.remove(s.getUserId());}
    
    public Lesson getLessonById(String lessonId) {
    for (Lesson l : lessons) {
        if (l.getId().equals(lessonId)) {
            return l;
        }
    }
    return null;
}
}