/*
 Encuentre la serie alternada para 1/50
 Serie alternada = 1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + 1/7 - 1/8 +...
 Imprimir el resultado de la sumatoria
*/
public class Serie_Alternada {
    public static void main (String[] args) {
        double j = 1, b = 1, sumatoria = 0;
        System.out.printf("%.0f", j);
        sumatoria += j/b;
        for (double i = b; i < 50; ) {
            i++;
            j = -j;
            System.out.printf(" %.0f/%.0f ", j, i);
            sumatoria += j/i;
        }
        System.out.printf("\nSumatoria: %f", sumatoria);
    }
}