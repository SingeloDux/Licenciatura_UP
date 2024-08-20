#include <stdlib.h>
#include <stdio.h>
#include <math.h>
// #include <Exer_nr04 & Eduardo S. Come>
/*
4 -	Desenvolva um programa que leia um número N e imprima “F1”, “F2” ou “F3”, conforme a
condição: “F1”, se N <= 10; “F2”, se N > 10 e N <= 100; “F3”, se N > 100 & “Erro!”, se N < 0.
*/

int main() {
    int n;

    printf("Digite um numero: ");
    scanf("%d", &n);

    if(n < 0) {
        printf("Erro!\n");

    } else if(n <= 10) {
        printf("F1\n");
    } else if(n <= 100) {
        printf("F2\n");
    } else{
        printf("F3\n");
    }
       
    return 0;
}