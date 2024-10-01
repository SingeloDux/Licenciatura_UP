Algoritmo "Conversor de temperatura"
// Algoritmo para converter temperatura de Fahrenheit para Celsius
var
   fahrenheit, celsius: real

inicio
   // Entrada de dados
   escreva("Digite a temperatura em graus Fahrenheit: ")
   leia(fahrenheit)

   // Cálculo da conversão para Celsius
   celsius := (fahrenheit - 32) / (9 / 5)

   // Saída do resultado
   escreval("A temperatura em graus Celsius é: ", celsius:0:2)
fimalgoritmo