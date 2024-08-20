#include <stdio.h>
#include <time.h>

/*
Resolução de exercicios - Entrada e Saída de dados
Usando a linguagem de programação em C, crie um programa para os seguintes exercicios:

d. Programa que que lê a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressão apenas em dias.
*/
int main(){
    int anos, meses, dias;

    printf("\nEste programa lê a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressão apenas em dias!\n");

    printf("Digite a idade em anos: ");
    scanf("%d", &anos);

    dias = anos * 365;
    meses = dias / 30;
    dias = dias % 30; // Resto dos dias

    // Impressão dos dados
    printf("\nA idade corresponde a %d dias. Que equivale a %d meses!\n", dias + (meses * 30), meses);

    return 0;
}
