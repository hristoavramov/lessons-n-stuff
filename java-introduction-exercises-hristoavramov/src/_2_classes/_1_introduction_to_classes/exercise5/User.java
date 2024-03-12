package _2_classes._1_introduction_to_classes.exercise5;

public class User {
    private final String firstName;
    private final String lastName;
    private int age;

   
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    
    public User(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }

    
    public void age() {
        age++;
    }

    
    public void age(int number) {
        age += number;
    }

    
    public void printUser() {
        System.out.println(firstName + " " + lastName + " " + age);
    }
}