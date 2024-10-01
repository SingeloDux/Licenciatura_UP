Algoritmo "EXERC010_QuantidNrs_ParesImpares_IntervaloValidado"
// 10. Ler dois números (inicial e final, o número final não pode ser menor
// do que o número inicial). Escreva quantos número pares e quantos números
// ímpares encontram-se entre os dois números fornecidos pelo utilizador.

// Algoritmo para contar quantos números pares e ímpares estão entre dois números
var
   inicial, final, i: inteiro
   contPares, contImpares: inteiro

inicio
   contPares := 0
   contImpares := 0

   escreva("Digite o número inicial: ")
   leia(inicial)
   escreva("Digite o número final: ")
   leia(final)

   enquanto final < inicial faca
      escreval("O número final não pode ser menor que o número inicial. Tente novamente.")
      escreva("Digite o número final: ")
      leia(final)
   fimenquanto

   para i := inicial até final faca
      se i % 2 = 0 entao
         contPares := contPares + 1 // Incrementa contador de pares
      senao
         contImpares := contImpares + 1 // Incrementa contador de ímpares
      fimse
   fimpara

   escreval("Total de números pares entre ", inicial, " e ", final, ": ", contPares)
   escreval("Total de números ímpares entre ", inicial, " e ", final, ": ", contImpares)
fimalgoritmo