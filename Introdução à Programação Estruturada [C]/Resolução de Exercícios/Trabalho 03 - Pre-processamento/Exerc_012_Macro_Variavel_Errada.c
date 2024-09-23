#include<stdio.h>
#define f(g,g2) g##g2

/* 12. **Qual é o resultado da execução do seguinte código 

Macro f(g, g2): 
A macro usa o operador ##, que concatena os dois argumentos. 
No entanto, no código atual, a macro não é utilizada.
A variável var12 é definida e inicializada com o valor 100.
O  printf("%d", var,12);
O código tenta usar var que não está declarado, por isso apresentará um erro de compilação porque var e 12 não estão concatenados corretamente. 

*/
int main(){
    int var12 = 100;
    
    printf("%d", var,12);
    return 0;
}
