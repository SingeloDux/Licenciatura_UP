#include <stdio.h>
/* Casos de estudo B

Complete as seguintes funções e chame no main:
a) int Maior ( int Ar [ ] ) { .. } Retorna o maior elemento par na lista Ar
*/

// Função para retornar o maior elemento par na lista Ar
int Maior(int Ar[], int tamanho) {
    int maior = -1; // para indicar que nenhum número par foi encontrado
    for (int i = 0; i < tamanho; i++) {
        if (Ar[i] % 2 == 0 && Ar[i] > maior) {
            maior = Ar[i];
        }
    }
    return maior;
}

int main() {
    int tamanho;
    printf("Digite o tamanho do array: ");
    scanf("%d", &tamanho);

    int Ar[tamanho];
    for (int i = 0; i < tamanho; i++) {
        printf("Digite o %do elemento do array: ", i + 1);
        scanf("%d", &Ar[i]);
    }

    // Chama a função Maior e imprime o resultado
    int maiorPar = Maior(Ar, tamanho);
    if (maiorPar != -1) {
        printf("O maior elemento par do array eh: %d\n", maiorPar);
    } else {
        printf("Nao ha elementos pares no array.\n");
    }

    return 0;
}