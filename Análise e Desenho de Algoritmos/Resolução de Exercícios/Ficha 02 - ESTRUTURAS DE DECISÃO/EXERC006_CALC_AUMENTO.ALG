Algoritmo "EXERC006_Calc_Aumento"
// 6. Usando sele��o encadeada e escolha m�ltipla, crie um algoritmo que
// receba o c�digo correspondente ao cargo de um funcion�rio e seu sal�rio
// actual e mostre o cargo, o valor do aumento e seu novo sal�rio. Os cargos
// est�o na tabela abaixo:
// C�DIGO CARGO           PERCENTAGEM
// 1      Escritur�rio    50%
// 2      Secret�rio      35%
// 3      Caixa           20%
// 4      Gestor          10%
// 5      Director        N�o tem aumento

// Algoritmo para calcular o aumento de sal�rio com base no cargo
var
   codigo: inteiro
   salario_atual, aumento, novo_salario: real

inicio
   escreva("Digite o c�digo do cargo (1-5): ")
   leia(codigo)
   escreva("Digite o sal�rio atual: ")
   leia(salario_atual)

   escolha codigo
      caso 1
         aumento := salario_atual * 0.50
         novo_salario := salario_atual + aumento
         escreval("Cargo: Escritur�rio")
      caso 2
         aumento := salario_atual * 0.35
         novo_salario := salario_atual + aumento
         escreval("Cargo: Secret�rio")
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
         escreval("C�digo inv�lido!")
         interrompa
   fimescolha

   se (codigo >= 1) e (codigo <= 5) entao
      escreval("Valor do aumento: ", aumento:0:2)
      escreval("Novo sal�rio: ", novo_salario:0:2)
   fimse

fimalgoritmo