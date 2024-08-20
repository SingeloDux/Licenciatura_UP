#include <stdlib.h>
#include <stdio.h>
#include <math.h>
// #include <Exer_nr04 & Eduardo S. Come>
/*
5 -	Faça um programa para ler a temperatura actual e conforme leitura, converta para Fahrenheit
e imprimir o resultado de acordo com a tabela...
*/

int main() {
    int celsius;
    float fahrenheit;

    printf("\nDigite a temperatura atual em graus celsius: ");
    scanf("%d", &celsius);

    fahrenheit = (celsius * 1.8) + 32;

    if(celsius < 16) {
        printf("\nMuito frio! A sua temperatura em fahrenheit eh %.2f Graus Fahrenheit!\n", fahrenheit);
    } else if(celsius <= 23) {
        printf("\nFrio! A sua temperatura em fahrenheit eh %.2f Graus Fahrenheit!\n", fahrenheit);
    } else if(celsius <= 26) {
        printf("\nAgradavel! A sua temperatura em fahrenheit eh %.2f Graus Fahrenheit!\n", fahrenheit);
    } else if(celsius <= 30) {
        printf("\nCalor! A sua temperatura em fahrenheit eh %.2f Graus Fahrenheit!\n", fahrenheit);
    }else{
        printf("\nMuito quente! A sua temperatura em fahrenheit eh %.2f Graus Fahrenheit!\n", fahrenheit);
    }
       
    return 0;
}