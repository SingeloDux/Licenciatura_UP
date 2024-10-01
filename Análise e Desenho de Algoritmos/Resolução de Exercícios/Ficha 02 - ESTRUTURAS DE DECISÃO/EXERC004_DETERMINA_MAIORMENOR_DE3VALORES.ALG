Algoritmo "EXERC004_Determina_MaiorMenor_De3Valores"
// 4. Fazer um algoritmo que análise 3 valores inteiros
// (através das variáveis n1, n2 e n3), e informa qual o maior e
// qual o menor deles.

// Algoritmo para encontrar o maior e o menor de três números inteiros
var
   n1, n2, n3, maior, menor: inteiro

inicio
   escreva("Digite o valor de n1: ")
   leia(n1)
   escreva("Digite o valor de n2: ")
   leia(n2)
   escreva("Digite o valor de n3: ")
   leia(n3)

   maior := n1
   se (n2 > maior) entao
      maior := n2
   fimse
   se (n3 > maior) entao
      maior := n3
   fimse

   menor := n1
   se (n2 < menor) entao
      menor := n2
   fimse
   se (n3 < menor) entao
      menor := n3
   fimse

   escreval("O maior valor é: ", maior)
   escreval("O menor valor é: ", menor)
fimalgoritmo