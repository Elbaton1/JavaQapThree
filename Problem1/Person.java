public class Person {
    private String myName;    
    private int myAge;        
    private String myGender;  

    // Constructor for Person object
    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    // Getter for name
    public String getName() {
        return myName;
    }

    // Getter for age
    public int getAge() {
        return myAge;
    }

    // Getter for gender
    public String getGender() {
        return myGender;
    }

    // Setter for name
    public void setName(String name) {
        this.myName = name;
    }

    // Setter for age
    public void setAge(int age) {
        this.myAge = age;
    }

    // Setter for gender
    public void setGender(String gender) {
        this.myGender = gender;
    }

    //display Person details
    @Override
    public String toString() {
        return myName + ", Age: " + myAge + ", Gender: " + myGender;
    }
}
