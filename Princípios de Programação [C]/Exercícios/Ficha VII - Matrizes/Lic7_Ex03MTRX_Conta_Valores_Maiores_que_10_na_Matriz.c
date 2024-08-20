#include <stdlib.h>
#include <stdio.h>

/*
3 - Leia  uma matriz  4  x  4,  conte  e  escreva  quantos  valores  maiores  que  10  ela  possui 
e retorne a localização(linha e a coluna) do maior valor.
*/

int main(){
    int matriz[4][4], i,j, contador=0;
    int posicao[2][1], maior=-10000;

    printf("Este programa conta valores maiores que 10 e retorna sua localizacao na matriz.\n");

    for(i = 0; i <4; i++){
        for(j = 0; j <4; j++){
            printf("Digite o valor da posicao [%d] [%d]: ", i+1, j+1);
            scanf("%d", &matriz[i][j]);

            if(matriz[i][j] > maior) { //comparar o valor na posicao atual da matriz com o menor atual
                maior = matriz[i][j];
                posicao[0][0]=i; //linha do maior 
                posicao[1][0]=j; // coluna do maior
            }

            if(matriz[i][j]>10){
                contador = contador+1;
            }
        }
    }
    printf("\nA matriz possui %d valores maiores que 10!", contador);
    printf("\nO maior eh %d que encontra-se na posicao [%d][%d] do vector!", maior, posicao[0][0] + 1, posicao[1][0] + 1);
    return 0;
}