// 3.      Faça um programa que ajude os turistas, onde seja informada a temperatura em Fahrenheit e seja mostrada a temperatura em graus centígrados. Formula: C =5* (°F - 32)/9.

import java.util.Scanner;

public class Exerc_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Conversor de Temperatura ===\n");
        System.out.println("Este programa converte Fahrenheit para Celsius");
        System.out.println("Formula: C = 5 * (°F - 32) / 9\n");
        
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // Conversão de Fahrenheit para Celsius
        double celsius = 5 * (fahrenheit - 32) / 9;
        
        System.out.println("\n--- Resultado da Conversao ---");
        System.out.printf("%.1f graus Fahrenheit equivale a %.1f graus Celsius%n", fahrenheit, celsius);
        
        scanner.close();
    }
}