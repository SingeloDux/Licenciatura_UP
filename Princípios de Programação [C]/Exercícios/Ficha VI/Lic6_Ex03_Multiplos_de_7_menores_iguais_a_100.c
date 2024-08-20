#include <stdlib.h>
#include <stdio.h>

/*
3 - Faça  um  programa  que  mostre  todos  os  múltiplos  positivos  do  número  7  
menores  ou iguais a 100, isto é, de 0 a 100 somente.(O comando a sua escolha)
*/

int main(){
int multiplo;

    printf("Estes sao os multiplos positivos do 7 no intervalo de 0 a 100 \n");

    for (multiplo =0 ; multiplo<=100; multiplo += 7){

    printf("%d, ", multiplo);

    }
}