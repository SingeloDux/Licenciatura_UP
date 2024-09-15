#include <stdio.h>
/*Escreva um programa que receba a idade de 10 pessoas, calcule e imprima a quantidade de pessoas maiores de idade (idade >= 18 anos).
*/

int main() {
    int idade, maioresDeIdade = 0, i;

    for (i = 1; i <= 10; i++) {
        printf("Digite a idade da %da pessoa : ", i);
        scanf("%d", &idade);

        if (idade >= 18) {
            maioresDeIdade++;
        }
    }

    printf("Quantidade de pessoas maiores de idade: %d\n", maioresDeIdade);

    return 0;
}