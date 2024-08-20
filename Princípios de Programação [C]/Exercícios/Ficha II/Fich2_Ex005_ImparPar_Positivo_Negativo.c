#include <stdio.h>
/*
Faça um algoritmo que leia um número inteiro e mostre uma mensagem se este for negativo, 
caso seja positivo, devera indicar ainda se ele é par ou ímpar.
Nota: O algoritmo deve emitir uma mensagem caso o valor seja 0 (zero).
*/
int main() {
    int num;
    printf("Este programa verifica se um numero eh impar, par, positivo ou negativo.\n");
    printf("Digite um numero inteiro para verificar: ");
    scanf("%d", &num);

    if (num < 0) {
        printf("O numero %d eh negativo.\n", num);
    } else if (num == 0) {
        printf("O programa nao pode determinar se e positivo ou negativo porque o numero digitado eh igual a zero.\n");
    } else {

        if (num % 2 == 0) {
            printf("O numero %d eh positivo e par.\n", num);
        } else {
            printf("O numero %d eh positivo e impar.\n", num);
        }
    }

    return 0;
}
