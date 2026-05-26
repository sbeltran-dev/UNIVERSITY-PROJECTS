// Develop a Java program that prints the cost of an order for an item given its description,
// the quantity ordered and the unit price. If the quantity ordered is greater than 50, a 15% discount is applied.
import java.util.Scanner;
public class ItemOrder {
    public  static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Which item do you wish to purchase?: ");
        String item = read.nextLine();
        System.out.println("The unit price of " + item + " is: ");
        double unitPrice = read.nextDouble();
        System.out.println("How many units of " + item + " you wish to buy?: ");
        int unit = read.nextInt();
//Option #1 (cleaner, just using else. The program assumes the quantity will always be greater than 50, the if statement is only used if it is less than 50):
        /*
        if (unit <= 50) {
            double totalprice = unitPrice * unit;
            System.out.printf("The total price for %s is: %.2f%n", item, totalprice);
        } else {
            double subtotal = unitPrice * unit;
            double discount = subtotal * 0.15;
            double totalprice = subtotal - discount;
            System.out.printf("Subtotal: %.2f%n", subtotal);
            System.out.printf("Discount: %.2f%n", discount);
            System.out.printf("Given the discount and subtotal, the total price is: %.2f%n", item, totalprice);
        }
        */
//Option #2 (use of else if. Same procedure, only more specific)
        /*
        if (unit <= 50) {
            double totalprice = unitPrice * unit;
            System.out.printf("Total price: %.2f%n", totalprice);
        } else if (unit > 50) {
            double subtotal = unitPrice * unit;
            double discount = subtotal * 0.5;
            double totalprice = subtotal - discount;
            System.out.printf("Subtotal: %.2f%n", subtotal);
            System.out.printf("Discount: %.2f%n", discount);
            System.out.printf("Given the discount and subtotal, the total price is: %.2f%n", item, totalprice);
        }
        */
//Switch is not recommendable in this case, because the else-if is better for numeric ranges (x>0)
// switch is useful in cases like days, origin, brand.
    }
}
