#include <stdio.h>
#include <stdlib.h>
#define PI 3.14
/* 2 – Seguindo o primeiro exemplo, desenvolva um programa C que calcule o perímetro da circunferência.*/

int main (){
    float perimetro, r;
    
    printf("Este programa calcula o perimetro da circunferencia. Digite o valor do raio: \n");
    scanf("%f", &r);

    if (r > 0) {
        perimetro = 2 * PI * r;
        printf("O perimetro da circunferencia de raio %.2fcm eh de %.2fcm\n", r, perimetro);
    } else {
        printf("O raio inserido nao eh valido. Por favor, insira um valor positivo.\n");
    }

    return 0;
}
