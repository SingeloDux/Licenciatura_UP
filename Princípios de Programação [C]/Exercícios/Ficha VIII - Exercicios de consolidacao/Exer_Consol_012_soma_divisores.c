#include <stdio.h>
#include <stdlib.h>
// #include <Exer_nr12 & Eduardo S. Come>

/* 12 - Usando o comando FOR, escreva um programa que leia um número inteiro e 
calcule a soma de todos os divisores desse número, com exceção dele próprio. 
Ex: a soma dos divisores do número 66 é 1 + 2 + 3 + 6 + 11 + 22 + 33 = 78
*/

int main(){
    int i=1, n, soma = 0;

    printf("\nDigite um numero inteiro para calcular a soma de todos os seus divisores: ");
    scanf("%d", &n);

    for(i; i<n; i++){
        if(n % i == 0) {
            soma += i;
        } 
    }
    printf("\n A soma dos divisores de %d, excepto ele proprio eh %d !", n, soma);
    return 0;
}