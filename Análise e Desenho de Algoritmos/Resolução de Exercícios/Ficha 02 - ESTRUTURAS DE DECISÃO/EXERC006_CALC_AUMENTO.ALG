Algoritmo "EXERC006_Calc_Aumento"
// 6. Usando seleção encadeada e escolha múltipla, crie um algoritmo que
// receba o código correspondente ao cargo de um funcionário e seu salário
// actual e mostre o cargo, o valor do aumento e seu novo salário. Os cargos
// estão na tabela abaixo:
// CÓDIGO CARGO           PERCENTAGEM
// 1      Escriturário    50%
// 2      Secretário      35%
// 3      Caixa           20%
// 4      Gestor          10%
// 5      Director        Não tem aumento

// Algoritmo para calcular o aumento de salário com base no cargo
var
   codigo: inteiro
   salario_atual, aumento, novo_salario: real

inicio
   escreva("Digite o código do cargo (1-5): ")
   leia(codigo)
   escreva("Digite o salário atual: ")
   leia(salario_atual)

   escolha codigo
      caso 1
         aumento := salario_atual * 0.50
         novo_salario := salario_atual + aumento
         escreval("Cargo: Escriturário")
      caso 2
         aumento := salario_atual * 0.35
         novo_salario := salario_atual + aumento
         escreval("Cargo: Secretário")
      caso 3
         aumento := salario_atual * 0.20
         novo_salario := salario_atual + aumento
         escreval("Cargo: Caixa")
      caso 4
         aumento := salario_atual * 0.10
         novo_salario := salario_atual + aumento
         escreval("Cargo: Gestor")
      caso 5
         aumento := 0
         novo_salario := salario_atual
         escreval("Cargo: Director (sem aumento)")
      outrocaso
         escreval("Código inválido!")
         interrompa
   fimescolha

   se (codigo >= 1) e (codigo <= 5) entao
      escreval("Valor do aumento: ", aumento:0:2)
      escreval("Novo salário: ", novo_salario:0:2)
   fimse

fimalgoritmo