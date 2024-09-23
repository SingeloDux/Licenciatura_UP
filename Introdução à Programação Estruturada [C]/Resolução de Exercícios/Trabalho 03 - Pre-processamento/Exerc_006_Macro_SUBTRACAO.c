#include <stdio.h>
#define TAMANHO 10;
#define SUB TAMANHO - 2;

/*6. Execute o código apresentado na imagem abaixo e justifique o resultado obtido.*/

int main(){
    int tamanho;
    tamanho = SUB;

    printf ("Size is %d\n", tamanho);    
    return 0;
}

/*
O resultado obtido é "Size is 10" devido à presença indevida de ponto e vírgula na definição da macro. Em definições de macro, o ponto e vírgula não deve ser utilizado, pois ele é diretamente substituído no código, o que gera problemas de sintaxe.

Por exemplo, a linha tamanho = SUB; foi substituída por tamanho = 10; - 2;, o que levou a um erro de interpretação. No entanto, no meu caso, o compilador ignorou a parte - 2 após o ponto e vírgula, resultando apenas no valor 10 sendo atribuído à variável tamanho.
*/