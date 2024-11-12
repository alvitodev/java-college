package P13_Inheritance;

// Superclass 
public class EmployeeRecord {
    protected String nama; // Nama karyawan

    // Konstruktor
    public EmployeeRecord(String nama) {
        this.nama = nama;
    }

    // Getter untuk nama karyawan
    public String getNama() {
        return nama;
    }

    // Setter untuk nama karyawan
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method untuk mendapatkan detail karyawan
    public String getDetails() {
        return "Nama: " + nama;
    }
}