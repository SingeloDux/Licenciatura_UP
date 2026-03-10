//12. Desenvolva um programa capaz e encontrar o maior dentre 4 números inteiros quaisquer dados pelo teclado.

import java.util.Scanner;

public class Exerc_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ENCONTRAR O MAIOR ENTRE 4 NUMEROS ===\n");
        
        System.out.print("Digite o primeiro numero inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo numero inteiro: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro numero inteiro: ");
        int num3 = scanner.nextInt();
        
        System.out.print("Digite o quarto numero inteiro: ");
        int num4 = scanner.nextInt();
        
        // Encontrar o maior número
        int maior = num1; // Assumimos inicialmente que o primeiro é o maior
        
        if (num2 > maior) {
            maior = num2;
        }
        
        if (num3 > maior) {
            maior = num3;
        }
        
        if (num4 > maior) {
            maior = num4;
        }
        
        System.out.println("\n=== RESULTADO ===\n");
        System.out.println("Numeros digitados:");
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Numero 3: " + num3);
        System.out.println("Numero 4: " + num4);
        System.out.println("\nO maior numero e: " + maior);
        
        scanner.close();
    }
}