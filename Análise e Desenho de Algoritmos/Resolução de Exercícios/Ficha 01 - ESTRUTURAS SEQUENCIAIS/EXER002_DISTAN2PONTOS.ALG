Algoritmo "Exer002_Distan2Pontos"

// Algoritmo para calcular a distância entre dois pontos no plano

var
   x1, y1, x2, y2, distancia: real

inicio
   // Entrada de dados
   escreva("Digite a coordenada x1 do ponto P: ")
   leia(x1)
   escreva("Digite a coordenada y1 do ponto P: ")
   leia(y1)

   escreva("Digite a coordenada x2 do ponto Q: ")
   leia(x2)
   escreva("Digite a coordenada y2 do ponto Q: ")
   leia(y2)

   // Cálculo da distância entre os pontos
   distancia := raizq((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))

   // Saída do resultado
   escreval("A distância entre os pontos P e Q é: ", distancia:0:2)
fimalgoritmo
