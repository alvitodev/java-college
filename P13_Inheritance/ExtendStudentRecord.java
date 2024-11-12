package P13_Inheritance;


public class ExtendStudentRecord extends StudentRecord {
    private List<String> programmingLanguages;
    private List<String> projects;
    private List<String> certifications;

    // Constructor
    public ExtendStudentRecord(String name, int age, List<String> programmingLanguages,
                                 List<String> projects, List<String> certifications) {
        super(name, age); // Call to superclass constructor
        this.programmingLanguages = programmingLanguages;
        this.projects = projects;
        this.certifications = certifications;
    }

    // Getters and Setters
    public List<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(List<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public List<String> getProjects() {
        return projects;
    }

    public void setProjects(List<String> projects) {
        this.projects = projects;
    }

    public List<String> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<String> certifications) {
        this.certifications = certifications;
    }

    // Override displayRecord method
    @Override
    public void displayRecord() {
        super.displayRecord(); // Call superclass method to display basic student info
        System.out.println("Programming Languages: " + programmingLanguages);
        System.out.println("Projects: " + projects);
        System.out.println("Certifications: " + certifications);
    }
}
