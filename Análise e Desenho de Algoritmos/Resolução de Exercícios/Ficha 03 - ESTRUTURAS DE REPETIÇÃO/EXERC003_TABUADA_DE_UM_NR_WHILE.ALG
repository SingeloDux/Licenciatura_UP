Algoritmo "EXERC003_Tabuada_De_Um_Nr_WHILE"
// 3. Ler uma vari�vel de n�mero inteiro e mostrar a tabuada desse n�mero.
// Usando o la�o de repeti��o enquanto.
// Algoritmo para exibir a tabuada de um n�mero inteiro usando la�o enquanto
var
   numero, i: inteiro

inicio
   escreva("Digite um n�mero inteiro: ")
   leia(numero)

   i := 1

   enquanto i <= 12 faca
      escreval(numero, " x ", i, " = ", numero * i)
      i := i + 1
   fimenquanto
fimalgoritmo
