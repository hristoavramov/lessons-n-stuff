package _2_classes._1_introduction_to_classes.exercise5;

public class Application {

    public static void main(String[] args) {
        
        User user1 = new User("Pete", "Peterson", 30);
        user1.printUser(); 

        
        User user2 = new User("Jane", "Janee");
        user2.printUser(); 

        
        user1.age();
        user1.printUser(); 

       
        user2.age(5);
        user2.printUser(); 
    }
}
