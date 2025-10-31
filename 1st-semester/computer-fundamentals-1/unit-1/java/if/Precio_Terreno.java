/*
 8. Elabore un algoritmo para calcular e imprimir el precio de un terreno del cual se tienen los siguientes datos: largo, ancho y precio por metro cuadrado. Si el terreno tiene más de 
 400 metros cuadrados se hace un descuento de 7.6%. Considere todas las validaciones necesarias.
 */
import java.util.Scanner;
public class Precio_Terreno {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double largo, ancho, metrosCuadrados, descuento = 0.076, precioMetro = 100;
        System.out.println("\n|| PROGRAMA PARA CALCULAR EL PRECIO DE UN TERRENO ||\n");
        System.out.println("Introduzca un largo: ");
        largo = input.nextDouble();
        System.out.println("Introduzca un ancho: ");
        ancho = input.nextDouble();
        metrosCuadrados = largo * ancho;
        precioMetro = precioMetro * metrosCuadrados;
        if (metrosCuadrados > 400) {
            precioMetro = precioMetro * descuento;
        }
        System.out.printf("Precio total: %.2f", precioMetro);
        input.close();
    }
}
