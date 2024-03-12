package _4_exceptions.exercise1;

import java.util.Scanner;

public class Application {

   
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int count = 0;
    
            try {
                while (true) {
                    String input = scanner.nextLine().trim();
    
                    if (input.equals("end")) {
                        break;
                    }
    
                    try {
                        int number = Integer.parseInt(input);
                        sum += number;
                        count++;
                    } catch (NumberFormatException e) {
                        System.out.println("Error:  enter a valid number or 'end'.");
                    }
                }
    
                if (count > 0) {
                    double average = (double) sum / count;
                    System.out.println("Average of entered numbers: " + average);
                } else {
                    System.out.println("No numbers entered.");
                }
            } finally {
                scanner.close();
            }
        }
    }