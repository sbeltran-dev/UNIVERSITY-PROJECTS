/*
Make a program in which given the name of a month and whether the year is a leap year or not, deduct the number of days int the month.
*/
import java.util.Scanner;
public class YearMonth {
    public static void main(String[] args) {
        Scanner read  = new Scanner(System.in);
        System.out.println("Month name: ");
        String mes = leer.next().toLowerCase(); // To read every format.
        System.out.println("It is a leap year? Y/N");
        char leapYear = read.next().charAt(0);
        int days = 0;
        switch (month) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                days = 31;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                days = 30;
                break;
            case "february":
                if (leapYear == 'y' || leapYear == 'Y') {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default: // Default is used in case the character entered does not match the case
                System.out.println("Invalid month.");
                read.close();
                return; // The program ends if the month is invalid
        }
        System.out.println(month + " has " + days + " days.");
    }
}
