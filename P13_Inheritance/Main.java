package P13_Inheritance;

// Program utama: Main.java
public class Main {

    public static void main(String[] args) {
        // Membangun objek ExtendStudentRecord
        ExtendStudentRecord student = new ExtendStudentRecord(
                "Badrol Salim", 20, 96.0, 70.0, 65.0, "Lanjutan"
        );

        // Menampilkan informasi siswa termasuk tingkat pengetahuan komputer
        student.getDetails();

        // Mengubah tingkat pengetahuan komputer
        student.setComputerKnowledgeLevel("Pemula");
        System.out.println("\nSetelah memperbarui Tingkat Pengetahuan Komputer:");
        student.getDetails();
    }
}