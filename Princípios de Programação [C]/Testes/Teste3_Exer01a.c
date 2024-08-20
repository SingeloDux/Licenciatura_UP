#include <stdlib.h>
#include <stdio.h>

/* Desenvolva um programa na linguagem que receba dois numeros inteiros digitados pelo utilizador.
Garanta que o segundo numero seja mairo que o primeiro, obrigando o utilizador a digitar, usando o
comado Dowhile. Após isso, imprima em ordem decrescente todos os numeros do intervalo dos
numeros digitados utilizando o comando FOR, e some todos os numeros do intervelo entre ambos,
incluindo-os.
*/
int main(){ int cc, a, b, c;
a=ceil(2.6); b= abs(-4); c= pow(a, 6-b);
cc= -a + b + c;
switch (cc) {
case 2: printf("CC = Electronica"); break;
case 4: printf("CC = Informatica"); break;
case 10: printf("CC = Quimica"); break;
default: printf("CC = Erro…");
}
return 0;
}