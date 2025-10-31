/*
 7. El promedio de prácticas de un curso se calcula en base a cuatro prácticas calificadas de las cuales se elimina la nota más baja y se promedian las tres notas más altas. Escriba un 
 programa que determine el promedio, si todas las calificaciones son menores de 7 imprimir el mensaje "Repetir curso", en lugar del promedio. 
Ejemplo: 
Sistema de Captura de calificaciones
Practica 1: 8
Practica 2: 6
Practica 3: 8.5 
Practica 4: 6
Tu promedio es de 7.5 

Sistema de Captura de calificaciones
Practica 1: 6.9
Practica 2: 6
Practica 3: 6.5 
Practica 4: 6 REPETIR CURSO. 

El rango de calificaciones es de 0.0 a 10.0.
Considere todas las validaciones necesarias.
 */
import java.util.Scanner;
public class Practicas_Curso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double calificacionesAltas = 0, cantidadAltas = 0, calificacion1, calificacion2, calificacion3, calificacion4;
        System.out.println("\n|| SISTEMA DE CAPTURA DE CALIFICACIONES ||\n");
        System.out.println("Practica 1: ");
        calificacion1 = input.nextDouble();
        if (calificacion1 >= 6) {
            calificacionesAltas += calificacion1;
            cantidadAltas++;
        }
        System.out.println("Practica 2: ");
        calificacion2 = input.nextDouble();
        if (calificacion2 >= 6) {
            calificacionesAltas += calificacion2;
            cantidadAltas++;
        }
        System.out.println("Practica 3: ");
        calificacion3 = input.nextDouble();
        if (calificacion3 >= 6) {
            calificacionesAltas += calificacion3;
            cantidadAltas++;
        }
        System.out.println("Practica 4: ");
        calificacion4 = input.nextDouble();
        if (calificacion4 >= 6) {
            calificacionesAltas += calificacion4;
            cantidadAltas++;
        }
        System.out.println("Cantidad de calificaciones altas: " + cantidadAltas);
        double promedio = calificacionesAltas / cantidadAltas;
        System.out.println("Promedio: " + promedio);
        if (calificacion1 < 7 && calificacion2 < 7 && calificacion3 < 7 && calificacion4 < 7) {
            System.out.println("Repetir curso.");
        }
    }
}
