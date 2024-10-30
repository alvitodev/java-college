package P06_Multidimension_Array;

import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ukuran baris dan kolom matriks
        System.out.print("Masukkan jumlah baris: ");
        int baris = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = scanner.nextInt();

        // Membuat matriks 2 dimensi
        int[][] matriks = new int[baris][kolom];

        // Mengisi elemen matriks
        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = scanner.nextInt();
            }
        }

        // Mengalikan setiap elemen dengan 5
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j] *= 5;
            }
        }

        // Menampilkan matriks hasil
        System.out.println("Matriks setelah dikalikan 5:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}