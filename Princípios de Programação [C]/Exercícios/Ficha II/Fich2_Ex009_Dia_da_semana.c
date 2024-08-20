#include <stdio.h>
#include <stdlib.h>
/* Utilizando o comando switch, construa um programa que leia um número inteiro de 1 a 7 e informe
o dia da semana correspondente, sendo domingo o dia de número 1. Se o número não
corresponder a um dia da semana, mostre uma mensagem de erro. */

int main(){
    int num;

    printf("Digite um numero de 1 a 7 para saber o dia da semana correspondente: ");
    scanf("%d", &num);

switch (num)
{
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