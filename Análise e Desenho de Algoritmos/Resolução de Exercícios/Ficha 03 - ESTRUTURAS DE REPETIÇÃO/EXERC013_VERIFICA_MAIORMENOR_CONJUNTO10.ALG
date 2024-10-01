Algoritmo "EXERC013_Verifica_MaiorMenor_Conjunto10"
// 13. Escreva um algoritmo que leia um conjunto de 10 números inteiros e
// mostre qual foi o maior e o menor valor fornecido.

// Algoritmo para ler 10 números inteiros e encontrar o maior e o menor
var
   numero, i, maior, menor: inteiro

inicio
   maior := -999999 // Pode ser ajustado para um número menor se necessário
   menor := 999999  // Pode ser ajustado para um número maior se necessário

   para i := 1 ate 10 faca
      escreva("Digite o ", i, "º número inteiro: ")
      leia(numero)

      se numero > maior entao
         maior := numero
      fimse

      se numero < menor entao
         menor := numero
      fimse
   fimpara

   escreval("O maior valor fornecido é: ", maior)
   escreval("O menor valor fornecido é: ", menor)
fimalgoritmo
