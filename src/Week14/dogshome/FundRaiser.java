package Week14.dogshome;

public class FundRaiser implements  Comparable<FundRaiser>{
    private String name;
    private double amount;
    private int id;

    public FundRaiser(String name, double amount, int id) {
        this.name = name;
        this.amount = amount;
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name + '\'' +
                ", " + amount +
                ", " + id ;
    }

    @Override
    public int compareTo(FundRaiser fr) {
        if (fr.getAmount() > this.getAmount()){
            return 1;
        }else if(fr.getAmount() < this.getAmount()){
            return -1;
        }else{
            return 0;
        }
    }
}
