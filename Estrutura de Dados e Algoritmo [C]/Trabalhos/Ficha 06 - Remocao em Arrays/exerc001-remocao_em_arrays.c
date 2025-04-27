/*
Casos de Estudo
1 – Melhore o algoritmo e o programa apresentado de modo que o valor do índice do array por remover seja introduzido pelo teclado.
*/
#include <stdio.h>
#include <stdlib.h>

void mostrar(int x[], int N) {
    for (int i = 0; i < N; i++) {
        printf("Elemento %d = %d \n", i, x[i]);
    }
}

int main() {
    int Ar[10] = {11, 15, 16, 8, 2};
    int N = 5; // Número atual de elementos no array
    int P;     // Índice do item a ser removido

    printf("Array atual:\n");
    mostrar(Ar, N);

    printf("Digite o índice do item a ser removido (0 a %d): ", N - 1);
    scanf("%d", &P);

    // Validaco do índice fornecido pelo usuário
    if (P < 0 || P >= N) {
        printf("Índice inválido! O índice deve estar entre 0 e %d.\n", N - 1);
        return 1;
    }

    // Remocao do item no índice P
    for (int i = P; i < N - 1; i++) {
        Ar[i] = Ar[i + 1];
    }

    N--; // Atualiza o número de elementos preenchidos

    printf("\nArray após a remoção:\n");
    mostrar(Ar, N);

    return 0;
}
