package backend;

public  class StudentQuizRecord {

    private String lessonId;
    private Double quizMark;
    private int remainingTrials;
    private boolean isLessonCompleted;

    public StudentQuizRecord(String lessonId, Double quizMark, int remainingTrials, boolean isLessonCompleted) {
        this.lessonId = lessonId;
        this.quizMark = quizMark;
        this.remainingTrials = remainingTrials;
        this.isLessonCompleted = isLessonCompleted;
    }

    public String getLessonId() {
        return lessonId;
    }

    public Double getQuizMark() {
        return quizMark;
    }

    public int getRemainingTrials() {
        return remainingTrials;
    }

    public boolean isLessonCompleted() {
        return isLessonCompleted;
    }
}
