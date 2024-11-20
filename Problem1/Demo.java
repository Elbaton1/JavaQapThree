public class Demo {
    public static void main(String[] args) {
        // Person object
        Person thor = new Person("Thor Odinson", 1500, "M"); // thors age is 1500 lol 
        System.out.println(thor);

        // Student object
        Student peter = new Student("Peter Parker", 18, "M", "HS12345", 3.8);
        System.out.println(peter);

        // Teacher object 
        Teacher steve = new Teacher("Steve Rogers", 100, "M", "History", 60000);
        System.out.println(steve);

        // CollegeStudent object 
        CollegeStudent wanda = new CollegeStudent("Deadpool", 21, "M", "UCB678", 4.0, 3, "Physics");
        System.out.println(wanda);
    }
}
