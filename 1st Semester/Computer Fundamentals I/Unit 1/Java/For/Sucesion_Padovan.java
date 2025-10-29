/*
 La sucesion de Padovan, es la secuencia de numeros P(n) definida por los siguientes valores iniciales: 
 P(0) = P(1) = P(2) = 1, y la siguiente relacion de recurrencia.
 P(n) = P(n-2) + P(n-3).
 Los primeros valores de P(n) son
 1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37, 49, 65, 86, 114, 151, 200, 265, 351, 465, 616, 816, 1081, 1432, 1897, 2513, 3329, 44100,...
 Solicite al usuario el limite de la serie.
*/
import java.util.Scanner;
public class Sucesion_Padovan {
    public static void main (String[] args) {
        int p0 = 1, p1 = 1, p2 = 1, nextP, limite;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un valor para el limite de la secuencia: ");
        limite = input.nextInt();
        // > Imprimimos los primeros valores.
        System.out.printf("%d, %d, %d", p0, p1, p2);
        for (int i = 3; i < limite; i++) {
            // > Realizamos la formula.
            nextP = p0 + p1;
            // > Rompemos el ciclo con esta condicion.
            if (nextP > limite) {
                break;
            }
            System.out.printf(", %d", nextP);
            // > Actualizamos los valores.
            p0 = p1;
            p1 = p2;
            p2 = nextP;
        }
        input.close();
    }
}