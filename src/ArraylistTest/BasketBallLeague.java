package ArraylistTest;

import Week14.module.scores.Module;

import java.util.ArrayList;

public class BasketBallLeague {
    private ArrayList<BasketBallTeam> league = new ArrayList<>();



    public void addTeam(BasketBallTeam team){
        league.add(team);
    }

    public void printLeague(){
        for(BasketBallTeam team : league){
            System.out.println(team);
        }
    }
}
