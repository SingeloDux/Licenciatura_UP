Algoritmo "calcRaizEquAdratica"
// Construa um algoritmo para calcular as raízes de uma
// equação quadrática (Ax^2 + Bx + C) sendo que os valores A, B e C
// são fornecidos pelo utilizador (considere que a equação possui duas raízes reais). */

// Algoritmo para calcular as raízes de uma equação quadrática
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

      escreval("A primeira raiz é: ", raiz1)
      escreval("A segunda raiz é: ", raiz2)
   senao
      escreval("A equação não possui raízes reais.")
   fimse
fimalgoritmo