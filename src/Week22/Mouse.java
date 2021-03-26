package Week22;

public class Mouse extends Animal implements Prey{

    public Mouse(Integer numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public String flee() {
        return "Mouse flees from eagle and snake";
    }
}
