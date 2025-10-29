/*
 Encuentre la serie geometrica para 1/50
 Serie geometrica = 1/1 + 1/2 + 1/4 + 1/6 + 1/8 + 1/10 + 1/12 +...
 Imprima el resultado de la sumatoria 
 Sumatoria = 2.90797909
*/
public class Serie_Geometrica {
    public static void main (String[] args) {
        double j = 1, b = 1, sumatoria = 0;
        System.out.printf("%.0f/%.0f ", j, b);
        sumatoria += j/b;
        for (double i = b; i < 51; i++) {
            i++;
            System.out.printf("%.0f/%.0f ", j, i);
            sumatoria += j/i;
        }
        System.out.printf("\nSumatoria: %f", sumatoria);
    }
}