/*
 6. Escriba un programa para determinar el grado de eficiencia de un operador de una fábrica de tornillos, de acuerdo a las siguientes condiciones, que se le imponen en un período de prueba:

1. Menos de 200 tornillos defectuosos.
2. Más de 10000 tornillos producidos.

El grado de eficiencia se determina de la siguiente manera:

1. Si no cumple ninguna condición, grado 5.
2. Si sólo cumple la primera condición, grado 6.
3. Si sólo cumple la segunda condición, grado 7.
4. Si cumple las dos condiciones, grado 8.
Considere todas las validaciones necesarias.
*/
import java.util.Scanner;
public class Grado_Eficiencia {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int tornillosDefectuosos, tornillosProducidos;
        System.out.println("Introduzca tornillos producidos: ");
        tornillosProducidos = input.nextInt();
        System.out.println("Cuantos tornillos son defectuosos? ");
        tornillosDefectuosos = input.nextInt();
        if (tornillosDefectuosos < 200 && tornillosProducidos > 10000) {
            System.out.println("Grado de eficiencia: 8.");
        } else if (tornillosProducidos > 10000) {
            System.out.println("Grado de eficiencia: 7.");
        } else if (tornillosDefectuosos < 200) {
            System.out.println("Grado de eficiencia: 6.");
        } else {
            System.out.println("Grado de eficiencia: 5.");
        }
    }
}