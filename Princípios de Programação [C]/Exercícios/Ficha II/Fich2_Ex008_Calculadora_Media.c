#include <stdlib.h>
#include <stdio.h>

/* 8 - Faça um algoritmo que calcule a média aritmética das três notas de um aluno e mostre, além do valor
da média, uma mensagem de "Dispensado", caso a média seja igual ou superior a 14; a mensagem
“Excluído” caso a média seja menor que 10 e "Admitido", caso contrário. Nota: O programa deve
emitir mensagem de Erro, caso os valores estejam fora do intervalo de 0 a 20. */

int main(){
    float n1,n2,n3,media;

    printf("Este programa calcula a media aritmetica das tres notas de um aluno");
    printf("\nDigite a primeira nota:");
    scanf("%f", &n1);

    printf("\nDigite a segunda nota:");
    scanf("%f", &n2);

    printf("\nDigite a terceira nota:");
    scanf("%f", &n3);

    if (n1 < 0 || n1 > 20 || n2 < 0 || n2 > 20 || n3 < 0 || n3 > 20) {
        printf("\nErro: As notas devem estar no intervalo de 0 a 20. Encerrando o programa.\n");
        return 0; 
    }

    media = (n1+n2+n3)/3;

    if(media>=14){
        printf("\nA sua media eh de %.2f, e voce foi DISPENSADO.", media);
    }else if(media<10){
        printf("\nA sua media eh de %.2f, e voce foi EXCLUIDO.", media);

    }else {

        printf("\nA sua media eh de %.2f, e voce foi ADMITIDO.", media);

    }
    return 0;
}