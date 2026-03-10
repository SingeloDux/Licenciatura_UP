// 27.	 Escreva um programa que leia vários números inteiros ate que seja informado o numero 0. Se o número lido for positivo, escreva uma mensagem indicando se ele é par ou ímpar. Se o número for negativo, escreva a seguinte mensagem “Este número não é positivo”. (use a função mod deve ser "x mod y" e retorna o resto da divisão de x por y).

import java.util.Scanner;

public class Exerc_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ANALISE DE NUMEROS INTEIROS ===\n");
        System.out.println("Digite varios numeros inteiros.");
        System.out.println("Para encerrar o programa, digite 0.\n");
        
        int numero;
        
        do {
            System.out.print("Digite um numero inteiro (0 para sair): ");
            numero = scanner.nextInt();
            
            if (numero == 0) {
                System.out.println("\nPrograma encerrado pelo usuario.");
                break;
            }
            
            // Verificar se o número é positivo
            if (numero > 0) {
                // Usando a função mod (resto da divisão)
                if (numero % 2 == 0) {
                    System.out.println("O numero " + numero + " e POSITIVO e PAR.\n");
                } else {
                    System.out.println("O numero " + numero + " e POSITIVO e IMPAR.\n");
                }
            } else {
                // Número negativo
                System.out.println("Este numero nao e positivo.\n");
            }
            
        } while (true); // Loop infinito, sai com break quando numero == 0
        
        scanner.close();
    }
}