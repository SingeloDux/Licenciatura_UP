/**
CASO DE ESTUDO D
1 - Crie um array de notas  Ar de tamanho 5, e um ponteiro P que aponta para Ar.
**/
#include <stdio.h>

int main() {
    float Ar[5];
    float *P = Ar;

    // a) Use o P inserir os valores no array pelo teclado e visualiza-los.

    for (int i = 0; i < 5; i++) {
        printf("Insira a nota %d: ", i + 1);
        scanf("%f", P + i);
    }

    printf("\n=-=-=-=-=- NOTAS INSERIDAS -=-=-=-=-=\n");
    for (int i = 0; i < 5; i++) {
        printf("Nota %d: %.2f\n", i + 1, *(P + i));
    }

    // b) Através de P, vifique quantas positivas e negativas existem na lista.
    int positivas = 0, negativas = 0;
    for (int i = 0; i < 5; i++) {
        if (*(P + i) >= 10 && *(P + i) <= 20) {
            positivas++;
        } else if (*(P + i) >= 0 && *(P + i) <= 9) {
            negativas++;
        }
    }

    printf("\n=-=-=-=-=- NOTAS POSITIVAS E NEGATIVAS -=-=-=-=-=\n");
    printf("Notas positivas: %d\n", positivas);
    printf("Notas negativas: %d\n", negativas); 

    // c) Através de P, diminua 1 valor a todas as notas na lista Ar
    for (int i = 0; i < 5; i++) {
        *(P + i) -= 1;
    }

    printf("\n=-=-=-=-=- NOTAS DECREMENTADAS 1 VALOR -=-=-=-=-=\n");
    for (int i = 0; i < 5; i++) {
        printf("Nota %d: %.2f\n", i + 1, *(P + i));
    }
    return 0;
}

