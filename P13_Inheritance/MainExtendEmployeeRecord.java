package P13_Inheritance;

// Program Main untuk ExtendedEmployeeRecord
import java.util.ArrayList;

public class MainExtendEmployeeRecord {
    public static void main(String[] args) {
        // Membuat daftar karyawan
        ArrayList<ExtendEmployeeRecord> daftarKaryawan = new ArrayList<>();

        // Menambahkan beberapa karyawan dengan informasi lengkap
        daftarKaryawan.add(new ExtendEmployeeRecord("Ujang", 30, "Manajer", 1500000.0, "Komunikasi", "Manajemen Proyek"));
        daftarKaryawan.add(new ExtendEmployeeRecord("Adit", 25, "Staf Administrasi", 800000.0, "Organisasi", "Administrasi"));
        daftarKaryawan.add(new ExtendEmployeeRecord("Denis", 40, "Supervisor", 1200000.0, "Kepemimpinan", "Pengawasan"));

        // Menampilkan detail setiap karyawan
        System.out.println("Informasi Semua Karyawan:");
        for (ExtendEmployeeRecord karyawan : daftarKaryawan) {
            System.out.println("----------------------------------");
            System.out.println(karyawan.getDetails());
        }

        System.out.println("\n===============================\n");

        // Memperbarui informasi karyawan tertentu
        System.out.println("[ Memperbarui informasi karyawan pertama ]");
        ExtendEmployeeRecord karyawanPertama = daftarKaryawan.get(0);
        karyawanPertama.setPosisi("Direktur Operasional");
        karyawanPertama.setGaji(2000000.0);
        karyawanPertama.setKompetensi("Strategi dan Komunikasi");

        // Menampilkan detail karyawan setelah diperbarui
        System.out.println("Detail Karyawan Pertama Setelah Pembaruan:");
        System.out.println("----------------------------------");
        System.out.println(karyawanPertama.getDetails());

        System.out.println("\n===============================\n");

        // Menampilkan total gaji semua karyawan
        double totalGaji = 0;
        for (ExtendEmployeeRecord karyawan : daftarKaryawan) {
            totalGaji += karyawan.getGaji();
        }
        System.out.println("Total Gaji Semua Karyawan: " + totalGaji);
    }
}
