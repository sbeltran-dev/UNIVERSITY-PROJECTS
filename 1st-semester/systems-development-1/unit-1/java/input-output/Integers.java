/*
2. Write a program that allows you to read 10 integers and obtain how many are positive.
*/
import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int positive = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number " + i + ": ");
            int num = read.nextInt();

            if (num > 0) {
                positive++;
            }
        }

        System.out.println("Number of positive numbers: " + positive);
        read.close();
    }
}

// The for is used to know EXACTLY how many times something is going to repeat.
// In this case (int i = 1; i <= 10; i++) it is going to repeat 10 times,
// starting from 1.

// The do is used to repeat something indefinitely, until the loop is closed.
// For example:
// do {
//     System.out.println("Do you want to continue? Y/N");
//     wantsToContinue = read.next().charAt(0);
//     read.nextLine();
// } while (wantsToContinue == 'y' || wantsToContinue == 'Y');
