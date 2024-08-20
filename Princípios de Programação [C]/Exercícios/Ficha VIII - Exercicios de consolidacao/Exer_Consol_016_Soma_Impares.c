#include <stdio.h>
#include <stdlib.h>
// #include <Exer_nr16 & Eduardo S. Come>

/* 16 -	Faca um programa que some os números ímpares contidos em um intervalo definido pelo
usuário. O usuário define o valor inicial do intervalo e o valor final deste intervalo e o programa
deve somar todos os números ímpares contidos neste intervalo.
*/

int main() {
    int i, inicio, fim, soma = 0;

    printf("Digite o valor inicial do intervalo: ");
    scanf("%d", &inicio);

    printf("Digite o valor final do intervalo: ");
    scanf("%d", &fim);

    if (inicio <= fim) {
        for (i = inicio; i <= fim; i++) {

            if (i % 2 != 0) {
                soma += i;
            }
        }

        printf("A soma dos numeros impares no intervalo [%d, %d] eh: %d\n", inicio, fim, soma);
    } else {
        printf("Erro: O valor inicial deve ser menor ou igual ao valor final.\n");
    }

    return 0;
}




