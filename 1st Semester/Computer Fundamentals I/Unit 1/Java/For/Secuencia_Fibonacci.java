/*
 Escribir un programa para encontrar la secuencia de Fibonacci. La secuencia es la siguiente:
 F = 0,1,1,2,3,5,8,13,21,34,55,.........,n
 El primer elemento es 0, el segundo es 1 y cada elemento restante es la suma de los dos anteriores el programa debe solicitar el numero limite de la serie .
 */
import java.util.Scanner;
public class Secuencia_Fibonacci {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, j = 1, suma, limite;
        System.out.println("Establezca un limite: ");
        limite = input.nextInt();
        System.out.printf("%d", i);
        System.out.printf(", %d", j);
        for (suma = 1; suma < limite; ) {
            System.out.printf(", %d", suma);
            suma = i + j;
            i = j; // > 'i' toma el valor anterior de 'j'.
            j = suma; // > 'j' toma el valor del nuevo numero (suma).
        }
        input.close();
    }
}