#include <stdlib.h>
#include <stdio.h>
// #include <Exer_nr21 & Eduardo S. Come>

/*
21 - Faca um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
a) somar as duas matrizes
b) subtrair a primeira matriz da segunda
c) adicionar uma constante as duas matrizes
d) imprimir as matrizes
*/

int main() {
    float matrizA[2][2], matrizB[2][2], matrizResultado[2][2];
    float constante;
    char opcao;
    int i, j;

    printf("Digite os elementos da Matriz A: \n");
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 2; j++) {
            printf("Matriz A[%d][%d]: ", i, j);
            scanf("%f", &matrizA[i][j]);
        }
    }

    printf("\nDigite os elementos da Matriz B:\n");
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 2; j++) {
            printf("Matriz B[%d][%d]: ", i, j);
            scanf("%f", &matrizB[i][j]);
        }
    }

    printf("\nMenu de opcoes:\n");
    printf("a) Somar as duas matrizes\n");
    printf("b) Subtrair a primeira matriz da segunda\n");
    printf("c) Adicionar uma constante as duas matrizes\n");
    printf("d) Imprimir as matrizes\n");
    printf("Escolha a opcao (a, b, c ou d): ");
    scanf(" %c", &opcao);

    switch(opcao) {
        case 'a':
            // Somar as matrizes
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }
            printf("\nResultado da soma das matrizes:\n");
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    printf("%.2f ", matrizResultado[i][j]);
                }
                printf("\n");
            }
            break;
        case 'b':
            // Subtrair a primeira matriz da segunda
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    matrizResultado[i][j] = matrizB[i][j] - matrizA[i][j];
                }
            }
            printf("\nResultado da subtracao das matrizes (B - A):\n");
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    printf("%.2f ", matrizResultado[i][j]);
                }
                printf("\n");
            }
            break;
        case 'c':
            printf("Digite a constante a ser adicionada: ");
            scanf("%f", &constante);
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    matrizA[i][j] += constante;
                    matrizB[i][j] += constante;
                }
            }
            printf("\nMatriz A apos adicionar a constante:\n");
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    printf("%.2f ", matrizA[i][j]);
                }
                printf("\n");
            }
            printf("\nMatriz B apos adicionar a constante:\n");
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    printf("%.2f ", matrizB[i][j]);
                }
                printf("\n");
            }
            break;
        case 'd':
            // Imprimir as matrizes
            printf("\nMatriz A:\n");
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    printf("%.2f ", matrizA[i][j]);
                }
                printf("\n");
            }
            printf("\nMatriz B:\n");
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    printf("%.2f ", matrizB[i][j]);
                }
                printf("\n");
            }
            break;
        default:
            printf("Opcao invalida!\n");
    }

    return 0;
}