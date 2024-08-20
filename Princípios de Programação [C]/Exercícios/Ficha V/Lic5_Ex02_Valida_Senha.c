#include <stdio.h>
#include <stdlib.h>
/*Escreva  um  programana  linguagem  C que  verifique  a  validade  de  uma  senha  fornecida  pelo usuário. 
A senha válida é o número 1234. Se a senha for idêntica o programa deve informar a mensagem ACESSO PERMITIDO, caso não ACESSO NEGADO*/

int main() {
    int senha;

    printf("Digite a senha para acessar o sistema: ");
    scanf("%d", &senha);

    if (senha == 1234) {
        printf("ACESSO PERMITIDO\n");
    } else {
        printf("ACESSO NEGADO\n");
    }

    return 0;
}