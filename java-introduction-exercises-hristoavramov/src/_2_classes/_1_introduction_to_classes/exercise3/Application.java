package _2_classes._1_introduction_to_classes.exercise3;

public class Application {

    public static void main(String[] args) {
        Multiplier multiplierObj = new Multiplier(5);

        int result1 = multiplierObj.multiply(10);
        System.out.println("Result 1: " + result1);

    }
}
