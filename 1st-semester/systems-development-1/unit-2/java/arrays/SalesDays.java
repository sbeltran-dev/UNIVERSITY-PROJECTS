/*
Create a program to read 30 days of sales made by an employee and print the day on which they had the highest and lowest sale, as well as the
corresponding amounts.
At the end it must print:
 TOTAL NUMBER OF ELEMENTS ABOVE THE AVERAGE: 999
 TOTAL NUMBER OF ELEMENTS BELOW THE AVERAGE: 999
 TOTAL NUMBER OF ELEMENTS EQUAL TO THE AVERAGE: 999
*/

import java.util.Scanner;

public class SalesDays {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int[] salesDay = new int[30];
        int counterHigher = 0;
        int counterLower = 0;
        int counterEqual = 0;
        double total = 0;
        double average;

        System.out.println("Enter employee name: ");
        String name = input.nextLine();

        for (int i = 0; i < 30; i++) {
            System.out.println("Sales for day " + (i + 1) + " made by employee " + name + ": ");
            salesDay[i] = input.nextInt();
            total += salesDay[i];
        }

        System.out.println("TOTAL SALES: " + total);
        average = total / salesDay.length;
        System.out.printf("SALES AVERAGE: %.0f\n", average);

        for (int sales : salesDay) {
            if (sales > average) {
                counterHigher++;
            } else if (sales < average) {
                counterLower++;
            } else {
                counterEqual++;
            }
        }

        System.out.println("TOTAL NUMBER OF ELEMENTS ABOVE THE AVERAGE: " + counterHigher);
        System.out.println("TOTAL NUMBER OF ELEMENTS BELOW THE AVERAGE: " + counterLower);
        System.out.println("TOTAL NUMBER OF ELEMENTS EQUAL TO THE AVERAGE: " + counterEqual);

        input.close();
    }
}
