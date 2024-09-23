# Análise e Desenho de Algoritmos

## 📘 Descrição

Nesta disciplina, focamos na análise teórica e prática de algoritmos, com ênfase na sua eficiência e complexidade. Exploramos técnicas para estimar o comportamento dos algoritmos de forma assintótica, ou seja, como eles se comportam com entradas grandes, e o impacto no tempo e espaço consumidos. Estudaremos também paradigmas como a **divisão e conquista**, que desempenha um papel importante na otimização de soluções para problemas computacionais.

## 📂 Conteúdo Disponível

### Técnicas de Pesquisa

A pesquisa é uma operação fundamental em estruturas de dados, e ela pode ser classificada em dois tipos principais:

#### 1. Pesquisa Sequencial
A **pesquisa sequencial** percorre os elementos de forma linear até encontrar o elemento desejado. Não requer que os dados estejam ordenados.

**Exemplo de pesquisa sequencial:**

```c
#include <stdio.h>

void pesquisa_linear(int a[], int n, int chave) {
    int i, count = 0;
    for(i = 0; i < n; i++) {
        if(a[i] == chave) {
            printf("Elemento encontrado no %d º índice\n", i+1);
            count++;
        }
    }
    if(count == 0)
        printf("O elemento não foi encontrado na matriz\n");
}

int main() {
    int a[10] = {12, 44, 32, 18, 4, 10};
    pesquisa_linear(a, 6, 18);  // Chave encontrada
    pesquisa_linear(a, 6, 23);  // Pesquisa sem êxito
    return 0;
}
```

#### 2. Pesquisa por Intervalos
A **pesquisa por intervalos** divide a pesquisa em subconjuntos, mas requer que os dados estejam ordenados. Exemplos incluem a **pesquisa binária** e a **pesquisa por saltos**.

**Exemplo de pesquisa binária:**

```c
#include <stdio.h>

void pesquisa_binaria(int a[], int baixo, int alto, int chave) {
    int medio = (baixo + alto) / 2;
    if (baixo <= alto) {
        if (a[medio] == chave)
            printf("Elemento encontrado no índice: %d\n", medio);
        else if(chave < a[medio])
            pesquisa_binaria(a, baixo, medio-1, chave);
        else
            pesquisa_binaria(a, medio+1, alto, chave);
    } else {
        printf("Pesquisa sem êxito\n");
    }
}

int main() {
    int a[5] = {12, 14, 18, 22, 39};
    pesquisa_binaria(a, 0, 4, 22);  // Chave encontrada
    pesquisa_binaria(a, 0, 4, 23);  // Pesquisa sem êxito
    return 0;
}
```

- **Algoritmos de Busca - Linear e Binária**: Para uma explicação detalhada com exemplos em JavaScript, veja [este vídeo](https://youtu.be/KUUXv6rBCrY).

---

## 🛠️ Paradigmas de Resolução de Problemas

### Dividir para Conquistar

O paradigma **Dividir para Conquistar** consiste em dividir um problema em subproblemas menores, resolvê-los individualmente e, em seguida, combinar as soluções para obter a solução do problema original.

1. **Divisão**: O problema é dividido em subproblemas menores.
2. **Conquista**: Os subproblemas são resolvidos, geralmente de forma recursiva.
3. **Combinação**: As soluções dos subproblemas são combinadas para formar a solução completa.

Este paradigma é aplicado em algoritmos famosos como:

- **Merge Sort** (Ordenação por mesclagem)
- **Quick Sort** (Ordenação rápida)
- **Pesquisa Binária**

---

## 📝 Notas Adicionais

Este repositório contém exemplos e implementações em C, focados nas técnicas de pesquisa e algoritmos clássicos. O material serve como base para o entendimento de conceitos fundamentais que serão explorados ao longo do curso, e é fundamental para exercícios práticos e provas de correção de algoritmos.

Acompanhe as fichas de exercícios e os trabalhos para reforçar os conceitos.
