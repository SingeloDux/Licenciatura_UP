Algoritmo "EXERC007_Valor_a_pagar"
// 7. Elabore um algoritmo que calcule o que deve ser pago por um produto,
// considerando o pre�o normal de etiqueta e a escolha da condi��o de pagamento.
// Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento
// escolhida e efetuar o c�lculo adequado.
// C�digo    Condi��o de pagamento
// 1         � vista em dinheiro ou cheque, recebe 10% de desconto
// 2         � vista no cart�o de credito, recebe 5% de desconto
// 3         Em duas vezes, pre�o normal de etiqueta sem juros
// 4         Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%

// Algoritmo para calcular o valor final de um produto com base na condi��o de pagamento
var
   preco_etiqueta, valor_final: real
   codigo_pagamento: inteiro

inicio
   // Entrada de dados
   escreva("Digite o pre�o de etiqueta do produto: ")
   leia(preco_etiqueta)
   escreva("Digite o c�digo da condi��o de pagamento (1-4): ")
   leia(codigo_pagamento)

   // Escolha m�ltipla para calcular o valor final conforme a condi��o de pagamento
   escolha codigo_pagamento
      caso 1
         valor_final := preco_etiqueta * 0.90 // 10% de desconto
         escreval("Condi��o de pagamento: � vista em dinheiro ou cheque")
      caso 2
         valor_final := preco_etiqueta * 0.95 // 5% de desconto
         escreval("Condi��o de pagamento: � vista no cart�o de cr�dito")
      caso 3
         valor_final := preco_etiqueta // Sem altera��o no pre�o
         escreval("Condi��o de pagamento: Em duas vezes, sem juros")
      caso 4
         valor_final := preco_etiqueta * 1.10 // 10% de juros
         escreval("Condi��o de pagamento: Em tr�s vezes, com 10% de juros")
      outrocaso
         escreval("C�digo inv�lido!")
         interrompa
   fimescolha

   // Exibi��o do valor final, se o c�digo for v�lido
   se (codigo_pagamento >= 1) e (codigo_pagamento <= 4) entao
      escreval("O valor final a ser pago �: ", valor_final:0:2)
   fimse

fimalgoritmo