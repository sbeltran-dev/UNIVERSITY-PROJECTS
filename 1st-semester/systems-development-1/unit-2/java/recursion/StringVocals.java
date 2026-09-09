/*
3. Write a Java program that uses a recursive method called vocals to calculate the number of vowels in a string (String).
 */

public class StringVocals {
    public static void main (String[] args) {
        System.out.println(vocalsCount("Juan"));
    }

    static int vocalsCount(String word) {
        if (word.length() == 0) { // * Base case. When the string is empty, the function will stop calling itself.
            return 0;
        }

        // * Evaluates the first character.
        char firstChar = word.charAt(0);

        // * Declare the variable to count the amount of vocals.
        int count = 0;

        // * Evaluates if the first character is a vocal.
        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
            count = 1;
        }

        // * Then this variable takes the rest of the String value.
        String stringValue = word.substring(1);

        // * We increment the amount of vocals.
        return count + vocalsCount(stringValue);
    }
}
