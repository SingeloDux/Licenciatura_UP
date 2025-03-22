/**
CASO DE ESTUDO C
2 – Considere o seguinte cenário: As variáveis float A = 56 e float B = 4; 
Foram criados os ponteiros K apontando para B e Z apontando para A.

Leitura complementar: 
    - https://www.tutorialspoint.com/cprogramming/c_pointers.htm
    - Let us C (Pag 178 a Página 185
**/
#include <stdio.h>

int main() {
    float A = 56, B = 4;
    float *Z = &A;
    float *K = &B;

    printf("\n=-=-=- VALORES INICIAIS -=-=-\n");
    printf("O valor de A é: %.2f\n", A);
    printf("O valor de B é: %.2f\n", B);

    printf("\n=-=-= EXIBICAO DE ENDEREÇOS DAS VARIÁVEIS -=-=-\n");
    //a) Visualize os endereços de A, B, Z e K.
    printf("Endereço de A: %p\n", &A);
    printf("Endereço de B: %p\n", &B);
    printf("Endereço de Z: %p\n", &Z);
    printf("Endereço de K: %p\n", &K); 

    printf("\n=-=-=- VALORES APOS MANIPULACAO DE PONTEIROS -=-=-\n");
    /** b) O que irá acontecer se fizermos: * Z = *Z / *K;
    R: O valor de A e do ponteiro Z será 14.00, 
    pois o valor de A foi dividido pelo valor de B.
    **/

    *Z = *Z / *K;
    printf("O valor de A é: %.2f\n", A);
    printf("O valor de Z é: %.2f\n", *Z);

    printf("\n=-=-=- COMPARACAO DE VALORES -=-=-\n");
    // c) Através dos ponteiros, verifique qual é o maior entre A e B.
    if (*Z > *K) {
        printf("A é maior que B\n");
    } else {
        printf("B é maior que A\n");
    }

    return 0;
}