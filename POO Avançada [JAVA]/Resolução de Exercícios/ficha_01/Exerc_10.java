// 10.	 Em uma escola, a média final é dada pela média aritmética de três notas. E a mesma tem o seguinte esquema de avaliação.
// Media Situação do aluno
// 0 – 4.9 Recuperação
// 5 – 6.9 Admitido/prova final
// 7 – 10 Dispensado
// a.	Desenvolva um programa que a partir da entrada das três notas mostre a situação do aluno.

import java.util.Scanner;

public class Exerc_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE AVALIACAO ESCOLAR ===\n");
        System.out.println("Este programa calcula a media final do aluno\n");
        
        // Entrada das três notas
        System.out.print("Digite a primeira nota (0-10): ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota (0-10): ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota (0-10): ");
        double nota3 = scanner.nextDouble();
        
        // Calcular a média aritmética
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("\n=== RESULTADOS ===\n");
        System.out.printf("Nota 1: %.1f%n", nota1);
        System.out.printf("Nota 2: %.1f%n", nota2);
        System.out.printf("Nota 3: %.1f%n", nota3);
        System.out.printf("Media Final: %.1f%n", media);
        
        // Determinar a situação do aluno com base na média
        System.out.println("\n=== SITUACAO DO ALUNO ===\n");
        
        if (media >= 0 && media < 5) {
            System.out.println("Media: " + String.format("%.1f", media));
            System.out.println("Situacao: RECUPERACAO");
            System.out.println("O aluno necessita fazer recuperacao.");
        } else if (media >= 5 && media < 7) {
            System.out.println("Media: " + String.format("%.1f", media));
            System.out.println("Situacao: ADMITIDO / PROVA FINAL");
            System.out.println("O aluno devera fazer prova final.");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Media: " + String.format("%.1f", media));
            System.out.println("Situacao: DISPENSADO");
            System.out.println("Parabens! O aluno esta aprovado e dispensado da prova final.");
        } else {
            System.out.println("ERRO: Notas invalidas!");
            System.out.println("As notas devem estar entre 0 e 10.");
        }
        
        scanner.close();
    }
}