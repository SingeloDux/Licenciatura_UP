#include <stdio.h>
/*
Escreva um programa que lê o instante do início e do término do jogo, ambos subdivididos em horas e minutos. 
Calcule e escreva a duração do jogo, também em horas e minutos, considerando que o tempo máximo de duração 
de um jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
*/
int main() {
    int horaInicio, minutoInicio, horaTermino, minutoTermino, duracaoHoras, duracaoMinutos;

    printf("Digite o instante de início do jogo.\nHoras: ");
    scanf("%d", &horaInicio);
    printf("Minutos: ");
    scanf("%d", &minutoInicio);

    printf("Digite o instante de término do jogo.\nHoras");
    scanf("%d", &horaTermino);
    printf("Minutos: ");
    scanf("%d", &minutoTermino);

    if (horaTermino < horaInicio || (horaTermino == horaInicio && minutoTermino < minutoInicio)) {
        duracaoHoras = (horaTermino + 24) - horaInicio;
    } else {
        duracaoHoras = horaTermino - horaInicio;
    }

    if (minutoTermino < minutoInicio) {
        duracaoHoras--;
        duracaoMinutos = (minutoTermino + 60) - minutoInicio;
    } else {
        duracaoMinutos = minutoTermino - minutoInicio;
    }

    printf("A duração do jogo foi de %d hora(s) e %d minuto(s).\n", duracaoHoras, duracaoMinutos);

    return 0;
}