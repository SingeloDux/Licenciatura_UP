#include <stdlib.h>
#include <stdio.h>
#include <math.h>
// #include <Exer_nr03 & Eduardo S. Come>
/*
3 -	Escreva um programa na linguagem C que lê 2 números reais e positivos, e efectue: 
i) a soma entre eles; 
ii) A media dos números; 
iii) a raiz quadrada da soma dos quadrados (√𝑎^2 + b^2).
*/

int main() {
    float n[2], soma, media, rq_soma_quad;
    int i=0;

    while (i < 2) {
        printf("\nDigite o %do numero real e positivo: ", i+1);
        scanf("%f", &n[i]);

        if (n[i] > 0) {
            i++;
        } else {
            printf("O numero deve ser real e positivo.\n");
        }
    }

    // i) Soma entre eles
    soma = n[0] + n[1];

    // ii) Média dos números
    media = soma / 2;

    // iii) Raiz quadrada da soma dos quadrados (√(a^2 + b^2))
    rq_soma_quad = sqrt((n[0] * n[0]) + (n[1] * n[1]));

    printf("\nA soma dos numeros eh: %.2f", soma);
    printf("\nA media dos numeros eh: %.2f", media);
    printf("\nA raiz quadrada da soma dos quadrados eh: %.2f\n", rq_soma_quad);
       
    return 0;
}