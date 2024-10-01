Algoritmo "MEDIA"

// Algoritmo para calcular a média semestral de um aluno
var
   nota1, nota2, nota3, media: real

inicio
   // Entrada de dados
   escreva("Digite a primeira nota: ")
   leia(nota1)
   escreva("Digite a segunda nota: ")
   leia(nota2)
   escreva("Digite a terceira nota: ")
   leia(nota3)

   // Cálculo da média semestral
   media := (nota1 + nota2 + nota3) / 3

   // Saída do resultado
   escreval("A média semestral do aluno é: ", media:0:2)
fimalgoritmo
