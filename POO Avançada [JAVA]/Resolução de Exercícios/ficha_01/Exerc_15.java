//           15.  Faça um programa que leia 3 números inteiros e imprima o menor deles.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exerc_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ENCONTRAR O MENOR ENTRE 3 NUMEROS INTEIROS ===\n");
        System.out.println("(Apenas numeros inteiros sao permitidos)\n");
        
        int num1 = lerInteiro(scanner, "Digite o primeiro numero inteiro: ");
        int num2 = lerInteiro(scanner, "Digite o segundo numero inteiro: ");
        int num3 = lerInteiro(scanner, "Digite o terceiro numero inteiro: ");
        
        // Encontrar o menor número
        int menor = num1; // Assumimos inicialmente que o primeiro é o menor
        
        if (num2 < menor) {
            menor = num2;
        }
        
        if (num3 < menor) {
            menor = num3;
        }
        
        System.out.println("\n=== RESULTADO ===\n");
        System.out.println("Numeros digitados:");
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Numero 3: " + num3);
        System.out.println("\nO menor numero e: " + menor);
        
        scanner.close();
    }
    
    // Método para ler apenas números inteiros com validação
    public static int lerInteiro(Scanner scanner, String mensagem) {
        int numero = 0;
        boolean valido = false;
        
        while (!valido) {
            try {
                System.out.print(mensagem);
                numero = scanner.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Digite apenas numeros inteiros!\n");
                scanner.nextLine(); // Limpar o buffer do scanner
            }
        }
        
        return numero;
    }
}