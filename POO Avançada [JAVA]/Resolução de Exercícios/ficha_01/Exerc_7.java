// 7.      Leia dois valores numéricos e escreva o menor valor.

import java.util.Scanner;

public class Exerc_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== MENOR DE DOIS VALORES ===\n");
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        System.out.println("\n=== RESULTADO ===\n");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
        
        // Encontrando o menor valor
        if (valor1 < valor2) {
            System.out.println("O menor valor e: " + valor1);
        } else if (valor2 < valor1) {
            System.out.println("O menor valor e: " + valor2);
        } else {
            System.out.println("Os dois valores sao iguais: " + valor1);
        }
        
        scanner.close();
    }
}