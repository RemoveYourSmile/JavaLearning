public class Truck extends Car{

    private int maxLoadCapacity;

    public Truck(String brand, String model, int numberOfDoors, int horsePower, int trunkCapacity, String fuelType, int maxLoadCapacity) {
        super(brand, model, numberOfDoors, horsePower, trunkCapacity, fuelType);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public int getNumberOfDoors() {
        System.out.println("Количество дверей (грузовик): " + numberOfDoors);
        return numberOfDoors;
    }

    @Override
    public int getTrunkCapacity() {
        System.out.println("Вместимость багажника (грузовик): " + trunkCapacity);
        return trunkCapacity;
    }

    public int getMaxLoadCapacity(){
        System.out.println("Грузоподъемность: " + maxLoadCapacity);
        return maxLoadCapacity;
    }
}
