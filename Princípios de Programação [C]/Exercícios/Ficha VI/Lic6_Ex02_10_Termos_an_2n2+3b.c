#include <stdlib.h>
#include <stdio.h>

/*
2 - Faça um programa para calcular os 10 primeiros termos de uma sucessão definida pelo termo geral: an= 2n^2+3, usando:
a) A estrutura de Repetição WHILE
b) A estrutura de Repetição FOR
*/

int main(){
    int an, n;

    printf("Os 10 primeiros termos da sucessao an = 2n^2 + 3 sao:\n");

    for(n=1;n<=10;n++){
        an = 2 * n * n + 3;
        printf("a%d = %d\n", n, an); 
    }
    return 0;
}