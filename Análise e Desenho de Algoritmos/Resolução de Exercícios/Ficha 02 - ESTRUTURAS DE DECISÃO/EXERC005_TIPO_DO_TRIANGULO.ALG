Algoritmo "EXERC005_Tipo_Do_Triangulo"
// 5. Dados 3 (tr�s) valores A, B e C, verifique se eles podem ser os
// comprimentos dos lados de um tri�ngulo e, se forem, verifique se � um
// tri�ngulo equil�tero, is�sceles ou escaleno. Se eles n�o formarem um
// tri�ngulo, escreva uma mensagem. Considere que: O comprimento de cada lado
// de um tri�ngulo � menor do que a soma dos outros dois lados;
// - Chama-se equil�tero o tri�ngulo que tem tr�s lados iguais
// - ...is�sceles o tri�ngulo que tem o comprimento de dois lados iguais
// Recebe-se o nome de escaleno o tri�ngulo que tem os tr�s lados diferentes.

// Algoritmo para verificar se tr�s valores formam um tri�ngulo e determinar o tipo de tri�ngulo
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

   // Verifica��o se os valores formam um tri�ngulo
   se (A < B + C) e (B < A + C) e (C < A + B) entao
      // Verifica��o do tipo de tri�ngulo
      se (A = B) e (B = C) entao
         escreval("Os valores formam um tri�ngulo equil�tero.")
      senao
         se (A = B) ou (B = C) ou (A = C) entao
            escreval("Os valores formam um tri�ngulo is�sceles.")
         senao
            escreval("Os valores formam um tri�ngulo escaleno.")
         fimse
      fimse
   senao
      // Se n�o formarem um tri�ngulo
      escreval("Os valores n�o formam um tri�ngulo.")
   fimse

fimalgoritmo