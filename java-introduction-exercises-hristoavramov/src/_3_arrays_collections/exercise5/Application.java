package _3_arrays_collections.exercise5;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;

        System.out.println("Enter number:");

        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (number > largest) {
                largest = number;
            }
        }

        if (largest != Integer.MIN_VALUE) {
            System.out.println("Largest number: " + largest);
        } else {
            System.out.println("None.");
        }

        scanner.close();
    }
}

