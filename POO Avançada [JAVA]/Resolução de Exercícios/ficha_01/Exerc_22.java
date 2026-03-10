// 22 Faça um programa que leia o nome e a três notas de uma disciplina de um aluno e ao final escreva o nome do aluno, sua média e se ele foi aprovado a média é 8.
import java.util.Scanner;

public class Exerc_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE NOTAS ESCOLAR ===\n");
        
        // Ler o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        // Ler as três notas
        System.out.println("\nDigite as tres notas do aluno (0-10):");
        
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();
        
        // Calcular a média
        double media = (nota1 + nota2 + nota3) / 3;
        
        // Determinar se foi aprovado (média >= 8)
        boolean aprovado = media >= 8;
        
        System.out.println("\n=== RESULTADO FINAL ===\n");
        System.out.println("Nome do aluno: " + nome);
        System.out.printf("Nota 1: %.1f%n", nota1);
        System.out.printf("Nota 2: %.1f%n", nota2);
        System.out.printf("Nota 3: %.1f%n", nota3);
        System.out.printf("Media final: %.2f%n", media);
        
        System.out.println("\n=== SITUACAO ===");
        if (aprovado) {
            System.out.println("APROVADO! Parabens!");
        } else {
            System.out.println("REPROVADO! Estude mais na proxima.");
        }
        
        scanner.close();
    }
}