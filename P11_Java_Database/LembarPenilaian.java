package P11_Java_Database;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class LembarPenilaian extends JFrame {
    private JTextField NIM, NAMA;
    private JRadioButton kelasA, kelasB, kelasC;
    private JComboBox<String> cbmatkul;
    private JButton btnCari, btnEdit, btnSimpan, btnHapus, btnKeluar;
    private ButtonGroup bgKelas;
    private JTable table;
    private DefaultTableModel tableModel;
    private Connection con;
    private Statement st;

    public LembarPenilaian() {
        // Inisialisasi koneksi ke database
        try {
            String db_url = "jdbc:mysql://localhost:3306/alvito_24051130033";
            String db_user = "root";
            String db_pw = "";
            con = DriverManager.getConnection(db_url, db_user, db_pw);
            st = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Komponen GUI
        setTitle("Lembar Penilaian");
        setSize(400, 430);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        // Label dan Field untuk NIM
        JLabel lblNIM = new JLabel("NIM");
        lblNIM.setBounds(10, 10, 80, 25);
        add(lblNIM);
        
        NIM = new JTextField();
        NIM.setBounds(100, 10, 180, 25);
        add(NIM);
        
        btnCari = new JButton("Cari");
        btnCari.setBounds(290, 10, 70, 25);
        add(btnCari);

        // Label dan Field untuk Nama
        JLabel lblNama = new JLabel("Nama");
        lblNama.setBounds(10, 40, 50, 25);
        add(lblNama);
        
        NAMA = new JTextField();
        NAMA.setBounds(100, 40, 230, 25);
        add(NAMA);

        // RadioButton untuk Kelas
        JLabel lblKelas = new JLabel("Kelas");
        lblKelas.setBounds(10, 70, 50, 25);
        add(lblKelas);

        kelasA = new JRadioButton("A");
        kelasA.setBounds(100, 70, 40, 25);
        add(kelasA);
        
        kelasB = new JRadioButton("B");
        kelasB.setBounds(150, 70, 40, 25);
        add(kelasB);
        
        kelasC = new JRadioButton("C");
        kelasC.setBounds(200, 70, 40, 25);
        add(kelasC);

        bgKelas = new ButtonGroup();
        bgKelas.add(kelasA);
        bgKelas.add(kelasB);
        bgKelas.add(kelasC);

        // ComboBox untuk mata kuliah
        JLabel lblmatkul = new JLabel("Mata Kuliah");
        lblmatkul.setBounds(10, 100, 120, 25);
        add(lblmatkul);
        
        cbmatkul = new JComboBox<>(new String[]{"Kalkulus", "Pemrograman", "Basis Data"});
        cbmatkul.setBounds(100, 100, 150, 25);
        add(cbmatkul);

        // Tombol untuk tindakan
        btnEdit = new JButton("Edit");
        btnEdit.setBounds(10, 140, 80, 25);
        add(btnEdit);
        
        btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(100, 140, 80, 25);
        add(btnSimpan);
        
        btnHapus = new JButton("Hapus");
        btnHapus.setBounds(190, 140, 80, 25);
        add(btnHapus);
        
        btnKeluar = new JButton("Keluar");
        btnKeluar.setBounds(280, 140, 80, 25);
        add(btnKeluar);

        // JTable and Table Model
        tableModel = new DefaultTableModel(new String[]{"NIM", "Nama", "Kelas", "matkul"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 180, 360, 200);
        add(scrollPane);

        // Event Handling
        btnCari.addActionListener(e -> cariData());
        btnEdit.addActionListener(e -> editData());
        btnSimpan.addActionListener(e -> simpanData());
        btnHapus.addActionListener(e -> hapusData());
        btnKeluar.addActionListener(e -> System.exit(0));

        loadData();
        setVisible(true);
    }

    private void loadData() {
        try {
            tableModel.setRowCount(0); 
            ResultSet rs = st.executeQuery("SELECT * FROM data_mahasiswa");
            while (rs.next()) {
                String nim = rs.getString("nim");
                String nama = rs.getString("nama");
                String kelas = rs.getString("kelas");
                String matkul = rs.getString("matkul");
                tableModel.addRow(new Object[]{nim, nama, kelas, matkul});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void cariData() {
        try {
            String query = "SELECT * FROM data_mahasiswa WHERE nim = '" + NIM.getText() + "'";
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                NAMA.setText(rs.getString("nama"));
                String kelas = rs.getString("kelas");
                kelasA.setSelected("A".equals(kelas));
                kelasB.setSelected("B".equals(kelas));
                kelasC.setSelected("C".equals(kelas));
                cbmatkul.setSelectedItem(rs.getString("matkul"));
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void editData() {
        try {
            String kelas = kelasA.isSelected() ? "A" : kelasB.isSelected() ? "B" : "C";
            String query = "UPDATE data_mahasiswa SET nama = '" + NAMA.getText() + 
                           "', kelas = '" + kelas + "', matkul = '" + cbmatkul.getSelectedItem() + 
                           "' WHERE nim = '" + NIM.getText() + "'";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Data berhasil diperbarui");
            loadData(); 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void simpanData() {
        try {
            // Cek apakah data dengan NIM yang sama sudah ada
            String checkQuery = "SELECT * FROM data_mahasiswa WHERE nim = '" + NIM.getText() + "'";
            ResultSet rs = st.executeQuery(checkQuery);
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Data dengan NIM ini sudah ada!");
                return;
            }

            String kelas = kelasA.isSelected() ? "A" : kelasB.isSelected() ? "B" : "C";
            String query = "INSERT INTO data_mahasiswa (nim, nama, kelas, matkul) VALUES ('" +
                           NIM.getText() + "', '" + NAMA.getText() + "', '" + kelas + "', '" +
                           cbmatkul.getSelectedItem() + "')";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
            loadData(); 
        } catch (SQLException ex) {
            ex.printStackTrace();            
        }
    }

    private void hapusData() {
        try {
            String query = "DELETE FROM data_mahasiswa WHERE nim = '" + NIM.getText() + "'";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
            NIM.setText("");
            NAMA.setText("");
            bgKelas.clearSelection();
            cbmatkul.setSelectedIndex(0);
            loadData(); 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new LembarPenilaian();
    }
}
