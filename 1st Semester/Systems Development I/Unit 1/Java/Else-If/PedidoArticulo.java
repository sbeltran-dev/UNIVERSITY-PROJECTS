//1. Elaborar un programa en Java que imprima el costo de un pedido de un artículo del cual se tiene la descripción,
// la cantidad pedida y el precio unitario. Si la cantidad pedida es mayor a 50 unidades, se hace un descuento de 15%.
import java.util.Scanner;
public class PedidoArticulo {
    public  static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cual es el articulo que desea adquirir?: ");
        String articulo = leer.nextLine();
        System.out.println("El precio unitario de " + articulo + " es de: ");
        double precioUnitario = leer.nextDouble();
        System.out.println("Cuantas unidades de " + articulo + " desea comprar?: ");
        int unidad = leer.nextInt();
//Opcion #1 (mas limpio, utilizando solo else. El programa asume que la cantidad siempre va a ser mayor a 50, el if es solo en caso de que sea menor a 50):
        /*
        if (unidad <= 50) {
            double preciotot = precioUnitario * unidad;
            System.out.printf("El precio total del articulo %s es de: %.2f%n", articulo, preciotot);
        } else {
            double subtotal = precioUnitario * unidad;
            double descuento = subtotal * 0.15;
            double preciotot = subtotal - descuento;
            System.out.printf("El subtotal es de: %.2f%n", subtotal);
            System.out.printf("El descuento es de: %.2f%n", descuento);
            System.out.printf("Teniendo en cuenta el descuento y el subtotal, el precio total del articulo %s seria de: %.2f%n", articulo, preciotot);
        }
        */
//Opcion #2 (uso de else if. Mismo procedimiento solo que mas especifico)
        /*
        if (unidad <= 50) {
            double preciotot = precioUnitario * unidad;
            System.out.printf("El precio total es de: %.2f%n", preciotot);
        } else if (unidad > 50) {
            double subtotal = precioUnitario * unidad;
            double descuento = subtotal * 0.5;
            double preciotot = subtotal - descuento;
            System.out.printf("El subtotal es de: %.2f%n", subtotal);
            System.out.printf("El descuento es de: %.2f%n", descuento);
            System.out.printf("Teniendo en cuenta el descuento y el subtotal, el precio total del articulo %s seria de: %.2f%n", articulo, preciotot);
        }
        */
//Switch no es recomendable en este caso, pues else-if es mejor para rangos numericos (x>0)
//y switch esta hecho para casos (dias a la semana, origen de, marca de).
    }
}
