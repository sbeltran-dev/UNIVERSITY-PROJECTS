/*
 Imprima en pantalla lo siguiente:
 Escriba el numero para la secuencia: 5
 1
 22
 333
 4444
 55555

 Escriba el numero para la secuencia: -4
 -4-4-4-4
 -3-3-3
 -2-2
 -1
*/
#include<stdio.h> 
int main(){
    int i,j,limite;printf("Escriba un numero para la secuencia: ");scanf("%d",&limite);if(limite>0){for(i=1;i<=limite;i++){for(j=0;j<i;j++){printf("%d",i);}printf("\n");}}else{
    for(i=limite;i<0;i++){for(j=i;j<0;j++){printf("%d",i);}printf("\n");}}return 0;
}
/*
 Lo que hicimos en este ejercicio se conoce como OFUSCACION de lineas de codigo. Es importante que te acostumbres a esta estructura porque te va a servir para que los demas no lo entiendan.
*/