package _1_introduction.exercise8;

public class Application {

    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("Enter your age");
    double Age = scanner.nextDouble();

    if (Age <= 120){
        System.out.println("Ok");
    }else{
        System.out.println("Impossible");
}
}
}