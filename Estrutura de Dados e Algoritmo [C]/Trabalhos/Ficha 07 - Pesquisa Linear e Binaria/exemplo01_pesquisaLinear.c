/* Exemplo 01 - Pesquisa Linear
   Data: 2025-05-14
   Descrição: Este programa realiza uma pesquisa linear em um vetor de inteiros.
*/
#include <stdio.h>
#include <stdlib.h>

int main(){
    int N = 5;
    int AR[10] = {11,15,16,8,2};
    int E = -1;
    int K = 8; // valor a ser pesquisado
    
    for(int i=0; i<N; N++){
    
            if(AR[i] == K){
                E=1;
                break;
            }
    }
    
    if (E == -1){
        printf("\nNao encontrado");
    }else{
        printf("\nValor encontrado");
    }

    printf("\nFIM\n");

    return 0;
}

