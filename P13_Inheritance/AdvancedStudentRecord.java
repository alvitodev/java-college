package P13_Inheritance;

// Subclass: AdvancedStudentRecord.java
public class AdvancedStudentRecord extends StudentRecord {
    private String computerKnowledgeLevel; // Additional attribute

    // Constructor
    public AdvancedStudentRecord(String name, int age, double englishScore, double scienceScore, double mathScore, String computerKnowledgeLevel) {
        super(name, age, englishScore, scienceScore, mathScore);
        this.computerKnowledgeLevel = computerKnowledgeLevel;
    }

    // Override displayInfo method to include computer knowledge level
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Computer Knowledge Level: " + computerKnowledgeLevel);
    }

    // Setter for computer knowledge level
    public void setComputerKnowledgeLevel(String level) {
        this.computerKnowledgeLevel = level;
    }

    // Getter for computer knowledge level
    public String getComputerKnowledgeLevel() {
        return computerKnowledgeLevel;
    }
}