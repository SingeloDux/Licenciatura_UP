#include <stdio.h>
/*
Em uma escola, a média final é dada pela média aritmética de três notas. 
E a mesma tem o seguinte esquema de avaliação: 
0 – 4.9 (Recuperação), 5 – 6.9 (Admitido/prova final ) e 7 – 10 (Dispensado).
*/
int main() {
    float nota1, nota2, nota3, media;

    printf("Digite a primeira nota: ");
    scanf("%f", &nota1);
    printf("Digite a segunda nota: ");
    scanf("%f", &nota2);
    printf("Digite a terceira nota: ");
    scanf("%f", &nota3);

    media = (nota1 + nota2 + nota3) / 3;

    printf("A média final é: %.2f\n", media);

    if (media >= 0 && media < 5.0) {
        printf("Situação: Recuperação\n");
    } else if (media >= 5.0 && media < 7.0) {
        printf("Situação: Admitido/prova final\n");
    } else if (media >= 7.0 && media <= 10.0) {
        printf("Situação: Dispensado\n");
    } else {
        printf("Nota inválida! As notas devem estar entre 0 e 10.\n");
    }

    return 0;
}
