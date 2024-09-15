#include <stdio.h>
/*
A secretária de Meio Ambiente controla o índice de poluição de 3 grupos altamente poluentes. 
O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3, 
as indústrias do 1º grupo são intimadas a suspender suas atividades; se o índice crescer para 0,4, 
as indústrias do 1º e 2º grupo são intimadas a suspender suas atividades; se o índice atingir 0,5, 
todos os grupos devem ser notificados a paralisarem suas atividades. Faça um algoritmo que leia o 
índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
*/

int main() {
    float indiceP;

    printf("Digite o índice de poluição medido: ");
    scanf("%f", &indiceP);

    if (indiceP < 0.05 || indiceP > 0.5) {
        printf("Índice de poluição fora do intervalo aceitável!\n");
    } else if (indiceP >= 0.3 && indiceP < 0.4) {
        printf("Indústrias do 1º grupo devem suspender suas atividades.\n");
    } else if (indiceP >= 0.4 && indiceP < 0.5) {
        printf("Indústrias do 1º e 2º grupo devem suspender suas atividades.\n");
    } else if (indiceP >= 0.5) {
        printf("Todos os grupos devem suspender suas atividades.\n");
    } else {
        printf("Índice de poluição está dentro do intervalo aceitável.\n");
    }

    return 0;
}