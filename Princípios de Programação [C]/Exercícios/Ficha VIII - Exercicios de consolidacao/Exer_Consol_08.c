#include <stdlib.h>
#include <stdio.h>
#include <math.h>
// #include <Exer_nr07 & Eduardo S. Come>
/*
8 - A empresa Sójogos pretende atribuir os prémios aos seus ganhadores de um concurso. 
Sendo que o valor da quantia total é definida pelo Director Geral. Os valores serão distribuídos da
seguinte maneira:
− O primeiro ganhador recebera 46%;
− O segundo recebera 32%;
− O terceiro recebera o restante;
*/

int main() {
    float primeiro, segundo, terceiro, total;

    printf("\nInforme a quantia total para a premiacao dos vencedores do concurso: ");
    scanf("%f", &total);

    primeiro = total * 0.46;
    segundo = total * 0.32;
    terceiro = total - (primeiro+segundo);

    printf("\nO primeiro lugar recebera 46%% que corresponde a %.2fMT\n", primeiro);
    printf("\nO primeiro lugar recebera 32%% que corresponde a %.2fMT\n", segundo);
    printf("\nO primeiro lugar recebera 22%% que corresponde a %.2fMT\n", terceiro);

    return 0;
}