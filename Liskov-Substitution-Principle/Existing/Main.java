import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Motorcycle());
        vehicleList.add(new Car());
       vehicleList.add(new Bicycle());
        for(Vehicle vehicle : vehicleList){
            System.out.println(vehicle.hasengine());
        }
    }
    
}
