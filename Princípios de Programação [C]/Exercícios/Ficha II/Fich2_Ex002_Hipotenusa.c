#include <stdio.h>
#include <stdlib.h>
#include <math.h>
    /*
    Sejam a e b os catetos de um triangulo, onde a hipotenusa e obtida pela equação: hipotenusa (h).Desenvolva um 
    programa que receba os valores de a e b maiores que zero e calcule o valor da hipotenusa através da equação.  
    */
int main(){
   float a,b,h;

    printf("\nEsse programa calcula o valor da hipotenusa atraves dos valores de catetos fornecidos.");
    printf("\nDigite o valor do cateto a: ");
    scanf("%f", &a);

    printf("\nDigite o valor do cateto b: ");
    scanf("%f", &b);

    if(a>0 && b>0){
        h = sqrt(pow(a,2)+pow(b,2));
        // h = sqrt(a*a + b*b);
        printf("\nO valor da hipotenusa dos dados fornecidos e: %.2f", h);

    }else{
        printf("\nOs valores dos catetos a e b devem ser maiores que zero.");
    }
    return 0;
}