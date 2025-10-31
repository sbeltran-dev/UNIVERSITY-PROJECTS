/*
 La sucesion de Padovan, es la secuencia de numeros P(n) definida por los siguientes valores iniciales: 
 P(0) = P(1) = P(2) = 1, y la siguiente relacion de recurrencia.
 P(n) = P(n-2) + P(n-3).
 Los primeros valores de P(n) son
 1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37, 49, 65, 86, 114, 151, 200, 265, 351, 465, 616, 816, 1081, 1432, 1897, 2513, 3329, 44100,...
 Solicite al usuario el limite de la serie.
*/
#include <stdio.h>
int main () {
    int p0 = 1, p1 = 1, p2= 1, p, limite;
    printf("Establezca un limite para la sucesion de Padovan: ");
    scanf("%d", &limite);
    printf("%d, %d, %d", p0, p1, p2); // > Copiamos el valor de las primeras variables.
    for (int i = 3; i < limite; i++) { // > 'i' va a empezar en 3 porque antes ya imprimimos las 3 variables.
        p = p0 + p1;
        if (p > limite) {
            break;
        }
        printf(", %d", p);
        p0 = p1;
        p1 = p2;
        p2 = p;
    }
    return 0;
}