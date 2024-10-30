package Pertemuan7;
import javax.swing.JOptionPane;

public class HitungVolumeBangun {
    // Method untuk menghitung volume kubus
    public static double hitungVolumeKubus(double sisi) {
        return sisi * sisi * sisi;
    }
    // Method untuk menghitung volume balok
    public static double hitungVolumeBalok(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }
    // Method untuk menghitung volume tabung
    public static double hitungVolumeTabung(double jarijari, double tinggi) {
        return Math.PI * jarijari * jarijari * tinggi;
    }
    public static void main(String[] args) {
        try {
            // Menampilkan daftar bangun
            String daftarBangun = "Daftar Bangun:\n1. Kubus\n2. Balok\n3. Tabung";
            String pilihanInput = JOptionPane.showInputDialog(daftarBangun + "\nMasukkan nomor bangun yang ingin dihitung:");
            // Konversi input pengguna ke nomor
            int pilihan = Integer.parseInt(pilihanInput);
            switch (pilihan) {
                case 1:
                    // Input sisi kubus
                    String sisiInput = JOptionPane.showInputDialog("Masukkan panjang sisi kubus (cm):");
                    double sisi = Double.parseDouble(sisiInput);
                    double volumeKubus = hitungVolumeKubus(sisi);
                    JOptionPane.showMessageDialog(null, "Volume Kubus: " + volumeKubus + " cm³");
                    break;
                case 2:
                    // Input panjang, lebar, dan tinggi balok
                    String panjangInput = JOptionPane.showInputDialog("Masukkan panjang balok (cm):");
                    String lebarInput = JOptionPane.showInputDialog("Masukkan lebar balok (cm):");
                    String tinggiBalokInput = JOptionPane.showInputDialog("Masukkan tinggi balok (cm):");
                    double panjang = Double.parseDouble(panjangInput);
                    double lebar = Double.parseDouble(lebarInput);
                    double tinggiBalok = Double.parseDouble(tinggiBalokInput);
                    double volumeBalok = hitungVolumeBalok(panjang, lebar, tinggiBalok);
                    JOptionPane.showMessageDialog(null, "Volume Balok: " + volumeBalok + " cm³");
                    break;
                case 3:
                    // Input jari-jari dan tinggi tabung
                    String jarijariInput = JOptionPane.showInputDialog("Masukkan jari-jari tabung (cm):");
                    String tinggiTabungInput = JOptionPane.showInputDialog("Masukkan tinggi tabung (cm):");
                    double jarijari = Double.parseDouble(jarijariInput);
                    double tinggiTabung = Double.parseDouble(tinggiTabungInput);
                    double volumeTabung = hitungVolumeTabung(jarijari, tinggiTabung);
                    JOptionPane.showMessageDialog(null, "Volume Tabung: " + volumeTabung + " cm³");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Nomor bangun tidak valid.");
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input tidak valid. Harap masukkan angka yang benar.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
        }
    }
}
