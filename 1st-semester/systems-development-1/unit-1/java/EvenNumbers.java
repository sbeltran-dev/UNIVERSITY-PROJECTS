/*
4. Given ten integers, write a program that allows you to display the sum
of the even numbers in the list, how many even numbers exist, and
what the arithmetic mean of the odd numbers is. Use % to detect an even
number. Example: if (number % 2 == 0).
The % performs division and returns the remainder. If it is equal to 0,
it means the number is even, and if it returns 1, it means the number is odd.
*/

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int EvenNumbers = 0;
        int OddNumbers = 0;
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number " + i + ": ");
            int number = read.nextInt();

            if (number % 2 == 0) {
                sumEven = sumEven + number;
                EvenNumbers++;
            } else {
                sumOdd = sumOdd + number;
                OddNumbers++;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Existing even numbers: " + OddNumbers);
        double average = (double) sumOdd / OddNumbers;
        System.out.printf("Arithmetic mean of odd numbers: %.2f", average);
    }
}
