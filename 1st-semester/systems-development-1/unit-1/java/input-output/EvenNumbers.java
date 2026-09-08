/*
3. Write a program that allows you to add the even numbers from 2 to 100 and print their value.
*/
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int sum = 0;

        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Total sum of the even numbers: " + sum);
        read.close();
    }
}

// for (int i = 2; i <= 100; i++) Goes through from 2 to 100.
// if (i % 2 == 0): Checks if the number is even.
// % is the modulo operator (remainder of division).
// If i % 2 == 0, it means it is divisible by 2 (even).
