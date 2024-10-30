package P07_Exception_Handling_and_Method;
import java.util.Scanner;

public class HitungSigma {
    // Fungsi untuk menghitung nilai y
    public static int hitungSigma(int x, int n) {
        int y = 0;
        for (int i = 1; i <= n; i++) {
            y += (x + 2 * i); // Rumus: x + 2i
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            // Input nilai x dan n dari pengguna
            System.out.print("Masukkan nilai x: ");
            int x = input.nextInt();
            System.out.print("Masukkan nilai n: ");
            int n = input.nextInt();
            // n tidak negatif atau nol (mutlak)
            if (n <= 0) {
                throw new IllegalArgumentException("n harus lebih besar dari nol.");
            }
            // Hitung hasil
            int hasil = hitungSigma(x, n);
            System.out.println("Hasil y: " + hasil);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input tidak valid, harap masukkan angka yang benar.");
        } finally {
            input.close(); // Menutup input scanner
        }
    }
}
