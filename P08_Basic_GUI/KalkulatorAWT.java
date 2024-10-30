package P08_Basic_GUI;
import java.awt.*;

import java.awt.event.*;

public class KalkulatorAWT extends Frame implements ActionListener {
    // Menambah elemen
    TextField textField;
    Button[] tombol = new Button[10];
    Button[] tombolOperasi = new Button[6]; 
    Button tambah, kurang, kali, bagi, hasilOperasi, clearTextField;
    double angka1 = 0, angka2 = 0, hasil = 0;
    char operator;

    public KalkulatorAWT() {
        // Window
        setTitle("Kalkulator");
        setSize(230, 260);
        setLayout(null);
        // TextField
        textField = new TextField();
        textField.setBounds(20, 40, 190, 30);
        add(textField);
        // Tombol operator
        tambah = new Button("+");
        kurang = new Button("-");
        kali = new Button("*");
        bagi = new Button("/");
        hasilOperasi = new Button("=");
        clearTextField = new Button("C");
        tombolOperasi[0] = tambah;
        tombolOperasi[1] = kurang;
        tombolOperasi[2] = kali;
        tombolOperasi[3] = bagi;
        tombolOperasi[4] = hasilOperasi;
        tombolOperasi[5] = clearTextField;
        // Menambah tombol operator
        for (int i = 0; i < 6; i++) {
            tombolOperasi[i].addActionListener(this);
        }
        // Menambah tombol angka 
        for (int i = 0; i < 10; i++) {
            tombol[i] = new Button(String.valueOf(i));
            tombol[i].addActionListener(this);
        }
        // Mengatur posisi dan ukuran tombol 
        tombol[1].setBounds(20, 80, 40, 35);
        tombol[2].setBounds(70, 80, 40, 35);
        tombol[3].setBounds(120, 80, 40, 35);
        tambah.setBounds(170, 80, 40, 35);
        tombol[4].setBounds(20, 120, 40, 35);
        tombol[5].setBounds(70, 120, 40, 35);
        tombol[6].setBounds(120, 120, 40, 35);
        kurang.setBounds(170, 120, 40, 35);
        tombol[7].setBounds(20, 160, 40, 35);
        tombol[8].setBounds(70, 160, 40, 35);
        tombol[9].setBounds(120, 160, 40, 35);
        kali.setBounds(170, 160, 40, 35);
        tombol[0].setBounds(20, 200, 40, 35);
        clearTextField.setBounds(70, 200, 40, 35);
        hasilOperasi.setBounds(120, 200, 40, 35);
        bagi.setBounds(170, 200, 40, 35);
        // Menambah tombol angka pada frame
        for (int i = 0; i < 10; i++) {
            add(tombol[i]);
        }
        // Menambah tombol operasi pada frame
        for (int i = 0; i < 6; i++) { 
            add(tombolOperasi[i]);
        }
        // Fungsi untuk close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setResizable(false);
        setVisible(true);
    }
    // Fungsi operasi kalkulator
    @Override
    public void actionPerformed(ActionEvent e) {
        // Mengambil angka dari textfield
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == tombol[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == clearTextField) {
            textField.setText("");
        }
        if (e.getSource() == tambah) {
            angka1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == kurang) {
            angka1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == kali) {
            angka1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == bagi) {
            angka1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == hasilOperasi) {
            angka2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    hasil = angka1 / angka2;
                    break;
            }
            textField.setText(String.valueOf(hasil));
            angka1 = hasil;
        }
    }
    public static void main(String[] args) {
        new KalkulatorAWT();
    }
}
