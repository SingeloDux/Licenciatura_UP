#include <stdio.h>
/*
Resolução de exercicios - Entrada e Saída de dados
Usando a linguagem de programação em C, crie um programa para os seguintes exercicios:

i. Programa que lê as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
*/
int main(){
    float base, altura, area;

    printf("\nEste programa retorna a area de um retângulo!\n");

    printf("Digite a base do retângulo: ");
    scanf("%f", &base);

    printf("Digite a altura do retângulo: ");
    scanf("%f", &altura);

    area = base * altura;

    printf("\nA área do retângulo é: %.2f\n", area);

    return 0;
}
