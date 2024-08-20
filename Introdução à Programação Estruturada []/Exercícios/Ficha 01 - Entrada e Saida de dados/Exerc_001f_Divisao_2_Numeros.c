#include <stdio.h>
/*
Resolução de exercicios - Entrada e Saída de dados
Usando a linguagem de programação em C, crie um programa para os seguintes exercicios:

f. Divisão de dois números;
*/
int main(){
    float nr1, nr2, divisao;

    printf("\nEste programa faz a divisao de dois numeros!\n");

    printf("\nDigite o primeiro número: ");
    scanf("%f", &nr1);
    printf("Digite o segundo número: ");
    scanf("%f", &nr2);

    if (nr2 != 0) {
        divisao = nr1 / nr2;
    } else {
        printf("Erro: Divisão por zero não é permitida.\n");
        return 1;
    }

    printf("O quociente dos numeros digitados eh: %.2f\n", divisao);
    return 0;
}
