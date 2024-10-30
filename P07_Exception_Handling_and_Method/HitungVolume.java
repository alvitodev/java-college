package P07_Exception_Handling_and_Method;
import java.util.Scanner;

public class HitungVolume {
    // Method untuk menghitung volume tabung
    public static double volumeTabung(double diameter, double tinggi) {
        double jarijari = diameter / 2;
        return Math.PI * jarijari * jarijari * tinggi;
    }
    // Method untuk menghitung volume kerucut
    public static double volumeKerucut(double diameter, double tinggi) {
        double jarijari = diameter / 2;
        return (1.0 / 3.0) * Math.PI * jarijari * jarijari * tinggi;
    }
    // Method untuk menghitung volume bola
    public static double volumeBola(double diameter) {
        double jarijari = diameter / 2;
        return (4.0 / 3.0) * Math.PI * Math.pow(jarijari, 3);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            // Input diameter dari pengguna
            System.out.print("Masukkan diameter (dalam cm): ");
            double diameter = input.nextDouble();
            
            // Diameter tidak negatif atau nol
            if (diameter <= 0) {
                throw new IllegalArgumentException("Diameter harus lebih besar dari nol.");
            }

            // Input tinggi untuk tabung dan kerucut
            System.out.print("Masukkan tinggi (dalam cm, untuk tabung/kerucut): ");
            double tinggi = input.nextDouble();

            // Output hasil perhitungan volume
            System.out.println("Volume Tabung: " + volumeTabung(diameter, tinggi) + " cm³");
            System.out.println("Volume Kerucut: " + volumeKerucut(diameter, tinggi) + " cm³");
            System.out.println("Volume Bola: " + volumeBola(diameter) + " cm³");
        // ExceptionHandling
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input tidak valid, harap masukkan angka yang benar.");
        } finally {
            input.close(); // Menutup input scanner
            System.out.println("Program selesai.");
        }
    }
}
