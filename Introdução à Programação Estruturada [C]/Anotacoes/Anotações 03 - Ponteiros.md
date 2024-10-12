# 📚 Ponteiros

## O que é um ponteiro?

Um **ponteiro** é uma variável que armazena o **endereço de memória** de outra variável, em vez de armazenar o valor diretamente. Em outras palavras, ele "aponta" para a localização onde o valor está armazenado na memória.

### Por que usar ponteiros?

Os ponteiros desempenham um papel crucial na programação em C, sendo utilizados em diversas situações, como:

- Manipulação de **strings**
- **Alocação de memória dinâmica**
- Passagem de parâmetros por **referência**
- Construção de **estruturas de dados** complexas (árvores, listas, etc.)
- Manipulação de **funções**
- **Estruturas de dados** especiais (ex.: árvores, tries)

### Declaração de Ponteiros

Para declarar um ponteiro, usamos a seguinte sintaxe:

```c
tipo *nome_variavel;
```

Exemplos de declaração de ponteiros:

```c
int *n;        // Ponteiro para um inteiro
double *n1;    // Ponteiro para um double
float *n2;     // Ponteiro para um float
char *sexo;    // Ponteiro para um char
```

### Exemplo de Uso de Ponteiros

Declaração e impressão de valores usando ponteiros:

```c
#include <stdio.h>

int main() {
    int valor = 42;
    int *ptr = &valor;  // Ponteiro que armazena o endereço de valor

    // Imprimindo o valor e o endereço
    printf("Valor: %d\n", valor);
    printf("Endereço armazenado no ponteiro: %p\n", (void *)ptr);
    printf("Valor apontado pelo ponteiro: %d\n", *ptr);

    return 0;
}
```

Saída esperada:

```
Valor: 42
Endereço armazenado no ponteiro: 0x7ffee3c9f978
Valor apontado pelo ponteiro: 42
```

### Problemas com Ponteiros de Tipos Incompatíveis

Quando se utiliza um ponteiro para acessar uma variável de tipo incompatível, pode-se obter resultados inesperados, como valores incorretos ou dados corrompidos.

#### Exemplo de Código com Saída Incompatível

```c
#include <stdio.h>

int main() {
    int valor = 42;
    short *a = (short *)&valor;  // Ponteiro de short para int
    int *b = &valor;             // Ponteiro de int para int
    char *c = (char *)&valor;    // Ponteiro de char para int

    // Imprimindo valores
    printf("Acesso via ponteiro 'a' (short): %d\n", *a);
    printf("Acesso via ponteiro 'b' (int): %d\n", *b);
    printf("Acesso via ponteiro 'c' (char): %d\n", *c);

    return 0;
}
```

Saída possível:

```
Acesso via ponteiro 'a' (short): 42
Acesso via ponteiro 'b' (int): 42
Acesso via ponteiro 'c' (char): -86
```

O valor acessado pelo ponteiro `b` é correto, mas os ponteiros `a` e `c` acessam os dados de forma incorreta, gerando valores inesperados.

### Referências

- [Ponteiros](https://sgeraldoc.blogspot.com/2019/05/ponteiros.html)

