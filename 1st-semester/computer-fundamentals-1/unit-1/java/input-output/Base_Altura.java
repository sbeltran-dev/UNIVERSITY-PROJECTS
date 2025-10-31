/*
 3. Programa para encontrar el área de una triangulo, solicite la base y altura, el área de un triángulo se obtiene médiatela siguiente formula Área = Base * Altura / 2. 
*/
public class Base_Altura {
    public static void main(String[] args) {
       int base = 15;
       float altura = 72.5f;
       float area = (float) (base * altura) / 2;
       System.out.printf("Area del triangulo: %.2f", area);
    }
}