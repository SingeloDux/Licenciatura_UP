Algoritmo "Calculadora Basica"

// Algoritmo para realizar as quatro operações matemáticas com dois números
var
   num1, num2, soma, subtracao, multiplicacao, divisao: real

inicio
   // Entrada de dados
   escreva("Digite o primeiro número: ")
   leia(num1)
   escreva("Digite o segundo número (diferente de zero): ")
   leia(num2)

   // Verifica se o segundo número é diferente de zero
   se num2 <> 0 entao
      // Cálculo das operações
      soma := num1 + num2
      subtracao := num1 - num2
      multiplicacao := num1 * num2
      divisao := num1 / num2

      // Saída dos resultados
      escreval("Soma: ", soma:0:2)
      escreval("Subtração: ", subtracao:0:2)
      escreval("Multiplicação: ", multiplicacao:0:2)
      escreval("Divisão: ", divisao:0:2)
   senao
      escreval("O segundo número deve ser diferente de zero.")
   fimse
fimalgoritmo
