package P04_Control_Structure;

import javax.swing.JOptionPane;

public class GanjilGenapJOptionPane {
    public static void main(String[] args) {
        String jumlah = JOptionPane.showInputDialog("Masukkan jumlah angka:");
        int n = Integer.parseInt(jumlah);
        
        int totalGanjil = 0;  // Untuk menghitung bilangan ganjil
        int totalGenap = 0; // Untuk menghitung bilangan genap
        
        // Memasukkan angka sebanyak n kali
        for (int i = 0; i < n; i++) {
            String nomorInput = JOptionPane.showInputDialog("Masukkan angka ke-" + (i + 1) + ":");
            int nomor = Integer.parseInt(nomorInput);
            
            // Ganjil atau genap
            if (nomor % 2 == 0) {
                totalGenap++;
                JOptionPane.showMessageDialog(null, nomor + " adalah bilangan genap.");
            } else {
                totalGanjil++;
                JOptionPane.showMessageDialog(null, nomor + " adalah bilangan ganjil.");
            }
        }
        
        // Hasil jumlah bilangan ganjil dan genap
        JOptionPane.showMessageDialog(null, "Jumlah bilangan genap: " + totalGenap + "\nJumlah bilangan ganjil: " + totalGanjil);
    }
}
