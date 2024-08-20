#include <stdio.h>
/*
Resolução de exercicios - Entrada e Saída de dados
Usando a linguagem de programação em C, crie um programa para os seguintes exercicios:

g. Calculo da média final dos alunos, tendo em conta que foram realizadas 4 testes;
*/
int main(){
    float nota1, nota2, nota3, nota4, media;

    printf("\nEste programa Calculo da média final dos alunos que realizaram 4 testes!\n");

    printf("Digite a primeira nota: ");
    scanf("%f", &nota1);
    printf("Digite a segunda nota: ");
    scanf("%f", &nota2);
    printf("Digite a terceira nota: ");
    scanf("%f", &nota3);
    printf("Digite a quarta nota: ");
    scanf("%f", &nota4);

    media = (nota1+nota2+nota3+nota4)/4;

    printf("\nA média final do aluno eh: %.2f\n", media);
    return 0;
}
