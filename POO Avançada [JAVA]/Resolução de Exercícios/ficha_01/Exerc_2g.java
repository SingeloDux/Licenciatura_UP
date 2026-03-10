// g.      Calculo da média final dos alunos, tendo em conta que foram realizadas 4 testes;

import java.util.Scanner;

public class Exerc_2g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Calculo da Media Final ===");
        System.out.println("Digite as notas dos 4 testes:\n");
        
        System.out.print("Nota do Teste 1: ");
        double teste1 = scanner.nextDouble();
        
        System.out.print("Nota do Teste 2: ");
        double teste2 = scanner.nextDouble();
        
        System.out.print("Nota do Teste 3: ");
        double teste3 = scanner.nextDouble();
        
        System.out.print("Nota do Teste 4: ");
        double teste4 = scanner.nextDouble();
        
        // Cálculo da média
        double media = (teste1 + teste2 + teste3 + teste4) / 4;
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Notas dos Testes:");
        System.out.println("Teste 1: " + teste1);
        System.out.println("Teste 2: " + teste2);
        System.out.println("Teste 3: " + teste3);
        System.out.println("Teste 4: " + teste4);
        System.out.printf("\nMedia Final: %.2f", media);
        
        scanner.close();
    }
}