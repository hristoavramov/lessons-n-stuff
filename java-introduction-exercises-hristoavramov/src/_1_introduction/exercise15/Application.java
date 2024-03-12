package _1_introduction.exercise15;

public class Application {

    public static void main(String[] args) {
        System.out.println("Printing a line:");
        printStars(3);
        
        System.out.println("\nPrinting a square:");
        printSquare(4);
        
        System.out.println("\nPrinting a rectangle:");
        printRectangle(2, 3);
    }
}

public static void printStars(int n){
    for (int i= 0; i< n; i++){
        System.out.print("*");
    }
    System.out.println();
}

// Method for printing a square
public static void printSquare(int n){
    for (int i = 0; i<n; i++){
        printStars(n);
    }
}


// method  for printing a rectangle
public static void printRectangle(int height, int widht){
    for (int i = 0; i < height; i++){
        printStars(widht);
    }
}