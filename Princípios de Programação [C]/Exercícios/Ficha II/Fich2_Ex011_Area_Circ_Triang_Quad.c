#include <stdio.h>
#include <math.h>
/* Utilizando o comando switch, construa um programa que através de um menu de selecção,
calcula a área de pelo menos três figuras geométricas a sua escolha.*/

int main() {
    int opcao;
    float lado, base, altura, raio, area;

    printf("Selecione a figura geometrica para calcular a area:\n");
    printf("1. Quadrado\n");
    printf("2. Triangulo\n");
    printf("3. Circulo\n");
    printf("Opcao: ");
    scanf("%d", &opcao);

    switch (opcao) {
        case 1: // Quadrado
            printf("Digite o lado do quadrado: ");
            scanf("%f", &lado);
            area = lado * lado;
            printf("A area do quadrado eh: %.2f\n", area);
            break;
        case 2: // Triângulo
            printf("Digite a base do triangulo: ");
            scanf("%f", &base);
            printf("Digite a altura do triangulo: ");
            scanf("%f", &altura);
            area = (base * altura) / 2;
            printf("A area do triangulo eh: %.2f\n", area);
            break;
        case 3: // Círculo
            printf("Digite o raio do circulo: ");
            scanf("%f", &raio);
            area = 3.14 * pow(raio,2);
            printf("A area do circulo eh: %.2f\n", area);
            break;
        default:
            printf("Opcao invalida.\n");
            break;
    }

    return 0;
}
