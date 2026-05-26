/*
If an angle is equal to 90 degrees, print the message "The angle is a right angle" otherwise print the message "The angle is not
a right angle"
*/
import java.util.Scanner;
public class RightAngle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter degrees: ");
        int degrees = read.nextInt();
        if (degrees == 90) {
            System.out.println("The angle is a right angle");
        } else {
            System.out.println("The angle is not a right angle");
        }
    }
}
