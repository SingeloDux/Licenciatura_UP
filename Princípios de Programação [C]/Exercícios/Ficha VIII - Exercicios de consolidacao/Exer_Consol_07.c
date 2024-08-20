#include <stdlib.h>
#include <stdio.h>
#include <math.h>
// #include <Exer_nr07 & Eduardo S. Come>
/*
7 - O custo ao consumidor de um carro novo, é a soma do custo de fábrica com a percentagem
do revendedor e com o custo dos impostos (aplicados ao custo de fábrica). Supondo que a
percentagem do revendedor seja de 25% do custo de fábrica e que os impostos custam 45%
do custo de fábrica, faça um programa que leia o valor de custo de fábrica e determine o preço
final do automóvel (custo ao consumidor).
*/

int main() {
    float cConsum, cFabric, percRevend, cImpost;

    printf("\nInforme o custo de fabrica para calcular o preco final do automovel: ");
    scanf("%f", &cFabric);

    percRevend = cFabric * 0.25;
    cImpost = cFabric * 0.45;
    cConsum = cFabric + percRevend + cImpost;

    printf("\nO preco final do automovel  eh: %.2fMT\n", cConsum);

    return 0;
}