package P13_Inheritance;

// Kelas induk: StudentRecord.java
public class StudentRecord {

    // Atribut privat untuk menyimpan informasi siswa
    private String name;
    private int age;
    private double englishScore;
    private double scienceScore;
    private double mathScore;

    // Konstruktor untuk menginisialisasi objek StudentRecord
    // Mendapat nama, umur, dan nilai ujian (Bahasa Inggris, Sains, Matematika)
    public StudentRecord(String name, int age, double englishScore, double scienceScore, double mathScore) {
        this.name = name;
        this.age = age;
        this.englishScore = englishScore;
        this.scienceScore = scienceScore;
        this.mathScore = mathScore;
    }

    // Metode untuk mendapatkan nama siswa
    public String getName() {
        return name;
    }

    // Metode untuk mendapatkan umur siswa
    public int getAge() {
        return age;
    }

    // Metode untuk mendapatkan nilai Bahasa Inggris
    public double getEnglishScore() {
        return englishScore;
    }

    // Metode untuk mendapatkan nilai Sains
    public double getScienceScore() {
        return scienceScore;
    }

    // Metode untuk mendapatkan nilai Matematika
    public double getMathScore() {
        return mathScore;
    }

    // Metode untuk menghitung rata-rata nilai
    public double getAverageScore() {
        return (englishScore + scienceScore + mathScore) / 3;
    }

    // Metode untuk menampilkan informasi siswa secara detail
    public void getDetails() {
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
        System.out.println("Nilai Bahasa Inggris: " + englishScore);
        System.out.println("Nilai Sains: "  + scienceScore);
        System.out.println("Nilai Matematika: " + mathScore);
        System.out.println("Rata-rata Nilai: " + getAverageScore());
    }
}