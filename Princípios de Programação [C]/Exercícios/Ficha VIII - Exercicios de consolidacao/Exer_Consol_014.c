#include <stdio.h>
#include <stdlib.h>
// #include <Exer_nr14 & Eduardo S. Come>

/* 14 -	Crie um programa que peça X números inteiros e apresente: a mehdia dos números, o maior e o menor números. 
Admita que o número 0 eh utilizado como sentinela (para fim de leitura), ou seja, para finalizar o programa e exibir os resultados.
*/

int main() {
    int num, count = 0;
    int soma = 0, maior = INT_MIN, menor = INT_MAX;
    float media;

    printf("Digite numeros inteiros para ver a media, o maior e menor. Digite 0 para terminar: \n");

    while(1){
        scanf("%d", &num);
        if (num == 0) {
            break;
        }
        soma += num;
        count++;
        if (num > maior) {
            maior = num;
        }
        if (num < menor) {
            menor = num;
        }
    }

    if (count > 0) {
        media = (float)soma / count;
        printf("A media dos numeros eh: %.2f\n", media);
        printf("O maior numero eh: %d\n", maior);
        printf("O menor numero eh: %d\n", menor);
    } else {
        printf("Nenhum numero foi inserido.\n");
    }
    return 0;
}