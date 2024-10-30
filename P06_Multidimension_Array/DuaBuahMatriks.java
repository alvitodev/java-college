package Pertemuan6;
import javax.swing.JOptionPane;

public class DuaBuahMatriks {
    public static void main(String[] args) {
        int[][][] matrix = {{{2, 9},
                             {1, 5}}, {{5, 17},
                                       {10, 4}}};
        int matriksKe = 0, baris = 0, kolom = 0;
        boolean ditemukan = false;

        String input = JOptionPane.showInputDialog("Masukkan nilai yang akan dicari");
        int dicari = Integer.parseInt(input);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[j].length; k++) {
                    if (matrix[i][j][k] == dicari) {
                        matriksKe = i;
                        baris = j;
                        kolom = k;
                        ditemukan = true;
                        break;
                    }
                } if (ditemukan) {
                    break;
                }
            }
        }
        if (ditemukan) {
            JOptionPane.showMessageDialog(null, "Angka " + dicari + " ditemukan pada matriks ke-" + (matriksKe + 1) + " baris ke-" + (baris + 1) +  " dan kolom ke-" + (kolom + 1));
        } else {
            JOptionPane.showMessageDialog(null, "Angka " + dicari + " tidak ditemukan");
        } 

        // Jumlah kedua matrix
        int[][] matriks1 = matrix[0];
        int[][] matriks2 = matrix[1];
        int[][] hasil = new int[matriks1.length][matriks1[0].length];
        for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks1[0].length; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        System.out.println("Hasil penjumlahan:");
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[i].length; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}