#include <stdlib.h>
#include <stdio.h>
#include <time.h>
// #include <Exer_nr23 & Eduardo S. Come>

/* 23.	Desenvolva um programa na linguagem C para calcular a determinante de uma Matriz. 
O tamanho da matriz deve ser informado pelo utilizador.
*/
int main() {
    int n;

    printf("Informe o tamanho da matriz (Ex: 3 para uma matriz 3x3): ");
    scanf("%d", &n);

    if (n != 3) {
        printf("Desculpe. O programa so calcula determinantes de matrizes 3x3 sem o uso de funcoes.\n");
        return 1;
    }

    int matriz[3][3];

    printf("\nDigite os elementos da matriz 3x3:\n");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("Elemento [%d][%d]: ", i + 1, j + 1);
            scanf("%d", &matriz[i][j]);
        }
    }

    int det = matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1]) -
              matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0]) +
              matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);

    printf("\nA determinante da matriz 3x3 eh: %d\n", det);

    return 0;
}