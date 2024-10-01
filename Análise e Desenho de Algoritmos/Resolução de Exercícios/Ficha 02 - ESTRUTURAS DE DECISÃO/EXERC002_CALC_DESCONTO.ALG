Algoritmo "EXERC002_Calc_Desconto"
// 2. Uma loja oferece para os seus clientes, um determinado desconto de
// acordo com o valor da compra efectuada. O desconto é de 10%, se o valor
// da compra for até 200.00MT, 15% se for maior que 200,00MT e menor ou igual
// a 500,00MT e 20% se for acima de 500,00MT. Crie um algoritmo que leia o
// nome do cliente e o valor da compra. Mostre ao final o nome do cliente, o
// valor da compra, o percentual de desconto e o seu valor e valor total
// a pagar deste cliente.

// Algoritmo para calcular o desconto de uma compra em uma loja
var
   nomeCliente: caractere
   valorCompra, desconto, valorDesconto, valorTotal: real

inicio
   escreva("Digite o nome do cliente: ")
   leia(nomeCliente)
   escreva("Digite o valor da compra: ")
   leia(valorCompra)

   se (valorCompra <= 200) entao
      desconto := 0.10 // 10% de desconto
   senao
      se (valorCompra > 200) e (valorCompra <= 500) entao
         desconto := 0.15 // 15% de desconto
      senao
         desconto := 0.20 // 20% de desconto
      fimse
   fimse

   valorDesconto := valorCompra * desconto
   valorTotal := valorCompra - valorDesconto

   escreval("Nome do cliente: ", nomeCliente)
   escreval("Valor da compra: ", valorCompra:0:2, " MT")
   escreval("Percentual de desconto: ", desconto * 100:0:0, "%")
   escreval("Valor do desconto: ", valorDesconto:0:2, " MT")
   escreval("Valor total a pagar: ", valorTotal:0:2, " MT")
fimalgoritmo