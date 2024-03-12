package _1_introduction.exercise7;

public class Application {

    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("Give me a first word");
    String FirstWord = scanner.nextLine();

    System.out.println("Give me a second word");
    String SecondWord = scanner.nextLine();

    if (FirstWord.equals(SecondWord)){
        System.out.println("Equal!");
    }else{
        System.out.println("Not equal!");
    }


    }
}
