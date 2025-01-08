/*
Desenvolver um programa que efetue a leitura de 10 elementos de um vetor A, construir um vetor B de mesmo tipo, observando a lei de formacao: se o valor for par, o valor devera ser multiplicado por 5, sendo impar, devera ser somado com 5. Ao final, mostrar os conteudos dos dois vetores.
*/
#include <stdio.h>
#include <string.h>

int main(){
    int vetorA[10], vetorB[10], i;

    for(i = 0 ; i < 10; i++){
        printf("Digite o elemento %d do vetor: ", i + 1);
        scanf("%d", &vetorA[i]);
        
        if (vetorA[i] % 2 ==0){
            vetorB[i] = vetorA[i]*5;

        }else{
            vetorB[i] = vetorA[i]+5;
        }    
    }
    
    printf("\nVetor A: ");
    for (int i = 0; i < 10; i++) {
        if (vetorA[i] % 2 == 0) {
            printf("\033[32m%d\033[0m", vetorA[i]);
        } else {
            printf("\033[31m%d\033[0m", vetorA[i]);
        }
        if (i < 9) printf("  ");
    }

    printf("\nVetor B: ");
    for (int i = 0; i < 10; i++) {
        if (vetorA[i] % 2 == 0) { 
            printf("\033[32m%d\033[0m", vetorB[i]);
        } else {
            printf("\033[31m%d\033[0m", vetorB[i]);
        }
        if (i < 9) printf("  ");
    }

    printf("\n");
    return 0;
}
