Algoritmo "EXERC013_Verifica_MaiorMenor_Conjunto10"
// 13. Escreva um algoritmo que leia um conjunto de 10 n�meros inteiros e
// mostre qual foi o maior e o menor valor fornecido.

// Algoritmo para ler 10 n�meros inteiros e encontrar o maior e o menor
var
   numero, i, maior, menor: inteiro

inicio
   maior := -999999 // Pode ser ajustado para um n�mero menor se necess�rio
   menor := 999999  // Pode ser ajustado para um n�mero maior se necess�rio

   para i := 1 ate 10 faca
      escreva("Digite o ", i, "� n�mero inteiro: ")
      leia(numero)

      se numero > maior entao
         maior := numero
      fimse

      se numero < menor entao
         menor := numero
      fimse
   fimpara

   escreval("O maior valor fornecido �: ", maior)
   escreval("O menor valor fornecido �: ", menor)
fimalgoritmo
