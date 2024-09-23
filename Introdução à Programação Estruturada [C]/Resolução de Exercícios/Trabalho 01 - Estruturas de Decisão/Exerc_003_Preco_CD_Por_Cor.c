#include <stdio.h>
#include <string.h>
/*
Em uma loja de CDs, existem apenas quatro tipos de preços associados a cores. Desenvolva o algoritmo que, a partir da entrada da cor, o software mostre o preço. A loja está atualmente com a seguinte tabela de preços: Verde: 10,00; Azul: 20,00; Amarelo: 30,00; Vermelho: 40,00;
*/
int main() {
    char cor[20];
    float preco;

    printf("Digite a cor do CD (Verde, Azul, Amarelo, Vermelho): ");
    scanf("%s", cor);

    if (strcmp(cor, "Verde") == 0) {
        preco = 10.00;
    } else if (strcmp(cor, "Azul") == 0) {
        preco = 20.00;
    } else if (strcmp(cor, "Amarelo") == 0) {
        preco = 30.00;
    } else if (strcmp(cor, "Vermelho") == 0) {
        preco = 40.00;
    } else {
        printf("Cor inválida! Por favor, digite uma cor válida.\n");
        return 1;
    }

    printf("O preço do CD da cor %s é: %.2fMT\n", cor, preco);

    return 0;
}
