#include <stdio.h>
/*5 - Tem se um conjunto de dados contendo a altura e o sexo (M ou F) de 15 pessoas. Faça um Programa que calcule e escreva: a média de altura das mulheres; o número de homens.
*/
int main() {
    float altura, somaAlturaMulheres = 0.0;
    char sexo;
    int i, contMulheres = 0, contHomens = 0, totalPessoas = 15;

    for (i = 0; i < totalPessoas; i++) {
        printf("Digite a altura da pessoa %d: ", i + 1);
        scanf("%f", &altura);
        
        printf("Digite o sexo da pessoa %d (M/F): ", i + 1);
        scanf(" %c", &sexo);

        if (sexo == 'F' || sexo == 'f') {
            somaAlturaMulheres += altura; 
            contMulheres++;
        } else if (sexo == 'M' || sexo == 'm') {
            contHomens++;
        } else {
            printf("Sexo inválido! Por favor, digite M ou F.\n");
            i--;
        }
    }

    float mediaAlturaMulheres = 0.0;
    if (contMulheres > 0) {
        mediaAlturaMulheres = somaAlturaMulheres / contMulheres;
        printf("A média de altura das mulheres é: %.2f\n", mediaAlturaMulheres);
    } else {
        printf("Não foram informadas mulheres.\n");
    }

    printf("Número de homens: %d\n", contHomens);

    return 0;
}