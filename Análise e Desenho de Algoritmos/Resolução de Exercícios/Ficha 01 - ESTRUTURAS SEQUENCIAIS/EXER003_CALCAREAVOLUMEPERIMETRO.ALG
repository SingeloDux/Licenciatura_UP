Algoritmo "Exer003_CalcAreaVolumePerimetro"

// Algoritmo para calcular o volume, a �rea e o per�metro de uma esfera
var
   raio, volume, area, perimetro: real

inicio

   pi := 3.14159

   escreva("Digite o valor do raio da esfera: ")
   leia(raio)

   volume := (4/3) * pi * (raio * raio * raio)

   area := 4 * pi * (raio * raio)

   perimetro := 2 * pi * raio

   // Sa�da dos resultados
   escreval("O volume da esfera �: ", volume:0:2)
   escreval("A �rea da superf�cie da esfera �: ", area:0:2)
   escreval("O per�metro (circunfer�ncia) da esfera �: ", perimetro:0:2)
fimalgoritmo
