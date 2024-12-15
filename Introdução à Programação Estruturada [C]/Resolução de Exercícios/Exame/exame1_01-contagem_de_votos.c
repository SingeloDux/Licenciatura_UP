#include <stdio.h>
#include <string.h>
int opcao;

void candidatos()
{
        printf("\n=-=-=-LISTA DE CANDIDATOS PARA VOTACAO! =-=-=-");
        printf("\n1 - Jorge Cossa");
        printf("\n2 - Joao Matos");
        printf("\n3 - Maria Rungo");
        printf("\n4 - Estevao Bila");
        printf("\n5 - Voto Nulo");
        printf("\n6 - Voto Branco");
        printf("\n0 - Sair");
        printf("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        printf("\nDigite o codigo do candidato para votar: ");
        scanf("%d", &opcao);
}

int main()
{
        int jorge = 0, joao = 0, maria = 0, estevao = 0, nulo = 0, branco = 0;
        float percNulo = 0, percBranco = 0;

        candidatos();

        do
        {
                switch (opcao)
                {
                case 1:
                        jorge += 1;
                        printf("Voto lancado para Jorge Cossa!\n\n");
                        candidatos();
                        break;
                case 2:
                        joao += 1;
                        printf("Voto lancado para Joao Matos!\n\n");
                        candidatos();
                        break;
                case 3:
                        maria = maria + 1;
                        printf("\033[32mVoto lancado para Maria Rungo!\033[m\n\n");
                        candidatos();
                        break;
                case 4:
                        estevao = estevao + 1;
                        printf("Voto lancado para Estevao Bila!\n\n");
                        candidatos();
                        break;
                case 5:
                        nulo = nulo + 1;
                        printf("Voto nulo lancado!\n\n");
                        candidatos();
                        break;
                case 6:
                        branco = branco + 1;
                        printf("Voto branco lancado!\n\n");
                        candidatos();
                        break;
                case 0:
                        printf("Exibindo os totais de votos!...\n\n");
                        break;
                default:
                        printf("Opção inválida! Tente novamente.\n\n");
                        candidatos();
                        break;
                }
        } while (opcao != 0);

        printf("\n===== CONTAGEM DE VOTOS ========\n");
        printf("\nJorge Cossa: %d votos", jorge);
        printf("\nJoao Matos: %d votos", joao);
        printf("\nMaria Rungo: %d votos", maria);
        printf("\nEstevao Bila: %d votos", estevao);
        printf("\nVotos Nulos: %d  || Votos Brancos: %d", nulo, branco);

        float total = jorge + joao + maria + estevao + nulo + branco;
        percBranco = (branco * 100) / total;
        percNulo = (nulo * 100) / total;

        printf("\nO total de votos nulos sobre o total de votos e de: %.2f%%", percNulo);
        printf("\nO total de votos em branco sobre o total de votos e de: %.2f%%", percBranco);

        return 0;
}
