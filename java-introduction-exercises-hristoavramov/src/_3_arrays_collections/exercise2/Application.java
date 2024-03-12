package _3_arrays_collections.exercise2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text");

        while (true) {
            String line = scanner.nextLine().trim();

            if (line.isEmpty()) {
                break;
            }

            String[] words = line.split("\\s+");
            System.out.println("Last word: " + words[words.length - 1]);
        }

        scanner.close();
    }
}
