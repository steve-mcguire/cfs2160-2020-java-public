package Week8;

public class MobilePhone {
    private String manufacturer;
    private int capacity;
    private String model;
    private float screenSize;
    private String operatingSystem;

    public MobilePhone(String manufacturer, int capacity, String model) {
        this.manufacturer = manufacturer;
        this.capacity = capacity;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        System.out.println(capacity > 0);
        if(capacity > 0){
            this.capacity = capacity;
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public static void main(String[] args) {
        MobilePhone stevesPhone = new MobilePhone("Apple", 32, "Iphone 6s");
        MobilePhone dansPhone = new MobilePhone("OnePlus", 128, "6t");

        System.out.println(dansPhone.getManufacturer());
        System.out.println(stevesPhone.getOperatingSystem());
        stevesPhone.setOperatingSystem("IOS 14.2");
        System.out.println(stevesPhone.getCapacity());
        stevesPhone.setCapacity(128);
        System.out.println(stevesPhone.getCapacity());
    }
}
