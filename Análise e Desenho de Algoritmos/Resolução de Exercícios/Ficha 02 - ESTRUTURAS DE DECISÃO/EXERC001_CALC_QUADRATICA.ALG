Algoritmo "EXERC001_Calc_Quadratica"

// Algoritmo para calcular as ra�zes de uma equa��o do segundo grau
// 1. Construa um algoritmo para calcular as ra�zes de uma equa��o
// do segundo grau, na forma(Ax^2 + Bx + C), sendo que os valores
// A, B e C s�o fornecidos pelo utilizador, levando em considera��o
// a exist�ncia de ra�zes reais.
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

   // Verifica��o da exist�ncia de ra�zes reais
   se (delta < 0) entao
      escreval("A equa��o n�o possui ra�zes reais.")
   senao
      // C�lculo das ra�zes
      x1 := (-B + raizq(delta)) / (2 * A)
      x2 := (-B - raizq(delta)) / (2 * A)

      // Sa�da dos resultados
      escreval("As ra�zes da equa��o s�o: ")
      escreval("x1 = ", x1:0:2)
      escreval("x2 = ", x2:0:2)
   fimse
fimalgoritmo
