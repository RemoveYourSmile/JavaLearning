public class Computer {

    static class Processor{
        private String model = "Intel Core i9 12900KF";

        String getDetails(){
            System.out.println(model);
            return model;
        }
    }

    class RAM{
        private int size = 8196;

        int getDetails(){
            System.out.println(size);
            return size;
        }
    }


    public static void main(String[] args){
        Computer.Processor processor = new Computer.Processor();
        processor.getDetails();
        Computer computer = new Computer();
        Computer.RAM ram = computer.new RAM();
        ram.getDetails();
    }
}
