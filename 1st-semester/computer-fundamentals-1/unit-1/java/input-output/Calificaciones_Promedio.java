/*
 2. Solicite dos calificaciones parciales y una calificación final, e imprima la calificación final, la cual es el resultado de promediar las tres calificaciones anteriores. 
 */
public class Calificaciones_Promedio {
    public static void main(String[] args) {
        float calificacion1 = 80.75f;
        float calificacion2 = 89.79f;
        float calificacionFinal = (float) (calificacion1 + calificacion2) / 2;
        System.out.printf("Calificacion final: %.2f", calificacionFinal);
    }
}
