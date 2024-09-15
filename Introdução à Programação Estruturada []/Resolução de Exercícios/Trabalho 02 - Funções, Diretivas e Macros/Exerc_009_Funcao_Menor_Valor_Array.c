#include <stdio.h>
/*
9. Programa que recebe como argumento um array e o seu respectivo tamanho e exibe o menor usando funções.
*/
int menorValor(int arr[], int tamanho) {
    int menor = arr[0];

    for(int i = 1; i < tamanho; i++) {
        if(arr[i] < menor) {
            menor = arr[i];
        }
    }

    return menor;
}

int main() {
    int numeros[5] = {10, 25, 6, 9, 12};

    printf("O menor número é: %d\n", menorValor(numeros, 5));

    return 0;
}