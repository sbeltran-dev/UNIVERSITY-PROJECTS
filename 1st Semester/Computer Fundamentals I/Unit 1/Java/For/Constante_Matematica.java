/*
 Escriba una aplicacion que estime el valor de la constante matematica e, utilizando la formula:
 e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + 1/5! +... 
 Solicite al usuario el numero de iteraciones.
 Imprima el resultado de la sumatoria. 
*/
import java.util.Scanner;
public class Constante_Matematica {
    public static void main (String[] args) {
        double j = 1, sumatoria = 0, factorial = 1;
        int iteraciones;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un numero de iteraciones: ");
        iteraciones = input.nextInt();
        System.out.printf("%.0f", j);
        for (double i = 0; i <= iteraciones; i++) {
            System.out.printf(" + %.0f/%.0f!", j, i);
            if (i > 0) { // > Hacemos la operacion para el factorial.
                factorial *= i;
            }
            sumatoria += 1.0 / factorial;
        }
        System.out.printf("\nSumatoria: %f", sumatoria);
        input.close();
    }
}