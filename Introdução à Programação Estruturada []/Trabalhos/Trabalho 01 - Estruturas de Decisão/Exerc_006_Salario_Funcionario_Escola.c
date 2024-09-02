#include <stdio.h>
/*
Determine o salário bruto e líquido de cada funcionário de uma escola, tendo em conta que 
os engenheiros recebem 10.900 Mt/h, 
doutores 15.400 Mt/h e 
técnicos 5.000 Mt/h.*/
int main() {
    int tipoFuncionario;
    float horasTrabalhadas, salarioBruto, salarioLiquido;
    const float desconto = 0.03;

    printf("Selecione o tipo de funcionário:\n");
    printf("1 - Engenheiro\n");
    printf("2 - Doutor\n");
    printf("3 - Técnico\n");
    printf("Digite o tipo de funcionário (1, 2 ou 3): ");
    scanf("%d", &tipoFuncionario);

    printf("Digite o número de horas trabalhadas no mês: ");
    scanf("%f", &horasTrabalhadas);

    switch (tipoFuncionario) {
        case 1: // Engenheiro
            salarioBruto = horasTrabalhadas * 10900;
            break;
        case 2: // Doutor
            salarioBruto = horasTrabalhadas * 15400;
            break;
        case 3: // Técnico
            salarioBruto = horasTrabalhadas * 5000;
            break;
        default:
            printf("Tipo de funcionário inválido!\n");
            return 1;
    }

    salarioLiquido = salarioBruto * (1 - desconto);

    printf("Salário Bruto: %.2f Mt\n", salarioBruto);
    printf("Salário Líquido: %.2f Mt\n", salarioLiquido);

    return 0;
}