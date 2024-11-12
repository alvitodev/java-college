package P13_Inheritance;

// Square.java
public class Square extends Shape {
    private double sideLength;

    // Konstruktor
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Override getName untuk mengembalikan nama bentuk
    @Override
    public String getName() {
        return "Square";
    }

    // Override getArea untuk menghitung luas persegi
    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    // Method tambahan untuk mendapatkan panjang sisi
    public double getSideLength() {
        return sideLength;
    }

    // Method tambahan untuk mengatur panjang sisi
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
