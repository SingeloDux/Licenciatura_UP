Algoritmo "EXERC004_Tabuado_De_Um_Nr_DO-WHILE"
// 4. Ler uma vari�vel de n�mero inteiro e mostrar a tabuada desse n�mero.
// Usando o la�o de repeti��o repita (do�while).

// Algoritmo para exibir a tabuada de um n�mero inteiro usando la�o repita
var
   numero, i: inteiro

inicio
   escreva("Digite um n�mero inteiro: ")
   leia(numero)

   i := 1

   repita
      escreval(numero, " x ", i, " = ", numero * i)
      i := i + 1
   ate i = 13
fimalgoritmo