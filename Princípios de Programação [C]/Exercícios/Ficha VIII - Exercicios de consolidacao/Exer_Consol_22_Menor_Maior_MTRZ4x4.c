#include <stdlib.h>
#include <stdio.h>
#include <time.h>
// #include <Exer_nr22 & Eduardo S. Come>

/* 22 - Desenvolva um programa na linguagem C, que leia uma matriz 4 x 4, cujos os valores são preenchidos automaticamente pela função RAND, 
e imprima a matriz gerada e retorne a localização (linha e a coluna) do maior valor, imprimir os elementos da diagonal principal.
Considere que a faixa de valores gerados esta entre zero e 100.
*/

int main() {
    int matriz[4][4];
    int maiorValor = 0;
    int linhaMaior, colunaMaior;
    srand(time(NULL));

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            matriz[i][j] = rand() % 101; // Gera números entre 0 e 100
        }
    }

    printf("Matriz gerada:\n");
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            printf("%3d ", matriz[i][j]);
            if (matriz[i][j] > maiorValor) {
                maiorValor = matriz[i][j];
                linhaMaior = i;
                colunaMaior = j;
            }
        }
        printf("\n");
    }

    printf("\nO maior valor da matriz eh %d, esta na linha %d, coluna %d.\n", maiorValor, linhaMaior + 1, colunaMaior + 1);

    printf("\nElementos da diagonal principal:\n");
    for (int i = 0; i < 4; i++) {
        printf("%d ", matriz[i][i]);
    }
    printf("\n");
    return 0;
}