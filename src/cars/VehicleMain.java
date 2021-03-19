package cars;

import java.util.ArrayList;

public class VehicleMain {

    public static void main(String[] args) {
        VehicleController vc = new VehicleController();
        ArrayList<Vehicle> vehicles = vc.getVehiclesByType("Van");

        System.out.println(vehicles);
    }
}
