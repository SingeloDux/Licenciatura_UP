Algoritmo "Calculadora Eleitoral"

// Algoritmo para calcular a percentagem de votos brancos, nulos e v�lidos
var
   totalEleitores, votosBrancos, votosNulos, votosValidos: inteiro
   percBrancos, percNulos, percValidos: real

inicio
   // Entrada de dados
   escreva("Digite o n�mero total de eleitores: ")
   leia(totalEleitores)
   escreva("Digite o n�mero de votos brancos: ")
   leia(votosBrancos)
   escreva("Digite o n�mero de votos nulos: ")
   leia(votosNulos)
   escreva("Digite o n�mero de votos v�lidos: ")
   leia(votosValidos)

   // C�lculo das porcentagens
   percBrancos := (votosBrancos / totalEleitores) * 100
   percNulos := (votosNulos / totalEleitores) * 100
   percValidos := (votosValidos / totalEleitores) * 100

   // Sa�da dos resultados
   escreval("Percentagem de votos brancos: ", percBrancos:0:2, "%")
   escreval("Percentagem de votos nulos: ", percNulos:0:2, "%")
   escreval("Percentagem de votos v�lidos: ", percValidos:0:2, "%")
fimalgoritmo
