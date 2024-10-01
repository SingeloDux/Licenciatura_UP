Algoritmo "Calculadora Custo Consumidor"

// Algoritmo para calcular o custo ao consumidor de um carro novo
var
   custoFabrica, percentualRevendedor, percentualImpostos, custoAoConsumidor: real

inicio
   // Entrada de dados
   escreva("Digite o custo de fábrica do carro: ")
   leia(custoFabrica)

   // Definindo os percentuais
   percentualRevendedor := 0.25 // 25%
   percentualImpostos := 0.45     // 45%

   // Cálculo do custo ao consumidor
   custoAoConsumidor := custoFabrica + (custoFabrica * percentualRevendedor) + (custoFabrica * percentualImpostos)

   // Saída do resultado
   escreval("O custo ao consumidor do carro é: ", custoAoConsumidor:0:2)
fimalgoritmo
