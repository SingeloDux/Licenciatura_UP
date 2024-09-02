#include <stdio.h>
/*
Escreva um programa em C que peça ao usuário para inserir um ano e determine se ele é bissexto ou não.
Nota: Um ano é considerado bissexto se:
    Ele é divisível por 4 e não é divisível por 100, ou
    Ele é divisível por 400.
*/

int main() {
    int ano;

    printf("Digite um ano: ");
    scanf("%d", &ano);

    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
        printf("O ano %d é bissexto.\n", ano);
    } else {
        printf("O ano %d não é bissexto.\n", ano);
    }

    return 0;
}