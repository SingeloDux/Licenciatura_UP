Algoritmo "Calculadora Eleitoral"

// Algoritmo para calcular a percentagem de votos brancos, nulos e válidos
var
   totalEleitores, votosBrancos, votosNulos, votosValidos: inteiro
   percBrancos, percNulos, percValidos: real

inicio
   // Entrada de dados
   escreva("Digite o número total de eleitores: ")
   leia(totalEleitores)
   escreva("Digite o número de votos brancos: ")
   leia(votosBrancos)
   escreva("Digite o número de votos nulos: ")
   leia(votosNulos)
   escreva("Digite o número de votos válidos: ")
   leia(votosValidos)

   // Cálculo das porcentagens
   percBrancos := (votosBrancos / totalEleitores) * 100
   percNulos := (votosNulos / totalEleitores) * 100
   percValidos := (votosValidos / totalEleitores) * 100

   // Saída dos resultados
   escreval("Percentagem de votos brancos: ", percBrancos:0:2, "%")
   escreval("Percentagem de votos nulos: ", percNulos:0:2, "%")
   escreval("Percentagem de votos válidos: ", percValidos:0:2, "%")
fimalgoritmo
