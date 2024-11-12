package P12_Create_Class;
public class StudentRecord {
    private String name;
    private String address;
    private int    age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;

    private static int studentCount;
    // Menghasilkan nama dari Siswa
    public String getName() {
        return name;
    }
    public double getEnglishGrade() {
        return englishGrade;
    }
    public double getMathGrade() {
        return mathGrade;
    }
    public double getScienceGrade() {
        return scienceGrade;
    }
    // Mengubah nama siswa
    public void setName(String temp) {
        this.name = temp;
    }
    public void setAddress(String temp) {
        this.address = temp;
    }
    public void setAge(int age){
        this.age = age; //SALAH!! -_-
    }
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade; //SALAH!! -_-
    }
    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade; //SALAH!! -_-
    }
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade; //SALAH!! -_-
    }
    // Menghitung rata-rata nilai matematika, bahasa inggris, ilmu sains
    public double getAverage() {
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade) / 3;
        return result;
    }
    
    public String getNumberInWords(int num) {
        String defaultNum = "zero";
        if(num==1){
            return "one";
        } else if (num == 2) {
            return "two";
        }
        return defaultNum;
    }
    // Menghasilkan jumlah instance StudentRecord
    public static int getStudentCount() {
        return studentCount;
    }
    public StudentRecord(){
        // Area inisialisasi kode;
        studentCount++;
        // this("some string");
    }
    public StudentRecord(String temp){
        this.name = temp;
        studentCount++;
    }
    public StudentRecord(String name, String address){
        this.name = name;
        this.address = address;
        studentCount++;
    }
    public StudentRecord(double mGrade, double eGrade, double sGrade){
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
        studentCount++;
    }
    
    public void print(String temp){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age +"\n");
    }
    public void print(double eGrade, double mGrade, double sGrade) {
        System.out.println("Name: "+name);
        System.out.println("Math Grade: "+mGrade);
        System.out.println("English Grade: "+eGrade);
        System.out.println("Science Grade: "+sGrade+"\n");
    }
    
    public static void main(String[] args) {
        // Membuat 3 object StudentRecord
        StudentRecord annaRecord = new StudentRecord("Anna");
        StudentRecord beahRecord = new StudentRecord("Beah", "Philippines");
        StudentRecord crisRecord = new StudentRecord(80, 90, 100);
        // Memberi nama siswa
        annaRecord.setName("Anna");
        annaRecord.setAddress("Philippines");
        annaRecord.setAge(15);
        annaRecord.setMathGrade(80);
        annaRecord.setEnglishGrade(95.5);
        annaRecord.setScienceGrade(100);
        // Overloaded methods
        annaRecord.print(annaRecord.getName());
        annaRecord.print(annaRecord.getEnglishGrade(), 
                         annaRecord.getMathGrade(),
                         annaRecord.getScienceGrade()); 

        beahRecord.setName("Beah");
        crisRecord.setName("Cris");
        // Menampilkan nama siswa "Anna"
        System.out.println(annaRecord.getName() + "\n");
        // Menampilkan jumlah siswa
        System.out.println("Count = "+StudentRecord.getStudentCount());
    }
}