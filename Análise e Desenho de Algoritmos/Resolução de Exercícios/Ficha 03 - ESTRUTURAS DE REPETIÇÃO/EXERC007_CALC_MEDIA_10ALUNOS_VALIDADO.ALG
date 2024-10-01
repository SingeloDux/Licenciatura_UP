Algoritmo "EXERC007_Calc_Media_10Alunos_Validado"
// 7. Ler a nota de 10 alunos, calcular a media e mostrar essa média.
// Aceitar somente notas de 0 a 10.

// Algoritmo para ler as notas de 10 alunos, calcular a média e validar notas
var
   nota: real
   soma: real
   media: real
   i: inteiro

inicio
   soma := 0

   para i := 1 até 10 faca
      repita
         escreva("Digite a nota do aluno ", i, " (entre 0 e 10): ")
         leia(nota)

         se (nota < 0) ou (nota > 10) entao
            escreval("Nota inválida! Por favor, digite uma nota entre 0 e 10.")
         fimse
      ate (nota >= 0) e (nota <= 10)
      
      soma := soma + nota
   fimpara

   media := soma / 10

   escreval("A média das notas dos 10 alunos é: ", media:0:2)
fimalgoritmo