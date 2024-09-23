#include <stdio.h>
/*
4- Recorrendo ao comando for, crie um programa que permita exibir o seguinte output: az by cx dw ev fu gt hs Ir jq kp lo mn nm ol pk qj ri sh tg uf ve wd xc yb za.
*/
int main() {
    char inicio = 'a', fim = 'z';
    int i;

    for (i = 0; i < 13; i++) { 
        printf("%c%c ", inicio, fim); 
        inicio++; 
        fim--; 
    }

    for (i = 0; i < 13; i++) { 
        printf("%c%c ", fim+1, inicio-1); 
        inicio--; 
        fim++; 
    }
/*
    inicio = 'n'; // Reinicializa inicio para 'n'
    fim = 'm';    // Reinicializa fim para 'm'

    for (i = 0; i < 13; i++) { 
        printf("%c%c ", fim, inicio); 
        inicio++; 
        fim--; 
    }*/

    printf("\n");
    return 0;
}