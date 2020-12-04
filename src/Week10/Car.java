package Week10;

import java.util.Calendar;

public class Car {
    private String brand;
    private String model;
    private int weight;
    private double engineSize;
    private String colour;
    private Boolean warranty;
    private int yearOfManufacture;

    public Car(String brand, String model, int weight, double engineSize, String colour) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.engineSize = engineSize;
        this.colour = colour;
        this.warranty = true;
        this.yearOfManufacture = 2016;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMakeAndModel(){
        return this.brand + " - " + this.model;
    }

    public Boolean isUnderWarranty(){
        Calendar cal = Calendar.getInstance();
        return (cal.get(Calendar.YEAR) - this.yearOfManufacture) <= 1;
    }

    @Override
    public String toString() {
        return "Car" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", engineSize=" + engineSize +
                ", colour='" + colour + '\'';
    }

    public static void main(String[] args) {
        Car bmwM3 = new Car("BMW", "M3", 2000, 3000, "Green");
        System.out.println(bmwM3.getBrand());

        System.out.println(bmwM3.isUnderWarranty());
    }
}
