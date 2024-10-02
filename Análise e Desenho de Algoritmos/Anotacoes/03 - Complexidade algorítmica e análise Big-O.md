# Complexidade Algorítmica e Análise Big-O

A complexidade de um algoritmo mede sua eficiência em termos de tempo de execução e uso de memória. É usada para avaliar o desempenho de algoritmos à medida que o tamanho dos dados de entrada cresce.

## 1. Tipos de Complexidade

### Complexidade de Tempo
- Mede o tempo que o algoritmo leva para ser executado.
- Quanto mais entradas, mais tempo pode ser necessário.

### Complexidade de Espaço
- Mede a quantidade de memória que o algoritmo usa durante sua execução.

## 2. Medidas de Complexidade

As medidas podem ser calculadas em:
- **Modelo matemático (Maquina de Turing)**: Conta os passos de execução.
- **Modelo real**: Mede o tempo de execução em segundos.

## 3. Notação Big-O

A **Notação Big-O** é usada para descrever a complexidade de um algoritmo. Ela indica o comportamento do algoritmo à medida que o tamanho da entrada aumenta.

### Exemplos de Notação Big-O

- **O(1)**: Tempo constante. Não importa o tamanho da entrada.  
  Exemplo: Acessar um elemento de um array.

- **O(n)**: Tempo linear. O tempo cresce proporcionalmente ao tamanho da entrada.  
  Exemplo: Percorrer uma lista de `n` elementos.

- **O(n²)**: Tempo quadrático. Usado em algoritmos menos eficientes onde o tempo cresce exponencialmente com a entrada.  
  Exemplo: Algoritmo Bubble Sort.

- **O(log n)**: Crescimento logarítmico. O algoritmo reduz a entrada a cada etapa.  
  Exemplo: Busca Binária.

## 4. Algoritmos de Ordenação e Sua Complexidade

### 4.1 Bubble Sort
- Compara e troca elementos adjacentes.
- Complexidade: **O(n²)**.

### 4.2 Insertion Sort
- Insere elementos na posição correta em uma lista ordenada.
- Complexidade: **O(n²)**.

### 4.3 Selection Sort
- Seleciona o menor elemento e o coloca no início da lista.
- Complexidade: **O(n²)**.

### 4.4 Merge Sort
- Divide a lista ao meio e ordena cada parte.
- Complexidade: **O(n log n)**.

### 4.5 Quick Sort
- Escolhe um pivô, divide a lista em partes menores.
- Complexidade: **O(n log n)** no melhor caso.

### 4.6 Heap Sort
- Utiliza uma estrutura de dados chamada heap para ordenar.
- Complexidade: **O(n log n)**.

## 5. Algoritmos de Pesquisa e Sua Complexidade

### Busca Linear
- Percorre todos os elementos até encontrar o valor.
- Complexidade: **O(n)**.

### Busca Binária
- Divide a lista em duas partes e descarta metade a cada iteração.
- Complexidade: **O(log n)**.

## 6. Algoritmos Recursivos

Algoritmos que se chamam repetidamente para resolver subproblemas menores. A complexidade é analisada pelo número de chamadas recursivas e o trabalho em cada nível.

### Exemplo de Recursão
```c
int fatorial(int n) {
    if (n == 0) return 1;
    else return n * fatorial(n-1);
}
```

## 7. Algoritmos de Árvores e Grafos

### 7.1 Algoritmos de Árvores
- Uma **árvore binária** é uma estrutura em que cada nó tem no máximo dois filhos.
- Usada em busca, inserção e remoção em tempo **O(log n)** em árvores balanceadas.

### 7.2 Algoritmos de Grafos
- Um grafo é um conjunto de vértices conectados por arestas.
- Usado para resolver problemas de roteamento, busca de caminhos, etc.

## 8. Estruturas de Dados e Algoritmos Eficientes

### 8.1 Vetor
- Armazena elementos contíguos na memória.
- Acesso em tempo **O(1)** para leitura e escrita.

### 8.2 Pilha (Stack)
- Estrutura de dados LIFO (Last In, First Out).
- Operações de inserção e remoção em tempo **O(1)**.

### 8.3 Fila (Queue)
- Estrutura de dados FIFO (First In, First Out).
- Operações de inserção e remoção também em **O(1)**.

## Vídeos Sugeridos
- [Complexidade de Algoritmos em 3 simples passos utilizando a Notação Big O](https://youtu.be/zXBaLEGv0iM)
- [Big O Notation (Descubra Agora se Seus Algoritmos São Eficientes) // Dicionário do Programador](https://youtu.be/RGD3iwqDdAE)

---

## 📝 Notas Adicionais

O material serve como base para o entendimento de conceitos fundamentais sendo explorados ao longo do curso. Acompanhe as fichas de exercícios e os trabalhos para reforçar os conceitos.

