/**
Insercao Em Arrays
**/
#include <stdio.h>

void mostrar(int x[]){
    int i;
    for(i=0; i<10; i++){
        printf("Elemento %d = %d \n",i, x[i]);
    }
}

int main(){
    int Ar[10] = {11,15,16,8,2};
    int N = 5; //O ultimo indice preenchido +1
    int K = 50; //Valor por inserir
    int P = 1; // indice por inserir
    int i;

    for(i=N; i>P; i--){ //Afastar os elementos do array por forma a abrir um espaço no P=1
        Ar[i] = Ar[i-1];
    } 

    Ar[P] = K; //Inserir o valor K no indice P (1)
    N++; // Atualiza o N - O ultimo lugar vazio
    mostrar(Ar); // Mostrar o array apos a insercao
}