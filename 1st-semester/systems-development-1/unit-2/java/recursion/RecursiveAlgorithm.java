/*
1. Write a Java program that uses a recursive method to determine whether a number is even or odd.
 */

public class RecursiveAlgorithm {
    public static void main (String[] args) {
        System.out.println(numberEvaluation(2));
    }

    static boolean numberEvaluation (int n) {
        if (n == 0) { // ** HERE IS WHERE THE FUNCTION WILL STOP.
            return true;
        }

        if (n == 1) {
            return false;
        }

        return numberEvaluation(n - 2);

        // ** EXPLANATION OF RECURSIVITY: In line 6 we enter the parameter for our boolean function. Every time the function calls itself
        // ** will do the operation that is set as a return. Then, it won't stop calling itself until one of the conditions returns a boolean.
    }
}
