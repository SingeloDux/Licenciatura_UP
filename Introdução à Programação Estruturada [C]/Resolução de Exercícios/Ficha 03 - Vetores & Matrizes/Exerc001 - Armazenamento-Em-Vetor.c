#include <stdio.h>

/*
1. Crie vetores para armazenar:
    - a. As vogais do alfabeto.
    - b. As temperaturas diárias de uma semana.
    - c. O número de dias de cada mês do ano.
*/
int main(){

// char alfabeto[26] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
//static int tempo[7]= {18,19,20,21,22,23,24};
char dia_semana[7]= {"Domingo", "Segunda-Feira", "Terca-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sabado"};
int dias_mes[12]={31,28,31,30,31,30,31,31,30,31,30,31};

    printf("Vogais do alfabeto: ");
    for (int i=0; i<26; i++){
        //printf("%c , ", alfabeto[i]);
    }

    printf("As temperaturas diárias da semana sao: ");
    for (int i=0; i<26; i++){
       // printf(" %c: %d graus \n", dia_semana[i], alfabeto[i]);
        printf(" %c \n", dia_semana[i]);
    }

    printf("Numero de dias de cadada mês do ano: \n");
    for (int i=1; i<=12; i++){
        printf("Mes %d tem %d dias \n", i, dias_mes[i-1]);
    }
    return 0;
}