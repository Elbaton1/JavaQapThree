public class Teacher extends Person {
    private String subject;  // Subject taught by the teacher
    private double salary;   // Annual salary of the teacher

    // Constructor to init Teacher object
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);  
        this.subject = subject;
        this.salary = salary;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Salary: $" + salary;
    }
}
