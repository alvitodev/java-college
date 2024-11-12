package P13_Inheritance;

// Superclass: StudentRecord.java
public class StudentRecord {
    private String name;
    private int age;
    private double englishScore;
    private double scienceScore;
    private double mathScore;

    // Constructor
    public StudentRecord(String name, int age, double englishScore, double scienceScore, double mathScore) {
        this.name = name;
        this.age = age;
        this.englishScore = englishScore;
        this.scienceScore = scienceScore;
        this.mathScore = mathScore;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public double getScienceScore() {
        return scienceScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    // Method to calculate average score
    public double getAverageScore() {
        return (englishScore + scienceScore + mathScore) / 3;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("English Score: " + englishScore);
        System.out.println("Science Score: " + scienceScore);
        System.out.println("Math Score: " + mathScore);
        System.out.println("Average Score: " + getAverageScore());
    }
}