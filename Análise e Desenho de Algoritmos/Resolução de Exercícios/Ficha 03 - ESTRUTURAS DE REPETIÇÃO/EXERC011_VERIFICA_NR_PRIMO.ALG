Algoritmo "EXERC011_Verifica_Nr_primo"
// 11. Crie um algoritmo que leia um número inteiro, e diga se ele é um número
// primo ou não.

// Algoritmo para verificar se um número é primo
var
   numero, ehPrimo, i: inteiro

inicio
   ehPrimo := 1 // 1 representa verdadeiro

   escreva("Digite um número inteiro: ")
   leia(numero)

   se numero <= 1 entao
      ehPrimo := 0 // 0 representa falso
   senao
      i := 2
      enquanto i <= numero / 2 faca
         se numero mod i = 0 entao
            ehPrimo := 0
         fimse
         i := i + 1
      fimenquanto
   fimse

   se ehPrimo = 1 entao
      escreval(numero, " é um número primo.")
   senao
      escreval(numero, " não é um número primo.")
   fimse
fimalgoritmo
