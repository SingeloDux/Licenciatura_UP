Algoritmo "EXERC010_QuantidNrs_ParesImpares_IntervaloValidado"
// 10. Ler dois n�meros (inicial e final, o n�mero final n�o pode ser menor
// do que o n�mero inicial). Escreva quantos n�mero pares e quantos n�meros
// �mpares encontram-se entre os dois n�meros fornecidos pelo utilizador.

// Algoritmo para contar quantos n�meros pares e �mpares est�o entre dois n�meros
var
   inicial, final, i: inteiro
   contPares, contImpares: inteiro

inicio
   contPares := 0
   contImpares := 0

   escreva("Digite o n�mero inicial: ")
   leia(inicial)
   escreva("Digite o n�mero final: ")
   leia(final)

   enquanto final < inicial faca
      escreval("O n�mero final n�o pode ser menor que o n�mero inicial. Tente novamente.")
      escreva("Digite o n�mero final: ")
      leia(final)
   fimenquanto

   para i := inicial at� final faca
      se i % 2 = 0 entao
         contPares := contPares + 1 // Incrementa contador de pares
      senao
         contImpares := contImpares + 1 // Incrementa contador de �mpares
      fimse
   fimpara

   escreval("Total de n�meros pares entre ", inicial, " e ", final, ": ", contPares)
   escreval("Total de n�meros �mpares entre ", inicial, " e ", final, ": ", contImpares)
fimalgoritmo