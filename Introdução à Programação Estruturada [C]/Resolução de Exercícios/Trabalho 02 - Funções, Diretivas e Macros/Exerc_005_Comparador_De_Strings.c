#include <stdio.h>
#include <string.h>
/*
5. EUma função que recebe duas strings como argumento e informa se as strings são iguais. Se forem iguais retornar 1 e caso contrario 0.
*/
int compararStrings(char frase1[], char frase2[]) {
    return strcmp(frase1, frase2) == 0 ? 1 : 0;
}

int main() {
    char frase1[100], frase2[100];

    printf("Digite a primeira string: ");
    scanf(" %[^\n]", frase1); 

    printf("Digite a segunda string: ");
    scanf(" %[^\n]", frase2);

    if (compararStrings(frase1, frase2)) {
        printf("As strings são iguais!\n");
    } else {
        printf("As strings são diferentes!\n");
    }

    return 0;
}


