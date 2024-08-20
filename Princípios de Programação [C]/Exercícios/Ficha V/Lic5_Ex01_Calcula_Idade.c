#include <stdio.h>
#include <stdlib.h>
#include <windows.h>  //fornece acesso a várias funcionalidades do Windows

/*4 – Desenvolva um programa em C, que receba o ano de nascimento de uma pessoa, calcule e imprima: 
a)	A idade da pessoa;
b)	Essa idade convertida em semanas;
*/

int main(){
    int anoNasc, anoAtual, idade, idadeSemanas;

    SYSTEMTIME dataHoraAtual;
	GetSystemTime(&dataHoraAtual);
    anoAtual = dataHoraAtual.wYear;

    printf("Este programa calcula a idade com base na data de nascimento e converte em semanas!\n");

    printf("\nDigite o seu ano de nascimento: ");
    scanf("%d", &anoNasc);

    if (anoNasc <= anoAtual && anoNasc > 0) {
        
        idade = anoAtual - anoNasc;
        idadeSemanas = idade*52;

        printf("\nVoce tem %d anos, que equivale a %d semanas.\n", idade, idadeSemanas);
    } else {
        printf("O ano de nascimento inserido nao eh valido. Por favor, insira um ano de nascimento correto.\n");
    }

    return 0;
}