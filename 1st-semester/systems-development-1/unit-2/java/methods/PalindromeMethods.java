/*
Develop a Java program that asks the user for a word and determines if it is a palindrome. The verification must ignore uppercase and lowercase letters
to avoid being case-sensitive.

Use methods that return a boolean (true or false) to be used in an if, and if it returns true, print "It is a Palindrome", and if not, "It is not a palindrome".
*/

import java.util.Scanner;

public class PalindromeMethods {
    public static void main(String[] args) {
        // > We call the method so that it is printed in the main block.
        readPalindrome();
    }

    // > We read the word
    public static void readPalindrome () {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String originalWord = input.nextLine().toLowerCase();

        StringBuilder word = new StringBuilder(originalWord);
        word.reverse();

        String reversedWord = word.toString();

        // > We call the print method to print the result inside the block.
        printResult(originalWord, reversedWord);
    }

    // > To print whether it is a palindrome or not.
    public static void printResult (String originalWord, String reversedWord) {
        if (originalWord.equals(reversedWord)) {
            System.out.println(originalWord + " is a palindrome.");
        } else {
            System.out.println(originalWord + " is not a palindrome.");
        }
    }
}
