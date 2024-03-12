package _1_introduction.exercise6;

public class Application {

    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("Give me the first number");
    double FirstNumber = scanner.nextDouble();

    System.out.println("Give me the second number");
    double SecondNumber = scanner.nextDouble();

    if (FirstNumber > SecondNumber){
        System.out.println("First number is greater " + FirstNumber);
    }
    else if (SecondNumber > FirstNumber){
        System.out.println("Second number is greater " + SecondNumber);
    
    }else{
        System.out.println("Equal");
    }
}

    }

