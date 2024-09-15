#include <stdio.h>
/*
10. Programa que recebe um array e o seu respectivo tamanho e no final exibir na ordem crescente. Coloque a função de ordenação fora do método main.
*/
void ordenarArray(int arr[], int tamanho) {
    int temp;
    for(int i = 0; i < tamanho - 1; i++) {
        for(int j = i + 1; j < tamanho; j++) {
            if(arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

int main() {
    int numeros[5] = {10, 3, 45, 7, 1};

    ordenarArray(numeros, 5);

    printf("Números em ordem crescente: ");
    for(int i = 0; i < 5; i++) {
        printf("%d ", numeros[i]);
    }
    printf("\n");

    return 0;
}