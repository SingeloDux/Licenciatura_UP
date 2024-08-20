#include <stdio.h>
#include <stdlib.h>
#define PI 3.14
/* 2 – Seguindo o primeiro exemplo, desenvolva um programa C que calcule o perímetro da circunferência.*/

int main (){
    float perimetro, r;
    
    printf("Este programa calcula o perimetro da circunferencia. Digite o valor do raio: \n");
    scanf("%f", &r);

    perimetro = 2*PI*r;

    printf("O perimetro da circunferencia de raio %.2fcm, eh de %.2fcm ", r, perimetro);

    return 0;
}
