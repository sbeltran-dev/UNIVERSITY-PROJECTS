/*
A company has 30 salespeople, and for each salesperson there is a name and the sale they made. Create a program that allows you to read this data
and provides a sales commission report in which all salespeople who have sales greater than the commission level appear,
which is calculated as follows:
Commission level = 3/4 * (average sales)
Commission = 5% on the amount exceeding what was sold above the commission level.
SALESPEOPLE COMMISSIONS
SALESPERSON NAME                  SALES            COMMISSION
XXXXXXXXXXXXXXXXXXXXXXXX        999,999.99        99,999.99
XXXXXXXXXXXXXXXXXXXXXXXX        999,999.99        99,999.99
        - -
XXXXXXXXXXXXXXXXXXXXXXXX        999,999.99        99,999.99
TOTAL 99 SALESPERSONS                     9,999,999.99       999,999.99
*/

public class OneDimensionalArrays {
    public static void main(String[] args) {
        double totalSalespeople = 0;
        int[] salespeople = new int[30];

        String[] names = {"Santiago", "Juan", "Jorge", "Julian", "Axel", "Alex", "Alexander", "Pepe", "Walter", "Winky", "Frankenstein", "Isaac", "Tony",
        "Molly", "Hallie", "Carlos", "Karla", "Virgilio", "Bonnie", "Nami", "Zoro", "Oliver", "Mickey", "Fubuki", "Genos", "Saitama", "Jotaro", "Giorno",
        "Diavolo", "Buu"};

        double[] sales = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};

        System.out.println("|| SALESPERSON COMMISSIONS ||\n");
        System.out.println("\nSALESPERSON NAME: \t\t\t SALES: \t\t\t COMMISSION:\n");

        double sum = 0;

        for (int i = 0; i < sales.length; i++) {
             sum += sales[i];
        }

        //System.out.println(sum);

        double average = sum / sales.length;

        //System.out.println(average);

        double commissionLevel = average * 0.75;

        //System.out.println(commissionLevel);

        for (int i = 0; i < salespeople.length; i++) {
            double commission = 0;

            if(sales[i] > commissionLevel){
                double excess = sales[i]-commissionLevel;
                commission = excess*0.05;
            }

            System.out.printf((i + 1) + ". " + "Salesperson: " + names[i] + "\t\t\t\t" + sales[i] + "\t\t\t\t" + commission + "\n");
        }
    }
}
