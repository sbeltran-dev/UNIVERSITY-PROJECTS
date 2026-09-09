/*
2. Write a Java program that uses a recursive method to reverse a number.
 */

public class InvertNumber {
    public static void main (String[] args) {
        System.out.println(invert(12));
    }

    static int invert(int n) {
        if (n < 10) { // * If it's a number of one digit (0-9).
            return n;
        } else { // * Takes the last digit + and calls the other digit.
            return (n % 10) * 10 + invert(n / 10);
        }
    }
}
