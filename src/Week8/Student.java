package Week8;

public class Student {
    private String studentID;
    private String name;
    private String DOB;
    private String emailAddress;
    private String patName;
    private String patEmailAddress;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getPatEmailAddress() {
        return patEmailAddress;
    }

    public void setPatEmailAddress(String patEmailAddress) {
        this.patEmailAddress = patEmailAddress;
    }

}
