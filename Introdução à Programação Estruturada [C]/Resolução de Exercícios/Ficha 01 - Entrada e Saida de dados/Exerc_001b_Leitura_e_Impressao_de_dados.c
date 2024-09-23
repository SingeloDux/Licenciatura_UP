#include <stdio.h>
/*
Resolução de exercicios - Entrada e Saída de dados
Usando a linguagem de programação em C, crie um programa para os seguintes exercicios:

b. Programa que lê o seu nome completo, morada, telefone e exibe na tela do monitor;
*/
int main(){
    char nome[50], morada[50], telefone[15];

    printf("\nEste programa faz a leitura e impressao dos seus dados!\n");

    printf("\nDigite o seu nome completo: ");
    scanf(" %[^\n]", nome);  // Lê até a nova linha

    printf("Digite sua morada: ");
    scanf(" %[^\n]", morada);

    printf("Digite seu telefone: ");
    scanf(" %[^\n]", telefone);

    // Impressão dos dados
    printf("\n--- Informações do Usuário ---\n");
    printf("Nome Completo: %s\n", nome);
    printf("Morada: %s\n", morada);
    printf("Telefone: %s\n", telefone);

    return 0;
}
