package _1_introduction.exercise5;

public class Application {

    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("How old are you?");
    double Age= scanner.nextDouble();
    
    if (Age < 18) {
        System.out.println("Of age? No");
    }else{
        System.out.println("Of age? Yes");
    }
    }
}
