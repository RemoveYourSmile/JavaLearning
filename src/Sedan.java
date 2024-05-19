public class Sedan extends Car{

    private String luxuryLevel;

    public Sedan(String brand, String model, int numberOfDoors, int horsePower,
                 int trunkCapacity, String fuelType, String luxuryLevel) {
        super(brand, model, numberOfDoors, horsePower, trunkCapacity, fuelType);
        this.luxuryLevel = luxuryLevel;
    }


    @Override
    public int getNumberOfDoors() {
        System.out.println("Количество дверей (седан): " + numberOfDoors);
        return numberOfDoors;
    }

    @Override
    public int getTrunkCapacity() {
        System.out.println("Вместимость багажника (седан): " + numberOfDoors);
        return trunkCapacity;
    }

    public String getLuxuryLevel(){
        System.out.println("Уровень комфорта: " + luxuryLevel);
        return luxuryLevel;
    }
}
