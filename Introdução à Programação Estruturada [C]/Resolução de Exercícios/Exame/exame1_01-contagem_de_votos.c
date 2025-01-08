/*
Em uma eleicao presidencial, existem 4 candidatos. Os votos sao informados atraves de um codigo. Os codigos utilizados sao: 1, 2, 3, 4 votos para os respetivos candidatos; 5 voto nulo e 6 voto branco. Escreva um programa que calcule e imprima: 
a) Total de votos para cada candidato e 
b) Total de votos nulos
c) Total de votos em branco
d) Percentagem de votos nulos sobre o total de votos;
e) Percentagem de votos em branco sobre o total de votos;
Para finalizar o conjunto de votos, tem-se o valor zero(0);
*/

#include <stdio.h>
#include <string.h>
int opcao;

void candidatos()
{
        printf("\n\033[1m=-= LISTA DE CANDIDATOS PARA VOTACAO! =-=\033[m");
        printf("\n1 - Jorge Cossa");
        printf("\n2 - Joao Matos");
        printf("\n3 - Maria Rungo");
        printf("\n4 - Estevao Bila");
        printf("\n5 - Voto Nulo");
        printf("\n6 - Voto Branco");
        printf("\n0 - Sair");
        printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        printf("\nDigite o codigo do candidato para votar: ");
        scanf("%d", &opcao);
}

int main()
{
        int votos[6] = {0}, total = 0;
        float percNulo = 0, percBranco = 0;

        do
        {
                candidatos();
                
                /*
                switch (opcao)
                {
                case 1: case 2: case 3: case 4: case 5: case 6:
                        votos[opcao - 1]++;
                        printf("\033[32mVoto lançado para o candidato %d!\033[m\n\n", opcao);
                        break;
                case 0:
                        printf("Exibindo os totais de votos!...\n\n");
                        break;
                default:
                        printf("Opção inválida! Tente novamente.\n\n");
                        break;
                }
                */
                if (opcao >= 1 && opcao <= 6) {
                        votos[opcao - 1]++;
                        printf("\033[32mVoto para o candidato %d registrado com sucesso!\033[m\n\n", opcao);
                } else if (opcao != 0) {
                        printf("\033[31mOpção inválida! Tente novamente.\033[m\n\n");
                }
        } while (opcao != 0);

        printf("\n===== CONTAGEM DE VOTOS ========\n");
        printf("Jorge Cossa: %d\n", votos[0]);
        printf("Joao Matos: %d\n", votos[1]);
        printf("Maria Rungo: %d\n", votos[2]);
        printf("Estevao Bila: %d\n", votos[3]);
        printf("Votos Nulos: %d\n", votos[4]);
        printf("Votos Brancos: %d\n", votos[5]);

        total = votos[0] + votos[1] + votos[2] + votos[3] + votos[4] + votos[5];

        if (total > 0) {
                percNulo = (votos[4] * 100.0) / total;
                percBranco = (votos[5] * 100.0) / total;

                printf("\nPercentagem de votos nulos  : %.2f%%\n", percNulo);
                printf("Percentagem de votos em branco: %.2f%%\n", percBranco);
        } else {
                printf("\nNenhum voto registrado.\n");
        }
        return 0;
}