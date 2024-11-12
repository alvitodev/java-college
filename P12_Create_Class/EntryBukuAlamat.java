package P12_Create_Class;

public class EntryBukuAlamat {
    // Deklarasi atribut
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String email;
    // Constructor tanpa parameter
    public EntryBukuAlamat() {
        this.nama = "";
        this.alamat = "";
        this.nomorTelepon = "";
        this.email = "";
    }
    // Constructor dengan parameter
    public EntryBukuAlamat(String nama, String alamat, String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }
    // Accessor method untuk nama
    public String getNama() {
        return nama;
    }
    // Mutator method untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    // Accessor method untuk alamat
    public String getAlamat() {
        return alamat;
    }
    // Mutator method untuk alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    // Accessor method untuk nomor telepon
    public String getNomorTelepon() {
        return nomorTelepon;
    }
    // Mutator method untuk nomor telepon
    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
    // Accessor method untuk email
    public String getEmail() {
        return email;
    }
    // Mutator method untuk email
    public void setEmail(String email) {
        this.email = email;
    }
    // Method untuk menampilkan informasi buku alamat
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Email: " + email);
    }
    // Main method 
    public static void main(String[] args) {
        // Membuat objek EntryBukuAlamat
        EntryBukuAlamat contact = new EntryBukuAlamat("Sukamto", "Jl. Gejayan No. 45", "08123456789", "sukamto@uny.ac.id");
        // Menampilkan informasi kontak
        contact.displayInfo();
    }
}
