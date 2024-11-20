public class Student extends Person {
    private String myIdNum;  // Student ID Number
    private double myGPA;    // Grade Point Average

    // Constructor to init Student object
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);  
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    // Getter for student ID
    public String getIdNum() {
        return myIdNum;
    }

    // Getter for GPA
    public double getGPA() {
        return myGPA;
    }

    // Setter for student ID
    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    // Setter for GPA
    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
