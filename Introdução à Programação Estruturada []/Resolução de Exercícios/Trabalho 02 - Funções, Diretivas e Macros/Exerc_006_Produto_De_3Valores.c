#include <stdio.h>
/*
6. Programa que recebe três valores via teclado e calcula o produto desses números.
*/
int main() {
    int i, num[3], produto;

    for(i=0; i<3;i++){
    printf("Digite três números: ");
    scanf("%d", &num[i]);
    }

    produto = num[0] *  num[1] *  num[2];

    printf("O produto é: %d\n", produto);

    return 0;
}

