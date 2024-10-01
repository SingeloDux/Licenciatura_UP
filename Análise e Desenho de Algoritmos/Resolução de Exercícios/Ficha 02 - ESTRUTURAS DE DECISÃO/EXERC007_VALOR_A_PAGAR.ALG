Algoritmo "EXERC007_Valor_a_pagar"
// 7. Elabore um algoritmo que calcule o que deve ser pago por um produto,
// considerando o preço normal de etiqueta e a escolha da condição de pagamento.
// Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
// escolhida e efetuar o cálculo adequado.
// Código    Condição de pagamento
// 1         À vista em dinheiro ou cheque, recebe 10% de desconto
// 2         À vista no cartão de credito, recebe 5% de desconto
// 3         Em duas vezes, preço normal de etiqueta sem juros
// 4         Em três vezes, preço normal de etiqueta mais juros de 10%

// Algoritmo para calcular o valor final de um produto com base na condição de pagamento
var
   preco_etiqueta, valor_final: real
   codigo_pagamento: inteiro

inicio
   // Entrada de dados
   escreva("Digite o preço de etiqueta do produto: ")
   leia(preco_etiqueta)
   escreva("Digite o código da condição de pagamento (1-4): ")
   leia(codigo_pagamento)

   // Escolha múltipla para calcular o valor final conforme a condição de pagamento
   escolha codigo_pagamento
      caso 1
         valor_final := preco_etiqueta * 0.90 // 10% de desconto
         escreval("Condição de pagamento: À vista em dinheiro ou cheque")
      caso 2
         valor_final := preco_etiqueta * 0.95 // 5% de desconto
         escreval("Condição de pagamento: À vista no cartão de crédito")
      caso 3
         valor_final := preco_etiqueta // Sem alteração no preço
         escreval("Condição de pagamento: Em duas vezes, sem juros")
      caso 4
         valor_final := preco_etiqueta * 1.10 // 10% de juros
         escreval("Condição de pagamento: Em três vezes, com 10% de juros")
      outrocaso
         escreval("Código inválido!")
         interrompa
   fimescolha

   // Exibição do valor final, se o código for válido
   se (codigo_pagamento >= 1) e (codigo_pagamento <= 4) entao
      escreval("O valor final a ser pago é: ", valor_final:0:2)
   fimse

fimalgoritmo