package Week10.savingsclub;

//DO NOT EDIT THIS CLASS FILE

public class ClubMember {
    private String name;
    private int contribution;

    public ClubMember(String name) {
        this.name = name;
        this.contribution = 0;
    }

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

    public boolean addContribution(int contribution) {
        if (contribution > 0){
            this.contribution += contribution;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "ClubMember{" +
                "name='" + name + '\'' +
                ", contribution=" + contribution +
                '}';
    }

    //DO NOT EDIT THIS CLASS FILE
    //DO NOT PUT MAIN METHOD HERE!
}
