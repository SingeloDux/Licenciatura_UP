#include <stdio.h>
#include <stdlib.h>

//4 - Construa um programa que receba como entrada três valores e os imprima em ordem crescente.

int main (){
int a,b,c,maior;

printf("Digite o primeiro valor: ");
scanf("%d", &a);

printf("Digite o segundo valor: ");
scanf("%d", &b);

printf("Digite o terceiro valor: ");
scanf("%d", &c);

if(a>b){
    maior=a; //Armazenamento do maior para passar para B
    a=b; // a recebe o menor
    b=maior; // B recebe o maior
}

if(a>c){
    maior = a;
    a = c;
    c= maior;
}

if(b>c){
    maior = b;
    b = c;
    c = maior;
}

    printf("Os valores em ordem crescente sao: %d, %d, %d\n", a, b, c);

    return 0;
}