/*
 Imprima en pantalla lo siguiente:
 Escriba el numero para la secuencia: 5
 1
 22
 333
 4444
 55555

 Escriba el numero para la secuencia: -4
 -4-4-4-4
 -3-3-3
 -2-2
 -1
*/
import java.util.Scanner;
public class Imprimir_Secuencia {
    public static void main (String[] args) {
        int sec;
        Scanner input = new Scanner(System.in);
        System.out.print("Escriba el numero para la secuencia: ");
        sec = input.nextInt();
        if (sec > 0) {
            for (int i = 0; i < sec; ) {
                i++;
                for (int j = 0; j < i; j++) {
                    System.out.print(" " + i);
                }
                System.out.println("");
            }
        } else {
            for (int i = sec; i <= -1; i++) { // > El bucle va a empezar desde el -5 (o el valor que le demos a 'sec') hasta el -1.
                for (int j = i; j < 0; j++) { // > La variable 'j' empieza valiendo -5 (porque ya vimos que 'i' vale lo mismo que el valor que le demos a 'sec') por lo que el numero de veces que va a imprimir el valor 'i' va a depender de cuanto valga 'i'. Despues se va a ir incrementando hasta llegar al 0.
                    System.out.print("" + i);
                }
                System.out.println("");
            }
        }
        input.close();
    }
}