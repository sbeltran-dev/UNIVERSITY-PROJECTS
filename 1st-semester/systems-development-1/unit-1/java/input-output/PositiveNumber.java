/*
If the number is positive, add it to the total amount of positive numbers, if not, add it to the amount of total negative numbers.
*/
import java.util.Scanner;
public class PositiveNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = read.nextDouble();
        double positiveTotal = 20;
        double negativeTotal = -20;
        if (number > 0) {
            positiveTotal = positiveTotal + number;
            System.out.println("Total amount of positive numbers: " + positiveTotal);
        } else {
            negativeTotal = negativeTotal + number;
            System.out.println("Total amount of negative numbers: " + negativeTotal);
        }
    }
}
