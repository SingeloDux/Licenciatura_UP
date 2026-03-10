// 20.  Fazer um programa que leia um conjunto de 10 notas de alunos de uma disciplina, armazene-as na variável nota e determine a maior delas.

import java.util.Scanner;

public class Exerc_20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ENCONTRAR A MAIOR NOTA ENTRE 10 ALUNOS ===\n");

        double nota;
        double maiorNota = -1; // Inicializa com valor abaixo do mínimo possível

        for (int i = 1; i <= 10; i++) {
            do {
                System.out.print("Digite a nota do " + i + "o aluno: ");
                nota = scanner.nextDouble();

                if (nota < 0 || nota > 20) {
                    System.out.println("Nota invalida! Digite um valor entre 0 e 20.\n");
                }
            } while (nota < 0 || nota > 20);

            if (nota > maiorNota) {
                maiorNota = nota;
            }
        }

        System.out.println("\n=== RESULTADO ===\n");
        System.out.println("A maior nota entre os 10 alunos e: " + maiorNota);

        scanner.close();
    }
}
