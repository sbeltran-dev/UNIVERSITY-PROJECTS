/*
 Calcule el valor de pi a partir de la siguiente serie infinita (Serie Gregory-Leibniz)
 pi = 4/1 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 +....
 Para 20 iteraciones e imprimir el resultado.
*/
public class Serie_Gregory {
    public static void main (String[] args) {
        double j = 4, b = 1, pi = 0;
        for (int i = 0; i < 20; i++) {
            pi += j/b;
            System.out.printf("%.0f/%.0f ", j, b);
            b++; b++;
            j = -j;
        }
        System.out.printf("\nEl valor de PI es: %f", pi);
    } 
}