Algoritmo "Media Provas Baseado Em Peso"

// Algoritmo para calcular a m�dia final de um aluno com pesos diferentes
var
   nota1, nota2, nota3, mediaFinal: real
   peso1, peso2, peso3: inteiro

inicio
   // Definindo os pesos
   peso1 := 2
   peso2 := 3
   peso3 := 5

   // Entrada de dados
   escreva("Digite a nota da primeira prova: ")
   leia(nota1)
   escreva("Digite a nota da segunda prova: ")
   leia(nota2)
   escreva("Digite a nota da terceira prova: ")
   leia(nota3)

   // C�lculo da m�dia final
   mediaFinal := (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3)

   // Sa�da do resultado
   escreval("A m�dia final do aluno �: ", mediaFinal:0:2)
fimalgoritmo
