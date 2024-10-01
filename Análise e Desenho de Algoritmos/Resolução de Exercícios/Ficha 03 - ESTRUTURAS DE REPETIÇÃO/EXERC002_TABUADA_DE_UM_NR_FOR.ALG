Algoritmo "EXERC002_Tabuada_De_Um_Nr_For"
// 2. Ler uma variável de número inteiro e mostrar a tabuada desse número.
// Usando o laço de repetição Para.

// Algoritmo para calcular e mostrar a tabuada de um número inteiro
var
   numero, i, resultado: inteiro

inicio
   escreva("Digite um número inteiro para ver sua tabuada: ")
   leia(numero)

   para i de 1 ate 12 faca
      resultado := numero * i
      escreval(numero, " x ", i, " = ", resultado)
   fimpara

fimalgoritmo