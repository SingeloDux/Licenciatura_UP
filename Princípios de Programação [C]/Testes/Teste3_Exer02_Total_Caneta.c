#include <stdlib.h>
#include <stdio.h>
// #include <Exer_nr24 & Eduardo S. Come>

/* 24.	Usando a estrutura de decisão IF e repeticao Dowhile para validação de dados, desenvolva um
programa simples que calcula o total a pagar por uma compra de canetas inclindo o IVA (16%).
Considere que cada caneta custa (MT) 7.5 e o numero de canetas a comprar são informadas pelo
utilizador. O programa deverá solicitar apenas a quantidade cenetas a comprar e, calcular o valor do
imposto e o valor total a pagar com o imposto. Os imposto são calculados de acordo com o valor total
a pagar, confome a tabela seguir:
*/
int main() {
    int quantidade;
    float preco_por_caneta = 7.5;
    float valor_total, valor_imposto, total_com_imposto;
    float taxa_imposto;

    // Solicita a quantidade de canetas até que um valor válido seja informado
    do {
        printf("Informe a quantidade de canetas a comprar: ");
        scanf("%d", &quantidade);

        if (quantidade <= 0) {
            printf("Quantidade inválida. Por favor, insira um número maior que 0.\n");
        }
    } while (quantidade <= 0);

    // Calcula o valor total sem imposto
    valor_total = quantidade * preco_por_caneta;

    // Determina a taxa de imposto com base na quantidade de canetas
    if (quantidade <= 200) {
        taxa_imposto = 0.0;
    } else if (quantidade <= 1000) {
        taxa_imposto = 0.10;
    } else {
        taxa_imposto = 0.16;
    }

    // Calcula o valor do imposto
    valor_imposto = valor_total * taxa_imposto;

    // Calcula o valor total a pagar incluindo o imposto
    total_com_imposto = valor_total + valor_imposto;

    // Exibe os resultados
    printf("Valor total sem imposto: %.2f MT\n", valor_total);
    printf("Valor do imposto: %.2f MT\n", valor_imposto);
    printf("Valor total a pagar com imposto: %.2f MT\n", total_com_imposto);

    return 0;
}
