/*
e) If distance is greater than 20 and less than 35, read a value for time.
*/

import java.util.Scanner;

public class TimeValue {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter a distance: ");
        int distance = read.nextInt();

        if (distance > 20 && distance < 35) {
            System.out.println("Enter a value for time: ");
            int time = read.nextInt();
            System.out.println("Value for time: " + time);
        }
    }
}
