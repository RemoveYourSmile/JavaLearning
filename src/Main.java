import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Phone first = new Phone("iPhone", "4",97);
        Rectangle rectangle = new Rectangle(5, 3);
        Rectangle rectangleSecond = new Rectangle();
        rectangle.square();
        rectangle.square(3, 4);
        first.setModel("X");
        first.getInfo();
        IntStream.range(0, 100 - first.getChargeLevel()).forEach(consumer -> first.charge());
        first.getInfo();
    }
}