/*
5. Write a program that displays an isosceles triangle.
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // > The main for controls the rows of the triangle.
            for (int c = 0; c < 5 - i - 1; c++) { // > Works to add the spaces of the triangle so that it is centered.
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) { // > It is used to print the asterisks that give the triangle its shape.
                System.out.print("*");
            }
            System.out.println(); // To add extra space at the end of the program.
        }
    }
}
