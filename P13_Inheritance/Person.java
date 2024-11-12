package P13_Inheritance;
public class Person {
    protected String name;
    protected String address;

    /**
     * Default constructor
     */
    public Person() {
        System.out.println("Inside Person:Constructor");
        name = "";
        address = "";
    }

    /**
     * Constructor dengan dua parameter
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Method accessor
     */
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String add) {
        this.address = add;
    }
    public static void main(String[] args) {
            Student anna = new Student();
        }
    }

    public class Student extends Person {
        public Student() {
            System.out.println("Inside Student: Constructor");
            //beberapa kode
        }
        //beberapa kode
}
