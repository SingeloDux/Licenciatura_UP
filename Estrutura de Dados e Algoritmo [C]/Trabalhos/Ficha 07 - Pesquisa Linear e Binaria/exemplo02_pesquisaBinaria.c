// PESQUISA BINÁRIA EM ARRAYS

#include <stdio.h>

int PesquisaBinaria ( int k[], int chave , int N){    
   
    int inf,sup,meio;
    inf=0;
    sup=N-1;
    while (inf<=sup) 
    {
        meio=(inf+sup)/2;
        if (chave==k[meio])
            return meio;
        else if (chave<k[meio])
            sup=meio-1;
        else
            inf=meio+1;
    }
    return -1; 
}


int main (){
    int c, i, v[9]={1, 2, 3, 4, 5, 6, 7, 8, 9};
    printf ("Digite numero procurado: ");
    scanf ("%d", &i);
    c=PesquisaBinaria (v, i, 9);
    if (c==-1)
       printf ("O vetor nao contem o numero procurado \n");
    else
        printf ("O numero encontra-se no indice %d \n", c);

        return 0;
    }