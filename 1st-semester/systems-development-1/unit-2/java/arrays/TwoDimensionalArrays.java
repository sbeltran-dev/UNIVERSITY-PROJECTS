/*
A manufacturing company has 12 plants. Create a program that allows you to read the name of each plant and the production made on each
of the seven days of the week. Use a one-dimensional array to read the names of the plants and a two-dimensional array (12 x 7)
to read the production of the twelve plants (one on each row) over the seven days, one column for each day. The idea is to read the name of the first plant and
then the production made on each of the seven days, then process plant 2, then 3, and so on. Print the following report:
WEEKLY PRODUCTION REPORT
PLANT    DAY 1 DAY 2 DAY 3 DAY 4 DAY 5 DAY 6 DAY 7 WEEKLY PROD.
XXXXXXX  999    999    999    999    999    999   999     999
XXXXXXX  999    999    999    999    999    999   999     999
---
XXXXXXX  999    999    999    999    999    999   999     999
TOTAL                                                                            9999
MOST PRODUCTIVE PLANT: XXXXXXXXXXXXXXXXXXXXXXXXX
PRODUCTION OF THE MOST PRODUCTIVE PLANT: 999
DAY WITH THE HIGHEST PRODUCTION: 999
HIGHEST PRODUCTION IN A DAY: 999
*/

public class TwoDimensionalArrays {
    public static void main (String [] args) {
        String[] plants = {"Atomic", "Nucle", "Gas", "Scien", "Math", "Elecs", "Engin", "Stark", "NVIDIA", "Intel", "AMD", "ASUS"};
        int[][] dailyProduction = new int[12][7];
        double[] day1Sales = {2800, 4000, 840, 600, 3000, 9800, 60, 140, 250, 10000, 4000, 2750, 2700, 1000};
        double[] day2Sales = {300, 4200, 8450, 600, 4000, 5800, 6000, 140, 250, 8000, 4000, 2750, 2600, 2000};
        double[] day3Sales = {2300, 700, 870, 600, 200, 5800, 700, 140, 250, 10000, 4000, 2750, 2300, 3000};
        double[] day4Sales = {800, 800, 500, 700, 3800, 400, 800, 140, 250, 11000, 4000, 2750, 2900, 4000};
        double[] day5Sales = {1100, 9000, 840, 800, 2600, 2000, 1000, 140, 250, 12000, 4000, 2750, 2700, 5000};
        double[] day6Sales = {3600, 100, 1000, 900, 700, 9600, 69000, 140, 250, 10000, 4000, 2750, 3000, 1000};
        double[] day7Sales = {2800, 450, 850, 1000, 3000, 300, 6000, 140, 250, 7000, 4000, 2750, 7600, 1200};
        double[] weeklyProduction = {10000, 20000, 360000, 58000, 98000, 78364, 93472, 28324, 78000, 8237, 94858, 10000};

        System.out.println("\n|| WEEKLY PRODUCTION REPORT ||\n");
        System.out.println("PLANTS: \t\t\t\t DAY 1: \t\t DAY 2: \t\t DAY 3: \t\t DAY 4: \t\t DAY 5: \t\t DAY 6: \t\t DAY 7: \t\t WEEKLY PRODUCTION:");

        for (int i = 0; i < plants.length; i++) {
            System.out.println(i + ". " + plants[i] + ": " + "\t\t\t\t" + day1Sales[i] + "\t\t\t\t" + day2Sales[i] + "\t\t\t" + day3Sales[i] + "\t\t\t" + day4Sales[i] + "\t\t\t" + day5Sales[i] + "\t\t\t" + day6Sales[i] + "\t\t\t" + day7Sales[i] + "\t\t\t\t" + weeklyProduction[i]);
        }

        // > Teacher, to be honest, I didn't really know how to get the total calculations. I was researching on Google and none of the solutions worked correctly.
        // For the one-dimensional array assignment, I asked if you could help me with the total and they couldn't tell me how. I looked at the document you shared, but I didn't really understand the methods.
        //
        System.out.println("Most productive plant: " + plants[2]);
        System.out.println("Production of the most productive plant: " + weeklyProduction[2]);
        System.out.printf("Day with the highest production: DAY 6.");
        System.out.println("Highest production in a day: " + day6Sales[6]);
    }
}
