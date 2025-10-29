/*
 Encontrar la sucesion de farey para un numero, supongamos
 3 = 1/1, 1/2, 1/3
     2/1, 2/2, 2/3
     3/1, 3/2, 3/3
*/

import java.util.Scanner;
public class Sucesion_Farey {
    public static void main (String[] args) {
        int numeroSucesion;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un numero para la sucesion de Farey: ");
        numeroSucesion = input.nextInt();
        for (int i = 1; i <= numeroSucesion; i++) {
            for (int j = 1; j <= numeroSucesion; j++) {
                System.out.printf("%d/%d\t", i, j);
            }
            System.out.println("");
        }
        input.close();
    }
}