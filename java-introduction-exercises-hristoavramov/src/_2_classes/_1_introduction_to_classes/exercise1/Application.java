package _2_classes._1_introduction_to_classes.exercise1;

public class Application {

    public static void main(String[] args) {
            Account Account = new Account(100.0);

            System.out.println("Initial balance: " + Account.balance() + " euros");
    
            Account.deposit(20.0);

            Account.withdraw(40.0);
    
            System.out.println("Final balance: " + Account.balance() + " euros");
    }
}
