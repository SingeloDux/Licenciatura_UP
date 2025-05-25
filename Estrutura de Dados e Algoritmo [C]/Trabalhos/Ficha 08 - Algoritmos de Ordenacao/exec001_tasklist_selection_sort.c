/*
=====================================
    Aula de Estrutura de Dados e Algoritmo
    Tema: Algoritmos de Ordenação
    Recurso de apoio: 
    https://www.treinaweb.com.br/blog/conheca-os-principais-algoritmos-de-ordenacao
=====================================

Introdução:
A ordenação de elementos é um dos tópicos centrais em estrutura de dados. 
Os algoritmos de ordenação variam em complexidade e eficiência, sendo essenciais 
para otimizar buscas, relatórios e organização de dados em sistemas.

Algoritmos simples:
- Bubble Sort: Compara pares adjacentes e os troca se estiverem fora de ordem.
- Selection Sort: Seleciona o menor (ou maior) elemento e o posiciona corretamente.
- Insertion Sort: Insere elementos na posição correta em uma lista parcialmente ordenada.
- Comb Sort: Aperfeiçoamento do Bubble Sort com comparações usando gaps maiores.

Algoritmos avançados:
- Quick Sort (Hoare, 1960): Algoritmo do tipo "dividir para conquistar", usando um pivô.
- Merge Sort (John von Neumann): Divide o vetor e combina sublistas ordenadas.
- Shell Sort (Donald Shell, 1959): Variante do Insertion Sort com saltos de comparação.

=====================================

TPC (Trabalho para Casa):
Implemente um dos algoritmos de ordenação acima aplicando-o a um array de estruturas.
Exiba o resultado no fórum da disciplina, com os dados ordenados e algum relatório simples.

Algoritmo escolhido: Selection Sort  
Aplicação desenvolvida: Lista de tarefas ordenadas por prioridade (1 = mais urgente)

=====================================
*/

#include <stdio.h>
#include <string.h>

#define MAX_TAREFAS 10

typedef struct {
    int id;
    char descricao[100];
    int prioridade; // 1 = mais urgente, 5 = menos urgente
} Tarefa;

// Insere uma nova tarefa no array
void inserirTarefa(Tarefa lista[], int *quantidade, int *proximoId) {
    if (*quantidade >= MAX_TAREFAS) {
        printf("Lista de tarefas cheia!\n");
        return;
    }

    Tarefa nova;
    nova.id = (*proximoId)++;

    printf("\n--- Inserir Nova Tarefa ---\n");
    printf("Descrição: ");
    getchar(); // limpar buffer do enter
    fgets(nova.descricao, sizeof(nova.descricao), stdin);
    nova.descricao[strcspn(nova.descricao, "\n")] = '\0'; // remove o \n

    do {
        printf("Prioridade (1 a 5): ");
        scanf("%d", &nova.prioridade);
        if (nova.prioridade < 1 || nova.prioridade > 5) {
            printf("Prioridade inválida. Digite um valor entre 1 e 5.\n");
        }
    } while (nova.prioridade < 1 || nova.prioridade > 5);

    lista[*quantidade] = nova;
    (*quantidade)++;

    printf("Tarefa adicionada com sucesso!\n");
}

// Exibe a lista de tarefas
void mostrarTarefas(Tarefa lista[], int quantidade) {
    if (quantidade == 0) {
        printf("\nLista de tarefas vazia.\n");
        return;
    }

    printf("\n======= Lista de Tarefas =======\n");
    printf("ID  | PRIORIDADE | DESCRIÇÃO\n");
    printf("----+------------+------------------------------\n");

    for (int i = 0; i < quantidade; i++) {
        printf("%-3d |     %d      | %s\n",
               lista[i].id, lista[i].prioridade, lista[i].descricao);
    }
    printf("\nPressione ENTER para continuar...");
    getchar(); getchar();

}

void ordenarPorPrioridade(Tarefa lista[], int quantidade) {
    for (int i = 0; i < quantidade - 1; i++) {
        int indiceMenor = i;

        for (int j = i + 1; j < quantidade; j++) {
            if (lista[j].prioridade < lista[indiceMenor].prioridade) {
                indiceMenor = j;
            }
        }

        // Troca os elementos
        if (indiceMenor != i) {
            Tarefa temp = lista[i];
            lista[i] = lista[indiceMenor];
            lista[indiceMenor] = temp;
        }
    }

    printf("\nTarefas ordenadas por prioridade com sucesso!\n");
}

int main() {
    Tarefa lista[MAX_TAREFAS];
    int quantidade = 0;
    int proximoId = 1;
    int opcao;

    do {
        printf("\n========== MENU ==========\n");
        printf("1. Adicionar nova tarefa\n");
        printf("2. Visualizar todas as tarefas\n");
        printf("3. Ordenar por prioridade (Selection Sort)\n");
        printf("0. Sair do programa\n");
        printf("==========================\n");
        printf("Escolha uma opção: ");
        scanf("%d", &opcao);

        switch (opcao) {
            case 1:
                inserirTarefa(lista, &quantidade, &proximoId);
                break;
            case 2:
                mostrarTarefas(lista, quantidade);
                break;
            case 3:
                ordenarPorPrioridade(lista, quantidade);
                mostrarTarefas(lista, quantidade);
                break;
            case 0:
                printf("Encerrando programa.\n");
                break;
            default:
                printf("Opção inválida!\n");
        }
    } while (opcao != 0);

    return 0;
}
