// 9.  Dada a nota de um aluno, entre 0.0 e 20.0, indique se está Aprovado (nota ≥ 9.5), Reprovado (nota < 7.5), ou para Exame (7.5 ≥ nota > 9.5); valide os casos fora de limites;

import java.util.Scanner;

public class Exerc_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE AVALIACAO ESCOLAR ===\n");
        System.out.println("Nota minima = 0, Nota maxima = 20 \n");
        
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        
        System.out.println("\n=== RESULTADO ===\n");
        System.out.println("Nota digitada: " + nota);
        
        // Validar se a nota esta dentro dos limites
        if (nota < 0.0 || nota > 20.0) {
            System.out.println("ERRO: Nota invalida!");
            System.out.println("A nota deve estar entre 0.0 e 20.0");
        } else {
            // Classificar o aluno
            if (nota >= 9.5) {
                System.out.println("SITUACAO: APROVADO");
            } else if (nota >= 7.5) {
                System.out.println("SITUACAO: EXAME");
            } else {
                System.out.println("SITUACAO: REPROVADO");
            }
        }
        
        scanner.close();
    }
}