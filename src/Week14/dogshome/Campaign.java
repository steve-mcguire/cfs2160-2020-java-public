package Week14.dogshome;

import java.util.Collections;

public class Campaign {

    public static void main(String[] args) {
        FundRaisingTeam frt = new FundRaisingTeam();

        frt.addMember(new FundRaiser("Steve", 23.99, 670824));
        frt.addMember(new FundRaiser("Ilias", 33.99, 5456));

        //System.out.println(frt.getTotalRaised());
        frt.sortTeam();
        System.out.println(frt.getTeamDetails());

    }
}
