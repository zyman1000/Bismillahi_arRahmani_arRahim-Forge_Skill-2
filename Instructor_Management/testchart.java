package Instructor_Management;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JFrame;

public class testchart {
    public static void main(String[] args) {
        chart_dispalay chartPanel = new chart_dispalay();

        // Example data
        List<String> lessons = List.of("Lesson 1", "Lesson 2", "Lesson 3");
        List<Integer> scores = List.of(85, 90, 70);

        chartPanel.showChart("Student Quiz Scores", "Lessons", "Score", "John Doe", lessons, scores,"avg: ",20);
    }
}
