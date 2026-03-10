// h.      Programa que que lê a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressão apenas em dias.

import java.util.Scanner;

public class Exerc_2h {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Conversão de Idade para Dias ===\n");

        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();

        // Considerando:
        // 1 ano = 365 dias
        // 1 mês = 30 dias (aproximação)
        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("\n--- Resultado ---");
        System.out.println("Idade informada: " + anos + " anos, " + meses + " meses e " + dias + " dias");
        System.out.println("Total em dias: " + totalDias + " dias");

        // Opcional: Mostrar o cálculo
        System.out.println("\n--- Cálculo ---");
        System.out.println(anos + " anos = " + (anos * 365) + " dias");
        System.out.println(meses + " meses = " + (meses * 30) + " dias");
        System.out.println("Dias = " + dias + " dias");
        System.out.println("Total = " + (anos * 365) + " + " + (meses * 30) + " + " + dias + " = " + totalDias + " dias");

        scanner.close();
    }
}
