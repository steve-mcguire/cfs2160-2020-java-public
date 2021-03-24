package PhoneShop;

public class PhoneMain {
    public static void main(String[] args) {
        PhoneStock ps = new PhoneStock();
        MobilePhone m1 = new MobilePhone("Apple", "Iphone 12", 799);
        MobilePhone m2 = new MobilePhone("Apple", "Iphone 11", 699);
        MobilePhone m3 = new MobilePhone("Cadburys", "Dairy Milk", .99);
        ps.addPhoneToStock(m1, 10);
        ps.addPhoneToStock(m2, 10);
        ps.addPhoneToStock(m3, 10);

        ps.printPhones();
        System.out.println("Reduce stock");
        ps.reduceStock(m1);
        ps.printPhones();
    }
}
