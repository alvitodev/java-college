package P13_Inheritance;

// Assuming StudentRecord is the superclass
public class AdvancedStudentRecord extends StudentRecord {
    private String computerKnowledgeLevel;

    // Constructor
    public AdvancedStudentRecord(String name, int age, double grade1, double grade2, double grade3, String computerKnowledgeLevel) {
        super(name, age, grade1, grade2, grade3);
        this.computerKnowledgeLevel = computerKnowledgeLevel;
    }

    // Getter for computer knowledge level
    public String getComputerKnowledgeLevel() {
        return computerKnowledgeLevel;
    }

    // Setter for computer knowledge level
    public void setComputerKnowledgeLevel(String computerKnowledgeLevel) {
        this.computerKnowledgeLevel = computerKnowledgeLevel;
    }

    // Overriding displayInfo method to include computer knowledge level
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method to display basic information
        System.out.println("Computer Knowledge Level: " + computerKnowledgeLevel);
    }
}
