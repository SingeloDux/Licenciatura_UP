Algoritmo "EXERC009_QuantNrs_ParesImpares_No_Intervalo"
// 9. Ler dois números (inicial e final). Escreva quantos números pares e
// quantos números ímpares encontram-se entre os dois números fornecidos
// pelo utilizador.

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

   se inicial > final entao
      escreval("O número inicial deve ser menor ou igual ao número final.")
   senao
      para i := inicial até final faca
         se i % 2 = 0 entao
            contPares := contPares + 1 // Incrementa contador de pares
         senao
            contImpares := contImpares + 1 // Incrementa contador de ímpares
         fimse
      fimpara

      escreval("Total de números pares entre ", inicial, " e ", final, ": ", contPares)
      escreval("Total de números ímpares entre ", inicial, " e ", final, ": ", contImpares)
   fimse
fimalgoritmo