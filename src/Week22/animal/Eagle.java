package Week22.animal;

public class Eagle extends Animal implements Predator {
    public Eagle(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public String hunt() {
        return "Eagle hunts snake and mouse";
    }
}
