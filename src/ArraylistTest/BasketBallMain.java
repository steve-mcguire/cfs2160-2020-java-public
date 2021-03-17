package ArraylistTest;

public class BasketBallMain {

    public static void main(String[] args) {
        BasketBallLeague league = new BasketBallLeague();
        BasketBallTeam alAhly = new BasketBallTeam("Al-Ahly", "Ashraf Tawfik", "A Mascot");
        league.addTeam(alAhly);
        BasketBallTeam alGezira = new BasketBallTeam("Al Gezria", "Head Coad", "Al Ge mascot");
        league.addTeam(alGezira);
        league.printLeague();
    }
}
