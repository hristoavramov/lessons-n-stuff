package _1_introduction.exercise3;

public class Application {

    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("Give me first number?");
    double T_Celsius = scanner.nextDouble();

    double T_Fahrenheit = (T_Celsius * 9/5) + 32;
    double T_Kelvin = T_Celsius + 273.15;

    System.out.println(("Celciuls is " + T_Celsius) + (" Kelvin is" + T_Kelvin) + (" Fahrenheit" + T_Fahrenheit) );
    }
}
