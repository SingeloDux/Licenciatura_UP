#include <stdio.h>
#include <stdlib.h>
/* Utilizando a estrutura de decisão switch, desenvolva um programa que verificar o dia da semana. 
O  usuário  vai  digitar  um  número  e  o  programa  vai  retornar  o  dia  da  semana  equivalente  ao número */

int main(){
    int num;

    printf("Digite um numero de 1 a 7 para saber o dia da semana correspondente: ");
    scanf("%d", &num);

switch (num)
{
case 1:
    printf("Domingo\n");
    break;

case 2:
printf("Segunda-Feira\n");
break;

case 3:
printf("Terca-Feira\n");
break;

case 4:
printf("Quarta-Feira\n");
break;

case 5:
printf("Quinta-Feira\n");
break;

case 6:
printf("Sexta-Feira\n");
break;

case 7:
printf("Sabado\n");
break;

default:
    printf("Erro! O numero digitado nao faz parte do intervalo solicitado.\n");
    break;
}

    return 0;
}