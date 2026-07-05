/*
Write a program in which given a positive integer n (> 1), check if it is a prime.
*/
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a whole positive number: ");
        int num = read.nextInt();
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("The number " + num + " is a prime number.");
        } else {
            System.out.println("The number " + num + " is not a prime number.");
        }
        read.close();
    }
}
