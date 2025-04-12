/**
1 - Uma empresa pretende fazer o cadastro simples dos dados de seus 5 clientes, onde cada cliente possui id, nome e saldo.
a) Prepare uma estrutura de dados capaz de armazenar os 5 clientes
b) Usando o algoritmo de ordenação (bubble sort) ordene os clients em função dos seus saldos e volte a visualizar os dados já ordenados.
**/

#include<stdio.h>

struct cliente{
	int id;
	char *nome;
	float saldo;
};
const int Tamanho=10; int  N=0; //variaveis publicas/globais
struct cliente cl[10]; //lista de pronta a receber 10 clientes

void insercao(int iD, char*n, float s , int P){
    if(N>Tamanho || P>N){
    printf("Array esta cheio ou deve inserir numa posicao dentro dos limites - N");
     }
     else
     { int i;
        for(i=N; i>P; i--){
            cl[i].id=cl[i-1].id;
            cl[i].nome=cl[i-1].nome;
            cl[i].saldo=cl[i-1].saldo;
        }
        cl[P].id=iD; cl[P].nome=n; cl[P].saldo=s;
        N++;
    printf("Item introduzido com sucesso,visualize novamente!");
     }
}

void visualizar(){
	int i; float s=0;  
	printf("\n Quantidade -> N:%d",N); 
	printf("\nElementos da lista apos a insercao:\n");
		for(i=0; i<Tamanho; i++)
		{
printf("Elemento %d id:%d nome: %s saldo:%f \n",i,cl[i].id,cl[i].nome,cl[i].saldo);
		 s = s + cl[i].saldo;
		}
		printf("\n Soma actualizada -> :%f \n",s); 
	}

    int main(){	
	insercao(111, "ABC", 1500 , 0); //insercao no indice 0
	insercao(222, "CDE", 500 , 1);//insercao no indice 1
	insercao(333, "XYZ", 350 , 2);//insercao no indice 2
	insercao(210, "DDD", 600 , 1); //Nova insercao no indice 1	
	visualizar();
	return 0;
}