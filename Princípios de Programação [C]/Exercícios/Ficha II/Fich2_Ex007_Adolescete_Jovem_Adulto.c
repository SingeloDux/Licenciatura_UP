#include <stdlib.h>
#include <stdio.h>

/*
7 - Construa um algoritmo que recebe a idade de um utilizador e imprima: ADOLESCENTE se a idade
for inferior a 15, JOVEM se for entre 15 e 35 anos e ADULTO se for maior que 35 anos de idade.
*/

int main(){
    int idade;

    printf("Digite uma idade para saber se eh adolescente, jovem ou adulto: ");
    scanf("%d", &idade);

    if(idade>=35){
        printf("\nADULTO");
    }else if(idade<=15){
        printf("\nADOLESCENTE");
    }else{
        printf("\nJOVEM");
    }

    return 0;
}