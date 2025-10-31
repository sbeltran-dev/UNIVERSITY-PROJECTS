/*
 Sumatoria encontrar la sumatoria de una serie de numeros, el limite se le solicita al usuario. (Puede usar formula de Gauss).
 
 Escriba el numero para sumatoria: 8
 Sumatoria = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
 Resultado = 36

 Escriba el numero para sumatoria: 100
 Sumatoria = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + ... + 100
*/
import java.util.Scanner;
public class Sumatoria_Numeros {
    public static void main (String[] args) {
        int sumatoria = 0, limite, resultado = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un valor para el numero de sumatorias: ");
        limite = input.nextInt();
        for (int i = 0; i < limite; i++) {
            System.out.printf("%d ", i + 1);
            // > Usamos la formula de Gauss.
            resultado = (limite * (limite + 1)) / 2;
        }
        System.out.println("\nResultado de la sumatoria: " + resultado);
        input.close();
    }
}