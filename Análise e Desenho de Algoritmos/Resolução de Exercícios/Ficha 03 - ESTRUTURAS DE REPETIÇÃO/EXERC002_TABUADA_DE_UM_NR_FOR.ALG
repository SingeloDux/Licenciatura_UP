Algoritmo "EXERC002_Tabuada_De_Um_Nr_For"
// 2. Ler uma vari�vel de n�mero inteiro e mostrar a tabuada desse n�mero.
// Usando o la�o de repeti��o Para.

// Algoritmo para calcular e mostrar a tabuada de um n�mero inteiro
var
   numero, i, resultado: inteiro

inicio
   escreva("Digite um n�mero inteiro para ver sua tabuada: ")
   leia(numero)

   para i de 1 ate 12 faca
      resultado := numero * i
      escreval(numero, " x ", i, " = ", resultado)
   fimpara

fimalgoritmo