Algoritmo "EXERC001_Calc_Quadratica"

// Algoritmo para calcular as raízes de uma equação do segundo grau
// 1. Construa um algoritmo para calcular as raízes de uma equação
// do segundo grau, na forma(Ax^2 + Bx + C), sendo que os valores
// A, B e C são fornecidos pelo utilizador, levando em consideração
// a existência de raízes reais.
var
   A, B, C, delta, x1, x2: real

inicio
   escreva("Digite o valor de A: ")
   leia(A)
   escreva("Digite o valor de B: ")
   leia(B)
   escreva("Digite o valor de C: ")
   leia(C)

   delta := (B^2) - (4 * A * C)

   // Verificação da existência de raízes reais
   se (delta < 0) entao
      escreval("A equação não possui raízes reais.")
   senao
      // Cálculo das raízes
      x1 := (-B + raizq(delta)) / (2 * A)
      x2 := (-B - raizq(delta)) / (2 * A)

      // Saída dos resultados
      escreval("As raízes da equação são: ")
      escreval("x1 = ", x1:0:2)
      escreval("x2 = ", x2:0:2)
   fimse
fimalgoritmo
