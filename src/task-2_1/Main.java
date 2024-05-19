
public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("BMW", "5", 5,
                625, 100, "Бензин", "Премиум");
        Truck truck = new Truck("Volvo", "F470", 2,
                470, 30, "Дизель", 40);

        sedan.getNumberOfDoors();
        sedan.getTrunkCapacity();
        sedan.getFuelType();
        sedan.getLuxuryLevel();
        sedan.start();
        sedan.stop();

        truck.getNumberOfDoors();
        truck.getTrunkCapacity();
        truck.getFuelType();
        truck.getMaxLoadCapacity();
        truck.start();
        truck.stop();
    }
}