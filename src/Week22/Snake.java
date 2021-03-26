package Week22;

public class Snake extends Animal implements Predator, Prey{

    public Snake(Integer numberOfLegs) {
        super(numberOfLegs);
    }


    @Override
    public String prey() {
        return "Snake preys on mouse";
    }

    @Override
    public String flee() {
        return "Snake flees from eagle";
    }
}
