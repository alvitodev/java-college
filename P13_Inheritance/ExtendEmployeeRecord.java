package P13_Inheritance;

// Extend EmployeeRecord
public class ExtendEmployeeRecord extends EmployeeRecord {
    private String kompetensi;
    private String keahlian;
    private double gaji;
    private int usia;
    private String posisi;

    // Konstruktor
    public ExtendEmployeeRecord(String nama, int usia, String posisi, double gaji, String kompetensi, String keahlian) {
        super(nama); // Memanggil konstruktor superclass EmployeeRecord
        this.usia = usia;
        this.posisi = posisi;
        this.gaji = gaji;
        this.kompetensi = kompetensi;
        this.keahlian = keahlian;
    }

    // Getter dan Setter untuk masing-masing atribut
    public String getKompetensi() {
        return kompetensi;
    }

    public void setKompetensi(String kompetensi) {
        this.kompetensi = kompetensi;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    // Override metode getDetails() dari EmployeeRecord untuk menampilkan informasi tambahan
    @Override
    public String getDetails() {
        return super.getDetails() +
               "\nUsia: " + usia +
               "\nPosisi: " + posisi +
               "\nGaji: " + gaji +
               "\nKompetensi: " + kompetensi +
               "\nKeahlian: " + keahlian;
    }
}
