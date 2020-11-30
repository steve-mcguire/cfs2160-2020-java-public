package Week10.savingsclub;

public class ClubMemberChild extends ClubMember{


    public ClubMemberChild(String name, int contribution) {
        super(name, contribution);
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
