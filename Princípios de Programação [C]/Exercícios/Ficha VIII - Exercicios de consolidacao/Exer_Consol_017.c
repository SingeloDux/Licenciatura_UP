#include <stdio.h>
#include <stdlib.h>
// #include <Exer_nr16 & Eduardo S. Come>

/* 17.	Desenvolva um programa que peça X números reais entre 1 a 20. 
A quantidade de números é definida pelo utilizador e deve ser entre 1-10, 
e calcular a soma de todos os números digitado e o quadrado de cada números digitados.
*/

int main() {
    int qtdNrs, i;
    float numero, soma = 0;

    printf("Digite a quantidade de numeros (deve ser entre 1 e 10): ");
    scanf("%d", &qtdNrs);

    if (qtdNrs >= 1 && qtdNrs <= 10) {
        for (i = 1; i <= qtdNrs; i++) {
            printf("\nDigite o %do numero (entre 1 e 20): ", i);
            scanf("%f", &numero);

            if (numero >= 1 && numero <= 20) {
                soma += numero;
                printf("O quadrado de %.2f eh %.2f\n", numero, numero * numero);
            } else {
                printf("Numero fora do intervalo valido. Tente novamente.\n");
                i--; // Decrementa i para repetir a leitura do número inválido
            }
        }

        printf("\nA soma de todos os numeros digitados eh: %.2f\n", soma);
    } else {
        printf("Quantidade de numeros invalida. Deve estar entre 1 e 10.\n");
    }

    return 0;
}



