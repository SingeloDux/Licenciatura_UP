#include <stdlib.h>
#include <stdio.h>

/*
1 - Faça um programa para achar o menor valor da Matriz do tipo 2x4.
*/

int main(){
    int matriz[2][4], menor=0;

    printf ("Este programa retorna o menor valor duma matriz 2x4.\n");

    for(int i = 0; i <2; i++){
        for(int j = 0; j <4; j++){
            printf("Digite o valor da posicao [%d] [%d]: ", i+1, j+1);
            scanf("%d", &matriz[i][j]);

            if(i == 0 && j == 0) { //inicializar a variavel menor com o primeiro elemento da matriz, indice 0.
                menor = matriz[i][j];
            } else {
                if(matriz[i][j] < menor) { //comparar o valor na posicao atual da matriz com o menor atual
                    menor = matriz[i][j];
                }
            }
        }
    }
    
    printf("\nO menor valor da matriz eh %d !", menor);

    return 0;
}