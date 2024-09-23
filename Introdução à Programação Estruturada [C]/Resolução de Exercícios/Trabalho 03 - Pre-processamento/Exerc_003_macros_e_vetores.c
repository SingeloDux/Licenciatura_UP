#include <stdio.h>
#define TAMANHO 10 
/*3. Define o macro e o cabeçalho necessario para a execução adequada do seguinte
programa.*/
int vetor[TAMANHO]; 
int dobro[TAMANHO]; 
    
int main() {
    int indice, i;


    for (indice = 0; indice < TAMANHO; indice++) {
        vetor[indice] = indice;
        dobro[indice] = indice * 2;
    }  

    for (i = 0; i < TAMANHO; i++) {
        printf("%d %d \n", vetor[i], dobro[i]);
    }

    return 0;
}