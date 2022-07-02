package prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bus());
        System.out.println(vehicles);

        List<Vehicle> copyList = clone(vehicles);
        System.out.println(copyList);
    }

    public static List<Vehicle> clone(List<Vehicle> vehicles) {
        List<Vehicle> copyList = new ArrayList<>();
        for (Vehicle vehicle: vehicles) {
            copyList.add(vehicle.clone());
        }
        return copyList;
    }
}
