Algoritmo "calcRaizEquAdratica"
// Construa um algoritmo para calcular as ra�zes de uma
// equa��o quadr�tica (Ax^2 + Bx + C) sendo que os valores A, B e C
// s�o fornecidos pelo utilizador (considere que a equa��o possui duas ra�zes reais). */

// Algoritmo para calcular as ra�zes de uma equa��o quadr�tica
var
   A, B, C, delta, raiz1, raiz2: real

inicio
   escreva("Digite o valor de A: ")
   leia(A)
   escreva("Digite o valor de B: ")
   leia(B)
   escreva("Digite o valor de C: ")
   leia(C)

   delta := (B * B) - 4 * A * C

   se delta >= 0 entao

      raiz1 := (-B + raizq(delta)) / (2 * A)
      raiz2 := (-B - raizq(delta)) / (2 * A)

      escreval("A primeira raiz �: ", raiz1)
      escreval("A segunda raiz �: ", raiz2)
   senao
      escreval("A equa��o n�o possui ra�zes reais.")
   fimse
fimalgoritmo