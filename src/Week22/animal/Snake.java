package Week22.animal;

public class Snake extends Animal implements Prey, Predator {
    public Snake(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public String hunt() {
        return "Snake hunts mouse";
    }

    @Override
    public String flee() {
        return "Snake flees Eagle";
    }
}
