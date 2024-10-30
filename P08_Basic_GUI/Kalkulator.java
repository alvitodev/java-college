package P08_Basic_GUI;
import javax.swing.*;

public class Kalkulator extends JFrame {
    JTextField textField;
    JButton[] angka = new JButton[10];
    JButton tambah, kurang, kali, bagi, clear;

    public Kalkulator() {
        setTitle("Kalkulator Sederhana");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Menempatkan jendela di tengah layar

        // Membuat komponen
        textField = new JTextField();
        textField.setBounds(30, 30, 240, 30);

        for (int i = 0; i < 10; i++) {
            angka[i] = new JButton(String.valueOf(i));
        }
        tambah = new JButton("+");
        kurang = new JButton("-");
        kali = new JButton("*");
        bagi = new JButton("/");
        clear = new JButton("C");

        // Menambahkan komponen ke panel
        add(textField);

        int x = 30, y = 80;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                angka[i * 3 + j].setBounds(x, y, 50, 30);
                add(angka[i * 3 + j]);
                x += 60;
            }
            x = 30;
            y += 40;
        }

        tambah.setBounds(190, 80, 50, 30);
        kurang.setBounds(190, 120, 50, 30);
        kali.setBounds(190, 160, 50, 30);
        bagi.setBounds(190, 200, 50, 30);
        clear.setBounds(30, 200, 50, 30);
        angka[9].setBounds(90, 200, 50, 30);
        angka[0].setBounds(150, 200, 50, 30);

        add(tambah);
        add(kurang);
        add(kali);
        add(bagi);
        add(clear);
        add(angka[9]);
        add(angka[0]);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Kalkulator();
    }
}