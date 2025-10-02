import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private List<Garage> garages;

    public Fleet() {
        garages = new ArrayList<>();
    }

    public void addGarage(Garage g) {
        garages.add(g);
        System.out.println("Добавлен гараж в автопарк.");
    }

    public void removeGarage(Garage g) {
        garages.remove(g);
        System.out.println("Удален гараж из автопарка.");
    }

    public void findVehicle(String brand, String model) {
        for (Garage g : garages) {
            for (Vehicle v : g.getVehicles()) {
                if (v.brand.equals(brand) && v.model.equals(model)) {
                    System.out.println("Найдено ТС: " + v.getInfo());
                    return;
                }
            }
        }
        System.out.println("ТС " + brand + " " + model + " не найдено в автопарке.");
    }
}
