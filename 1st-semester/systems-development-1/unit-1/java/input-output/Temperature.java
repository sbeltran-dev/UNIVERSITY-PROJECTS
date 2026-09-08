/*
b) If the temperature is higher than 100 degrees, display the message
“above the boiling point of water”
otherwise display the message
“below the boiling point of water”.
*/

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        double temperature = read.nextDouble();

        if (temperature > 100) {
            System.out.println("Above the boiling point of water.");
        } else {
            System.out.println("Below the boiling point of water.");
        }
    }
}
