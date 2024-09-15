#include <stdio.h>
/*
Faça um programa que leia dois inteiros, que representam a idade e o tempo de contribuição de um trabalhador e 
informe se ele pode se aposentar ou não. Os critérios para aposentadoria são: Ter pelo menos 65 anos de idade; 
Ou ter trabalhado pelo menos 30 anos; Ou ter pelo menos 60 anos e trabalhado pelo menos 25.
*/
int main() {
    int idade, tempoContribuicao;

    printf("Digite a idade do trabalhador: ");
    scanf("%d", &idade);
    printf("Digite o tempo de contribuição (em anos): ");
    scanf("%d", &tempoContribuicao);

    if (idade >= 65) {
        printf("O trabalhador pode se aposentar (idade >= 65 anos).\n");
    } else if (tempoContribuicao >= 30) {
        printf("O trabalhador pode se aposentar (tempo de contribuição >= 30 anos).\n");
    } else if (idade >= 60 && tempoContribuicao >= 25) {
        printf("O trabalhador pode se aposentar (idade >= 60 anos e tempo de contribuição >= 25 anos).\n");
    } else {
        printf("O trabalhador não pode se aposentar.\n");
    }

    return 0;
}