package _3_arrays_collections.exercise1;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.println("Text:");

        while (true) {
            String line = scanner.nextLine().trim();

            if (line.isEmpty()) {
                break;
            }

            String[] words = line.split("\\s+");

            for (String word : words) {
                if (word.toLowerCase().contains("av")) {
                    System.out.println(word);
                }
            }
        }

        scanner.close();
    }
}


