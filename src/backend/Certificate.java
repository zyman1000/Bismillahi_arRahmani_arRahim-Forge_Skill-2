
package backend;

import java.util.Date;

public class Certificate {
    private String studentID;
    private String courseID;
    private String certificateID;
    private String issueDate;
    public Certificate(String studentID, String courseID, String certificateID, String issueDate){
        this.studentID = studentID;
        this.courseID = courseID;
        this.certificateID = certificateID;
        this.issueDate = issueDate;
    }
    public String getCertificateID(){
        return certificateID;
    }
    public String getcourseID(){
        return courseID;
    }
    public String getstudentID(){
        return studentID;
    }
    public String getissueDate(){
        return issueDate;
    }
}
