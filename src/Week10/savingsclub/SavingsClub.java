package Week10.savingsclub;

public class SavingsClub {
    //class attributes

    //constructors

    //methods

    //main method
    public static void main(String[] args) {

        ClubMemberChild t = new ClubMemberChild("CMC Steve", 50);
        System.out.println(t);

        ClubMember steve = new ClubMember("Steve", 21);
        if(steve.addContribution(-10)){
            System.out.println("Error in deposit");
        }else{
            System.out.println("Contribution accepted");
        }
        System.out.println(steve);
    }
}
