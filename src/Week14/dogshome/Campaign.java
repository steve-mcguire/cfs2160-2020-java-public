package Week14.dogshome;

public class Campaign {

    public static void main(String[] args) {
        FundRaisingRegion frt = new FundRaisingRegion();

        frt.addMember(new FundRaiser("Steve", 23.99, 670824));
        frt.addMember(new FundRaiser("Ilias", 33.99, 5456));

        //System.out.println(frt.getTotalRaised());
        frt.sortTeam();
        System.out.println(frt.getTeamDetails());

    }
}
