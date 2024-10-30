package P05_Array;

import javax.swing.*;

public class NewClass2 {
    public static void main(String[] args) {
        int data[] = new int[10];

        // Input data ke array
        for (int a = 0; a < data.length; a++) {
            data[a] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Element Index ke-" + a));
            System.out.println("Index ke-" + a + " adalah " + data[a]);
        }

        // Input nilai yang ingin dicari
        int nilaiCari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai yang ingin dicari:"));

        // Cari posisi index nilai yang dicari
        int index = -1; // -1 agar tidak terjadi ambiguitas ketika ada nilai yang ditemukan pada index 0
        for (int i = 0; i < data.length; i++) {
            if (data[i] == nilaiCari) { // Jika ada data yang sama dengan nilaiCari
                index = i; // Set index ke i 
                break;
            }
        }

        // Jika nilai ditemukan, tukar dengan nilai baru
        if (index != -1) {
            int nilaiBaru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai baru untuk index ke-" + index + ":"));
            data[index] = nilaiBaru;

            // Tampilkan kembali array setelah perubahan
            System.out.println("Array setelah perubahan:");
            for (int i = 0; i < data.length; i++) {
                System.out.println("Index ke-" + i + " adalah " + data[i]);
            }
        } else { // Jika tidak ditemukan
            System.out.println("Nilai " + nilaiCari + " tidak ditemukan dalam array.");
        }
    }
}