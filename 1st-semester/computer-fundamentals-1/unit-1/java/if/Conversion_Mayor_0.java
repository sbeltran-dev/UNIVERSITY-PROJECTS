package If;
/*
 2. Programa para convertir de pies a centímetros. Si los centímetros son mayores a cero imprimir el resultado, en caso contrario imprimir un mensaje de error. Considere todas las 
 validaciones necesarias.
 */

import java.util.Scanner;
public class Conversion_Mayor_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un valor en Pies: ");
        double valorPies = input.nextDouble();
        double valorCentimetros = valorPies * 100;
        if (valorCentimetros > 0) {
            System.err.println("\nResultado: " + valorCentimetros);
        } else {
            System.out.println("Error.");
        }
        input.close();
    }
}