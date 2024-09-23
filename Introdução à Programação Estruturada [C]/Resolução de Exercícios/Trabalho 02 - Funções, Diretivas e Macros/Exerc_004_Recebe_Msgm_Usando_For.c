#include <stdio.h>
#include <string.h>

/*
4. Programa que recebe várias mensagens usando estrutura de repetição e exibir na tela.
*/
int main() {
    char mensagens[3][100]; 

    for(int i = 0; i < 3; i++) {
        printf("Digite uma mensagem: ");
        scanf(" %[^\n]", mensagens[i]); 
    }

    printf("\n Mensagens digitadas");

    for(int i = 0; i < 3; i++) {
        printf("%s\n", mensagens[i]);
    }

    return 0;
}