package Week10.employee;

public class Employee {
    private String name;
    private String emailAddress;
    private int idNumber;
    private int rating;

    public Employee(String name, String emailAddress, int idNumber) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.idNumber = idNumber;
        this.rating = 0;
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

    public boolean raiseRating(int newRating){
        if(newRating > 0 && newRating > this.rating){
            this.rating = newRating;
            return true;
        }
        else{
            return false;
        }
    }

    public int getRating(){
        return this.rating;
    }

    @Override
    public String toString() {
        return  name +
                " - " + emailAddress +
                " - " + idNumber;
    }

    public static void main(String[] args) {
        Employee steve = new Employee("Steve", "s.mcguire@hud.ac.uk"
                ,45654);
        System.out.println("Current rating is " + steve.getRating());
        System.out.println("Attempting to raise rating");
        if(steve.raiseRating(10)){
            System.out.println("Rating raised succesfully");
        }else{
            System.out.println("Rating not raised succesfully");
        }
        System.out.println("Current rating is " + steve.getRating());
        if(steve.raiseRating(5)){
            System.out.println("Rating raised succesfully");
        }else{
            System.out.println("Rating not raised succesfully");
        }
        System.out.println("Current rating is " + steve.getRating());
    }
}
