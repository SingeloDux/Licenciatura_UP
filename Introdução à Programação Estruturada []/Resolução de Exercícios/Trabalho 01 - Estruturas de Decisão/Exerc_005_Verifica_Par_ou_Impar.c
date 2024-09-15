#include <stdio.h>
/*
Desenvolva um programa capaz de verificar se um número inteiro qualquer, dado como entrada, é par ou ímpar.
*/
int main() {
    int num;

    printf("Digite um número inteiro para verificar se e par ou impar: ");
    scanf("%d", &num);

    if (num % 2 == 0) {
        printf("O número %d é par.\n", num);
    } else {
        printf("O número %d é ímpar.\n", num);
    }

    return 0;
}
