/*
Develop a Java program that asks the user for a word and determines if it is a palindrome. The verification must ignore uppercase and lowercase letters
to avoid being case-sensitive.

Solve it in 2 different ways:

>> Solution 1. Use character-type arrays.
2. Use StringBuilder (research how it is used).
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "reconocer";
        boolean palindrome = true; // > We establish that the word is a palindrome.
        char[] characters = word.toCharArray(); // > This is where the array is created.

        for (int i = 0; i < characters.length / 2; i++) { // > We put /2 on 'characters.length'
            if (characters[i] != characters[(characters.length - i - 1)]) {
                System.out.println("THE WORD IS NOT A PALINDROME.");
                palindrome = false; // > Here it becomes 'false'
                break; // > To close the loop.
            }
        }

        if (palindrome == true) {
            System.out.println("THE WORD IS A PALINDROME.");
        }
    }
}

/*
 The array works in the following way:
 When the array is created, a piece of data is stored in each position inside the brackets. For example, characters[0] stores the character 'r'
        Position:  [0] [1] [2] [3] [4] [5] [6] [7] [8] >> Important: Arrays ALWAYS start at 0, but in total there are 9 positions.
 -DATA: Character:  [r] [e] [c] [o] [n] [o] [c] [e] [r]


 We put a two on characters.length/2 because we only want it to go through half of the array. In this case, since the total number is 9 positions,
 it will only go through 4 because that is half of 9, and that is what characters.length/2 is doing.
 If we don't make that division, this will happen:

 i = 0: compare position 0 with position 8 → r with r
 i = 1: compare position 1 with position 7 → e with e
 i = 2: compare position 2 with position 6 → c with c
 i = 3: compare position 3 with position 5 → o with o
 i = 4: compare position 4 with position 4 → n with n
 i = 5: compare position 5 with position 3 → o with o  - Unnecessary
 i = 6: compare position 6 with position 2 → c with c  - Unnecessary
 i = 7: compare position 7 with position 1 → e with e  - Unnecessary
 i = 8: compare position 8 with position 0 → r with r  - Unnecessary

 In line 18:
 The operation (characters.length-i-1) is done because we know that characters.length = 9, and we are subtracting 'i' to move "backward"
 i = 0: 9 - 1 - 0 = 8
 i = 1: 9 - 1 - 1 = 7
 i = 2: 9 - 1 - 2 = 6
 Since we know that the length is 9, we also subtract the -1 at the end of the operation so that position 9, which does not exist, is subtracted. This is how:
 length - 1 = 9-1 = 8 POSITIONS
 */
