Algoritmo "MEDIA"

// Algoritmo para calcular a m�dia semestral de um aluno
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

   // C�lculo da m�dia semestral
   media := (nota1 + nota2 + nota3) / 3

   // Sa�da do resultado
   escreval("A m�dia semestral do aluno �: ", media:0:2)
fimalgoritmo
