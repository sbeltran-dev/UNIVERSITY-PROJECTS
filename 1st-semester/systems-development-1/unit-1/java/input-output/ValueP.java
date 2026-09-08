/*
d) If x is greater than y, and z is less than 20, read a value for p.
*/

import java.util.Arrays;
import java.util.Scanner;

public class ValueP {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter a value for x: ");
        double x = read.nextDouble();

        System.out.println("Enter a value for y: ");
        double y = read.nextDouble();

        System.out.println("Enter a value for z: ");
        double z = read.nextDouble();

        if (x > y && z < 20) {
            System.out.println("Enter a value for P:");
            double valuep = read.nextDouble();
            System.out.println("Value for P: " + valuep);
        }
    }
}
