#include <stdio.h>
/*
6 - Desenvolver um programa que efectue a soma de todos os números ímpares e que se encontram no conjunto dos números de 1 até 500.

*/
int main() {
    int i, soma = 0;

    for (i = 1; i <= 500; i += 2) { // Incrementa i de 2 em 2 para pular os números pares
        soma += i;
    }

    printf("A soma de todos os números ímpares entre 1 e 500 é: %d\n", soma);

    return 0;
}