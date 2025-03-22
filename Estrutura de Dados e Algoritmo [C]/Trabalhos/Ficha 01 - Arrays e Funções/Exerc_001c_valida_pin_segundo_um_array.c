#include <stdio.h>

/* Casos de estudo B

Complete as seguintes funções e chame no main:
c)void Login (int Acessos [ ], int P ) { ... }  Verifica se o pin P existe na lista Acessos ou não.
*/

void Login(int Acessos[], int P) {
    for (int i = 0; i < 5; i++) {
        if (Acessos[i] == P) {
            printf("Pin %d encontrado na lista de acessos.\n", P);
            return; 
        }
    }
    printf("Pin %d não encontrado na lista de acessos.\n", P);
}

int main() {
    int Acessos[5] = {1234, 5678, 9101, 1121, 3344};

    int P;
    printf("Digite o PIN para verificar: ");
    scanf("%d", &P);

    // Chama a função Login para verificar se o pin está na lista
    Login(Acessos, P);

    return 0;
}