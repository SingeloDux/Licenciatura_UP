/*
Dado um array de tamanho 10, com 5 posições preenchidas, pretende-se remover um dos items num determinado índice P do array AR
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
    int P = 1; // Índice do item a ser removido

    // Remover o item no índice P
    for (int i = P; i < N; i++) {
        Ar[i] = Ar[i + 1];
    }

    N--; // Atualiza o número de elementos preenchidos

    mostrar(Ar, N); // Mostrar o array após a remoção

    return 0;
}
