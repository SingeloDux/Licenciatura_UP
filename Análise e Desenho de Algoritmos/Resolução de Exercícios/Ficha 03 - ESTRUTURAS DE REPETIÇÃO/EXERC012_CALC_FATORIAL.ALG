Algoritmo "EXERC012_Calc_Fatorial"
// 12. Usando todas estruturas de repetição crie algoritmo para cálculo de
// fatorial de um número fornecido pelo utilizador, sabendo que:
// N! = 1 × 2 × 3 ×. . .× (N - 1) × N
// 0! = 1, por definição

// Algoritmo para calcular o fatorial usando o laço para
var
   numero, fatorial, i: inteiro

inicio
   // Entrada de dados
   escreva("Digite um número inteiro: ")
   leia(numero)

   // Inicializa o fatorial
   fatorial := 1

   // Cálculo do fatorial
   para i := 1 ate numero faca
      fatorial := fatorial * i
   fimpara

   // Saída do resultado
   escreval("O fatorial de ", numero, " é: ", fatorial)
fimalgoritmo