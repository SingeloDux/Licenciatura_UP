#include <stdio.h>
#include <string.h>

typedef struct {
    int codigo;
    char titulo[100];
    char autor[50];
} Livro;

int pesquisaBinaria(Livro livros[], int codigo, int tamanho) {
    int inf = 0, sup = tamanho - 1, meio;

    while (inf <= sup) {
        meio = (inf + sup) / 2;

        if (livros[meio].codigo == codigo)
            return meio;
        else if (codigo < livros[meio].codigo)
            sup = meio - 1;
        else
            inf = meio + 1;
    }

    return -1;
}

int pesquisaLinear(Livro livros[], char titulo[], int tamanho) {
    for (int i = 0; i < tamanho; i++) {
        if (strcmp(livros[i].titulo, titulo) == 0)
            return i;
    }
    return -1;
}

int main() {
    Livro biblioteca[5] = {
        {301, "Programando em C/C++", "Kris Jamsa"},
        {302, "Use a Cabeca - SQL", "O'Reilly"},
        {303, "Neuromancer", "William Gibson"},
        {304, "Jogador Numero 1", "Ernest Cline"},
        {305, "A Arte de Enganar", "Kevin D. Mitnick"}
    };

    int opcao;
    printf("=-=-=- MENU DE TIPOS DE PESQUISA -=-=-=\n");
    printf("1 - Pesquisar por TITULO (Linear)\n");
    printf("2 - Pesquisar por CODIGO (Binaria)\n");
    printf("Escolha uma opcao: ");
    scanf("%d", &opcao);
    getchar();

    if (opcao == 1) {
        char tituloBusca[100];
        printf("\nDigite o titulo do livro: ");
        fgets(tituloBusca, sizeof(tituloBusca), stdin);
        tituloBusca[strcspn(tituloBusca, "\n")] = '\0'; // remover \n

        int resultado = pesquisaLinear(biblioteca, tituloBusca, 5);

        if (resultado != -1) {
            printf("\nLivro encontrado:\n");
            printf("Codigo: %d\n", biblioteca[resultado].codigo);
            printf("Titulo: %s\n", biblioteca[resultado].titulo);
            printf("Autor: %s\n", biblioteca[resultado].autor);
        } else {
            printf("\nLivro NAO encontrado.\n");
        }

    } else if (opcao == 2) {
        int codBusca;
        printf("\nDigite o codigo do livro: ");
        scanf("%d", &codBusca);

        int resultado = pesquisaBinaria(biblioteca, codBusca, 5);

        if (resultado != -1) {
            printf("\nLivro encontrado:\n");
            printf("Codigo: %d\n", biblioteca[resultado].codigo);
            printf("Titulo: %s\n", biblioteca[resultado].titulo);
            printf("Autor: %s\n", biblioteca[resultado].autor);
        } else {
            printf("\nLivro NAO encontrado.\n");
        }

    } else {
        printf("\nOpcao invalida.\n");
    }

    printf("\nFIM\n");
    return 0;
}
