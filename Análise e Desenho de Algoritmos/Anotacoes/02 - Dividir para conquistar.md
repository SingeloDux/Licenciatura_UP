# 🛠️ Paradigmas de Resolução de Problemas - Dividir para Conquistar

O paradigma **Dividir para Conquistar** consiste em dividir um problema em subproblemas menores, resolvê-los individualmente e, em seguida, combinar as soluções para obter a solução do problema original. Cada subproblema é dividido até que seja simples o suficiente para ser resolvido diretamente.

## 1. Etapas da Divisão e Conquista

- **Divisão**: O problema é dividido em subproblemas menores.
- **Conquista**: Os subproblemas são resolvidos, geralmente de forma recursiva.
- **Combinação**: As soluções dos subproblemas são combinadas para formar a solução completa.

## 2. Vantagens
- Torna problemas grandes mais manejáveis.
- Melhora a eficiência, permitindo resolver subproblemas menores de forma rápida.
- Usado para criar algoritmos rápidos e eficientes, especialmente em problemas de grande escala.

## 3. Exemplos de Algoritmos de Dividir e Conquistar
Este paradigma é aplicado em algoritmos famosos como:

### Merge Sort (Ordenação por mesclagem)
Ordena dividindo uma lista ao meio, ordenando as duas metades e depois combinando-as.  
**Exemplo**:
1. Divida a lista: `[8, 3, 5, 4]` -> `[8, 3]` e `[5, 4]`
2. Ordene recursivamente: `[3, 8]` e `[4, 5]`
3. Combine: `[3, 4, 5, 8]`

### Quick Sort (Ordenação rápida)
Escolhe um pivô, divide a lista em duas partes (menores e maiores que o pivô) e ordena recursivamente cada parte.

### Pesquisa Binária
Procura em uma lista ordenada dividindo a lista ao meio repetidamente, até encontrar o elemento.  
**Exemplo**:
1. Procure o número 6 em `[1, 3, 6, 9, 11]`
2. Divida: `[1, 3, 6]` e `[9, 11]`
3. Verifique a metade esquerda, onde 6 é encontrado.

### Algoritmo de Karatsuba (Multiplicação de Números Grandes)
Divide números grandes em partes menores, resolve multiplicações menores e combina o resultado.

### Transformada Rápida de Fourier (FFT)
Usada para computar a transformada de Fourier de forma eficiente, aplicando divisão recursiva a sinais.

### Algoritmo de Strassen (Multiplicação de Matrizes)
Multiplica matrizes grandes dividindo-as em submatrizes e combinando resultados.

## Vídeo Sugerido
- [Ordenação: Aplicações e Pesquisa Binária Direta](https://youtu.be/NJ_pQ4kUHQc)

## 📝 Notas Adicionais

O material serve como base para o entendimento de conceitos fundamentais sendo explorados ao longo do curso. Acompanhe as fichas de exercícios e os trabalhos para reforçar os conceitos.

