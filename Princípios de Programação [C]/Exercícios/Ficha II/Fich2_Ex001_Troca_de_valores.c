#include <stdio.h>
#include <stdlib.h>
// 1 – Faça um programa que leia dois valores para as variáveis A e B  
// e efetue a troca dos valores deforma que a variável A passe a possuir o valor da variável B 
// e a variável B passe a possuir o valor da variável A. 
// Apresente os valores trocados se A & B forem diferentes e maiores que zero.
int main(){

    int a,b,aux;

    printf("\nDigite o valor de A: ");
    scanf("%d", &a);

    printf("\nDigite o valor de B: ");
    scanf("%d", &b);

    if(a !=b && a>0 && b>0){
        aux=a;
        a=b;
        b=aux;
        printf("\nTroca  de valores efectuada. Agora o valor de A=%d, e o valor de B=%d", a, b);

    }else{
        printf("\n Os valores de A e B devem ser diferentes e nenhum deles pode ser zero.");
    }
    return 0;
}