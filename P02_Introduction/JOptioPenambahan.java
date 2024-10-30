package P02_Introduction;
import javax.swing.JOptionPane;

public class JOptioPenambahan {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan pertama"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan kedua"));
            String msg = "Hasil penjumlahan " + a +" + " + b + " = " + (a+b);
            JOptionPane.showMessageDialog(null, msg); }
        catch (NumberFormatException e) {
            String msgError = "Bilangan yang anda masukkan salah!";
            JOptionPane.showMessageDialog(null, msgError);
        }
    }
}