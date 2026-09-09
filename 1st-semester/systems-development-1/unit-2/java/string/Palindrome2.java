/*
Develop a Java program that asks the user for a word and determines if it is a palindrome. The verification must ignore uppercase and lowercase letters
to avoid being case-sensitive.

Solve it in 2 different ways:

1. Use character-type arrays.
>> Solution 2. Use StringBuilder (research how it is used).
*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String originalWord = input.nextLine().toLowerCase(); // > We convert to lowercase.

        StringBuilder word = new StringBuilder(originalWord);
        word.reverse();

        String reversedWord = word.toString(); // > We reverse it.

        if (originalWord.equals(reversedWord)) {
            System.out.println("THE WORD IS A PALINDROME.");
        } else {
            System.out.println("THE WORD IS NOT A PALINDROME.");
        }
    }
}

/*
 What is a StringBuilder?
 It is used to manipulate a String-type variable more efficiently. It has methods such as .reverse() to reverse the data entered into the variable.
 There is also .equals() to compare if the data of the String variable is the same as the data that was reversed.

 Another option with the same function as .equals(); is .compareTo(); the difference is that it will return a 0 ('false') or 1 ('true') as a response.
 There is also another version of .compareTo(); >> .compareToIgnoreCase(); to ignore uppercase letters.
*/
