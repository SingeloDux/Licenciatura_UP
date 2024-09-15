#include <stdio.h>
/*
#include <iostream>
using namespace std;

1 - Execute e compile os exemplos apresentados nesta apostila.

Neste exemplo o programa exibe uma mensagem sempre que o valor da variável i for diferente de 1. E quando o utilizador digitar 1 o programa termina a execução.
*/

int main(){
    int i=0;
    while(i!=1){
        printf("Digite o valor de i: ");
        scanf("%i",&i);
    }
    printf("Fora do loop");
    return 0;
}