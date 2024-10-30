package Pertemuan6;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        // Deklarasi array bertipe char dengan panjang 20
        char[] karakter = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z'};

        // Input karakter dari keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan karakter yang ingin dicari: ");
        char karakterDicari = scanner.next().charAt(0); // charAt berfungsi mengonversi string ke char dari string index ke-0
        scanner.close();

        // Tampilkan isi array
        System.out.println("Isi array:");
        for (int i = 0; i < karakter.length; i++) {
            System.out.print(karakter[i] + " ");
        }
        System.out.println();

        // Cari karakter dalam array
        boolean ditemukan = false;
        for (int i = 0; i < karakter.length; i++) {
            if (karakter[i] == karakterDicari) {
                ditemukan = true;
            }
        }

        // Output hasil pencarian
        if (ditemukan) {
            System.out.println("Karakter " + karakterDicari + " ditemukan dalam array.");
        } else {
            System.out.println("Karakter " + karakterDicari + " tidak ditemukan dalam array.");
        }
    }
}