Algoritmo "Calculadora Salarial"

// Algoritmo para calcular o sal�rio total de um vendedor
var
   salarioFixo: real
   valorVendas, comissao, salarioTotal: real

inicio
   // Definindo o sal�rio fixo
   salarioFixo := 12000.00

   // Entrada de dados
   escreva("Digite o valor total das vendas do m�s: ")
   leia(valorVendas)

   // C�lculo da comiss�o
   comissao := valorVendas * 0.15 // 15% de comiss�o

   // C�lculo do sal�rio total
   salarioTotal := salarioFixo + comissao

   // Sa�da dos resultados
   escreval("Sal�rio fixo: ", salarioFixo:0:2)
   escreval("Valor das vendas: ", valorVendas:0:2)
   escreval("Comiss�o: ", comissao:0:2)
   escreval("Sal�rio total do vendedor: ", salarioTotal:0:2)
fimalgoritmo
