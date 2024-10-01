Algoritmo "Exer003_CalcAreaVolumePerimetro"

// Algoritmo para calcular o volume, a área e o perímetro de uma esfera
var
   raio, volume, area, perimetro: real

inicio

   pi := 3.14159

   escreva("Digite o valor do raio da esfera: ")
   leia(raio)

   volume := (4/3) * pi * (raio * raio * raio)

   area := 4 * pi * (raio * raio)

   perimetro := 2 * pi * raio

   // Saída dos resultados
   escreval("O volume da esfera é: ", volume:0:2)
   escreval("A área da superfície da esfera é: ", area:0:2)
   escreval("O perímetro (circunferência) da esfera é: ", perimetro:0:2)
fimalgoritmo
