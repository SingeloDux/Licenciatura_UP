Algoritmo "EXERC011_Verifica_Nr_primo"
// 11. Crie um algoritmo que leia um n�mero inteiro, e diga se ele � um n�mero
// primo ou n�o.

// Algoritmo para verificar se um n�mero � primo
var
   numero, ehPrimo, i: inteiro

inicio
   ehPrimo := 1 // 1 representa verdadeiro

   escreva("Digite um n�mero inteiro: ")
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
      escreval(numero, " � um n�mero primo.")
   senao
      escreval(numero, " n�o � um n�mero primo.")
   fimse
fimalgoritmo
