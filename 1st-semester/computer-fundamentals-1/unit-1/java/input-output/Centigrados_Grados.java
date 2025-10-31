/*
 1. Convertir de grados Centígrados a grados Fahrenheit. Considere que F = C * 9.0 / 5.0 + 32. 
 */
public class Centigrados_Grados {
    public static void main (String [] args) {
        float centigrados = 110.25f;
        float gradosFarenheit = (float) ((centigrados * 9.0) / 5.0 + 32);
        System.out.printf("La conversion es igual a: %.2f", gradosFarenheit);
    }
}
