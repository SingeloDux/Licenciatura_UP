Algoritmo "EXERC005_Tipo_Do_Triangulo"
// 5. Dados 3 (três) valores A, B e C, verifique se eles podem ser os
// comprimentos dos lados de um triângulo e, se forem, verifique se é um
// triângulo equilátero, isósceles ou escaleno. Se eles não formarem um
// triângulo, escreva uma mensagem. Considere que: O comprimento de cada lado
// de um triângulo é menor do que a soma dos outros dois lados;
// - Chama-se equilátero o triângulo que tem três lados iguais
// - ...isósceles o triângulo que tem o comprimento de dois lados iguais
// Recebe-se o nome de escaleno o triângulo que tem os três lados diferentes.

// Algoritmo para verificar se três valores formam um triângulo e determinar o tipo de triângulo
var
   A, B, C: real

inicio
   // Entrada de dados
   escreva("Digite o valor do lado A: ")
   leia(A)
   escreva("Digite o valor do lado B: ")
   leia(B)
   escreva("Digite o valor do lado C: ")
   leia(C)

   // Verificação se os valores formam um triângulo
   se (A < B + C) e (B < A + C) e (C < A + B) entao
      // Verificação do tipo de triângulo
      se (A = B) e (B = C) entao
         escreval("Os valores formam um triângulo equilátero.")
      senao
         se (A = B) ou (B = C) ou (A = C) entao
            escreval("Os valores formam um triângulo isósceles.")
         senao
            escreval("Os valores formam um triângulo escaleno.")
         fimse
      fimse
   senao
      // Se não formarem um triângulo
      escreval("Os valores não formam um triângulo.")
   fimse

fimalgoritmo