#include <stdio.h>
#include <stdlib.h>

int main(){
int n1, n2, soma;

printf("Soma de dois valores \n");
printf("Digite o primeiro valor\n");
scanf("%d", &n1);

printf("Digite o segundo valor\n");
scanf("%d", &n2);

soma=n1+n2;

printf("\nO resultado da soma é: %d", soma);

return 0;
}