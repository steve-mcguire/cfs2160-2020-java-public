package cars;

public class Vehicle {
    private String brand, vType;
    private String registration;
    private VehicleType type;

    public Vehicle(String brand, String registration, VehicleType type, String vType) {
        this.brand = brand;
        this.registration = registration;
        this.type = type;
        this.vType = vType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getVType(){
        return vType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", registration='" + registration + '\'' +
                ", type=" + type +
                '}';
    }
}
