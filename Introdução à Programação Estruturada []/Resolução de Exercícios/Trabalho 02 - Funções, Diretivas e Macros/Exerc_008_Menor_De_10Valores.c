#include <stdio.h>
/*
8. Programa que recebe 10 números inteiros e determina o menor.
*/
int main() {
    int num[10], menor;

    for(int i=0; i<10;i++){
        printf("Digite o %do número:", i+1);
        scanf("%d", &num[i]);
    }

    menor = num[0];
    for(int i = 1; i <10; i++) {
        if(num[i] < menor) {
            menor = num[i];
        }
    }

    printf("O menor número é: %d\n", menor);

    return 0;
}

