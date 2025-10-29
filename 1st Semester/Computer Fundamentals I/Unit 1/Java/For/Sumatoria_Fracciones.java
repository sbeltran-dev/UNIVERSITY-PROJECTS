/*
 Sumatoria de 1/1 + 1/2 + 1/3 + 1/4 + ... + 1/50
 Calcular el resultado
*/
public class Sumatoria_Fracciones {
    public static void main (String[] args) {
        double n = 1, i = 1, resultado = 0;
        System.out.println("\n|| SUMATORIA DE FRACCIONES ||\n");
        System.out.printf("%.0f", i / n);
        for (n = 1; n < 50; ) {
            n++;
            System.out.printf(", %.3f", i / n);
            resultado += i / n;
        }
        System.out.printf("\nResultado de la sumatoria: %.3f", resultado);
    }
}