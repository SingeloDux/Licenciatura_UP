#include <stdio.h>
/*
6 - Leia o salario de um funcionário. Calcule e imprima o valor do novo salario, sabendo que ele
recebeu um aumento de 25%.
*/
int main() {
    float salarioAtual, novoSalario, aumento;

    printf("Digite o salario actual do funcionario: ");
    scanf("%f", &salarioAtual);

    novoSalario = salarioAtual + (salarioAtual * 0.25);
    aumento = salarioAtual * 0.25;

    printf("\nO funcionario recebeu um aumento de %.2fmt", aumento);
    printf("\nO novo salario do funcionario com aumento de 25%% eh: %.2fmt\n", novoSalario);

    return 0;
}
