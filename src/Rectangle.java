public class Rectangle {
    static {
        System.out.println("Статичный");
    }

    {
        System.out.println("Нестатичный");
    }

    private int length;

    private int width;

    public Rectangle(){}

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void square(){
        System.out.println("Площадь прямоугольника = " + length * width);
    }

    public void square(int length, int width){
        System.out.println("Параметры были изменены, площадь прямоугольника = " + length * width);
    }
}
