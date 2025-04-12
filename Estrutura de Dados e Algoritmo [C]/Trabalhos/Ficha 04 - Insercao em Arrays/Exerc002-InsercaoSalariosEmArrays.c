/**
Insercao Em Arrays

CASO DE ESTUDO
2 – Use o algoritmo discutido para inserir e visualizar os salários de x  trabalhadores numa estrutura de dados de 20 espaços disponíveis. 
Visualize igualmente a média aritmética dos x salários cadastrados.
**/
#include <stdio.h>

#define TAM 20

// Mostrar todos os salários cadastrados
void mostrarSalarios(float salarios[], int N){
    printf("\n--- Lista de Salarios Cadastrados ---\n");
    for(int i = 0; i < N; i++){
        printf("Trabalhador %d: %.2fMT\n", i, salarios[i]);
    }
    printf("-------------------------------------\n");
}

// Inserir salário na posição desejada
int inserirSalario(float salarios[], int *N, float salario, int posicao){
    if(*N >= TAM){
        printf("Erro: Limite de trabalhadores atingido.\n");
        return 0;
    }
    if(posicao < 0 || posicao > *N){
        printf("Erro: Posicao invalida. Deve estar entre 0 e %d.\n", *N);
        return 0;
    }

    for(int i = *N; i > posicao; i--){
        salarios[i] = salarios[i - 1];
    }

    salarios[posicao] = salario;
    (*N)++;
    return 1;
}

// Calcular média dos salários cadastrados
float calcularMedia(float salarios[], int N){
    float soma = 0;
    for(int i = 0; i < N; i++){
        soma += salarios[i];
    }
    return (N > 0) ? soma / N : 0;
}

int main(){
    float salarios[TAM];
    int N = 0; // Número de salários cadastrados
    float salario;
    int posicao;
    char continuar;

    printf("Cadastro de Salarios - Maximo de %d trabalhadores\n", TAM);

    do {
        printf("\nDigite o salario do trabalhador: ");
        scanf("%f", &salario);

        printf("Digite a posicao para inserir (0 a %d): ", N);
        scanf("%d", &posicao);

        if(inserirSalario(salarios, &N, salario, posicao)){
            printf("Salario inserido com sucesso.\n");
        } else {
            printf("Erro ao inserir salario.\n");
        }

        printf("Deseja inserir outro salario? (s/n): ");
        scanf(" %c", &continuar);

    } while((continuar == 's' || continuar == 'S') && N < TAM);

    mostrarSalarios(salarios, N);

    float media = calcularMedia(salarios, N);
    printf("\nMedia dos salarios: %.2fMT\n", media);

    return 0;
}
