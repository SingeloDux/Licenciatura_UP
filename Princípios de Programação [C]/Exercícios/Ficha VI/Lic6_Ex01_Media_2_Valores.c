#include <stdlib.h>
#include <stdio.h>

/*
1 - Faça um programa em C para calcular a médias aritmética de dois números inteiros entre 0-20. 
A operação deve ser executada apenas se a condição for satisfeita. 
Nota: Apoie-seno vídeo disponibilizado na plataforma.
Usei do While porque executa 1 vez antes da condicao, sendo assim nao preciso inicializar as variaveis com valores aleatorios.
*/

int main() {
    int n1, n2;
    float media;
    
    printf("Este programa calcula a medias aritmetica de dois numeros entre 0 e 20:\n");

    do {
        printf("Digite o primeiro numero: ");
        scanf("%d", &n1);
        printf("Digite o segundo numero: ");
        scanf("%d", &n2);

        if ((n1 < 0 || n1 > 20) || (n2 < 0 || n2 > 20)) {
            printf("Os numeros devem estar entre 0 e 20. Tente novamente.\n");
        }
    } while ((n1 < 0 || n1 > 20) || (n2 < 0 || n2 > 20));

    media = (n1 + n2) / 2;

    printf("A media aritmetica dos numeros digitados eh %.2f\n", media);

    return 0;
}