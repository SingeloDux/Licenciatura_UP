#include <stdio.h>
#include <stdlib.h>
// #include <Exer_nr10 & Eduardo S. Come>

/* 10 - Utilizando o comando switch, faça um programa que receba a altura e o sexo de uma pessoa e
calcule e mostre seu peso ideal, utilizando as seguintes formulas (onde h corresponde a altura):
- Homens: (72.7 ∗ h) − 58
- Mulheres: (62, 1 ∗ h) − 44,7 */

int main(){
    char sexo;
    float h, pesoIdeal;

    printf("Digite a altura em metros para o calculo do peso ideal : ");
    scanf("%f", &h);

    printf("\nDigite o sexo (M para masculino ou F para feminino): ");
    scanf(" %c", &sexo);

    switch (sexo) {
        case 'M':
        case 'm':
            pesoIdeal = (72.7 * h) - 58;
            printf("O peso ideal para um homem com %.2f metros de altura eh %.2f kg.\n", h, pesoIdeal);
            break;
        case 'F':
        case 'f':
            pesoIdeal = (62.1 * h) - 44.7;
            printf("O peso ideal para uma mulher com %.2f metros de altura eh %.2f kg.\n", h, pesoIdeal);
            break;
        default:
            printf("Opcao invalida. Digite M para masculino ou F para feminino.\n");
            break;
    }
    return 0;
}