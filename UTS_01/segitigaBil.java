package UTS;
import java.util.Scanner;
public class segitigaBil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = scanner.nextInt();
        int angka = 1;
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka++ + " ");
            }
            System.out.println();
        }
    }
}