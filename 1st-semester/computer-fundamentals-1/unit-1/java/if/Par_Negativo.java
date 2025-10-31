/*
 4. Programa para determinar si un número es par negativo, par positivo o cero o ninguna de las anteriores. Considere todas las validaciones necesarias.
 */
import java.util.Scanner;
public class Par_Negativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, residuo;
        System.out.println("Introduzca un numero: ");
        numero = input.nextInt();
        residuo = numero % 2; // > El '%' es el operador para el modulo. Devuelve el resto de la division entre 2.
        System.out.println("Residuo: " + residuo);
        if (residuo == 0 && numero < 0) {
            System.out.println("Par negativo.");
        } else if (residuo == 0 && numero > 0) {
            System.out.println("Par positivo.");
        } else if (numero == 0) {
            System.out.println("Cero.");
        } else {
            System.out.println("Ninguna de las anteriores / Es un impar.");
        }
        input.close();
    }
}
