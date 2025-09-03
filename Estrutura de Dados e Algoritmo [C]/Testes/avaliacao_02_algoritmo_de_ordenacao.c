/*
Estudo de Caso:
Organização de alunos do ensino primário por idade para formação de turmas, garantindo que os alunos sejam distribuídos de forma justa e apropriada por faixa etária.

Algoritmos utilizados:
- Counting Sort
- Brick Sort (Odd-Even Sort)

Ambos os algoritmos foram aplicados sobre um array de estruturas contendo o nome e a idade de cada aluno.

=====================================
*/

#include <stdio.h>
#include <string.h>

#define MAX 10
#define IDADE_MAX 12

typedef struct {
    char nome[50];
    int idade;
} Crianca;

void listarCriancas(Crianca lista[], int tamanho) {
    printf("\nLista de crianças:\n");
    printf("NOME                      | IDADE\n");
    printf("--------------------------+-------\n");
    for (int i = 0; i < tamanho; i++) {
        printf("%-25s | %d\n", lista[i].nome, lista[i].idade);
    }
}

void countingSort(Crianca lista[], int tamanho) {
    Crianca ordenado[MAX];
    int contagem[IDADE_MAX + 1] = {0};

    // Contagem de frequências
    for (int i = 0; i < tamanho; i++) {
        contagem[lista[i].idade]++;
    }

    // Acumulação dos índices
    for (int i = 1; i <= IDADE_MAX; i++) {
        contagem[i] += contagem[i - 1];
    }

    // Construção do array ordenado
    for (int i = tamanho - 1; i >= 0; i--) {
        int idx = contagem[lista[i].idade] - 1;
        ordenado[idx] = lista[i];
        contagem[lista[i].idade]--;
    }

    // Reescrever no array original
    for (int i = 0; i < tamanho; i++) {
        lista[i] = ordenado[i];
    }

    printf("\n=== Criancas ordenadas por idade usando Counting Sort ===\n");
}

void brickSort(Crianca lista[], int tamanho) {
    int trocado = 1;

    while (trocado) {
        trocado = 0;

        // Fase 1: índices pares
        for (int i = 0; i < tamanho - 1; i += 2) {
            if (lista[i].idade > lista[i + 1].idade) {
                Crianca temp = lista[i];
                lista[i] = lista[i + 1];
                lista[i + 1] = temp;
                trocado = 1;
            }
        }

        // Fase 2: índices ímpares
        for (int i = 1; i < tamanho - 1; i += 2) {
            if (lista[i].idade > lista[i + 1].idade) {
                Crianca temp = lista[i];
                lista[i] = lista[i + 1];
                lista[i + 1] = temp;
                trocado = 1;
            }
        }
    }

    printf("\n=== Criancas ordenadas por idade usando Brick Sort ===\n");
}

int main() {
    Crianca grupo[MAX] = {
        {"Ana", 9},
        {"Bruno", 7},
        {"Carla", 6},
        {"Daniel", 12},
        {"Eduarda", 10},
        {"Osvaldo", 7},
        {"Maria", 11},
        {"Henrique", 6},
        {"Isabela", 8},
        {"João", 9}
    };

    printf("Antes da ordenação:\n");
    listarCriancas(grupo, MAX);

    countingSort(grupo, MAX);
    listarCriancas(grupo, MAX);

    brickSort(grupo, MAX);
    listarCriancas(grupo, MAX);

    return 0;
}
