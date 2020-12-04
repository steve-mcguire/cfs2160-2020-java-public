package Week10;

public class Car {
    private String brand;
    private String model;
    private int weight;
    private double engineSize;
    private String colour;

    public Car(String brand, String model, int weight, double engineSize, String colour) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.engineSize = engineSize;
        this.colour = colour;
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
    }
}
