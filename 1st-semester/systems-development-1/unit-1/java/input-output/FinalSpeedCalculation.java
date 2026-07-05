import java.util.Scanner;
public class FinalSpeedCalculation {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String UNDERLINED = "\u001B[4m";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(RED + "\nWELCOME\n" + RESET);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(MAGENTA + "═══════════════ ENTER YOUR NAME ═══════════════");
        String name = input.nextLine();
        System.out.println("▶ What is the name of the object?: ");
        String object = input.nextLine();
        System.out.println("▶ What is the height?: " + RESET);
        double height = input.nextDouble();
        double gravity = 9.8;
        double finalspeed = Math.sqrt(2 * gravity * height);
        System.out.printf(UNDERLINED + GREEN + "▀▄▀▄▀▄ %s, if the object %s falls from %.2f meters, its final speed would be: %.2f m/s", name, object, height, finalspeed);
    }
}
