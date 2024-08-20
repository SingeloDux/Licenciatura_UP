#include <stdlib.h>
#include <stdio.h>

/*
3 - Considere um programa para ler dois valores e escrever o maior deles. 
Se os valores informados forem iguais, este devera emitir uma mensagem.
*/

int main(){
int n1,n2;

printf("Este programa determina o maior dentre dois valores.");
printf("\nDigite o primeiro valor: ");
scanf("%d", &n1);

printf("\nDigite o segundo valor: ");
scanf("%d", &n2);

if (n1 > n2) {
    printf("O maior numero eh o %d\n", n1);
} else if (n2 > n1) {
    printf("O maior numero eh o %d\n", n2);
} else {
    printf("Os dois numeros sao iguais. Para determinar o maior, o segundo valor deve ser diferente do primeiro.\n");
}
    return 0;
}