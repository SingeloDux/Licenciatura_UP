#include <stdio.h>
/*
Leia o comprimento dos três lados de um triângulo (a, b, c) e determine o tipo de triângulo, com base nos seguintes casos:
    a) Se `A >= B + C`, nenhum triângulo é formado.
    b) Se `A^2 = B^2 + C^2`, é formado um triângulo retângulo.
    c) Se `A^2 > B^2 + C^2`, é formado um triângulo obtusângulo.
    d) Se `A^2 < B^2 + C^2`, é formado um triângulo acutângulo.
Observações: `A` é o maior dos lados ; `B` e `C` são os outros dois lados; Prever a possibilidade de dados negativos e indicar erro.
*/

int main() {
    float a, b, c;

    printf("Digite o comprimento do lado A: ");
    scanf("%f", &a);
    printf("Digite o comprimento do lado B: ");
    scanf("%f", &b);
    printf("Digite o comprimento do lado C: ");
    scanf("%f", &c);

    if (a <= 0 || b <= 0 || c <= 0) {
        printf("Erro: Os lados devem ser positivos.\n");
        return 1;
    }

    float A, B, C;
    if (a >= b && a >= c) {
        A = a; B = b; C = c;
    } else if (b >= a && b >= c) {
        A = b; B = a; C = c;
    } else {
        A = c; B = a; C = b;
    }

    if (A >= B + C) {
        printf("Nenhum triângulo é formado.\n");
    } else {
        float A2 = A * A;
        float B2 = B * B;
        float C2 = C * C;

        if (A2 == B2 + C2) {
            printf("É um triângulo retângulo.\n");
        } else if (A2 > B2 + C2) {
            printf("É um triângulo obtusângulo.\n");
        } else {
            printf("É um triângulo acutângulo.\n");
        }
    }

    return 0;
}