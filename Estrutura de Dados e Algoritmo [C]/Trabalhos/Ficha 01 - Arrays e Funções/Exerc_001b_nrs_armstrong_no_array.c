#include <stdio.h>

/* Casos de estudo B

Complete as seguintes funções e chame no main:
b) int contagem(int Ar [ ]) { .. }  Retorna o número de elementos Armstrong na lista Ar
*/

int potencia(int base, int expoente) {
    // Substituímos a função pow da biblioteca matemática por uma função manual potencia. A função pow da biblioteca matemática não é recomendada para inteiros, pois retorna um double.

    int resultado = 1;
    for (int i = 0; i < expoente; i++) {
        resultado *= base;
    }
    return resultado;
}

// Função para contar o número de elementos Armstrong na lista Ar
int contagem(int Ar[], int tamanho) {
    int count = 0;
    for (int i = 0; i < tamanho; i++) {
        int num = Ar[i];
        int originalNum = num;
        int n = 0, resultado = 0;

        while (originalNum != 0) {
            originalNum /= 10;
            ++n; // Conta o número de dígitos em num para calcular a potência n
        }

        originalNum = num;

        // Calcula a soma dos dígitos elevados à potência n
        while (originalNum != 0) {
            int resto = originalNum % 10;
            resultado += potencia(resto, n); // Usa a função potencia
            originalNum /= 10;
        }

        if (resultado == num) {
            count++; // Incrementa o contador se o número é Armstrong
        }
    }
    return count;
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

    int numArmstrong = contagem(Ar, tamanho);
    printf("O numero de elementos Armstrong no array eh: %d\n", numArmstrong);

    return 0;
}