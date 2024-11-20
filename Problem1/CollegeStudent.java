public class CollegeStudent extends Student {
    private int year;         // Current year in college 
    private String major;     // Major of student

    // Constructor to initialize CollegeStudent object
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);  
        this.year = year;
        this.major = major;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Getter for major
    public String getMajor() {
        return major;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Setter for major
    public void setMajor(String major) {
        this.major = major;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
}
