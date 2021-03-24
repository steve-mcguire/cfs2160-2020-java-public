package PhoneShop;

public class MobilePhone {
    private String brand, model;
    private double cost;

    public MobilePhone(String brand, String model, double cost) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


}
