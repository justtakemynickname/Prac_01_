import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        System.out.println("Добавлено ТС в гараж: " + v.getInfo());
    }

    public void removeVehicle(Vehicle v) {
        vehicles.remove(v);
        System.out.println("Удалено ТС из гаража: " + v.getInfo());
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
