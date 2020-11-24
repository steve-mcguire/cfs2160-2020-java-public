package Week10.christmasclub;

public class ChristmasClub {
    //class attributes

    //constructors

    //methods

    //main method
    public static void main(String[] args) {

        ClubMember steve = new ClubMember("Steve", 21);
        if(steve.addContribution(-10)){
            System.out.println("Error in deposit");
        }else{
            System.out.println("Contribution accepted");
        }
        System.out.println(steve);
    }
}
