/*
 Sea la siguiente operacion, aplicable a cualquier entero positivo:
 Si el numero es par, se divide entre 2.
 Si el numero es impar, se multiplica por 3 y se le suma 1.
 Solicite al usuario el numero de entero positivo.
 Imprima cada elemento de la conjetura de Collatz hasta que llegue a 1.
*/
import java.util.Scanner;
public class Conjetura_Collatz {
    public static void main (String[] args) {
        int numero, residuo = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un numero entero positivo: ");
        numero = input.nextInt();
        if (numero > 0) {
            for (; numero > 1;) {
                System.out.print("\t" + numero);
                residuo = numero % 2;
                if (residuo == 0) {
                    numero = numero / 2;
                } else {
                    numero = (numero * 3) + 1;
                }
            }
            System.out.println("\t" + numero); // > Para imprimir el 1.
        } else {
            System.out.println("ERROR!!!111!!11!!1");
        }
        input.close();
    }

}
