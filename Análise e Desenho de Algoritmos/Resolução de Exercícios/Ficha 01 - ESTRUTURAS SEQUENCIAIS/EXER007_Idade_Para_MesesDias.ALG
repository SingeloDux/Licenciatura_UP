Algoritmo "Conversor de idade anos em dias"

// Algoritmo para converter a idade em anos, meses e dias para dias
var
   anos, meses, dias, idadeEmDias: inteiro

inicio
   // Entrada de dados
   escreva("Digite a idade em anos: ")
   leia(anos)
   escreva("Digite a quantidade de meses adicionais: ")
   leia(meses)
   escreva("Digite a quantidade de dias adicionais: ")
   leia(dias)

   // Cálculo da idade total em dias
   idadeEmDias := (anos * 365) + (meses * 30) + dias

   // Saída do resultado
   escreval("A idade total em dias é: ", idadeEmDias)
fimalgoritmo
