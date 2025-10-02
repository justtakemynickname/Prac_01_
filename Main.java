public class Main {
    public static void main(String[] args) {
        // Создаем транспортные средства
        Car car1 = new Car("Toyota", "Camry", 2020, 4, "Автомат");
        Car car2 = new Car("BMW", "X5", 2019, 5, "Механика");
        Motorcycle moto1 = new Motorcycle("Yamaha", "R1", 2021, "Спортбайк", false);
        Motorcycle moto2 = new Motorcycle("Honda", "Gold Wing", 2018, "Туристический", true);

        // Создаем гаражи
        Garage garage1 = new Garage();
        Garage garage2 = new Garage();

        // Добавляем транспорт в гаражи
        garage1.addVehicle(car1);
        garage1.addVehicle(moto1);

        garage2.addVehicle(car2);
        garage2.addVehicle(moto2);

        // Создаем автопарк и добавляем гаражи
        Fleet fleet = new Fleet();
        fleet.addGarage(garage1);
        fleet.addGarage(garage2);

        // Поиск ТС
        fleet.findVehicle("Toyota", "Camry");
        fleet.findVehicle("Audi", "A6");

        // Удаление ТС и гаражей
        garage1.removeVehicle(moto1);
        fleet.removeGarage(garage2);
    }
}
