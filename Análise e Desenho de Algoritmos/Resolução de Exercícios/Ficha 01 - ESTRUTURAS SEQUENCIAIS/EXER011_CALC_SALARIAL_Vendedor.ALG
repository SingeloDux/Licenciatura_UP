Algoritmo "Calculadora Salarial"

// Algoritmo para calcular o salário total de um vendedor
var
   salarioFixo: real
   valorVendas, comissao, salarioTotal: real

inicio
   // Definindo o salário fixo
   salarioFixo := 12000.00

   // Entrada de dados
   escreva("Digite o valor total das vendas do mês: ")
   leia(valorVendas)

   // Cálculo da comissão
   comissao := valorVendas * 0.15 // 15% de comissão

   // Cálculo do salário total
   salarioTotal := salarioFixo + comissao

   // Saída dos resultados
   escreval("Salário fixo: ", salarioFixo:0:2)
   escreval("Valor das vendas: ", valorVendas:0:2)
   escreval("Comissão: ", comissao:0:2)
   escreval("Salário total do vendedor: ", salarioTotal:0:2)
fimalgoritmo
