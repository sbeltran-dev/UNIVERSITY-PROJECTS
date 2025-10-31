/*
 Calcule el valor de pi a partir de la siguiente serie infinita (Serie Gregory-Leibniz)
 pi = 4/1 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 +....
 Para 20 iteraciones e imprimir el resultado.
*/
#include<stdio.h>
int main(){
    double n=4,d=1,pi=0;printf("\n|| SERIE DE GREGORY ||\n");for(int i=1;i<21;i++){pi+=n/d;printf("%.0f/%.0f ",n,d);d++;d++;n=-n;}printf("\nEl valor de Pi es: %f",pi);return 0;
}