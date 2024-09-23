#include <stdio.h>
/*
3- Fazer um programa que leia um conjunto de 10 notas de alunos de uma disciplina, armazene-as na variável nota e determine a maior delas.
*/
int main() {
    float notas[10];
    float maiorNota;
    int i;

    for (i = 0; i < 10; i++) {
        printf("Digite a nota do aluno %d: ", i + 1);
        scanf("%f", &notas[i]);
    }

    maiorNota = notas[0];

    for (i = 1; i < 10; i++) {
        if (notas[i] > maiorNota) {
            maiorNota = notas[i];
        }
    }

    printf("A maior nota é: %.2f\n", maiorNota);

    return 0;
}