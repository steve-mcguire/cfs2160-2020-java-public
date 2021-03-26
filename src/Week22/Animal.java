package Week22;

public abstract class Animal {

    private Integer numberOfLegs;

    public Animal(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
