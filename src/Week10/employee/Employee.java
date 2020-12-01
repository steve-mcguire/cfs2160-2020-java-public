package Week10.employee;

public class Employee {
    private String name;
    private String emailAddress;
    private int idNumber;

    public Employee(String name, String emailAddress, int idNumber) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.idNumber = idNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return  name +
                " - " + emailAddress +
                " - " + idNumber;
    }

}
