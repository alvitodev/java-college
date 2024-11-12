package P13_Inheritance;

// Main program: Main.java
public class Main {
    public static void main(String[] args) {
        // Creating an instance of AdvancedStudentRecord
        AdvancedStudentRecord student = new AdvancedStudentRecord(
            "John Doe", 16, 85.0, 90.0, 88.0, "Intermediate"
        );

        // Display the student information including computer knowledge level
        student.displayInfo();

        // Changing the computer knowledge level
        student.setComputerKnowledgeLevel("Advanced");
        System.out.println("\nAfter updating Computer Knowledge Level:");
        student.displayInfo();
    }
}