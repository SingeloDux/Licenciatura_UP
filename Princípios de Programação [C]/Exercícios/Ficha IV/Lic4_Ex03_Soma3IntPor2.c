#include <stdio.h>
#include <stdlib.h>
// 3 – Escreva um programa em linguagem C, que calcule a soma de 3 números inteiros e divida o resultado por 2.

int main(){
int n1, n2, n3, soma;

printf("Este programa faz a soma de 3 numeros e divide o resultado por 2.\n");

printf("\nDigite o primeiro numero: ");
scanf("%d", &n1);

printf("\nDigite o segundo numero: ");
scanf("%d", &n2);

printf("\nDigite o terceiro numero: ");
scanf("%d", &n3);

soma=(n1+n2+n3)/2;

printf("\nO resultado da soma dividida por 2 eh: %d", soma);

return 0;
}