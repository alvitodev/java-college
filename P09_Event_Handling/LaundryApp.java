import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaundryApp {
    public static void main(String[] args) {
        // Membuat frame utama aplikasi
        JFrame frame = new JFrame("Aplikasi Laundry");
        frame.setSize(540, 450);  // Menentukan ukuran frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Mengatur agar aplikasi tertutup ketika tombol 'X' ditekan
        frame.setLayout(null);  // Menonaktifkan layout manager untuk pengaturan posisi komponen secara manual
        frame.setResizable(false);  // Menonaktifkan opsi resize pada frame
        // Membuat komponen label untuk judul aplikasi
        JLabel title = new JLabel("Aplikasi Laundry", JLabel.CENTER);  // Membuat judul di tengah
        JLabel labelNota = new JLabel("No. Nota:");
        JLabel labelNama = new JLabel("Nama Pelanggan:");
        JLabel labelAlamat = new JLabel("Alamat:");
        JLabel labelJenis = new JLabel("Jenis Laundry:");
        JLabel labelJumlah = new JLabel("Jumlah (Kg):");
        JLabel labelTambah = new JLabel("Tambahan:");
        JLabel labelTotal = new JLabel("Total Bayar:");
        JLabel labelAntar = new JLabel("Antar Jemput:");
        JLabel labelHasilOutput = new JLabel("Hasil Output:");
        // Membuat text field untuk inputan No. Nota
        JTextField textNota = new JTextField();
        JTextField textNama = new JTextField();
        JTextField textAlamat = new JTextField();
        JTextField textJumlah = new JTextField();
        // Membuat combo box untuk jenis laundry dan input harga laundry
        JTextField textLaundryPrice = new JTextField();  // Inputan harga laundry
        String[] laundryTypes = {"Reguler", "Express"};  // Pilihan jenis laundry
        JComboBox<String> comboLaundry = new JComboBox<>(laundryTypes);  // Membuat dropdown untuk memilih jenis laundry
        // Checkbox untuk pilihan tambahan Karpet dan Bed Cover dengan input harga
        JCheckBox checkKarpet = new JCheckBox("Karpet");
        JTextField textKarpetPrice = new JTextField();  // Input harga karpet
        JCheckBox checkBedCover = new JCheckBox("Bed Cover");
        JTextField textBedCoverPrice = new JTextField();  // Input harga bed cover
        // Radio button untuk opsi antar jemput
        JRadioButton radioYa = new JRadioButton("Ya");
        JRadioButton radioTidak = new JRadioButton("Tidak");
        // Button group untuk mengelompokkan radio button antar jemput
        ButtonGroup antarGroup = new ButtonGroup();
        antarGroup.add(radioYa);
        antarGroup.add(radioTidak);
        // Text area untuk menampilkan output dengan scroll pane
        JTextArea outputArea = new JTextArea(10, 20);
        outputArea.setEditable(false);  // Agar output tidak bisa diedit
        outputArea.setFont(new java.awt.Font("Comic Sans MS", java.awt.Font.PLAIN, 12));  // Mengatur font text menjadi Comic Sans MS
        JScrollPane scrollOutput = new JScrollPane(outputArea);  // Menambahkan scroll pane pada text 
        // Label untuk menampilkan total harga
        JLabel labelTotalAmount = new JLabel();
        // Membuat tombol untuk tampilkan, bersihkan, dan keluar
        JButton buttonTampil = new JButton("Tampil");
        JButton buttonBersih = new JButton("Bersih");
        JButton buttonKeluar = new JButton("Keluar");
        // Menentukan posisi dan ukuran komponen menggunakan setBounds()
        title.setBounds(0, 10, 550, 30);
        title.setFont(title.getFont().deriveFont(18.0f));  // Memperbesar ukuran font pada judul
        labelNota.setBounds(20, 50, 100, 20);
        textNota.setBounds(140, 50, 150, 20);
        labelNama.setBounds(20, 100, 120, 20);
        textNama.setBounds(140, 100, 150, 20);
        labelAlamat.setBounds(20, 130, 100, 20);
        textAlamat.setBounds(140, 130, 150, 20);
        labelJenis.setBounds(20, 160, 100, 20);
        comboLaundry.setBounds(140, 160, 100, 20);
        textLaundryPrice.setBounds(250, 160, 80, 20); 
        labelJumlah.setBounds(20, 190, 100, 20);
        textJumlah.setBounds(140, 190, 150, 20);
        labelTambah.setBounds(20, 220, 100, 20);
        checkKarpet.setBounds(140, 220, 100, 20);
        textKarpetPrice.setBounds(250, 220, 80, 20); 
        checkBedCover.setBounds(140, 250, 100, 20);
        textBedCoverPrice.setBounds(250, 250, 80, 20); 
        labelAntar.setBounds(20, 280, 100, 20);
        radioYa.setBounds(140, 280, 50, 20);
        radioTidak.setBounds(200, 280, 60, 20);
        buttonTampil.setBounds(20, 320, 80, 20);
        buttonBersih.setBounds(120, 320, 80, 20);
        buttonKeluar.setBounds(220, 320, 80, 20);
        labelHasilOutput.setBounds(350, 50, 100, 20);
        scrollOutput.setBounds(350, 70, 150, 220);  // ScrollPane untuk text area
        labelTotal.setBounds(20, 360, 100, 20);
        labelTotalAmount.setBounds(140, 360, 150, 20);  // Label untuk total harga
        // Menambahkan komponen ke dalam frame
        frame.add(title);
        frame.add(labelNota);
        frame.add(textNota);
        frame.add(labelNama);
        frame.add(textNama);
        frame.add(labelAlamat);
        frame.add(textAlamat);
        frame.add(labelJenis);
        frame.add(comboLaundry);
        frame.add(textLaundryPrice);
        frame.add(labelJumlah);
        frame.add(textJumlah);
        frame.add(labelTambah);
        frame.add(checkKarpet);
        frame.add(textKarpetPrice);
        frame.add(checkBedCover);
        frame.add(textBedCoverPrice);
        frame.add(labelAntar);
        frame.add(radioYa);
        frame.add(radioTidak);
        frame.add(buttonTampil);
        frame.add(buttonBersih);
        frame.add(buttonKeluar);
        frame.add(labelHasilOutput);
        frame.add(scrollOutput);
        frame.add(labelTotal);
        frame.add(labelTotalAmount);
        // Action listener untuk tombol Tampil
        buttonTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengambil data dari input
                String nota = textNota.getText();
                String nama = textNama.getText();
                String alamat = textAlamat.getText();
                String jenisLaundry = comboLaundry.getSelectedItem().toString();
                // Mengambil harga laundry dan jumlah kilogram
                int hargaLaundry = Integer.parseInt(textLaundryPrice.getText());
                int jumlahKg = Integer.parseInt(textJumlah.getText());
                // Menghitung total harga
                int totalHarga = hargaLaundry * jumlahKg;
                // Jika karpet dipilih, tambahkan harga karpet
                if (checkKarpet.isSelected()) {
                    totalHarga += Integer.parseInt(textKarpetPrice.getText());
                }
                // Jika bed cover dipilih, tambahkan harga bed cover
                if (checkBedCover.isSelected()) {
                    totalHarga += Integer.parseInt(textBedCoverPrice.getText());
                }
                // Memilih opsi antar jemput
                String antar = radioYa.isSelected() ? "Ya" : "Tidak";
                // Menampilkan hasil di text area
                outputArea.setText("No. Nota : " + nota + "\n" +
                                   "Nama : " + nama + "\n" +
                                   "Alamat : " + alamat + "\n" +
                                   "Jenis Laundry : " + jenisLaundry + "\n" +
                                   "Jumlah : " + jumlahKg + " Kg\n" +
                                   "Antar Jemput : " + antar);
                
                // Menampilkan total harga
                labelTotalAmount.setText("Rp " + totalHarga);
            }
        });
        // Action listener untuk tombol Bersih dengan dialog konfirmasi
        buttonBersih.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Konfirmasi sebelum membersihkan field
                int response = JOptionPane.showConfirmDialog(frame, "Apakah Anda yakin ingin membersihkan semua field?", "Konfirmasi Bersih", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    // Jika ya, bersihkan semua field
                    textNota.setText("");
                    textNama.setText("");
                    textAlamat.setText("");
                    textJumlah.setText("");
                    comboLaundry.setSelectedIndex(0);
                    textLaundryPrice.setText("");
                    checkKarpet.setSelected(false);
                    textKarpetPrice.setText("");
                    checkBedCover.setSelected(false);
                    textBedCoverPrice.setText("");
                    antarGroup.clearSelection();  
                    outputArea.setText(""); 
                    labelTotalAmount.setText("");  // Bersihkan semua input
                }
            }
        });
        // Action listener untuk tombol Keluar
        buttonKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();  // Menutup aplikasi
            }
        });
        // Menampilkan frame
        frame.setVisible(true);
    }
}
