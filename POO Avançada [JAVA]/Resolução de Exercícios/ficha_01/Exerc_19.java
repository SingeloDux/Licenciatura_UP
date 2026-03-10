// 19.  Leia um valor numérico n e escreva o valor da soma dos n termos, onde cada termo e dado pela fórmula:(1/n)2*n >= 0.

import java.util.Scanner;

public class Exerc_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SOMA DOS N TERMOS (1/k) ===\n");
        
        System.out.print("Digite o valor de n (numero de termos): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Erro: n deve ser maior que zero.");
        } else {
            double soma = 0.0;
            
            for (int k = 1; k <= n; k++) {
                double termo = 1.0 / k;  // cada termo e 1/k
                soma += termo;
            }
            
            System.out.println("\n=== RESULTADO ===\n");
            System.out.println("Numero de termos (n): " + n);
            System.out.println("Soma dos " + n + " primeiros termos da serie 1/k: " + soma);
        }
        
        scanner.close();
    }
}