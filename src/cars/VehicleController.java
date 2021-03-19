package cars;

import java.util.ArrayList;

public class VehicleController {
    private ArrayList<Vehicle> fleet = new ArrayList<>();

    public VehicleController() {
        addVehicle(new Vehicle("Ford", "REG 123", VehicleType.CAR, "van"));
        addVehicle(new Vehicle("Merc", "REG 123", VehicleType.VAN, "Van"));
        addVehicle(new Vehicle("VW", "REG 123", VehicleType.MINIBUS, "Bus"));
        //addVehicle(new Vehicle("Ford", "REG 123", VehicleType.CAR));
        //addVehicle(new Vehicle("T", "REG 123", VehicleType.VAN));
        //addVehicle(new Vehicle("BUS BRAND", "REG 123", VehicleType.CAR));
        //addVehicle(new Vehicle("Ford", "REG 123", VehicleType.MINIBUS));
    }

    public void addVehicle(Vehicle v){
        fleet.add(v);
    }

    public ArrayList<Vehicle> getVehiclesByType(String type){
        ArrayList<Vehicle> foundVehicles = new ArrayList<>();

        for(Vehicle v : fleet){
            if(v.getVType().toLowerCase().equals(type.toLowerCase())){
                foundVehicles.add(v);
            }
        }

        return foundVehicles;
    }
}
