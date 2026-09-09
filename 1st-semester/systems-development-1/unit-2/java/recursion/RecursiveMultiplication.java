/*
4. Write a Java program that uses a recursive method to perform a multiplication using the Russian method.
 */

public class RecursiveMultiplication {
    public static void main (String[] args) {
        System.out.println(multiplication(24, 16));
    }

    static int multiplication (int a, int b) {
        if (a == 1) {
            return b; // * When te functions reaches this condition, it will return the total value of b.
        }

        // ** IF THE VARIABLE 'A' IT'S A EVEN NUMBER, WE WILL CUT IT IN HALF, AND WE WILL INCREMENT B.
        if (a % 2 == 0) {
            return multiplication(a / 2, b * 2);
        } else {
            return b + multiplication(a / 2, b * 2);
        }
    }
}

// ** HOW DOES THE RUSSIAN PEASANT METHOD OF MULTIPLICATION WORKS?

/*
 In this case, we have
 a = 24 | b = 16
 ---------------
 12       32
 6        64
 3        128
 1        256
 ---------------
          384 ------> 128 + 256

 We are cutting in half the first variable until it reaches 1, and the second variable is going to be incremented by 2.
 Then, we will sum the variables of 'b' that are with the odd variables of 'a' (in this case 3 and 1).
*/
