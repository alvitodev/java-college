package Pertemuan6;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama: "); // Input nama mahasiswa
        String nama = scanner.nextLine();

        System.out.print("Jumlah nilai: "); // Input jumlah nilai
        int jumlahNilai = scanner.nextInt(); 
        int totalNilai = 0; // Inisialisasi variabel untuk menampung total nilai

        for (int i = 1; i <= jumlahNilai; i++) { // Input nilai-nilai
            System.out.print("Nilai-" + i + ": ");
            int nilai = scanner.nextInt();
            totalNilai += nilai;
        }
        scanner.close();
        double rataRata = (double) totalNilai / jumlahNilai; // Hitung nilai rata-rata menggunakan double agar mendapat nilai pecahan

        System.out.println(nama + ", nilai rata-rata adalah " + rataRata); // Output
    }
}