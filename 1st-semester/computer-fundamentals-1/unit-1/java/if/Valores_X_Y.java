/*
 9. Elabore un algoritmo que imprima los valores de X y Y, teniendo como entrada el valor de X y calcular el de Y de acuerdo con las siguientes condiciones: Si X>0 entonces Y = 3X + 6.
Si X=0 entonces Y = X + 6 
Si X<0 entonces Y = X

Considere todas las validaciones necesarias.
 */
import java.util.Scanner;
public class Valores_X_Y {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Introduzca un valor para X: ");
        x = input.nextInt();
        if (x > 0) {
            System.out.printf("Y = 3(%d) + 6", x);
        } else if (x == 0) {
            System.out.printf("Y = %d + 6", x);
        } else if (x < 0) {
            System.out.printf("Y = %d", x);
        }
    }
}
