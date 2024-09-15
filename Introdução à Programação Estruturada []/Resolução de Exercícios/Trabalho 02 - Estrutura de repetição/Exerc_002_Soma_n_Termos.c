#include <stdio.h>
/*
2 - Leia um valor numérico n e escreva o valor da soma dos n termos.
*/
int main() {
    int n, i;
    int soma = 0;

    printf("Digite o valor de n: ");
    scanf("%d", &n);

    for (i = 1; i <= n; i++) {
        soma += i;
    }

    printf("A soma dos %d primeiros termos é: %d\n", n, soma);

    return 0;
}