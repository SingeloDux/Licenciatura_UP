#include <stdlib.h>
#include <stdio.h>
// #include <Exer_nr20 & Eduardo S. Come>

/*
20 - Faca um programa para ler a nota da prova de 15 alunos e armazene num vector, calcule e
imprima a media geral.
*/

int main() {
    float notas[15];
    float soma = 0, media;
    int i;

    for (i = 0; i < 15; i++) {
        printf("Digite a nota do %do aluno: ", i + 1);
        scanf("%f", &notas[i]);

        soma += notas[i];
    }

    media = soma / 15;

    printf("\nA media geral das notas dos alunos eh: %.2f\n", media);

    return 0;
}