/**
CASO DE ESTUDO D
2 – Considere os Arrays K e Z, onde temos os ponteiros P apontando para K e Q apontando para Z.

**/
#include <stdio.h>
int main(){
    int K[5], Z[5], *P, *Q, i, soma=0;
    P = K;
    Q = Z;

    for(i=0; i<5; i++){
        printf("Digite o valor de K[%d]: ", i);
        scanf("%d", &K[i]);
    }
    for(i=0; i<5; i++){
        printf("Digite o valor de Z[%d]: ", i);
        scanf("%d", &Z[i]);
    }

    // a) Após preencher as duas listas, usando P e Q, faça a troca dos elementos de K e Z, onde toda a lista de K passa para Z e vice-versa.

    for(i=0; i<5; i++){
        int aux = K[i];
        K[i] = Z[i];
        Z[i] = aux;
    }
    
    printf("\n\nLista K trocada: ");
    for(i=0; i<5; i++){
        printf("%d ", K[i]);
    }
    printf("\nLista Z trocada: ");
    for(i=0; i<5; i++){
        printf("%d ", Z[i]);
    }
    printf("\n");

    // b) Usando P e Q, imprima a soma dos elementos de K com os de Z, usando a regra de adição de matrizes unidimensionais.

    for(i=0; i<5; i++){
        soma += K[i] + Z[i];
    }
    printf("\nSoma dos elementos de K e Z: %d\n", soma);
    return 0;
}