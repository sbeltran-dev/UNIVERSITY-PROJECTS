/*
 3. Programa para convertir de grados Centígrados a grados Fahrenheit. Considere que F = C * 9.0 / 5.0 +32. La temperatura en centígrados debe ser mayor a -32 en caso contrario imprimir 
 un mensaje de error. Considere todas las validaciones necesarias.
 */
import java.util.Scanner;
public class Grados_Centigrados {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un valor en grados Centigrados: ");
        double gradosCentigrados = input.nextDouble();
        if (gradosCentigrados > -32) {
            double gradosFarenheit = gradosCentigrados * 9.0 / 5.0 + 32;
            System.out.println("\nValor en grados Farenheit: " + gradosFarenheit);
        } else {
            System.out.println("\nError.");
        }
        input.close();
    }
}