/**
CASO DE ESTUDO C
1 – Crie uma variável K e um ponteiro P apontando para K. 
Através de P, faça o decremento do valor de K e visualize o novo valor usando P.

Leitura complementar: 
    - https://www.tutorialspoint.com/cprogramming/c_pointers.htm
    - Let us C (Pag 178 a Página 185
**/
#include <stdio.h>

int main() {
    int k = 10;
    int *p = &k;

    printf("Valor de K: %d\n", k);
    (*p)--;
    printf("Valor de K após decremento: %d\n", k);

    return 0;
}