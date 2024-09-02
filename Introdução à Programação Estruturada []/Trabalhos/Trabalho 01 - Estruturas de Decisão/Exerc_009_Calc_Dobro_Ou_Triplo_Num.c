#include <stdio.h>
/*
Encontre o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o result.
*/

int main() {
    int nr;
    int result;

    printf("Calculadora de dobro do número para positivos e triplo para negativo. \n");
    printf("Digite um número inteiro : ");
    scanf("%d", &nr);

    if (nr > 0) {
        result = nr * 2;
    } else {
        result = nr * 3;
    }

    printf("O resultado é: %d\n", result);

    return 0;
}