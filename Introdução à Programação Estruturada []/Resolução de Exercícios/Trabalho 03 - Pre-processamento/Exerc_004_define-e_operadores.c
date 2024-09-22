#include <stdio.h>
#define x 7
#define y 5
#define xy x + y

/*4. Digite o código abaixo e descreve o resultado obtido.*/

int main() {
   
    printf("xy %d \n", xy * xy);

    return 0;
}

/*
A linha printf("xy %d \n", xy * xy); é substituída por printf("xy %d \n", 7 + 5 * 7 + 5); 
devido à definição anterior da macro #define xy x + y, que é expandida para 7 + 5.

Ao avaliar a expressão 7 + 5 * 7 + 5, a multiplicação tem precedência sobre a adição, então o cálculo ocorre assim:

Primeiro, 5 * 7 = 35.
Depois, 7 + 35 + 5 = 47.
Por isso, o programa imprime 47.

*/