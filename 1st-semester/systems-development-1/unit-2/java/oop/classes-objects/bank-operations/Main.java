/*
Create a Java program that applies object-oriented programming, in which it simulates the operations of a bank. Create constructors and methods to
deposit and withdraw money from the account. It is suggested to ask for the account holder's name, the amount to deposit / withdraw, the initial balance, and the balance.
*/

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        Account bank_account = new Account(1000, "Alex");

        do {
            System.out.println("\n|| MENU ||");
            System.out.println("1. Show holder name.");
            System.out.println("2. Deposit funds.");
            System.out.println("3. Withdraw funds.");
            System.out.println("4. Show current balance.");
            System.out.println("0. Leave.");
            System.out.println("\nSelect an option: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Holder name: " + bank_account.getHolder_Name());
                    break;
                case 2:
                    System.out.println("Input a quantity to deposit funds to the balance: ");
                    double deposit_funds = input.nextDouble();
                    bank_account.Deposit_Funds(deposit_funds);
                    System.out.println("\nCurrent balance: " + bank_account.getBalance());
                    break;
                case 3:
                    System.out.println("Input a quantity to withdraw funds to the balance: ");
                    double withdraw_funds = input.nextDouble();
                    bank_account.Withdraw_Funds(withdraw_funds);
                    System.out.println("\nCurrent balance: " + bank_account.getBalance());
                    break;
                case 4:
                    System.out.println("Account balance: " + bank_account.getBalance());
                    break;
            }
        } while (option != 0);

        input.close();
    }
}
