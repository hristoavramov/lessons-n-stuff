package _1_introduction.exercise10;

public class Application {

    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("Enter a number");
    
    double Sum = 0;
    int Count = 0;

    while (true) {
        double Number = scanner.nextDouble();
        if (Number < 0) {
            break;
        }
        Sum += Number;
        Count++;
    }

    if (Count > 0) {
        double Average = Sum / Count;
        System.out.println("Average of positive numbers: " + Average);
    }else{
        System.out.println("No positive numbers entered.");
    }
    scanner.close();
    
    }
}
