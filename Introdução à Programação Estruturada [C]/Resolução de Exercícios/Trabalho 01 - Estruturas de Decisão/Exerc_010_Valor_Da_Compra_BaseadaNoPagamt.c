#include <stdio.h>
/*
Desenvolva um programa que leia o valor de uma determinada compra e o código da forma de pagamento. 
Com base neste código, o programa deverá calcular e imprimir o valor a pagar, a forma de pagamento 
e o valor de cada parcela, se for o caso: À vista, com 8% de desconto; À vista no cartão, 4% de desconto; 
Em 2x, preço normal sem juros; Em 4x, preço acrescido de 8%; Qualquer outro código: Opção inválida.
*/

int main() {
    float valorCompra, valorAPagar, valorParcela;
    int codigo;

    printf("Digite o valor da compra: ");
    scanf("%f", &valorCompra);

    printf("Digite o código da forma de pagamento:\n");
    printf("1 - À vista (8%% de desconto)\n");
    printf("2 - À vista no cartão (4%% de desconto)\n");
    printf("3 - Em 2x (sem juros)\n");
    printf("4 - Em 4x (8%% de juros)\n");
    printf("Código: ");
    scanf("%d", &codigo);

    switch (codigo) {
        case 1: 
            valorAPagar = valorCompra * 0.92; // 100% - 8% = 92%
            printf("Forma de pagamento: À vista (8%% de desconto)\n");
            break;
        case 2: 
            valorAPagar = valorCompra * 0.96; // 100% - 4% = 96%
            printf("Forma de pagamento: À vista no cartão (4%% de desconto)\n");
            break;
        case 3: 
            valorAPagar = valorCompra; 
            valorParcela = valorAPagar / 2; // Dividido em 2 parcelas
            printf("Forma de pagamento: Em 2x (sem juros)\n");
            printf("Valor de cada parcela: %.2f\n", valorParcela);
            break;
        case 4: 
            valorAPagar = valorCompra * 1.08; // 100% + 8% = 108%
            valorParcela = valorAPagar / 4; // Dividido em 4 parcelas
            printf("Forma de pagamento: Em 4x (8%% de juros)\n");
            printf("Valor de cada parcela: %.2f\n", valorParcela);
            break;
        default: 
            printf("Opção inválida!\n");
            return 1; 
    }

    if (codigo >= 1 && codigo <= 4) {
        printf("O valor a pagar e: %.2f\n", valorAPagar);
    }

    return 0;
}