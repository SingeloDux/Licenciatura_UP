// e.       Efectue a soma de dois números inteiros;

import java.util.Scanner;

public class Exerc_2e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo numero inteiro: ");
        int num2 = scanner.nextInt();
        
        int soma = num1 + num2;
        
        System.out.println("\n--- Resultado da Soma ---");
        System.out.println(num1 + " + " + num2 + " = " + soma);
        
        scanner.close();
    }
}