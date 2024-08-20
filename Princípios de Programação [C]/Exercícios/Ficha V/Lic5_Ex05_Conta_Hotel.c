#include <stdio.h>
#include <stdlib.h>
/* Faça um programa para calcular a conta final de um hóspede de um hotel, considerando que:
a) Serão lidos o nome do hóspede, o tipo do apartamento utilizado (A, B, ou C o número de diárias utilizadas pelo hóspede; 
b) O valor da diária em MT é determinado pela seguinte tabela:A= 3.000, B= 1700 e C 800;c) 
O valor total das diárias é calculado pela multiplicação do número de diária utilizadas pelo valor da diária; 
d) O subtotal é calculado pela soma do valor total das diárias e o valor do consumo interno;
e) Toda factura é cobrada o valor da taxa de serviço equivale a 10% do subtotal; 
f) O total geral resulta da soma do subtotal com a taxa de serviço;
g)  Como saída,  escreva  a  conta  final  contendo:  o  nome  do  hóspede,  o tipo  do  apartamento, 
o número  de  diárias  utilizadas,  o  valor  unitário  da  diária,  o  valor total  das  diárias,  
o  subtotal, o valor da taxa de serviço e o total geral. */

int main() {
    char nome[12];
    char tipoApartamento;
    int numDiarias;
    float valorDiaria, valorTotalDiarias, consumo, subtotal, taxaServico, totalGeral;

    printf("Para calcular a conta final do hospede, por favor digite o seu nome: ");
    scanf("%s", &nome);

    printf("Digite o tipo do apartamento utilizado (A, B ou C): ");
    scanf(" %c", &tipoApartamento);

    printf("Digite o numero de diarias utilizadas: ");
    scanf("%d", &numDiarias);

    switch (tipoApartamento) {
        case 'A':
            valorDiaria = 3000;
            break;
        case 'B':
            valorDiaria = 1700;
            break;
        case 'C':
            valorDiaria = 800;
            break;
        default:
            printf("Tipo de apartamento inválido!\n");
            return 1;
    }

    valorTotalDiarias = numDiarias * valorDiaria;

    printf("Digite o valor do consumo interno: ");
    scanf("%f", &consumo);

    subtotal = valorTotalDiarias + consumo;
    taxaServico = subtotal * 0.1;
    totalGeral = subtotal + taxaServico;

    printf("\nConta final do hospede %s\n", nome);
    printf("Tipo do apartamento: %c\n", tipoApartamento);
    printf("Numero de diarias utilizadas: %d\n", numDiarias);
    printf("Valor unitario da diaria: %.2f\n", valorDiaria);
    printf("Valor total das diarias: %.2f\n", valorTotalDiarias);
    printf("Subtotal: %.2f\n", subtotal);
    printf("Valor da taxa de servico: %.2f\n", taxaServico);
    printf("Total geral: %.2f\n", totalGeral);

    return 0;
}