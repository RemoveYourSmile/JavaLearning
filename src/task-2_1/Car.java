public abstract class Car implements Vehicle {

    private String brand;

    private String model;

    protected int numberOfDoors;

    private int horsePower;

    protected int trunkCapacity;

    private String fuelType;

    public Car(String brand, String model, int numberOfDoors, int horsePower, int trunkCapacity, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.horsePower = horsePower;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public void start() {
        System.out.println("Машина начала движение");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась");
    }

    @Override
    public void getFuelType() {
        System.out.println("Тип используемого топлива: " + fuelType);
    }

    public abstract int getNumberOfDoors();

    public abstract int getTrunkCapacity();
}
