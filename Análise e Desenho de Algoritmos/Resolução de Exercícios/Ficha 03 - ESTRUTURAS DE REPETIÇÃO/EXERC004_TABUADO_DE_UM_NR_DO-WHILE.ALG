Algoritmo "EXERC004_Tabuado_De_Um_Nr_DO-WHILE"
// 4. Ler uma variável de número inteiro e mostrar a tabuada desse número.
// Usando o laço de repetição repita (do…while).

// Algoritmo para exibir a tabuada de um número inteiro usando laço repita
var
   numero, i: inteiro

inicio
   escreva("Digite um número inteiro: ")
   leia(numero)

   i := 1

   repita
      escreval(numero, " x ", i, " = ", numero * i)
      i := i + 1
   ate i = 13
fimalgoritmo