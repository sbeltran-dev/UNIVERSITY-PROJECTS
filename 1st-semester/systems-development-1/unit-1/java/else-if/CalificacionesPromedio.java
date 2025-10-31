//3. Elaborar un programa en Java que lea los datos de un estudiante (nombre y tres calificaciones parciales) e imprima el nombre y la calificación
// final de acuerdo con lo siguiente: para aprobar el curso debe tener 60 o más en cada una de las tres calificaciones, la calificación final será el
// promedio. En caso de haber reprobado uno o más exámenes ordinarios, la calificación final será NA (No Acreditado).
import java.util.Scanner;
public class CalificacionesPromedio {
    public static void main(String[] args) {
        Scanner leer = new  Scanner(System.in);
        System.out.println("Nombre del alumno: ");
        String alumno = leer.next();
        System.out.println("Calificacion del primer parcial: ");
        double parcial1 =  leer.nextDouble();
        System.out.println("Calificacion del segundo parcial: ");
        double parcial2 =  leer.nextDouble();
        System.out.println("Calificacion del tercer parcial: ");
        double parcial3 =  leer.nextDouble();
        double sumaparciales= parcial1 + parcial2 + parcial3;
        double calificacionfinal = sumaparciales / 3;
//Opcion 1 (else)
        /*
        if (parcial1 >= 60 && parcial2 >= 60 && parcial3 >= 60) {
            System.out.println("Nombre de alumno: " + alumno);
            System.out.printf("Calificacion final del alumno %s: %.2f%n", alumno, calificacionfinal);
            System.out.print("Aprobatoria: Si");
        } else {
            System.out.println("Nombre de alumno: " + alumno);
            System.out.printf("Calificacion final del alumno %s: %.2f%n", alumno, calificacionfinal);
            System.out.print("Aprobatoria: No");
        }
        */
//Opcion 2: (else if). El && se usa para casos en los que TODOS los valores cumplen con esa condicion, pero en caso de que por el incumplimiento de UNA
//O MAS condiciones, debera ponerse || para indicar que ya no entra al if.
        /*
        if (parcial1 >= 60 && parcial2 >= 60 && parcial3 >= 60) {
            System.out.println("Nombre de alumno: " + alumno);
            System.out.printf("Calificacion final del alumno %s: %.2f%n", alumno, calificacionfinal);
            System.out.print("Aprobatoria: Si");
        } else if (parcial1 < 60 || parcial2 < 60 || parcial3 < 60) {
            System.out.println("Nombre de alumno: " + alumno);
            System.out.printf("Calificacion final del alumno %s: %.2f%n", alumno, calificacionfinal);
            System.out.print("Aprobatoria: No");
        }
        */
    }
}
