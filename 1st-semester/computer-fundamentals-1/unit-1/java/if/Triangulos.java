/*
 5. Escriba un programa que lea tres longitudes y determine si forman o no un triángulo. Si es un triángulo, determine de qué tipo de triángulo se trata entre: equilátero (Si tiene tres lados 
 iguales), isósceles (si tiene dos lados iguales) o escaleno (si tiene tres lados desiguales). Considere que para formar un triángulo se requiere que: "el lado mayor sea menor que la suma de 
 los otros dos lados". Considere todas las validaciones necesarias.
 */
import java.util.Scanner;
public class Triangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Programa para determinar el tipo de un triangulo en funcion de la longitud de sus lados.");
        System.out.println("Desarrollado por: Santiago Beltran.");
        float lado1 = Float.parseFloat(System.console().readLine("Lado 1: "));
        if (lado1 > 0) {
            float lado2 = Float.parseFloat(System.console().readLine("Lado 2: "));
            if (lado2 > 0) {
                float lado3 = Float.parseFloat(System.console().readLine("Lado 3: "));
                if (lado3 > 0) {
                    // > Determinamos si las medidas cumplen para ser un triangulo.
                    // > Primer paso para encontrar el lado mayor.
                    float mayor = lado1;
                    if (mayor < lado2) {
                        mayor = lado2;
                    }
                    if (mayor < lado3) {
                        mayor = lado3;
                    }
                    System.out.printf("El lado mayor es %s: ", mayor);
                    if (mayor < (lado1 + lado2 + lado3 - mayor)) {
                        System.out.println("Si es un triangulo.");
                        // > Determinamos el tipo de triangulo.
                        if (lado1 == lado2 && lado2 == lado3) {
                            System.out.println("Triangulo equilatero.");
                        } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
                            System.out.println("Escaleno.");
                        } else {
                            System.out.println("Isoseles.");
                        }
                    } else {
                        System.out.println("Con esas medidas no es posible formar un triangulo.");
                    }
                } else {
                    System.out.println("El lado de un triangulo tiene que ser mayor a 0.");
                }
            } else {
                System.out.println("El lado de un triangulo tiene que ser mayor a 0.");
            }
        } else {
            System.out.println("El lado de un triangulo tiene que ser mayor a 0.");
        }
    input.close();
    }
}