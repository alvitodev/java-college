package P13_Inheritance;

// Circle.java
public class Circle extends Shape {
    private double radius;

    // Konstruktor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override getName untuk mengembalikan nama bentuk
    @Override
    public String getName() {
        return "Circle";
    }

    // Override getArea untuk menghitung luas lingkaran
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method tambahan untuk mendapatkan radius
    public double getRadius() {
        return radius;
    }

    // Method tambahan untuk mengatur radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
