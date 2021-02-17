package Week14.dogshome;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class FundRaisingRegion {
    private ArrayList<FundRaiser> team = new ArrayList<>();

    public FundRaisingRegion() {
    }

    public void addMember(FundRaiser fr){
        team.add(fr);
    }

    public double getTotalRaised(){
        double totalRaised = 0;
        for(FundRaiser fr : team){
          totalRaised += fr.getAmount();
        }
        return totalRaised;
    }

    public String getTeamDetails(){
        StringBuilder sb = new StringBuilder();
        for(FundRaiser fr : team){
            sb.append(String.format("%-10s | %7s | %10s", fr.getName(), fr.getId(), getMoney(fr.getAmount())));

            sb.append("\n");
        }
        return sb.toString();
    }

    public String getMoney(double amount){
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
        return nf.format(amount);
    }

    public void sortTeam(){
        Collections.sort(team);
    }
}
