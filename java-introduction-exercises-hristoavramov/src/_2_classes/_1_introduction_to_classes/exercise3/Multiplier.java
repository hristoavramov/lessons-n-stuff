package _2_classes._1_introduction_to_classes.exercise3;

public class Multiplier {
    private int multiplier;

    public Multiplier(int number) {
        this.multiplier = number;
    }

    public int multiply(int number) {
        return number * multiplier;
    }
}