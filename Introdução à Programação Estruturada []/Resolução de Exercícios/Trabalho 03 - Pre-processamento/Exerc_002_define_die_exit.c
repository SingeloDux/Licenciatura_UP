#include <stdio.h>
#include <stdlib.h>
#define y 10
#define DIE \
fprintf(stderr, "Erro fatal :Abortar \n"); exit(0);

/*2. Descreve o significado do seguinte código:

O código começa com a definição de uma macro y com o valor 10, o que faz com que todas as ocorrências de y sejam substituídas por 10 durante o pré-processamento, antes da compilação. Além disso, a macro DIE é criada para imprimir "Erro fatal: Abortar" no fluxo de erro padrão (stderr) e finalizar o programa imediatamente.

Dentro da função main, uma variável valor é declarada, e logo após é definida uma constante x com o valor 12. O primeiro printf exibirá os valores de y (10) e x (12). A variável valor é então inicializada com 1.

Na estrutura condicional if (valor < 0), é verificado se valor é menor que zero. Como valor é 1, a condição não é satisfeita, e o programa não executa a macro DIE. Assim, o fluxo continua normalmente e a mensagem "N terminou a execução" é impressa.

*/

int main() {
   int valor;
   const int x = 12;

   printf("O valor de y e: %d e de x e: %d", y,x);
    valor = 1;
    if (valor<0)
    DIE;

    printf("N terminou a execucao \n");

    return (0);
}