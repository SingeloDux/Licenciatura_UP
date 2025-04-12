/**
Adicione o algoritmo da remoção de modo que:
Permitir remover e reorganizar a lista de clientes
 Actualizar a soma dos saldos após cada remoção

**/

#include<stdio.h>

struct cliente {
	int id;
	char *nome;
	float saldo;
};

const int Tamanho = 10;
int N = 0; // variáveis globais
struct cliente cl[10]; // lista com até 10 clientes

void insercao(int iD, char* n, float s, int P) {
	if (N >= Tamanho || P > N || P < 0) {
		printf("Array está cheio ou a posição é inválida.\n");
	} else {
		int i;
		for (i = N; i > P; i--) {
			cl[i] = cl[i - 1];
		}
		cl[P].id = iD;
		cl[P].nome = n;
		cl[P].saldo = s;
		N++;
		printf("Item introduzido com sucesso!\n");
	}
}

void remover(int P) {
	if (P < 0 || P >= N) {
		printf("Posição inválida para remoção.\n");
	} else {
		int i;
		for (i = P; i < N - 1; i++) {
			cl[i] = cl[i + 1]; // deslocar os elementos à esquerda
		}
		N--; // reduzir o número de elementos
		printf("Elemento removido com sucesso!\n");
	}
}

void visualizar() {
	int i;
	float s = 0;
	printf("\nQuantidade -> N: %d\n", N);
	printf("Elementos da lista:\n");
	for (i = 0; i < N; i++) {
		printf("Elemento %d | id: %d | nome: %s | saldo: %.2f\n", i, cl[i].id, cl[i].nome, cl[i].saldo);
		s += cl[i].saldo;
	}
	printf("\nSoma atualizada dos saldos: %.2f\n", s);
}

int main() {
	insercao(111, "ABC", 1500, 0); // inserção no índice 0
	insercao(222, "CDE", 500, 1);  // inserção no índice 1
	insercao(333, "XYZ", 350, 2);  // inserção no índice 2
	insercao(210, "DDD", 600, 1);  // inserção no índice 1
	visualizar();

	printf("\n--- Removendo cliente na posição 2 ---\n");
	remover(2);
	visualizar();

	return 0;
}
