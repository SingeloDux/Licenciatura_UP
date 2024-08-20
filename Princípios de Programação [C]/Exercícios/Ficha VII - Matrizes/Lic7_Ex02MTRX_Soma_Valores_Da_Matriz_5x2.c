#include <stdlib.h>
#include <stdio.h>

/*
2 - Faça um programa para somar todos valores de uma Matriz do tipo 5x2.
*/

int main(){
    int matriz[5][2], soma=0;

    printf("Este programa calcula a soma dos valores de uma matriz 5x2.\n");

    for(int i = 0; i <5; i++){
        for(int j = 0; j <2; j++){
            printf("Digite o valor da posicao [%d] [%d]: ", i+1, j+1);
            scanf("%d", &matriz[i][j]);

            soma = soma + matriz[i][j];
        }
    }
    
    printf("\nA soma dos valores da matriz digitada eh %d !", soma);

    return 0;
}