/*
 5. Solicite una medida en metros y la convierta a milímetros, centímetros, decímetros, kilómetros, pulgadas, pies, yardas y millas. 
 
 1 m = 1000 mm             1 m = 39.37 '' 
 1 m = 100 cm                 1 m = 3.28 ' 
 1 m = 10 dm                  1 m = 1.0936 yd 
 1 m = 0.001 km              1 m = 0.000621371 m 
*/
import java.util.Scanner;
public class Medida_Metros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un valor en metros: ");
        double medidaMetros = input.nextDouble();
        double medidaMilimetros = medidaMetros * 1000;
        double medidaCentimetros = medidaMetros * 100;
        double medidaDecimetros = medidaMetros * 10;
        double medidaKilometros = medidaMetros * 0.001;
        double medidaPulgadas = medidaMetros * 39.37;
        double medidaPies = medidaMetros * 3.28;
        double medidaYardas = medidaMetros * 1.0936;
        double medidaMillas = medidaMetros * 0.000621371;
        System.out.printf("Medida de metros en milimetros: %.2f\n", medidaMilimetros);
        System.out.printf("Medida de metros en centimetros: %.2f\n", medidaCentimetros);
        System.out.printf("Medida de metros en decimetros: %.2f\n", medidaDecimetros);
        System.out.printf("Medida de metros en kilometros: %.2f\n", medidaKilometros);
        System.out.printf("Medida de metros en pulgadas: %.2f\n", medidaPulgadas);
        System.out.printf("Medida de metros en pies: %.2f\n", medidaPies);
        System.out.printf("Medida de metros en yardas: %.2f\n", medidaYardas);
        System.out.printf("Medida de metros en millas: %.2f\n", medidaMillas);
        input.close();
    }
}
