#include <stdio.h>
#include <time.h>

/*
Resolução de exercicios - Entrada e Saída de dados
Usando a linguagem de programação em C, crie um programa para os seguintes exercicios:

c. Leia seu nome, apelido, telefone, ano de nascimento e escreva na tela. Calcule a sua idade e escreva na tela.
*/
int main(){
    char nome[50], apelido[20], telefone[15];
    int anoNasc, anoAtual, idade;

    time_t segundos;
    struct tm *tempo_atual;
    // Obtém o tempo atual em segundos desde a Epoch
    time(&segundos);
    // Converte os segundos para uma estrutura tm (tempo)
    tempo_atual = localtime(&segundos);
    anoAtual = tempo_atual->tm_year + 1900; // tm_year começa em 1900

    printf("\nEste programa faz a leitura dos seus dados e calcula sua idade!\n");

    printf("\nDigite o primeiro e o segundo nome: ");
    scanf(" %[^\n]", nome);  // Lê até a nova linha

    printf("Digite o seu apelido: ");
    scanf(" %[^\n]", apelido);

    printf("Digite seu telefone: ");
    scanf(" %[^\n]", telefone);

    printf("Digite o seu ano de nascimento: ");
    scanf("%d", &anoNasc);

    idade = anoAtual - anoNasc;

    // Impressão dos dados
    printf("\n--- Informações do Usuário ---\n");
    printf("Nome Completo: %s %s\n", nome, apelido);
    printf("Telefone: %s\n", telefone);
    printf("Voce tem %d anos.\n", idade);

    return 0;
}
