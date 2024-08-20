#include <stdio.h>
#include <stdlib.h>
// #include <Exer_nr15 & Eduardo S. Come>

/* 15 -	Construa um programa que gere automaticamente 10 (dez) números inferiores a 100. 
O programa devera imprima os gerados, e calcule a média dos números, 
a quantidade de números pares e ímpares e múltiplos positivos de 7.
*/

int main() {
    int i;
    int soma = 0, media, pares = 0, impares = 0, multiplos7 = 0;

    printf("1O numeros gerados automaticamente:\n");
    for (i = 1; i <= 30; i += 3) {
        printf("%d ,", i);
        soma += i;

        if (i % 2 == 0) {
            pares++;
        } else {
            impares++;
        }

        if (i % 7 == 0) {
            multiplos7++;
        }
    }

    media = soma / 10;

    printf("\n\nA media dos numeros gerados eh: %d\n", media);
    printf("A quantidade de numeros pares eh: %d\n", pares);
    printf("A quantidade de numeros impares eh: %d\n", impares);
    printf("A quantidade de multiplos positivos de 7 eh: %d\n", multiplos7);

    return 0;
}