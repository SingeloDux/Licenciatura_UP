1 Execute e compile os exemplos apresentados nesta apostila.

#include <stdio.h>
#include <stdlib.h>
int main() {
     int i;   
     for(i=0; i<=10; i++)
     printf(" %d ",i);
    
     return 0;
}

Contagem crescente usando o comando for

Exemplo:
   #include<iostream>
   using namespace std;
   int main()
   {
        int i=0;
        while(i!=1)
        {
            printf(" Digite o valor de i: ");
            scanf(" %i ",&i);
        }
        printf(" Fora do loop");
    }
                       
Neste exemplo o programa exibe uma mensagem sempre que o valor da variável i for diferente de 1. E quando o utilizador digitar 1 o programa termina a execução.

Exemplo
     #include <stdio.h>
     #include <stdlib.h>

     int main()
     {
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

Este programa recebe um número inteiro qualquer e exibe na ordem inversa.

2 Leia um valor numérico n e escreva o valor da soma dos n termos.

Fazer um programa que leia um conjunto de 10 notas de alunos de uma disciplina, armazene-as na variável nota e determine a maior delas.

Recorrendo ao comando for, crie um programa que permita exibir o seguinte output: az by cx dw ev fu gt hs Ir jq kp lo mn nm ol pk qj ri sh tg uf ve wd xc yb za.

Tem-se um conjunto de dados contendo a altura e o sexo (M ou F) de 15 pessoas. Faça um Programa que calcule e escreva: a média de altura das mulheres; o número de homens.

Desenvolver um programa que efectue a soma de todos os números ímpares e que se encontram no conjunto dos números de 1 até 500.

Escreva um programa que receba a idade de 10 pessoas, calcule e imprima a quantidade de pessoas maiores de idade (idade >= 18 anos).

8 Fazer um programa que calcule a média aritmética de n números digitados pelo teclado. Até que o usuário informe o valor zero.

9 Escreva um programa que leia vários números inteiros ate que seja informado o numero 0. Se o número lido for positivo, escreva uma mensagem indicando se ele é par ou ímpar. Se o número for negativo, escreva a seguinte mensagem “Este número não é positivo”. (use a função mod deve ser "x mod y" e retorna o resto da divisão de x por y).
