Algoritmo "EXERC001_Tabuada_De_Um_Nr_While"
// 1. Ler uma variável de número inteiro e mostrar a tabuada desse número.

// Algoritmo para exibir a tabuada de um número inteiro usando laço enquanto
var
   numero, i: inteiro

inicio
   escreva("Digite um número inteiro: ")
   leia(numero)

   i := 1

   enquanto i <= 12 faca
      escreval(numero, " x ", i, " = ", numero * i)
      i := i + 1
   fimenquanto
fimalgoritmo