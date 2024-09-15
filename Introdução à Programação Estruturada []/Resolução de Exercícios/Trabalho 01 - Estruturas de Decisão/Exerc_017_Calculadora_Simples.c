#include <stdio.h>
/*
Escreva um programa em C que implemente uma calculadora simples. 
O programa deve pedir ao usuário para inserir dois números e um operador (+, -, *, /) e, 
em seguida, exibir o resultado da operação.
*/

int main() {
    float num1, num2, resultado;
    char operador;

    printf("Digite o primeiro número: ");
    scanf("%f", &num1);
    printf("Digite o operador (+, -, *, /): ");
    scanf(" %c", &operador);
    printf("Digite o segundo número: ");
    scanf("%f", &num2);

    switch (operador) {
        case '+':
            resultado = num1 + num2;
            printf("Resultado: %.2f\n", resultado);
            break;
        case '-':
            resultado = num1 - num2;
            printf("Resultado: %.2f\n", resultado);
            break;
        case '*':
            resultado = num1 * num2;
            printf("Resultado: %.2f\n", resultado);
            break;
        case '/':
            if (num2 == 0) {
                printf("Erro: Divisão por zero!\n");
                return 1;
            }
            resultado = num1 / num2;
            printf("Resultado: %.2f\n", resultado);
            break;
        default:
            printf("Erro: Operador inválido!\n");
            return 1; 
    }

    return 0;
}