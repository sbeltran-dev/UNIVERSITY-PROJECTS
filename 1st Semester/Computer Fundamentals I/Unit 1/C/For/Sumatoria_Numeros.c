/*
 Sumatoria encontrar la sumatoria de una serie de numeros, el limite se le solicita al usuario. (Puede usar formula de Gauss).
 
 Escriba el numero para sumatoria: 8
 Sumatoria = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
 Resultado = 36

 Escriba el numero para sumatoria: 100
 Sumatoria = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + ... + 100
*/
#include <stdio.h>
int main () {
    int numero = 1, sumatoria, limite;
    printf("Escriba el numero para la sumatoria: ");
    scanf("%d", &limite);
    printf("%d", numero);
    for (int i = numero; i < limite; ) {
        i++;
        printf(" + %d", i);
        sumatoria = limite * (limite + 1) / 2;
    }
    printf("\nSumatoria: %d", sumatoria);
    return 0;
}