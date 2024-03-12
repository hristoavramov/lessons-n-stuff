package _1_introduction.exercise2;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Give me first number?");
        double firstNumber = scanner.nextDouble();
        System.out.println("Give me second number?");
        double secondNumber = scanner.nextDouble();
        System.out.println("Give me third number?");
        double thirdNumber = scanner.nextDouble();

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("The average of the three numbers is: " + average);

    }
}
