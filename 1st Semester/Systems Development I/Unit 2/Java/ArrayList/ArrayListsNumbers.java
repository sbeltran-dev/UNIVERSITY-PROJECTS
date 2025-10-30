/*
Crear un programa en Java que permita leer 10 números, que los guarde en un ArrayList, después los ordene llamando el método Collections.sort(lista);,
imprima la lista. Luego pida al usuario que introduzca un límite inferior y otro superior, y luego debe de mostrar solo aquellos números que están dentro del
límite inferior y superior. (Eliminar los que no esten dentro de los limites).
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
        // * We declare a 'for' loop to store the 10 numbers to the 'ArrayList'
        for (int i = 0; i < 10; i++) {
            System.out.println("Input a number: ");
            numbers =  input.nextInt();
            list1.add(numbers);
        }
        // * We order all the nums.
        Collections.sort(list1);
        // * Now the program will ask for the user to input the another numbers.
        System.out.println("Input a number for the inferior limit: ");
        numbers = input.nextInt();
        list1.addFirst(numbers);
        System.out.println("Enter another number for the superior limit: ");
        numbers = input.nextInt();
        list1.addLast(numbers);
        // * We print the list to know the numbers stored in the array and the size of the list.
        System.out.println("List: " + list1);
        System.out.println("Size of the list: " + list1.size());
        // * We order the list to establish the limits.
        Collections.sort(list1);
        inferiorLimit = list1.getFirst();
        superiorLimit = list1.getLast();
        list1.removeIf(number -> number > inferiorLimit & number < superiorLimit);
        System.out.println("List: " + list1);
        System.out.println("Size of the list: " + list1.size());
    }
}