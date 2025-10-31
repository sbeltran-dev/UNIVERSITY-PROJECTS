/*
 Encontrar la sucesion de farey para un numero, supongamos
 3 = 1/1, 1/2, 1/3
     2/1, 2/2, 2/3
     3/1, 3/2, 3/3
*/
#include <stdio.h>
int main () {
    int i, j, numero;
    printf("Introduzca un numero para la secuencia de Farey: "); scanf("%d", &numero); printf("%d = ", numero);
    for (i = 1; i <= numero; i++) {
        for (j = 1; j <= numero; j++) {
            printf("%d/%d", i, j);
            if (i == j && i == numero) printf(". "); // > Se puede comprimir el 'if' porque solo esta imprimiendo, o sea, que solo necesitamos una linea de codigo.
            else printf(", ");
        }
        printf("\n");
    }
    return 0;
}