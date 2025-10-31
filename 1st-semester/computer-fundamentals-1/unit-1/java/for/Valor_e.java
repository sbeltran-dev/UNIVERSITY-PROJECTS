/*
 Escriba una aplicacion que calcule el valor de e^x, utilizando la formula (Brook Taylor):
 e^x = 1 + x^1/1! + x^2/2! + x^3/3! + ... + n^n/n!
 Pedir al usuario el numero de iteraciones.
*/
import java.lang.Math;
import java.util.Scanner;
public class Valor_e {
    public static void main (String[] args) {
        int iteraciones;
        double x = 1, n = 0, sumatoria = 0;
        long factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el numero de iteraciones: ");
        iteraciones = input.nextInt();
        System.out.printf("\nex = %.0f ", x);
        sumatoria += x;
        x = iteraciones;
        for (double i = 1; i < x; i++) {
            n++;
            System.out.printf("+ %.0f^%.0f/%.0f! ", x, n, i);
            if (i > 0) {
                factorial *= i;
            }
            sumatoria += Math.pow(x, n) / factorial;
        }
        System.out.printf("\nSumatoria: %f", sumatoria);
    }
}