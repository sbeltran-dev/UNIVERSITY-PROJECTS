/*
 Sumatoria de 1/1 + 1/2 + 1/3 + 1/4 + ... + 1/50
 Calcular el resultado
*/
#include <stdio.h>
int main () {
    double i = 1, j = 1, sumatoria = 0;
    printf("%d/%d", j, i);
    for (i = 1; i < 51; i++) {
        printf(" + %.0f/%.0f", j, i);
        sumatoria += j / i;
    }
    printf("\nSumatoria: %f", sumatoria);
    return 0;
}