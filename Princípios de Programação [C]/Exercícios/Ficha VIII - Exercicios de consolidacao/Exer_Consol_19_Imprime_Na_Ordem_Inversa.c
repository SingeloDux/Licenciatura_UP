#include <stdlib.h>
#include <stdio.h>

/*
19 - Crie um programa que lê 6 valores inteiros e, em seguida, 
mostre na tela os valores lidos na ordem inversa.
*/

int main(){
    int i, num[6];


    printf ("Este programa recebe seis valores e imprime: na ordem digitada e na inversa.\n");

    for(i = 1; i <=6; i++){
        printf("Digite o valor da %da posicao: ", i);
        scanf("%d", &num[i]);
    }

    printf("\nEsses sao os valores na ordem inversa: ");
    for(i = 6; i >=1; i--){
        printf(" %d, ", num[i]);
    }
    return 0;

}