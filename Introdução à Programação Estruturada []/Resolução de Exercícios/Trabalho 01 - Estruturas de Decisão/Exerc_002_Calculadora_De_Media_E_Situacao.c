#include <stdio.h>
/*
Desenvolva um programa que, a partir da entrada das três notas, mostre a situação do aluno. 
No caso do aluno em recuperação e admitido/prova final, mostre também quanto o aluno irá precisar 
para passar. No caso da recuperação, a nota necessária para passar é dada por `10 – Média + 2` e 
na prova final é dada por `10 – Média`.
*/
int main() {
    float nota1, nota2, nota3, media, notaNecessaria;

    printf("Digite a primeira nota: ");
    scanf("%f", &nota1);
    printf("Digite a segunda nota: ");
    scanf("%f", &nota2);
    printf("Digite a terceira nota: ");
    scanf("%f", &nota3);

    media = (nota1 + nota2 + nota3) / 3;

    printf("A média final é: %.2f\n", media);

    if (media >= 0 && media < 5.0) {
        notaNecessaria = 10 - media + 2;
        printf("Situação: Recuperação\n");
        printf("Nota necessária para passar: %.2f\n", notaNecessaria);
    } else if (media >= 5.0 && media < 7.0) {
        notaNecessaria = 10 - media;
        printf("Situação: Admitido/prova final\n");
        printf("Nota necessária para passar: %.2f\n", notaNecessaria);
    } else if (media >= 7.0 && media <= 10.0) {
        printf("Situação: Dispensado\n");
    } else {
        printf("Nota inválida! As notas devem estar entre 0 e 10.\n");
    }

    return 0;
}
