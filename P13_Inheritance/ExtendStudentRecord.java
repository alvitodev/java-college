package P13_Inheritance;

// Ekstensi StudentRecord: ExtendStudentRecord.java
public class ExtendStudentRecord extends StudentRecord {

    // Atribut privat untuk menyimpan tingkat pengetahuan komputer
    private String computerKnowledgeLevel;

    // Konstruktor untuk memperluas objek StudentRecord
    // Mendapat semua informasi dari StudentRecord dan tingkat pengetahuan komputer
    public ExtendStudentRecord(String name, int age, double englishScore, double scienceScore, double mathScore, String computerKnowledgeLevel) {
        super(name, age, englishScore, scienceScore, mathScore);
        this.computerKnowledgeLevel = computerKnowledgeLevel;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Tingkat Pengetahuan Komputer: " + computerKnowledgeLevel);
    }

    // Metode untuk mengubah tingkat pengetahuan komputer
    public void setComputerKnowledgeLevel(String level) {
        this.computerKnowledgeLevel = level;
    }

    // Metode untuk mendapatkan tingkat pengetahuan komputer
    public String getComputerKnowledgeLevel() {
        return computerKnowledgeLevel;
    }
}