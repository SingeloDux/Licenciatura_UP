// Registe 6 temperaturas ocorridas diariamente numa localidade e que calcule a média dessas               temperaturas. O programa também deve indicar quais as temperaturas que tiveram valores acima         da média.

import java.util.Scanner;

public class Exerc_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== REGISTO DE TEMPERATURAS DIARIAS ===\n");
        System.out.println("Este programa registra 6 temperaturas e calcula: edia das temperaturas e Quais temperaturas ficaram acima da media\n");
        
        double[] temperaturas = new double[6];
        double soma = 0;
        
        // Registar as 6 temperaturas
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite a temperatura do dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }
        
        // Calcular a média
        double media = soma / 6;
        
        // Exibir resultados
        System.out.println("\n=== RESULTADOS ===\n");
        
        System.out.println("Temperaturas registadas:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Dia " + (i + 1) + ": " + temperaturas[i] + "°C");
        }
        
        System.out.printf("\nMedia das temperaturas: %.2f°C\n", media);
        
        // Verificar quais temperaturas estão acima da média
        System.out.println("\nTemperaturas ACIMA da media:");
        boolean encontrouAcima = false;
        
        for (int i = 0; i < 6; i++) {
            if (temperaturas[i] > media) {
                System.out.println("Dia " + (i + 1) + ": " + temperaturas[i] + "°C");
                encontrouAcima = true;
            }
        }
        
        if (!encontrouAcima) {
            System.out.println("Nenhuma temperatura acima da media registada.");
        }
        
        scanner.close();
    }
}