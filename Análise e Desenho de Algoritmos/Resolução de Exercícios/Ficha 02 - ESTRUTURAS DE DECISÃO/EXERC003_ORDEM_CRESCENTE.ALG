Algoritmo "EXERC003_Ordem_Crescente"
// 3. Crie 2 variáveis (A e B) e leia 1 valor para cada um deles.
// Disponibilize eles de forma crescente.

// Algoritmo para ler dois valores e mostrar em ordem crescente
var
   A, B: real

inicio
   // Entrada de dados
   escreva("Digite o valor de A: ")
   leia(A)
   escreva("Digite o valor de B: ")
   leia(B)

   // Verificação e exibição em ordem crescente
   se (A < B) entao
      escreval("Valores em ordem crescente: ", A:0:2, ",", B:0:2)
   senao
      escreval("Valores em ordem crescente: ", B:0:2, ",", A:0:2)
   fimse
fimalgoritmo
