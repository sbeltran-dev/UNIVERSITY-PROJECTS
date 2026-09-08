/*
Create a Java program that allows you to read 10 numbers, save them in an ArrayList,
then sort them by calling the method Collections.sort(list);,
print the list. Then ask the user to enter a lower limit and an upper limit,
and then it should only display those numbers that are within the lower and upper limits.
(Remove those that are not within the limits.)
*/

// * First of all, we're going to import the library to work with 'ArrayLists'
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListsNumbers {
    public static void main (String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        int numbers;
        int inferiorLimit;
        int superiorLimit;

        Scanner input = new Scanner(System.in);

        // * We declare a 'for' loop to store the 10 numbers in the 'ArrayList'
        for (int i = 0; i < 10; i++) {
            System.out.println("Input a number: ");
            numbers = input.nextInt();
            list1.add(numbers);
        }

        // * We sort all the numbers.
        Collections.sort(list1);

        // * Now the program will ask the user to input the other numbers.
        System.out.println("Input a number for the lower limit: ");
        numbers = input.nextInt();
        list1.addFirst(numbers);

        System.out.println("Enter another number for the upper limit: ");
        numbers = input.nextInt();
        list1.addLast(numbers);

        // * We print the list to know the numbers stored in the array and the size of the list.
        System.out.println("List: " + list1);
        System.out.println("Size of the list: " + list1.size());

        // * We sort the list to establish the limits.
        Collections.sort(list1);
        inferiorLimit = list1.getFirst();
        superiorLimit = list1.getLast();

        list1.removeIf(number -> number > inferiorLimit & number < superiorLimit);

        System.out.println("List: " + list1);
        System.out.println("Size of the list: " + list1.size());
    }
}
