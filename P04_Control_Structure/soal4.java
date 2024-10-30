package P04_Control_Structure;

import javax.swing.*;
public class soal4 {
    public static void main(String[] args) {
        String angka = JOptionPane.showInputDialog("Masukkan angka yang anda inginkan: ");
        int n = Integer.parseInt(angka);
        for (int i=1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" "); 
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
        System.out.println();    
        }
    }
}