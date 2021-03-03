package ArraylistTest;

public class BasketBallTeam {
    private String clubName;
    private String coach;
    private String mascot;

    public BasketBallTeam(String clubName, String coach, String mascot) {
        this.clubName = clubName;
        this.coach = coach;
        this.mascot = mascot;
    }

    @Override
    public String toString() {
        return "BasketBallTeam{" +
                "clubName='" + clubName + '\'' +
                ", coach='" + coach + '\'' +
                ", mascot='" + mascot + '\'' +
                '}';
    }
}
