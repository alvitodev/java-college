package P13_Inheritance;

public class MainShape {
    public static void main(String[] args) {
        // Membuat objek Circle dengan radius 5.0
        Shape circle = new Circle(5.0);
        System.out.println("Shape: " + circle.getName());
        System.out.println("Area: " + circle.getArea() + "cm");

        System.out.println(); // Pembatas output

        // Membuat objek Square dengan panjang sisi 4.0
        Shape square = new Square(4.0);
        System.out.println("Shape: " + square.getName());
        System.out.println("Area: " + square.getArea() + "cm");
    }
}