#include <stdio.h>
/*Fazer um programa que calcule a média aritmética de n números digitados pelo teclado. Até que o usuário informe o valor zero.
*/
int main() {
    float numero, soma = 0.0;
    int cont = 0;

    printf("Digite os números (digite 0 para sair):\n");

    while (1) {
        scanf("%f", &numero);

        if (numero == 0) { 
            break;
        }

        soma += numero;
        cont++;
    }

    if (cont > 0) { 
        float media = soma / cont;
        printf("A média aritmética dos números digitados é: %.2f\n", media);
    } else {
        printf("Nenhum número foi digitado.\n");
    }

    return 0;
}