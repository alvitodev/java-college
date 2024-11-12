package P12_Create_Class;

public class BukuAlamat {
    // Inner class Entry untuk data kontak individu
    public static class Entry {
        // Deklarasi atribut
        private String nama;
        private String alamat;
        private String nomorTelepon;
        private String email;
        // Constructor tanpa parameter
        public Entry() {
            this.nama = "";
            this.alamat = "";
            this.nomorTelepon = "";
            this.email = "";
        }
        // Constructor dengan parameter
        public Entry(String nama, String alamat, String nomorTelepon, String email) {
            this.nama = nama;
            this.alamat = alamat;
            this.nomorTelepon = nomorTelepon;
            this.email = email;
        }
        // Accessor dan mutator method untuk nama
        public String getNama() {
            return nama;
        }
        public void setNama(String nama) {
            this.nama = nama;
        }
        // Accessor dan mutator method untuk alamat
        public String getAlamat() {
            return alamat;
        }
        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }
        // Accessor dan mutator method untuk nomor telepon
        public String getNomorTelepon() {
            return nomorTelepon;
        }
        public void setNomorTelepon(String nomorTelepon) {
            this.nomorTelepon = nomorTelepon;
        }
        // Accessor dan mutator method untuk email
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        // Method untuk menampilkan informasi kontak
        public void displayInfo() {
            System.out.println("Nama: " + nama);
            System.out.println("Alamat: " + alamat);
            System.out.println("Nomor Telepon: " + nomorTelepon);
            System.out.println("Email: " + email);
        }
    }
    // Array untuk menampung data Entry hingga 100 kontak
    private Entry[] kontakList;
    private int jumlahKontak;
    // Constructor untuk inisialisasi array dan jumlah kontak
    public BukuAlamat() {
        this.kontakList = new Entry[100];  // Menampung hingga 100 data
        this.jumlahKontak = 0;
    }
    // Method untuk memasukkan data baru
    public void masukkanData(String nama, String alamat, String nomorTelepon, String email) {
        if (jumlahKontak < 100) {
            kontakList[jumlahKontak] = new Entry(nama, alamat, nomorTelepon, email);
            jumlahKontak++;
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("Buku alamat penuh.");
        }
    }
    // Method untuk menghapus data berdasarkan nama
    public void hapusData(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i < jumlahKontak; i++) {
            if (kontakList[i].getNama().equalsIgnoreCase(nama)) {
                for (int j = i; j < jumlahKontak - 1; j++) {
                    kontakList[j] = kontakList[j + 1];
                }
                kontakList[jumlahKontak - 1] = null;
                jumlahKontak--;
                ditemukan = true;
                System.out.println("Data [ " + nama + " ] berhasil dihapus.");
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }
    // Method untuk menampilkan seluruh data
    public void tampilkanSeluruhData() {
        if (jumlahKontak == 0) {
            System.out.println("Buku alamat kosong.");
        } else {
            System.out.println("[ Daftar kontak pada buku alamat: ]");
            for (int i = 0; i < jumlahKontak; i++) {
                System.out.println("Kontak ke-" + (i + 1) + ":");
                kontakList[i].displayInfo();
                System.out.println();
            }
        }
    }
    // Method untuk memperbarui data berdasarkan nama
    public void updateData(String nama, String alamat, String nomorTelepon, String email) {
        boolean ditemukan = false;
        for (int i = 0; i < jumlahKontak; i++) {
            if (kontakList[i].getNama().equalsIgnoreCase(nama)) {
                kontakList[i].setAlamat(alamat);
                kontakList[i].setNomorTelepon(nomorTelepon);
                kontakList[i].setEmail(email);
                ditemukan = true;
                System.out.println("Data [ " + nama + " ] berhasil diperbarui.");
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }
    // Main method
    public static void main(String[] args) {
        BukuAlamat bukuAlamat = new BukuAlamat();

        // Menambah beberapa data kontak
        bukuAlamat.masukkanData("Anggun Mawar", "Jl. Mawar No.5", "08111333555", "anggunmawar@uny.ac.id");
        bukuAlamat.masukkanData("Natasya Sabrina", "Jl. Melati No.10", "08222244446", "natasya@uny.ac.id");

        // Menampilkan seluruh data
        bukuAlamat.tampilkanSeluruhData();

        // Memperbarui data kontak "Anggun Mawar"
        bukuAlamat.updateData("Anggun Mawar", "Jl. Basuki Rahmad No. 15", "08333779999", "anggunmawar.new@uny.ac.id");

        // Menampilkan seluruh data setelah update
        bukuAlamat.tampilkanSeluruhData();

        // Menghapus data kontak "Natasya Sabrina"
        bukuAlamat.hapusData("Natasya Sabrina");

        // Menampilkan seluruh data setelah penghapusan
        bukuAlamat.tampilkanSeluruhData();
    }
}
