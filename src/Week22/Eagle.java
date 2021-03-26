package Week22;

public class Eagle extends Animal implements Predator{

    public Eagle(Integer numberOfLegs) {
        super(numberOfLegs);
    }


    @Override
    public String prey() {
        return "Eagle preys on snake and mouse";
    }
}
