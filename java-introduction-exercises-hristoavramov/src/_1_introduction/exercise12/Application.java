package _1_introduction.exercise12;

public class Application {

    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("Enter a number");
    int number =  scanner.nextInt();
    int sum = 0;
    for (int count = 1; count <= number; count++) {
        sum += count;
        
    }
    System.out.println(sum);
    }
}
