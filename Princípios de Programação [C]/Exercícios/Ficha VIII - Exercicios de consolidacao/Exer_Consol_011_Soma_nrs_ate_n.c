#include <stdio.h>
#include <stdlib.h>
// #include <Exer_nr11 & Eduardo S. Come>

/* 11 - Utilizando o comando while, faça um programa que receba um número n positivo e some-os
desde 1 ate o número n digitado. Isto é, se n = 7, somar: 1+2+3+4+5+6+7. */

int main(){
    int n, soma=0, i=1;

    printf("Digite um numero para efectuar a soma: ");
    scanf("%d", &n);

    while(i<=n){
        soma = soma + i;
        i++;
    }

    printf("\nA soma dos numeros de 1 ate %d eh: %d",n,soma);
    return 0;
}