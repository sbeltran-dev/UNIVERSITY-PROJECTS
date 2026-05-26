// Make a Java program that reads a student's data (name and three partial grades) and prints the name and the final
// grade according to the following: to pass the course the student must have 60 or more in each of the three grades, the final grade will be
// the average. If the student has failed one or more regular exams, the final grade will be NA (Not Accredited).
import java.util.Scanner;
public class AverageGrades {
    public static void main(String[] args) {
        Scanner read = new  Scanner(System.in);
        System.out.println("Student's name: ");
        String student = read.next();
        System.out.println("First partial grade: ");
        double grade1 =  read.nextDouble();
        System.out.println("Second partial grade: ");
        double grade2 =  read.nextDouble();
        System.out.println("Third partial grade: ");
        double grade3 =  read.nextDouble();
        double gradessum = grade1 + grade2 + grade3;
        double finalgrade = gradessum / 3;
//Option 1 (else)
        /*
        if (grade1 >= 60 && grade2 >= 60 && grade3 >= 60) {
            System.out.println("Student's name: " + student);
            System.out.printf("%s's final grade: %.2f%n", student, finalgrade);
            System.out.print("Passed the course: Yes");
        } else {
            System.out.println("Student's name: " + student);
            System.out.printf("%s's final grade: %.2f%n", student, finalgrade);
            System.out.print("Passed the course: No");
        }
        */
//Option 2: (else if). The && operator is used for cases when ALL values meet that condition, but in case of non-compliance with ONE
//OR MORE conditions, the || operator should be use to indicate that it no longer enters the if statement.
        /*
        if (grade1 >= 60 && grade2 >= 60 && grade3 >= 60) {
            System.out.println("Student's name: " + student);
            System.out.printf("%s's final grade: %.2f%n", student, finalgrade);
            System.out.print("Passed the course: Yes");
        } else if (grade1 < 60 || grade2 < 60 || grade3 < 60) {
            System.out.println("Student's name: " + student);
            System.out.printf("%s's final grade: %.2f%n", student, finalgrade);
            System.out.print("Passed the course: No");
        }
        */
    }
}
