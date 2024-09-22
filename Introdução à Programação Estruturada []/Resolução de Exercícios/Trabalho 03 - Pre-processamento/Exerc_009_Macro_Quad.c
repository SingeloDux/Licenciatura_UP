#include <stdio.h>
#define quadrado(x) x*x

/*9. Qual será o resultado da exucção do código abaixo*/

int main() {
    int x;

    x = 36/quadrado(6);
    printf("E %d", x);

    return 0;
}

/*
Uma vez que quadrado(x) x*x, a linha x = 36 / quadrado(6); é expandida para x = 36 / 6 * 6; após a substituição.
Primeiro, 36 / 6 é calculado, resultando em 6.
Depois, 6 * 6 resulta em 36.
*/