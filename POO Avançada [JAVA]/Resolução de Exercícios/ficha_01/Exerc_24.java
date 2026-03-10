// 24.  Tem-se um conjunto de dados contendo a altura e o sexo (M ou F) de 15 pessoas. Faça um Programa que calcule e escreva: • a média de altura das mulheres; • número de homens.

import java.util.Scanner;

public class Exerc_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ANALISE DE ALTURAS POR SEXO ===\n");
        System.out.println("Este programa analisa dados de 15 pessoas:\n");
        System.out.println("- Media de altura das mulheres");
        System.out.println("- Numero de homens\n");
        
        int totalHomens = 0;
        int totalMulheres = 0;
        double somaAlturaMulheres = 0;
        
        for (int i = 1; i <= 15; i++) {
            System.out.println("\n--- Pessoa " + i + " ---");
            
            // Ler o sexo com validação
            char sexo;
            do {
                System.out.print("Digite o sexo (M/F): ");
                String entrada = scanner.next().toUpperCase();
                sexo = entrada.charAt(0);
                
                if (sexo != 'M' && sexo != 'F') {
                    System.out.println("Sexo invalido! Digite apenas M ou F.");
                }
            } while (sexo != 'M' && sexo != 'F');
            
            // Ler a altura
            System.out.print("Digite a altura (em metros): ");
            double altura = scanner.nextDouble();
            
            // Processar os dados
            if (sexo == 'M') {
                totalHomens++;
            } else { // sexo == 'F'
                totalMulheres++;
                somaAlturaMulheres += altura;
            }
        }
        
        System.out.println("\n=== RESULTADOS ===\n");
        
        // Calcular e mostrar média das mulheres
        if (totalMulheres > 0) {
            double mediaAlturaMulheres = somaAlturaMulheres / totalMulheres;
            System.out.printf("Media de altura das mulheres: %.2f metros\n", mediaAlturaMulheres);
            System.out.println("Total de mulheres: " + totalMulheres);
        } else {
            System.out.println("Nenhuma mulher foi registrada no conjunto de dados.");
        }
        
        System.out.println("\nNumero de homens: " + totalHomens);
        
        // Estatísticas adicionais
        System.out.println("\n--- Estatisticas Gerais ---");
        System.out.println("Total de pessoas analisadas: 15");
        System.out.printf("Percentual de homens: %.1f%%\n", (totalHomens * 100.0 / 15));
        System.out.printf("Percentual de mulheres: %.1f%%\n", (totalMulheres * 100.0 / 15));
        
        scanner.close();
    }
}