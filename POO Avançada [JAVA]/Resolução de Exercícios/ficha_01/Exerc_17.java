//           17.  Leia três valores numéricos e escreva-os em ordem crescente.

import java.util.Scanner;

public class Exerc_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ORDENAR 3 NUMEROS EM ORDEM CRESCENTE ===\n");
        
        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro numero: ");
        double num3 = scanner.nextDouble();
        
        // Encontrar a ordem crescente
        double menor, medio, maior;
        
        // Encontrar o menor
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
                maior = num3;
            } else {
                medio = num3;
                maior = num2;
            }
        } 
        else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
                maior = num3;
            } else {
                medio = num3;
                maior = num1;
            }
        } 
        else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
                maior = num2;
            } else {
                medio = num2;
                maior = num1;
            }
        }
        
        System.out.println("\n=== RESULTADO ===\n");
        System.out.println("Numeros digitados: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Ordem crescente: " + menor + ", " + medio + ", " + maior);
        
        scanner.close();
    }
}