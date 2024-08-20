#include <stdio.h>
#include <stdlib.h>
// #include <Exer_nr13 & Eduardo S. Come>

/* 13 - O sistema de avaliação de determinada disciplina, é composto por três notas na escala de 0 a 20. 
A primeira prova tem peso 20%, a segunda tem peso 30% e a terceira tem peso 50%. 
Faça um algoritmo para calcular a média final de um aluno desta disciplina e informa se Exclui, Admite ou Dispensa. 
O programa sé deve ser executado apenas com notas dentro da escala, caso, não, este deverá solicitar a nota até que esteja dentro do parâmetro.
*/

int main(){
    int i=0;
    float nota[3], media;

    while (i < 3) {
        printf("\nDigite a nota da %da prova: ", i+1);
        scanf("%f", &nota[i]);

        if (nota[i] >= 0 && nota[i]<=20) {
            i++;
        } else {
            printf("\nA nota nao pode ser menor que 0 ou maior que 20.\n");
        }
    }
    // Como a soma dos pesos é 1, a fórmula pode ser simplificada para:
    media = (nota[0] * 0.2) + (nota[1] * 0.3) + (nota[2]* 0.5);

    if(media>=14){
        printf("\nA sua media eh de %.2f valores, voce foi Dispensado!", media);
    } else if(media<10){
        printf("\nA sua media eh de %.2f valores, voce foi Excluido!", media);
    }else{
        printf("\nA sua media eh de %.2f valores, voce foi Admitido!", media);
    }
    return 0;
}