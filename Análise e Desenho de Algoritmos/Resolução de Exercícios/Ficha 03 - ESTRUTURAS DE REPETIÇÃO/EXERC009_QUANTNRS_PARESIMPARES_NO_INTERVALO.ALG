Algoritmo "EXERC009_QuantNrs_ParesImpares_No_Intervalo"
// 9. Ler dois n�meros (inicial e final). Escreva quantos n�meros pares e
// quantos n�meros �mpares encontram-se entre os dois n�meros fornecidos
// pelo utilizador.

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

   se inicial > final entao
      escreval("O n�mero inicial deve ser menor ou igual ao n�mero final.")
   senao
      para i := inicial at� final faca
         se i % 2 = 0 entao
            contPares := contPares + 1 // Incrementa contador de pares
         senao
            contImpares := contImpares + 1 // Incrementa contador de �mpares
         fimse
      fimpara

      escreval("Total de n�meros pares entre ", inicial, " e ", final, ": ", contPares)
      escreval("Total de n�meros �mpares entre ", inicial, " e ", final, ": ", contImpares)
   fimse
fimalgoritmo