#include <stdlib.h>
#include <stdio.h>
#include <math.h>
// #include <Exer_nr09 & Eduardo S. Come>
/*
9 - Utilizando a estrutura de decisão switch, desenvolva um programa que verificar o dia da
semana. O usuário vai digitar um número e o programa vai retornar o dia da semana
equivalente ao número.
*/

int main(){
    int num;

    printf("Digite um numero de 1 a 7 para saber o dia da semana correspondente: ");
    scanf("%d", &num);

    switch(num) {
    case 1:
        printf("Domingo");
        break;
    case 2:
        printf("Segunda-Feira");
        break;
    case 3:
        printf("Terca-Feira");
        break;
    case 4:
        printf("Quarta-Feira");
        break;
    case 5:
        printf("Quinta-Feira");
        break;
    case 6:
        printf("Sexta-Feira");
        break;
    case 7:
        printf("Sabado");
        break;
    default:
        printf("O numero digitado nao faz parte do intervalo solicitado.");
        break;
    }
    return 0;
}