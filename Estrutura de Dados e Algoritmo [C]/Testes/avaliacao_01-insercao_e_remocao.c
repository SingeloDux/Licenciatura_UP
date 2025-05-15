/*
1 - Usando estruturas, faça um programa qualquer à sua escolha que permite 

a) inserir elementos em um array de estruturas usando o algoritmo da inserção, seguido da impressão dos dados existentes. Este, deve igualmente imprimir um pequeno relatório (à sua escolha) que resulte dos dados processados (ex. o maior, o menor, etc).

b) Simule a remoção de um elemento na lista seguido pela visualização do array após a remoção.
*/
#include <stdio.h>
#include <string.h>

#define MAX 5

typedef struct {
    int id;
    char nome[50];
    char telefone[15];
    char email[50];
} Contato;

// Valida se o contato contém apenas dígitos
int validarContato(char str[]) {
    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] < '0' || str[i] > '9') {
            return 0;
        }
    }
    return 1;
}

void inserirContato(Contato agenda[], int *quantidade, int *proximoId) {
    if (*quantidade >= MAX) {
        printf("Agenda cheia!\n");
        return;
    }

    Contato novo;
    novo.id = (*proximoId)++;

    printf("\n--- Inserir novo contato ---\n");
    printf("Nome: ");
    getchar(); // limpar buffer
    fgets(novo.nome, sizeof(novo.nome), stdin);
    novo.nome[strcspn(novo.nome, "\n")] = 0;

    do {
        printf("Insira o número do telefone: ");
        scanf("%s", novo.telefone);
        if (!validarContato(novo.telefone)) {
            printf("Telefone inválido. Tente novamente.\n");
        }
    } while (!validarContato(novo.telefone));

    printf("Email: ");
    scanf("%s", novo.email);

    agenda[*quantidade] = novo;
    (*quantidade)++;
}

void removerContato(Contato agenda[], int *quantidade, int id) {
    int pos = -1;

    for (int i = 0; i < *quantidade; i++) {
        if (agenda[i].id == id) {
            pos = i;
            break;
        }
    }

    if (pos == -1) {
        printf("Contato com ID %d não encontrado.\n", id);
        return;
    }

    // Mover os elementos para cobrir o removido
    for (int i = pos; i < *quantidade - 1; i++) {
        agenda[i] = agenda[i + 1];
    }

    (*quantidade)--;

    printf("Contato com ID %d removido com sucesso.\n", id);
}

void mostrarContatos(Contato agenda[], int quantidade) {
    printf("\n--- Lista de Contatos ---\n");
    for (int i = 0; i < quantidade; i++) {
        printf("ID: %d | Nome: %s | Telefone: %s | Email: %s\n",
               agenda[i].id, agenda[i].nome, agenda[i].telefone, agenda[i].email);
    }
}

void relatorio(Contato agenda[], int quantidade) {
    if (quantidade == 0) {
        printf("\nAgenda vazia.\n");
        return;
    }

    Contato *primeiro = &agenda[0];

    for (int i = 1; i < quantidade; i++) {
        if (strcmp(agenda[i].nome, primeiro->nome) < 0) {
            primeiro = &agenda[i];
        }
    }

    printf("\n--- Relatório ---\n");
    printf("Total de contatos: %d\n", quantidade);
    printf("Primeiro em ordem alfabética: %s (ID: %d)\n", primeiro->nome, primeiro->id);
}

int main() {
    Contato agenda[MAX];
    int quantidade = 0;
    int proximoId = 1;
    int opcao;

    do {
        printf("\n1. Inserir contato\n2. Ver lista\n3. Ver relatório\n4. Remover contato por ID\n0. Sair\nEscolha: ");
        scanf("%d", &opcao);

        switch (opcao) {
            case 1:
                inserirContato(agenda, &quantidade, &proximoId);
                break;
            case 2:
                mostrarContatos(agenda, quantidade);
                break;
            case 3:
                relatorio(agenda, quantidade);
                break;
            case 4: {
                int id;
                printf("Informe o ID do contato a remover: ");
                scanf("%d", &id);
                removerContato(agenda, &quantidade, id);
                break;
            }
            case 0:
                printf("Saindo...\n");
                break;
            default:
                printf("Opção inválida.\n");
        }
    } while (opcao != 0);

    return 0;
}
