// f.       Divisão de dois números;

import java.util.Scanner;

public class Exerc_2f {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero (dividendo): ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero (divisor): ");
        double num2 = scanner.nextDouble();

        System.out.println("\n--- Resultado da Divisão ---");

        // Verificação para evitar divisão por zero
        if (num2 != 0) {
            double divisao = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + divisao);
        } else {
            System.out.println("ERRO: Nao eh possivel dividir por zero!");
        }

        scanner.close();
    }
}
