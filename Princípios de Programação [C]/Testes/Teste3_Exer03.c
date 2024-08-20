#include <stdlib.h>
#include <stdio.h>

/* Desenvolva um programa na linguagem que receba dois numeros inteiros digitados pelo utilizador.
Garanta que o segundo numero seja mairo que o primeiro, obrigando o utilizador a digitar, usando o
comado Dowhile. Após isso, imprima em ordem decrescente todos os numeros do intervalo dos
numeros digitados utilizando o comando FOR, e some todos os numeros do intervelo entre ambos,
incluindo-os.
*/
int main() {
    int num1, num2, soma = 0;

    // Solicita os dois numeros garantindo que o segundo seja maior que o primeiro
    do {
        printf("Digite o primeiro numero: ");
        scanf("%d", &num1);
        
        printf("Digite o segundo numero (deve ser maior que o primeiro): ");
        scanf("%d", &num2);

        if (num2 <= num1) {
            printf("Erro: O segundo numero deve ser maior que o primeiro. Tente novamente.\n");
        }
    } while (num2 <= num1);

    // Imprime os numeros em ordem decrescente e calcula a soma
    printf("numeros em ordem decrescente entre %d e %d:\n", num2, num1);
    for (int i = num2; i >= num1; i--) {
        printf("%d ", i);
        soma += i;
    }
    printf("\n");

    // Imprime a soma dos numeros
    printf("A soma de todos os numeros no intervalo [%d, %d] eh: %d\n", num1, num2, soma);

    return 0;
}