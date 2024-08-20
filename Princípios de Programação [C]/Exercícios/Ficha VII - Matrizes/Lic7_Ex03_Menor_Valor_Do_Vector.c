#include <stdlib.h>
#include <stdio.h>

/*
3 - Faça um programa para achar o menor valor do vector. Considere um vector do tipo 1x4.
*/

int main(){
    int i, num[4], menor;


    printf ("Este programa retorna o menor valor de um vector 1x4 \n");

    for(i = 0; i <4; i++){
        printf("Digite o valor da %d posicao: ", i+1);
        scanf("%d", &num[i]);
    }
    
    menor = num[0];

    for(i = 0; i <4; i++){

        if(num[i]<menor){
            menor=num[i];
        }
    }   
    printf("\nO menor valor dos valores digitados eh %d", menor);

    return 0;
}