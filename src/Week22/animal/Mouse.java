package Week22.animal;

public class Mouse extends Animal implements Prey{
    public Mouse(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public String flee() {
        return "Mouse flees Snake and Eagle";
    }
}
