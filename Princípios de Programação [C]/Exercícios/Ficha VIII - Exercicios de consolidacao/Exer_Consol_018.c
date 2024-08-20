#include <stdio.h>
#include <stdlib.h>
// #include <Exer_nr18 & Eduardo S. Come>

/* 18. Ler um conjunto de números reais, armazenando-o em vector e calcular o quadrado das
componentes deste vector, armazenando o resultado em outro vector. O conjunto tem 10
elementos cada. Imprimir todos os conjuntos.
*/

int main() {
    float numeros[10];
    float quadrados[10];
    int i;

    for (i = 0; i < 10; i++) {
        printf("Digite o %do numero real: ", i + 1);
        scanf("%f", &numeros[i]);

        quadrados[i] = numeros[i] * numeros[i];
    }

    printf("\nConjunto original:\n");
    for (i = 0; i < 10; i++) {
        printf("%.2f, ", numeros[i]);
    }

    printf("\n\nConjunto dos quadrados:\n");
    for (i = 0; i < 10; i++) {
        printf("%.2f, ", quadrados[i]);
    }

    printf("\n");

    return 0;
}


