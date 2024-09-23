# 📝 Trabalho I - Exercícios - Estruturas de Decisão

## Recursos 📚
- [Matéria de apoio](http://sgeraldoc.blogspot.com/2020/03/estrutura-de-controle-sequencial-e-de.html)
- [Fonte dos exercícios](http://sgeraldoc.blogspot.com/2020/03/exercicios-estruturas-de-controle.html)

## 1. Média Final e Situação do Aluno

Em uma escola, a média final é dada pela média aritmética de três notas. E a mesma tem o seguinte esquema de avaliação:

| Média   | Situação do Aluno           |
|---------|-----------------------------|
| 0 – 4.9 | Recuperação                 |
| 5 – 6.9 | Admitido/prova final        |
| 7 – 10  | Dispensado                  |

## 2. Situação do Aluno com Base nas Notas

Desenvolva um programa que, a partir da entrada das três notas, mostre a situação do aluno. No caso do aluno em recuperação e admitido/prova final, mostre também quanto o aluno irá precisar para passar. No caso da recuperação, a nota necessária para passar é dada por `10 – Média + 2` e na prova final é dada por `10 – Média`.

## 3. Preço dos CDs

Em uma loja de CDs, existem apenas quatro tipos de preços associados a cores. Desenvolva o algoritmo que, a partir da entrada da cor, o software mostre o preço. A loja está atualmente com a seguinte tabela de preços:

| Cor       | Preço  |
|-----------|--------|
| Verde     | 10,00  |
| Azul      | 20,00  |
| Amarelo   | 30,00  |
| Vermelho  | 40,00  |

## 4. Maior de Quatro Números

Desenvolva um programa capaz de encontrar o maior dentre 4 números inteiros quaisquer dados pelo teclado.

## 5. Verificação de Paridade

Desenvolva um programa capaz de verificar se um número inteiro qualquer, dado como entrada, é par ou ímpar.

## 6. Cálculo de Salário Bruto e Líquido

Determine o salário bruto e líquido de cada funcionário de uma escola, tendo em conta que os engenheiros recebem 10.900 Mt/h, doutores 15.400 Mt/h e técnicos 5.000 Mt/h.

## 7. Índice de Poluição

A secretária de Meio Ambiente controla o índice de poluição de 3 grupos altamente poluentes. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3, as indústrias do 1º grupo são intimadas a suspender suas atividades; se o índice crescer para 0,4, as indústrias do 1º e 2º grupo são intimadas a suspender suas atividades; se o índice atingir 0,5, todos os grupos devem ser notificados a paralisarem suas atividades. Faça um algoritmo que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.

## 8. Cálculo da Área de um Triângulo

Prepare um programa para ler a base e a altura de um triângulo e imprimir a área (`área = 0.5 * base * altura`). Preveja a possibilidade de valores negativos para a base ou a altura e imprima uma mensagem identificando este valor como a base ou a altura, se for o caso.

## 9. Dobro ou Triplo

Encontre o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.

## 10. Forma de Pagamento

Desenvolva um programa que leia o valor de uma determinada compra e o código da forma de pagamento. Com base neste código, o programa deverá calcular e imprimir o valor a pagar, a forma de pagamento e o valor de cada parcela, se for o caso:

1. À vista, com 8% de desconto
2. À vista no cartão, 4% de desconto
3. Em 2x, preço normal sem juros
4. Em 4x, preço acrescido de 8%
5. Qualquer outro código: Opção inválida

## 11. Tipo de Triângulo

Leia o comprimento dos três lados de um triângulo (a, b, c) e determine o tipo de triângulo, com base nos seguintes casos:

a) Se `A >= B + C`, nenhum triângulo é formado.
b) Se `A^2 = B^2 + C^2`, é formado um triângulo retângulo.
c) Se `A^2 > B^2 + C^2`, é formado um triângulo obtusângulo.
d) Se `A^2 < B^2 + C^2`, é formado um triângulo acutângulo.

Observações:
- `A` é o maior dos lados
- `B` e `C` são os outros dois lados
- Prever a possibilidade de dados negativos e indicar erro.

## 12. Ordem dos Valores

Leia um conjunto de quatro valores `i`, `a`, `b`, `c`, onde `i` é um valor inteiro e positivo e `a`, `b`, `c` são quaisquer valores reais distintos. Escreva:

a) Se `i = 1`, os 3 valores `a`, `b`, `c` em ordem crescente.
b) Se `i = 2`, os 3 valores `a`, `b`, `c` em ordem decrescente.
c) Se `i = 3`, os 3 valores de forma que o maior valor entre `a`, `b`, `c` fique entre os outros 2.

## 13. Duração do Jogo

Escreva um programa que lê o instante do início e do término do jogo, ambos subdivididos em horas e minutos. Calcule e escreva a duração do jogo, também em horas e minutos, considerando que o tempo máximo de duração de um jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

## 14. Aposentadoria

Faça um programa que leia dois inteiros, que representam a idade e o tempo de contribuição de um trabalhador e informe se ele pode se aposentar ou não. Os critérios para aposentadoria são:
- Ter pelo menos 65 anos de idade;
- Ou ter trabalhado pelo menos 30 anos;
- Ou ter pelo menos 60 anos e trabalhado pelo menos 25.

## 15. Alarme do Celular

João configurou o seu celular para despertar em um determinado horário. Dados a hora e o minuto que João configurou o celular e a hora e o minuto em que ele deseja que o celular toque, faça um programa que determine quantas horas e minutos faltam para que o celular de João dispare o alarme. O horário programado para despertar pode estar no dia posterior ao da configuração.

## 16. Ano Bissexto

Escreva um programa em C que peça ao usuário para inserir um ano e determine se ele é bissexto ou não.

## 17. Calculadora Simples

Escreva um programa em C que implemente uma calculadora simples. O programa deve pedir ao usuário para inserir dois números e um operador (+, -, *, /) e, em seguida, exibir o resultado da operação.

Materia de apoio: http://sgeraldoc.blogspot.com/2020/03/estrutura-de-controle-sequencial-e-de.html
Fonte exercicios: Shelto http://sgeraldoc.blogspot.com/2020/03/exercicios-estruturas-de-controle.html

Boa sorte e bons estudos! 😄
