/*
 Escribir un programa para encontrar la secuencia de Fibonacci. La secuencia es la siguiente:
 F = 0,1,1,2,3,5,8,13,21,34,55,.........,n
 El primer elemento es 0, el segundo es 1 y cada elemento restante es la suma de los dos anteriores el programa debe solicitar el numero limite de la serie .
*/
#include <stdio.h>
int main () {
    int x = 0, y = 1, limite, suma;
    printf("Establezca un limite: \n");
    scanf("%d", &limite);
    printf("%d", x);
    printf(", %d", y);
    for (suma = 1; suma < limite; ) {
        printf(", %d", suma);
        suma = x + y;
        x = y; // > 'x' toma el valor del numero anterior, o sea, toma el valor de 'y'
        y = suma; // > 'y' toma el valor del elemento restante, o sea, de la suma de los dos anteriores, para posteriormente realizar la suma de 'x' y 'y'.
    }
    return 0;
}