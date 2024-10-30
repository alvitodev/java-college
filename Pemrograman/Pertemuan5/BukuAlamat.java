package Pemrograman.Pertemuan5;

public class BukuAlamat {
    public static void main(String[] args) {
        // Inisialisasi array multidimensi untuk buku alamat
        String[][] bukuAlamat = {{"Florence", "735-1234", "Manila"},
                                 {"Joyce", "983-3333", "Quezon City"},
                                 {"Becca", "456-3322", "Manila"}};

        // Looping untuk mencetak setiap entri dalam buku alamat
        for (int i = 0; i < bukuAlamat.length; i++) {
            String[] entry = bukuAlamat[i];
            System.out.println("Name \t: " + entry[0]);
            System.out.println("Tel. # \t: " + entry[1]);
            System.out.println("Address : " + entry[2]);
            System.out.println();
        }
    }
}