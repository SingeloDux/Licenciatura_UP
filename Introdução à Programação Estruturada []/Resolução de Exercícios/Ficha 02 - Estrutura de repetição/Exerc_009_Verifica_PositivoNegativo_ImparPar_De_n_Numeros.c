#include <stdio.h>

/*9 - Escreva um programa que leia vários números inteiros ate que seja informado o numero 0. Se o número lido for positivo, escreva uma mensagem indicando se ele é par ou ímpar. Se o número for negativo, escreva a seguinte mensagem “Este número não é positivo”. (use a função mod deve ser "x mod y" e retorna o resto da divisão de x por y).
*/
int main() {
    int numero;

    printf("Digite vários números inteiros (digite 0 para sair):\n");

    while (1) { 
        scanf("%d", &numero); 

        if (numero == 0) { 
            break;
        }

        if (numero > 0) { 
            if (numero % 2 == 0) { // Par?
                printf("O número %d é positivo e par.\n", numero);
            } else { // Impar
                printf("O número %d é positivo e ímpar.\n", numero);
            }
        } else { // Negativo
            printf("Este número não é positivo.\n");
        }
    }

    return 0;
}