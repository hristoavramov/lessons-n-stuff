package _1_introduction.exercise9;

public class Application {

    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("Give me a number");
    double Number = scanner.nextDouble();

    if (Number % 5 == 0 && Number % 3 ==0){
        System.out.println("FizzBuzz");
    }
        else if (Number % 5 == 0){
        System.out.println("Buzz");
    }
    else if (Number % 3 ==0){
        System.out.println("Fizz");
    }else{
        System.out.println(Number);
    }
}
}
