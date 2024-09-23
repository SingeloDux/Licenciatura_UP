#include <stdio.h>
/*
Resolução de exercicios - Entrada e Saída de dados
Usando a linguagem de programação em C, crie um programa para os seguintes exercicios:

e. Efectue a soma de dois números inteiros;
*/
int main(){
    int nr1, nr2, soma;

    printf("\nEste programa faz calculos matematicos basicos!\n");

    printf("\nDigite o primeiro número: ");
    scanf("%d", &nr1);
    printf("Digite o segundo número: ");
    scanf("%d", &nr2);

    soma = nr1 + nr2;

    printf("\n--- Resultados ---\n");
    printf("A soma dos numeros digitados eh: %d\n", soma);

    return 0;
}
