Aqui está a versão otimizada do seu conteúdo com formatação em Markdown e algumas melhorias de clareza:


# 📚 Vetores, Matrizes e Strings

## Vetores
Um vetor é uma coleção de variáveis do mesmo tipo, que compartilham o mesmo nome e ocupam posições consecutivas na memória. Cada variável é chamada de **elemento** e é identificada por um **índice**. Se `v` é um vetor com `n` posições, seus elementos são: `v[0]`, `v[1]`, ..., `v[n-1]`.

### Exemplo:
Um vetor para armazenar 5 números inteiros pode ser declarado assim:
```c
int v[5];
```

### Inicialização de Vetores
Em C, vetores globais e estáticos são automaticamente inicializados com zero. Contudo, podemos inicializá-los explicitamente, colocando os valores entre chaves `{}` no momento da declaração.

#### Exemplo:
```c
#include <stdio.h>

void main(void) {
    static float moeda[5] = {1.00, 0.50, 0.25, 0.10, 0.05};
}
```

Os valores são armazenados a partir da posição `0` do vetor, na ordem em que são fornecidos. No exemplo, `moeda[2]` armazena o valor `0.25`.

**Nota**: Apenas valores constantes ou expressões são permitidos na inicialização de vetores. Variáveis não são permitidas.

## Matrizes
Uma matriz é uma coleção bidimensional de elementos distribuídos em **linhas** e **colunas**. Se `A` é uma matriz `m×n`, suas linhas são indexadas de `0` a `m-1` e suas colunas de `0` a `n-1`. Para acessar um elemento específico de `A`, usamos `A[i][j]`, onde `i` é o número da linha e `j` o número da coluna.

### Exemplo:
Uma matriz `3x4` de inteiros pode ser declarada assim:
```c
int A[3][4];
```

Isso cria a seguinte matriz:

| A[0][0] | A[0][1] | A[0][2] | A[0][3] |
|---------|---------|---------|---------|
| A[1][0] | A[1][1] | A[1][2] | A[1][3] |
| A[2][0] | A[2][1] | A[2][2] | A[2][3] |

### Inicialização de Matrizes
Matrizes podem ser inicializadas da mesma forma que vetores. Uma matriz nada mais é do que um vetor de vetores, e a sintaxe de inicialização é a mesma.

## Exercícios

1. Crie vetores para armazenar:
    - a. As vogais do alfabeto.
    - b. As temperaturas diárias de uma semana.
    - c. O número de dias de cada mês do ano.

2. Crie um programa que leia duas strings. Se forem iguais, exiba "strings iguais". Caso contrário, concatene as strings e imprima o resultado.

3. Crie um programa que declare duas strings com capacidade para 30 caracteres. Leia a primeira string e copie-a para a segunda. Exiba o conteúdo das duas strings.

4. Leia um texto de no máximo 99 caracteres e imprima o número de caracteres digitados. **Dica**: percorra o vetor até encontrar o caractere terminador `\0`.

5. Uma loja de CDs usa cores para marcar preços. Crie um algoritmo que mostre o preço com base na cor fornecida. Use a tabela a seguir:

| Cor      | Preço  |
|----------|--------|
| Verde    | 10 MZN |
| Azul     | 20 MZN |
| Amarelo  | 30 MZN |
| Vermelho | 40 MZN |

6. Crie um programa que some todos os valores de um array unidimensional e exiba a média.

7. Ordene de forma crescente os elementos do array: `(1, 8, 3, 5, 7, 6, 4)`.

8. Crie um array que exiba o seguinte output:

```
08 09 10 11
12 13 14 15
```

9. Crie um programa que receba um valor inteiro e faça uma busca em um array de 10 elementos. Informe quantos valores foram encontrados ou se nenhum foi encontrado.

### Referências
- [Vectores, Matrizes e Strings](https://sgeraldoc.blogspot.com/2019/04/vectores-matrizes-e-strings.html)
```
