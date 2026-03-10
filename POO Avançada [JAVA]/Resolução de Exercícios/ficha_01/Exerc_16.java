//           16.  Crie um programa que efectue a contagem de 0 a 100.

public class Exerc_16 {
    public static void main(String[] args) {
        
        System.out.println("=== CONTAGEM DE 0 A 100 ===\n");
        
        // Contagem crescente de 0 a 100
        System.out.println("Contagem crescente:");
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
            
            // Para melhor formatação, quebra a linha a cada 20 números
            if (i % 20 == 0 && i > 0) {
                System.out.println();
            }
        }
        
        System.out.println("\n\n=== FIM DA CONTAGEM ===");
    }
}