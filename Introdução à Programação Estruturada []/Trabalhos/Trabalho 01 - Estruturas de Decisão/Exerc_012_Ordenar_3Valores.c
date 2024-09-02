#include <stdio.h>
/*
Leia um conjunto de quatro valores `i`, `a`, `b`, `c`, onde `i` é um valor inteiro e positivo 
e `a`, `b`, `c` são quaisquer valores reais distintos. Escreva: 
    a) Se `i = 1`, os 3 valores `a`, `b`, `c` em ordem crescente.
    b) Se `i = 2`, os 3 valores `a`, `b`, `c` em ordem decrescente.
    c) Se `i = 3`, os 3 valores de forma que o maior valor entre `a`, `b`, `c` fique entre os outros 2.
*/
int main() {
    int i;
    float a, b, c, temp;

    printf("Digite o valor de i (inteiro positivo de 1 a 3): ");
    scanf("%d", &i);
    printf("Digite o valor de a: ");
    scanf("%f", &a);
    printf("Digite o valor de b: ");
    scanf("%f", &b);
    printf("Digite o valor de c: ");
    scanf("%f", &c);

    switch (i) {
        case 1: // Ordem crescente
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                temp = b;
                b = c;
                c = temp;
            }
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }
            printf("Ordem crescente: %.2f, %.2f, %.2f\n", a, b, c);
            break;
        case 2: // Ordem decrescente
            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            if (b < c) {
                temp = b;
                b = c;
                c = temp;
            }
            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            printf("Ordem decrescente: %.2f, %.2f, %.2f\n", a, b, c);
            break;
        case 3: // Maior valor entre os outros 2
            if (a >= b && a >= c) {
                printf("Maior valor entre os outros 2: %.2f, %.2f, %.2f\n", b, a, c);
            } else if (b >= a && b >= c) {
                printf("Maior valor entre os outros 2: %.2f, %.2f, %.2f\n", a, b, c);
            } else {
                printf("Maior valor entre os outros 2: %.2f, %.2f, %.2f\n", a, c, b);
            }
            break;
        default:
            printf("Valor de i inválido!\n");
            return 1;
    }

    return 0;
}