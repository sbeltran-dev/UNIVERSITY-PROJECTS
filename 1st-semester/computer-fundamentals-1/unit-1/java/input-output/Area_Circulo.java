/*
 4. Encontrar el área de una circulo, solicite el radio, el área de un circulo se obtiene mediante la siguiente formula Área = 𝛑 * radio2. 
*/
import java.lang.Math;
import java.util.Scanner;
public class Area_Circulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un valor para el radio: ");
        float radio = input.nextFloat();
        float resultado = (float)(Math.PI * Math.pow(radio, 2));
        System.out.printf("El area del circulo es de: %.2f", resultado);
        input.close();
    }
}