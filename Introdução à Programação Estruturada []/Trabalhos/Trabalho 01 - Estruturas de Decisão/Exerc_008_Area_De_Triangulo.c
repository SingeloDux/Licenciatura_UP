#include <stdio.h>
/*
Prepare um programa para ler a base e a altura de um triângulo e imprimir a área 
(`área = 0.5 * base * altura`). Preveja a possibilidade de valores negativos para a base ou a 
altura e imprima uma mensagem identificando este valor como a base ou a altura, se for o caso.
*/

int main() {
    float base, altura, area;

    printf("Digite a base do triângulo: ");
    scanf("%f", &base);

    if (base < 0) {
        printf("Valor inválido: A base não pode ser negativa.\n");
        return 1; 
    }

    printf("Digite a altura do triângulo: ");
    scanf("%f", &altura);

    if (altura < 0) {
        printf("Valor inválido: A altura não pode ser negativa.\n");
        return 1; 
    }

    area = 0.5 * base * altura;
    printf("A área do triângulo é: %.2f\n", area);
    return 0;
}