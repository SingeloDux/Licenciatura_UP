#include <stdio.h>
/*
7. Programa que exibe o maior de dois números
*/
int maiorNumero(int a, int b) {
    return (a > b) ? a : b;
}

int main() {
    int num[2];

    for(int i=0; i<2;i++){
        printf("Digite o %do número:", i+1);
        scanf("%d", &num[i]);
    }

    printf("O maior número é: %d\n", maiorNumero(num[0], num[1]));

    return 0;
}


