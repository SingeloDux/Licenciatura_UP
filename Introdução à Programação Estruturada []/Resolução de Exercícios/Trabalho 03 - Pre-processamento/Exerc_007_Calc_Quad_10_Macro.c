#include <stdio.h>
#define QUADRADO(n) ((n) * (n)) // Definindo a macro para calcular o quadrado

/*7. Usando macro e estrutura de repetição cria um programa para obter o quadrado de 10 números.*/

int main() {
    int num;

    for(int i = 1; i <= 10; i++) {
        printf("Digite o %do número: ", i);
        scanf("%d", &num);
        printf("O quadrado de %d é: %d\n", num, QUADRADO(num));
    }

    return 0;
}