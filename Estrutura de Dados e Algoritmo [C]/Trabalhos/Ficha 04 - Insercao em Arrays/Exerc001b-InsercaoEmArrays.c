/**
Insercao Em Arrays

CASO DE ESTUDO
1 - Melhore o algoritmo e o programa apresentado de modo que:
a) ...
b) Adicione outras melhorias ao algoritmo por forma a torna-lo perfeito (vide o link http://www.tutorialsspace.com/Data-Structures/13-Array-Insertion-In-An-Array-Algorithm.aspx).
NOTA: O LINK FORNECIDO NAO ENCONTRA-SE MAIS ACESSIVEL.
**/
#include <stdio.h>
#define TAMANHO 10

// Função para exibir o array até o índice N
void mostrar(int x[], int N){
    printf("\n--- Conteudo do Array ---\n");
    for(int i = 0; i < N; i++){
        printf("Elemento %d = %d\n", i, x[i]);
    }
    printf("-------------------------\n");
}

// Função para inserir um elemento no array
int inserir(int Ar[], int *N, int K, int P){
    if(*N >= TAMANHO){
        printf("Erro: O array esta cheio. Nao e possivel inserir mais elementos.\n");
        return 0;
    }

    if(P < 0 || P > *N){
        printf("Erro: Posicao invalida. Deve estar entre 0 e %d.\n", *N);
        return 0;
    }

    for(int i = *N; i > P; i--){
        Ar[i] = Ar[i - 1];
    }

    Ar[P] = K;
    (*N)++;
    return 1;
}

int main(){
    int Ar[TAMANHO] = {11, 15, 16, 8, 2};
    int N = 5; // Número de elementos válidos no array
    int K, P;

    printf("Array inicial:\n");
    mostrar(Ar, N);

    printf("Digite o valor (K) a ser inserido: ");
    scanf("%d", &K);

    printf("Digite a posicao (P) para insercao (0 a %d): ", N);
    scanf("%d", &P);

    if(inserir(Ar, &N, K, P)){
        printf("Valor inserido com sucesso!\n");
        mostrar(Ar, N);
    } else {
        printf("Falha na insercao.\n");
    }
    return 0;
}