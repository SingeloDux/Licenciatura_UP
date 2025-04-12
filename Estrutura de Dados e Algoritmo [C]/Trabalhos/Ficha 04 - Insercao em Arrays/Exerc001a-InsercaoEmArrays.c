/**
Insercao Em Arrays

CASO DE ESTUDO
1 - Melhore o algoritmo e o programa apresentado de modo que:
a) O valor de K e P sejam introduzidos pelo teclado, e que não haja violação do índice P (dentro dos limites do array).
**/
#include <stdio.h>

void mostrar(int x[]){
    int i;
    for(i=0; i<10; i++){
        printf("Elemento %d = %d \n",i, x[i]);
    }
}

int main(){
    int Ar[10] = {11,15,16,8,2};
    int N = 5; // Número atual de elementos no array
    int K, P; // Valor a inserir e índice de inserção
    int i;

    // Mostrar o array antes da inserção
    printf("Array antes da insercao:\n");
    mostrar(Ar);

    printf("\nPor favor indique o valor (K) a inserir no array: ");
    scanf("%d", &K);

    printf("Por favor indique o indice (P) onde deseja inserir o valor: ");
    scanf("%d", &P);

    // Verificação de limites
    if(P < 0 || P > N || N >= 10){
        printf("Posicao invalida ou array cheio. Insercao nao realizada.\n");
        return 1;
    }

    // Move os elementos para abrir espaço na posição P
    for(i = N; i > P; i--){
        Ar[i] = Ar[i - 1];
    }

    Ar[P] = K; // Insere o valor K na posição P
    N++; // Atualiza o número de elementos
    
    mostrar(Ar); // Mostrar o array apos a insercao

    return 0;
}
