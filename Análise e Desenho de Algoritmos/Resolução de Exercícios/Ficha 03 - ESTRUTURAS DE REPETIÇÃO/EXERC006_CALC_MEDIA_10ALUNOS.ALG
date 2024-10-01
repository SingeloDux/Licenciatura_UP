Algoritmo "EXERC006_Calc_Media_10Alunos"
// 6. Ler a nota de 10 alunos, calcular a media e mostrar essa média.

// Algoritmo para ler as notas de 10 alunos e calcular a média
var
   nota: real
   soma: real
   media: real
   i: inteiro

inicio
   soma := 0

   para i := 1 até 10 faca
      escreva("Digite a nota do aluno ", i, ": ")
      leia(nota)
      soma := soma + nota
   fimpara

   media := soma / 10

   escreval("A média das notas dos 10 alunos é: ", media:0:2)
fimalgoritmo
