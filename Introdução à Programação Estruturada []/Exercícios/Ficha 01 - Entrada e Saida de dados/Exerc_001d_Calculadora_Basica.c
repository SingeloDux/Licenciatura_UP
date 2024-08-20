#include <stdio.h>
/*
Resolução de exercicios - Entrada e Saída de dados
Usando a linguagem de programação em C, crie um programa para os seguintes exercicios:

d. Leia dois números e calcule a soma e o produto entre eles, e a subtracção e a divisão do primeiro valor com o segundo. Escreva o resultado na tela.
*/
int main(){
    float nr1, nr2, soma, subtracao, produto, divisao;

    printf("\nEste programa faz calculos matematicos basicos!\n");

    printf("\nDigite o primeiro número: ");
    scanf("%f", &nr1);
    printf("Digite o segundo número: ");
    scanf("%f", &nr2);

    soma = nr1 + nr2;
    produto = nr1 * nr2;
    subtracao = nr1 - nr2;
    // Verifica divisão por zero
    if (nr2 != 0) {
        divisao = nr1 / nr2;
    } else {
        printf("Erro: Divisão por zero não é permitida.\n");
        return 1;
    }

    printf("\n--- Resultados ---\n");
    printf("Soma: %.2f\n", soma);
    printf("Produto: %.2f\n", produto);
    printf("Subtração: %.2f\n", subtracao);
    printf("Divisão: %.2f\n", divisao);
    return 0;
}
