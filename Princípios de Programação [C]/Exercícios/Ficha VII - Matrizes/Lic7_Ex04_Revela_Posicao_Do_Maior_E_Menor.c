#include <stdlib.h>
#include <stdio.h>

/*
4 - Fazer um programa para ler 5 valores e, em seguida, mostrar a posição onde se encontram o maior e o menor valor
*/

int main(){
    int i, num[5], menor, maior, posicao_menor, posicao_maior;


    printf ("Este programa retorna a posicao do maior e o menor valor de um vector.\n");

    for(i = 0; i <5; i++){
        printf("Digite o valor da %d posicao: ", i+1);
        scanf("%d", &num[i]);
    }
    
    menor = num[0];
    maior = num[0];
    posicao_menor = 0;
    posicao_maior = 0;

    for(i = 1; i <5; i++){

        if(num[i]<menor){
            menor=num[i];
            posicao_menor = i;

        } 
        if(num[i]>maior){
            maior=num[i];
            posicao_maior = i;
        }
    }   
    printf("\nO menor valor dos valores digitados eh %d e encontra-se na posicao %d", menor, posicao_menor+1);
    printf("\nO maior valor dos valores digitados eh %d e encontra-se na posicao %d\n", maior, posicao_maior+1);

    return 0;
}