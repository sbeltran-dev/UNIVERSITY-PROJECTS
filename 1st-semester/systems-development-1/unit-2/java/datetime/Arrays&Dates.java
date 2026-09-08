/*
Write a Java program that simulates a ticket sales system, assuming it is for a company in charge of selling the tickets and the cashier is
the one who enters all the information. The company will organize a progressive rock / metal music concert for Dream Theater or another non-metal band or group that
you like. The program must include date handling, zone prices, available ticket limits by zone, data validation, and an interactive
menu for the user.

Required:
1. Read the concert date in the format dd/MM/YYYY, validate the correct format with try-catch as seen in previous classes, in the catch
specify DateTimeParseException and specify the error message in case it is not correct.

2. The current date must be obtained: This will be used to know if the concert has already passed, if the concert is today, and how many days remain until the concert. If the
concert has already passed, display the message and end the program. If it is today, display a warning that there are only a few hours left to sell tickets. If there are days remaining, indicate how many
remain.

3. For the prices, you can assign them yourselves, for example General $500, Preferential $1500, VIP $2500.

4. For the limit of tickets available by zone, you can assign an amount for each zone, for example General: 5,000, Preferential: 2,500 and VIP 2,000
available spaces.

5. Ticket purchasing process: The user must indicate how many tickets they want to buy, for each ticket, choose the zone (1. General, 2. Preferential, 3. VIP), all
data must be validated to ensure they are valid and positive numbers. The system must accumulate how many tickets and the total collected in each zone.

6. Main menu: The program must display a menu with the following options: 1. Buy tickets. 2. Show sales summary. 3. Exit. When selecting 1
it must execute the ticket purchasing process specified in point 4, and perform the validations specified in the first points. When selecting 2 it must
print the number of tickets sold by zone and the total amount collected.

You can separate the code using methods. During the weekend I will publish some examples of how you can separate it using methods / functions, because this
program is already longer.
*/

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ArraysAndDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter band name: ");
        String bandName = input.nextLine();

        System.out.print("Enter the date for the " + bandName + " concert: ");
        String date = input.nextLine();

        try {
            LocalDate concert = LocalDate.parse(date, dateFormat);
            LocalDate currentDate = LocalDate.now();

            if (concert.isBefore(currentDate)) {
                System.out.println("The " + bandName + " concert already passed.");
                return;
            } else if (concert.isEqual(currentDate)) {
                System.out.println("There are only a few hours left until the " + bandName + " concert!");
            } else {
                long days = ChronoUnit.DAYS.between(currentDate, concert);
                System.out.println("There are " + days + " days left until the " + bandName + " concert.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date.");
            return;
        }

        int[] availableTickets = {5000, 2500, 2000};
        double[] prices = {500, 1500, 2500};
        String[] ticketType = {"General", "Preferential", "VIP"};
        int[] ticketsSold = {0, 0, 0};
        double totalCollected = 0;

        int option;

        do {
            System.out.println("\n|| MAIN MENU ||\n");
            System.out.println("1. Buy tickets");
            System.out.println("2. Sales summary");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\n || PRICES ||");

                    for (int i = 0; i < ticketType.length; i++) {
                        System.out.println((i + 1) + ". " + ticketType[i] + ": $" + prices[i] + " (Available: " + availableTickets[i] + ")");
                    }

                    System.out.print("\nHow many tickets do you want to buy? ");
                    int quantity = input.nextInt();

                    double purchaseTotal = 0;

                    for (int i = 0; i < quantity; i++) {
                        System.out.println("\n Ticket ." + (i + 1) + ": ");

                        for (int j = 0; j < ticketType.length; j++) {
                            System.out.println((j + 1) + ". " + ticketType[j] + " - $" + prices[j]);
                        }

                        System.out.print("Select the ticket type: ");
                        int zone = input.nextInt() - 1;

                        if (zone >= 0 && zone < ticketType.length && availableTickets[zone] > 0) {
                            availableTickets[zone]--;
                            ticketsSold[zone]++;
                            purchaseTotal += prices[zone];
                        } else {
                            System.out.println("Not available.");
                            i--;
                        }
                    }

                    totalCollected += purchaseTotal;
                    System.out.printf("\nTOTAL TO PAY: $%.2f\n", purchaseTotal);
                    break;

                case 2:
                    System.out.println("\n|| SALES SUMMARY ||");

                    for (int i = 0; i < ticketType.length; i++) {
                        System.out.println(ticketType[i] + ": " + ticketsSold[i] + " sold, " + availableTickets[i] + " available");
                    }

                    System.out.printf("Total collected: $%.2f\n", totalCollected);
                    break;

                case 3:
                    System.out.println("Closing system...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 3);

        input.close();
    }
}
