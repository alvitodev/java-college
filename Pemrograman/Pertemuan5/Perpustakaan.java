package Pemrograman.Pertemuan5;

import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar buku yang tersedia di perpustakaan
        String[] buku = {"Pemrograman Java", "Algoritma dan Struktur Data", "Jaringan Komputer", "Basis Data", "Sistem Operasi"};
        boolean[] statusPeminjaman = new boolean[buku.length]; // false = tersedia, true = dipinjam
        String[] peminjamNama = new String[buku.length];  // Menyimpan nama peminjam
        String[] peminjamNIM = new String[buku.length];   // Menyimpan NIM peminjam

        boolean running = true; // Flag untuk mengontrol apakah program tetap berjalan pada while loop dibawah
        while (running) {
            // Menu utama
            System.out.println("\n=== Menu Perpustakaan ===");
            System.out.println("1. Tampilkan Daftar Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Keluar");

            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine();

            switch (opsi) { // Menuju case tertentu menurut input opsi sebelumnya
                case 1:
                    // Tampilkan daftar buku
                    System.out.println("\nDaftar Buku di Perpustakaan:");
                    for (int i = 0; i < buku.length; i++) { // Output for loop daftar buku
                        if (statusPeminjaman[i]) {
                            System.out.println((i + 1) + ". " + buku[i] + " (Dipinjam oleh " + peminjamNama[i] + ", NIM: " + peminjamNIM[i] + ")");
                        } else {
                            System.out.println((i + 1) + ". " + buku[i] + " (Tersedia)");
                        }
                    }
                    break;

                case 2:
                    // Proses peminjaman buku

                    System.out.println("\nDaftar Buku di Perpustakaan:");
                    for (int i = 0; i < buku.length; i++) { // Menampilkan daftar buku kembali agar aksesibilitas peminjaman mudah
                        if (statusPeminjaman[i]) {
                            System.out.println((i + 1) + ". " + buku[i] + " (Dipinjam oleh " + peminjamNama[i] + ", NIM: " + peminjamNIM[i] + ")");
                        } else {
                            System.out.println((i + 1) + ". " + buku[i] + " (Tersedia)");
                        }
                    }

                    System.out.print("\nMasukkan nomor buku yang ingin dipinjam: ");
                    int pilihan = scanner.nextInt();
                    scanner.nextLine(); 

                    if (pilihan > 0 && pilihan <= buku.length) { // (Jika 1-5)
                        if (!statusPeminjaman[pilihan - 1]) { // Jika statusPeminjaman pada buku pilihan n false(tersedia)
                            // Input nama dan NIM peminjam
                            System.out.print("Masukkan nama peminjam: ");
                            String nama = scanner.nextLine();
                            System.out.print("Masukkan NIM peminjam: ");
                            String nim = scanner.nextLine();

                            // Simpan data peminjaman
                            statusPeminjaman[pilihan - 1] = true; // Jadikan statusPeminjaman true
                            peminjamNama[pilihan - 1] = nama; // Nama peminjam pada buku n = input
                            peminjamNIM[pilihan - 1] = nim; // NIM peminjam pada buku n = input

                            System.out.println("Anda berhasil meminjam buku: " + buku[pilihan - 1]);
                        } else {
                            System.out.println("Maaf, buku tersebut sudah dipinjam.");
                        }
                    } else { // Jika input pilihan nomor buku tidak sesuai banyak data pada buku (1-5)
                        System.out.println("Nomor buku tidak valid.");
                    }
                    break;

                case 3:
                    // Proses pengembalian buku
                    System.out.print("\nMasukkan nomor buku yang ingin dikembalikan: ");
                    int kembali = scanner.nextInt();
                    scanner.nextLine();
                    if (kembali > 0 && kembali <= buku.length) {
                        if (statusPeminjaman[kembali - 1]) { // Jika statusPeminjaman pada buku pilihan n true(dipinjam)
                            // Proses pengembalian buku
                            statusPeminjaman[kembali - 1] = false; // Jadikan status peminjaman buku n = false(tersedia)
                            System.out.println("Buku " + buku[kembali - 1] + " berhasil dikembalikan oleh " + peminjamNama[kembali - 1]);

                            // Kosongkan data peminjam
                            peminjamNama[kembali - 1] = null;
                            peminjamNIM[kembali - 1] = null;
                        } else {
                            System.out.println("Buku tersebut belum dipinjam.");
                        }
                    } else {
                        System.out.println("Nomor buku tidak valid.");
                    }
                    break;

                case 4:
                    // Keluar dari program
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    running = false;
                    break;

                default:
                    System.out.println("Opsi tidak valid, silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
