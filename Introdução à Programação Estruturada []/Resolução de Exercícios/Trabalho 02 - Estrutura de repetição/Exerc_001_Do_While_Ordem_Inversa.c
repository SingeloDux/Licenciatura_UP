#include <stdio.h>
#include <stdlib.h>
/*
1- Execute e compile os exemplos apresentados nesta apostila.

Este programa recebe um número inteiro qualquer e exibe na ordem inversa.
*/
int main(){
int num, right_digit;
printf("Enter your number. \n");
scanf(" %d ",&num);

do {
    right_digit = num % 10;
    printf(" %d ",right_digit);
    num = num / 10;
}
while( num != 0 );
printf(" \n ");
return 0;

}