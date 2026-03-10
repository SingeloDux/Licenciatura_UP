// 8. Leia três valores numéricos e escreva o maior valor.

import java.util.Scanner;

public class Exerc_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== MAIOR DE TRES VALORES ===\n");
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();
        
        System.out.println("\n=== RESULTADO ===\n");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
        System.out.println("Valor 3: " + valor3);
        
        // Encontrando o maior valor
        double maior = valor1; // Assumimos inicialmente que o primeiro e o maior
        
        if (valor2 > maior) {
            maior = valor2;
        }
        
        if (valor3 > maior) {
            maior = valor3;
        }
        
        System.out.println("O maior valor e: " + maior);
        
        scanner.close();
    }
}