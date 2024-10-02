# Programação Dinâmica

A **Programação Dinâmica (PD)** é uma técnica usada para resolver problemas de otimização ao dividi-los em subproblemas menores e combinar as soluções. Ela é eficaz quando os subproblemas se repetem e é mais eficiente do que recalcular soluções repetidamente.

## Características
- **Subproblemas sobrepostos**: A solução de um subproblema é reutilizada várias vezes.
- **Subestrutura ótima**: A solução ótima de um problema pode ser construída a partir das soluções ótimas de seus subproblemas.

## Etapas da Programação Dinâmica
1. **Caracterizar** a estrutura da solução ótima.
2. **Definir recursivamente** o valor da solução ótima.
3. **Calcular** o valor da solução de forma bottom-up (de baixo para cima).
4. **Construir** a solução ótima usando as informações calculadas.

## Abordagens
- **Top-Down (Memorização)**: Resolve recursivamente e armazena resultados para reutilização.
- **Bottom-Up**: Resolve iterativamente, construindo soluções a partir de subproblemas menores.

## Exemplos
### Fibonacci
O cálculo da sequência de Fibonacci recursivamente gera muitos subproblemas repetidos. A PD armazena essas soluções em uma tabela, evitando recalcular.

### Problema da Mochila
Dado um conjunto de itens com pesos e valores, a PD ajuda a maximizar o valor dentro de uma capacidade limitada. (Veja mais no vídeo: [Problema da Mochila](https://youtu.be/e0i-NZLqyI4)).

## Diferença entre PD, Algoritmos Gananciosos e Dividir e Conquistar
- **Algoritmos Gananciosos**: Fazem escolhas locais ótimas, mas podem não levar à solução global ótima.
- **Dividir e Conquistar**: Divide o problema em subproblemas independentes.
- **PD**: Subproblemas são interdependentes, e as soluções anteriores são memorizadas para evitar trabalho redundante.

## Recursos Adicionais
- [O que é Programação Dinâmica](https://youtu.be/Up2pYS9yg9A)
- [Wikipedia - Programação Dinâmica](https://pt.wikipedia.org/wiki/Programa%C3%A7%C3%A3o_din%C3%A2mica)

## 📝 Notas Adicionais

O material serve como base para o entendimento de conceitos fundamentais sendo explorados ao longo do curso. Acompanhe as fichas de exercícios e os trabalhos para reforçar os conceitos.


