Algoritmo "EXERC012_Calc_Fatorial"
// 12. Usando todas estruturas de repeti��o crie algoritmo para c�lculo de
// fatorial de um n�mero fornecido pelo utilizador, sabendo que:
// N! = 1 � 2 � 3 �. . .� (N - 1) � N
// 0! = 1, por defini��o

// Algoritmo para calcular o fatorial usando o la�o para
var
   numero, fatorial, i: inteiro

inicio
   // Entrada de dados
   escreva("Digite um n�mero inteiro: ")
   leia(numero)

   // Inicializa o fatorial
   fatorial := 1

   // C�lculo do fatorial
   para i := 1 ate numero faca
      fatorial := fatorial * i
   fimpara

   // Sa�da do resultado
   escreval("O fatorial de ", numero, " �: ", fatorial)
fimalgoritmo