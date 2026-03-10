// Escreva um programa leia o salário de um empregado e imprima o desconto do INSS de 30%.
import java.util.Scanner;

public class Exerc_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULO DE DESCONTO DO INSS ===\n");
        
        System.out.print("Digite o salario do empregado (MT): ");
        double salario = scanner.nextDouble();
        
        // Calculando o desconto do INSS (30%)
        double descontoINSS = salario * 0.30;
        
        // Calculando o salario com desconto
        double salarioLiquido = salario - descontoINSS;
        
        System.out.println("\n=== RESULTADOS ===\n");
        System.out.printf("Salario Bruto: %.2f MT%n", salario);
        System.out.printf("Desconto INSS (30%%): %.2f MT%n", descontoINSS);
        System.out.printf("Salario Liquido: %.2f MT%n", salarioLiquido);
        
        scanner.close();
    }
}