package backend;
import java.util.*;
import java.util.HashSet;

public class progress {

    private String courseId;
    private List<StudentQuizRecord>  quizRecords;
   // private Set<String> completedLessons; 

    public progress(String courseId) {
        this.quizRecords = new ArrayList<>();
        this.courseId = courseId;
   //     this.completedLessons = new HashSet<>();
    }

   /* public void completeLesson(String lessonId) {
        completedLessons.add(lessonId);
    }*/

    public int getCompletedCount() {
    Set<String> completed = new HashSet<>();

    for (StudentQuizRecord r : quizRecords) {
        if (r.isPassed()) {
            completed.add(r.getLesson().getId());
        }
    }
    return completed.size();
}


public Set<String> getCompletedLessons() {
    Set<String> completed = new HashSet<>();

    for (StudentQuizRecord r : quizRecords) {
        if (r.isPassed()) {
            System.out.println(r.getClass().getName());
            
            completed.add(r.getLesson().getId());
        }
    }
    return completed;
}


   public boolean isLessonCompleted(String lessonId) {
    // Check quiz records instead of the set
    for (StudentQuizRecord r : quizRecords) {
        if (r.getLesson().getId().equals(lessonId) && r.isPassed()) {  
            return true;
        }
    }
    return false;
}

    public String getCourseId() {
        return courseId;
    }
    
    private int getPassedLessonsCount() {
    Set<String> completed = new HashSet<>();

    for (StudentQuizRecord r : quizRecords) {
        if (r.isPassed()) {
            
            completed.add(r.getLesson().getId());
        }
    }
    return completed.size();
}
    
    public double getProgressPercentagebycourse(Course course) {
    int totalLessons = course.getLessons().size();
    if (totalLessons == 0) {
        return 0;
    }

    int passedLessons = getPassedLessonsCount();
    return (passedLessons * 100.0) / totalLessons;
}

    public double getProgressPercentage(int totalLessons) {
    if (totalLessons == 0) {
        return 0;
    }

    int passedLessons = getPassedLessonsCount();
    return (passedLessons * 100.0) / totalLessons;
}


    
    
    

    
    
    
    public void addQuizRecord(StudentQuizRecord record) {
    quizRecords.add(record);
}
    
    public List<StudentQuizRecord> getQuizRecords() {
    return quizRecords;
}
    
    public int getAttemptsForQuiz(Quiz quiz,Lesson lesson) {
        int count = 0;
        
        
        for (StudentQuizRecord r : quizRecords) {
            if (r.getQuiz().getId() == quiz.getId()&&r.getScore() >= 0&& r.getLesson().getId().equals(lesson.getId())) {
                count++;
            }
        }
        return count;
    }
    
   
    public int getRemainingTries(Quiz quiz,Lesson lesson) {
        int attemptsDone = getAttemptsForQuiz(quiz,lesson);
        return quiz.getNumberOfTry() - attemptsDone;
    }
    
    
    public StudentQuizRecord startAttempt(Lesson lesson) {
        StudentQuizRecord record = new StudentQuizRecord(lesson); 
        quizRecords.add(record);
        return record;
}
    
    
    public void updateAttempt(StudentQuizRecord attempt) {
   
    for (int i = 0; i < quizRecords.size(); i++) {
        if (quizRecords.get(i).getQuiz().getId() == attempt.getQuiz().getId()) {
            quizRecords.set(i, attempt);
            return;
        }
    }
    
    quizRecords.add(attempt);
}

}
