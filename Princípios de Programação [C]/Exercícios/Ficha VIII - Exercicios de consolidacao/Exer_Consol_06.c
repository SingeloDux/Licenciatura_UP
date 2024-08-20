#include <stdlib.h>
#include <stdio.h>
#include <math.h>
// #include <Exer_nr06 & Eduardo S. Come>
/*
6.	O sistema de avaliação de determinada disciplina, é composto por três provas. 
A primeira prova tem peso 20%, a segunda tem peso 30% e a terceira prova tem peso 50%. 
Faça um programa para calcular a média final de um aluno desta disciplina.
*/

int main() {
    int i=0;
    float nota[3], media;

    while (i < 3) {
        printf("\nDigite a nota da %da prova: ", i+1);
        scanf("%f", &nota[i]);

        if (nota[i] >= 0 && nota[i]<=20) {
            i++;
        } else {
            printf("A nota nao pode ser menor que 0 ou maior que 20.\n");
        }
    }
    // Como a soma dos pesos é 1, a fórmula pode ser simplificada para:
    media = (nota[0] * 0.2) + (nota[1] * 0.3) + (nota[2]* 0.5);

    printf("A media final do aluno eh: %.2f\n", media);

    return 0;
}