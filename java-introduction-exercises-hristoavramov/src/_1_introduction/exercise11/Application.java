package _1_introduction.exercise11;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a row");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++ ) {
            String output = "";
            for (int j = 0; j <= i; j++) {
                output += "*";
            }
            System.out.println(output);
        }

    } 


}
