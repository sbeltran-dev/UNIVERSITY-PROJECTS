/*
 1. Diseñe un programa que solicite la edad de una persona si la edad esta entre 0 y 12, imprimir niño, si la edad esta entre 13 y 17 imprimir adolescente, si la edad esta entre 18 y 25 
 joven adulto, si la edad esta entre 26 y 45 imprimir adulto, si la edad están entre 46 y 60 imprimir adulto mayor, si la edad esta entre 61 y 120 anciano, si la edad es mayor a 120 imprimir 
 difícil de creer. Considere todas las validaciones necesarias.
*/
import java.util.Scanner;
public class Imprimir_Edad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca la edad de una persona: ");
        int edad = input.nextInt();
        if (edad == 0 || edad <= 12) {
            System.err.println("Nino.");
        } else if (edad == 13 || edad <= 17) {
            System.out.println("Adolescente.");
        } else if (edad == 18 || edad <= 25 ) {
            System.out.println("Joven adulto.");
        } else if (edad == 26 || edad <= 45) {
            System.out.println("Adulto.");
        } else if (edad == 46 || edad <= 60) {
            System.out.println("Adulto mayor.");
        } else if (edad == 61 || edad <= 120) {
            System.out.println("Anciano.");
        } else {
            System.out.println("Dificil de creer.");
        }
        input.close();
    }
}