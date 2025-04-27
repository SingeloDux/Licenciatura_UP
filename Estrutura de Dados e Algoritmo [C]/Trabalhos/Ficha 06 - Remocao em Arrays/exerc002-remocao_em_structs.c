/*
Casos de Estudo
2 – Use o algoritmo discutido para remover dados de um array de estruturas. Será necessário visualizar o array após a operação.
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    int id;
    char nome[50];
} Pessoa;

// Função para exibir o array de estruturas
void mostrar(Pessoa x[], int N) {
    for (int i = 0; i < N; i++) {
        printf("Elemento %d: ID = %d, Nome = %s\n", i, x[i].id, x[i].nome);
    }
}

int main() {
    // Array de estruturas
    Pessoa Ar[10] = { 
        {1, "Alice"}, {2, "Eduardo"}, {3, "Celio"}, {4, "Diana"}, {5, "Anselmo"}
    };
    int N = 5; // Número atual de elementos no array
    int P;     // Índice do item a ser removido

    printf("Array atual:\n");
    mostrar(Ar, N);
    printf("Digite o índice do item a ser removido (0 a %d): ", N - 1);
    scanf("%d", &P);

    if (P < 0 || P >= N) {
        printf("Índice inválido! O índice deve estar entre 0 e %d.\n", N - 1);
        return 1; // Finaliza o programa com erro
    }

    // Remover o item no índice P
    for (int i = P; i < N - 1; i++) {
        Ar[i] = Ar[i + 1];
    }
    N--; // Atualiza o número de elementos preenchidos

    printf("\nArray após a remoção:\n");
    mostrar(Ar, N);

    return 0;
}
