package Pertemuan6;

public class Latihan5 {
    public static void main(String[] args) {
        int[] angka = new int[10]; // Membuat array dengan 10 elemen

        angka[1] = 8; // Memasukkan nilai 8 pada beberapa indeks
        angka[4] = 8;
        angka[8] = 8;

        System.out.print("Isi array: ");
        for (int i = 0; i < angka.length; i++) { // Menampilkan semua elemen array
            System.out.print(angka[i] + " ");
        }
        System.out.println();

        System.out.println("Posisi nilai 8: "); 
        for (int i = 0; i < angka.length; i++) { // Mencari dan menampilkan posisi nilai 8
            if (angka[i] == 8) {
                System.out.println("Index ke-" + i);
            }
        }
    }
}