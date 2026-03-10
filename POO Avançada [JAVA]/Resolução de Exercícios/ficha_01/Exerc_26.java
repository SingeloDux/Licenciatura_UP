// 26.	 Escreva um programa que receba a idade de 10 pessoas, calcule e imprima a quantidade de pessoas maiores de idade (idade >= 18 anos).
import java.util.Scanner;

public class Exerc_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== VERIFICACAO DE MAIORIDADE ===\n");
        System.out.println("Este programa recebe a idade de 10 pessoas");
        System.out.println("e calcula quantas sao maiores de idade (>= 18 anos).\n");
        
        int maioresIdade = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            
            if (idade >= 18) {
                maioresIdade++;
            }
        }
        
        System.out.println("\n=== RESULTADO ===\n");
        System.out.println("Total de pessoas analisadas: 10");
        System.out.println("Quantidade de pessoas maiores de idade: " + maioresIdade);
        System.out.println("Quantidade de pessoas menores de idade: " + (10 - maioresIdade));
        
        scanner.close();
    }
}