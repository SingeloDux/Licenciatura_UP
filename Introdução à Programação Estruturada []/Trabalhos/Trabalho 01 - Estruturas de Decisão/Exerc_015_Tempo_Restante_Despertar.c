#include <stdio.h>
/*
João configurou o seu celular para despertar em um determinado horário. Dados a hora e o minuto que João configurou o celular e a hora e o minuto em que ele deseja que o celular toque, faça um programa que determine quantas horas e minutos faltam para que o celular de João dispare o alarme. O horário programado para despertar pode estar no dia posterior ao da configuração.
*/
int main() {
    int horaConfig, minutoConfig, horaAlarme, minutoAlarme;
    int horasRestantes, minutosRestantes;

    printf("Digite a hora de configuração (0 a 23): ");
    scanf("%d", &horaConfig);
    printf("Digite os minutos de configuração (0 a 59): ");
    scanf("%d", &minutoConfig);

    printf("Digite a hora do alarme (0 a 23): ");
    scanf("%d", &horaAlarme);
    printf("Digite os minutos do alarme (0 a 59): ");
    scanf("%d", &minutoAlarme);

    if (horaConfig < 0 || horaConfig > 23 || minutoConfig < 0 || minutoConfig > 59 ||
        horaAlarme < 0 || horaAlarme > 23 || minutoAlarme < 0 || minutoAlarme > 59) {
        printf("Horário inválido. Por favor, insira horários válidos.\n");
        return 1;
    }

    int totalMinutosConfig = horaConfig * 60 + minutoConfig;
    int totalMinutosAlarme = horaAlarme * 60 + minutoAlarme;

    if (totalMinutosAlarme <= totalMinutosConfig) {
        totalMinutosAlarme += 24 * 60;
    }

    minutosRestantes = totalMinutosAlarme - totalMinutosConfig;

    horasRestantes = minutosRestantes / 60;
    minutosRestantes = minutosRestantes % 60;

    printf("Faltam %d hora(s) e %d minuto(s) para o alarme tocar.\n", horasRestantes, minutosRestantes);

    return 0;
}