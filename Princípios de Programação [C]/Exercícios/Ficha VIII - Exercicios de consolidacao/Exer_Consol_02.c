#include <stdlib.h>
#include <stdio.h>
// #include <Exer_nr02 & Eduardo S. Come>
/*
2 - Desenvolva um programa que leia três valores inteiros positivos e apresente a diferença do
maior pelo menor, quando os números não são todos iguais
*/

int main() {
    int i, n[3], maior, menor, resultado;

    for(i = 0; i < 3; i++) {
        printf("\nDigite o %do valor: ", i+1);
        scanf("%d", &n[i]);
    }

    maior = n[0];
    menor = n[0];

    for(i = 1; i < 3; i++) {
        if(n[i] > maior) {
            maior = n[i];
        }
        if(n[i] < menor) {
            menor = n[i];
        }
    }
     if (n[0] == n[1] && n[0] == n[2]) {
        printf("\nPara calcular a diferenca os numeres devem ser diferentes.\n");
    } else {
        resultado = maior - menor;
        printf("\nA diferenca do maior pelo menor eh: %d\n", resultado);
    }
       
    return 0;
}