#include <stdio.h>
#include <math.h>
/* Desenvolva um programa para ler o número total de eleitores de um município, o número de votos
brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao
total de eleitores incluindo as abstenções.
NOTA: Esses cálculos devem ser efectuados se a soma dos votos brancos, nulos e válidos não
forem superiores ao número total de eleitores do município. */

int main() {
    float totalEleitores, vBrancos, vNulos, vValidos, abstencoes;

    printf("Digite o numero total de eleitores do municipio: ");
    scanf("%f", &totalEleitores);
    
    printf("\nDigite o numero total de votos brancos: ");
    scanf("%f", &vBrancos);

    printf("\nDigite o numero total de votos nulos: ");
    scanf("%f", &vNulos);

    printf("\nDigite o numero total de votos validos: ");
    scanf("%f", &vValidos);

    if(vBrancos + vNulos + vValidos > totalEleitores){
    
        printf("A soma dos votos brancos, nulos e validos eh superior ao total de eleitores do municipio. O programa sera encerrado.");    
    }else{
        
        abstencoes = totalEleitores - (vBrancos + vNulos + vValidos);
        
        abstencoes = (abstencoes / totalEleitores) * 100;
        vBrancos=(vBrancos/totalEleitores)*100;
        vNulos=(vNulos/totalEleitores)*100;
        vValidos=(vValidos/totalEleitores)*100;

    printf("\nOs votos brancos representam um percentual de %.2f%% em relacao ao total de eleitores do municipio.", vBrancos);
    printf("\nOs votos nulos representam um percentual de %.2f%% em relacao ao total de eleitores do municipio.", vNulos);
    printf("\nOs votos validos representam um percentual de %.2f%% em relacao ao total de eleitores do municipio.", vValidos);
    printf("\nO percentual de abstencoes eh de %.2f%% em relacao ao total de eleitores do municipio.", abstencoes);

    }

    return 0;
}