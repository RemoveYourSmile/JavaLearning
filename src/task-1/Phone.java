public class Phone {
    private String name;

    private String model;

    private int chargeLevel;

    public Phone(String name, String model, int chargeLevel){
        this.name = name;
        this.model = model;
        this.chargeLevel = chargeLevel;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getChargeLevel(){
        return chargeLevel;
    }

    public void charge(){
        chargeLevel += chargeLevel == 100 ? 0 : 1;
        System.out.println("Charging: " + chargeLevel + "%");
    }

    public void getInfo(){
        System.out.println("Phone: " + name + " " + model + ", charge level: " + chargeLevel);
    }
}
