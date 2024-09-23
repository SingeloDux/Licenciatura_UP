#include <stdio.h>

/* 1. Qual é a diferença entre const MAX = 100; e #define MAX 100.

    A declaração const MAX = 100; define MAX como uma constante cujo valor não pode ser alterado durante a execução do programa, e ela segue as regras de escopo e tipo (int, float, etc).
    Por outro lado, #define é uma diretiva de pré-processador que simplesmente faz uma substituição textual de MAX pelo valor 100 antes de compilar o código. Nesse caso, não há verificação de tipo, pois o #define é apenas uma macro, sem escopo ou tipo. */

const int MAX_CONST = 100; // Definindo uma constante usando const
#define MAX_DEFINE 100 // Definindo uma constante usando #define

int main() {

    // Tentando alterar o valor de MAX_CONST (vai gerar erro de compilação se descomentado)
    // MAX_CONST = 200; // Isso não é permitido
    printf("Constante definida com const: %d\n", MAX_CONST);
    
  
    // MAX_DEFINE é uma macro e não pode ser alterada diretamente
    // MAX_DEFINE = 200; // Isso também não é permitido, mas geraria erro diferente
    printf("Constante definida com #define: %d\n", MAX_DEFINE);

    return 0;
}
