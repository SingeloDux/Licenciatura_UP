Algoritmo "Calculadora Basica"

// Algoritmo para realizar as quatro opera��es matem�ticas com dois n�meros
var
   num1, num2, soma, subtracao, multiplicacao, divisao: real

inicio
   // Entrada de dados
   escreva("Digite o primeiro n�mero: ")
   leia(num1)
   escreva("Digite o segundo n�mero (diferente de zero): ")
   leia(num2)

   // Verifica se o segundo n�mero � diferente de zero
   se num2 <> 0 entao
      // C�lculo das opera��es
      soma := num1 + num2
      subtracao := num1 - num2
      multiplicacao := num1 * num2
      divisao := num1 / num2

      // Sa�da dos resultados
      escreval("Soma: ", soma:0:2)
      escreval("Subtra��o: ", subtracao:0:2)
      escreval("Multiplica��o: ", multiplicacao:0:2)
      escreval("Divis�o: ", divisao:0:2)
   senao
      escreval("O segundo n�mero deve ser diferente de zero.")
   fimse
fimalgoritmo
