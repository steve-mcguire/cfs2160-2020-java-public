package Week10.savingsclub;

public class ClubMember {
    //DO NOT MAKE CHANGES TO THIS FILE
    private String name;
    private int contribution;

    public ClubMember(String name, int contribution) {
        this.name = name;
        this.contribution = contribution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContribution() {
        return contribution;
    }

    public void setContribution(int contribution) {
        this.contribution = contribution;
    }

    @Override
    public String toString() {
        return "ClubMember{" +
                "name='" + name + '\'' +
                ", contribution=" + contribution +
                '}';
    }

    //DO NOT MAKE CHANGES TO THIS FILE
}
