// 2d.      Leia dois números e calcule a soma e o produto entre eles, e a subtracção e a divisão do primeiro valor com o segundo. Escreva o resultado na tela.

import java.util.Scanner;

public class Exerc_2d {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;
        double produto = num1 * num2;
        double subtracao = num1 - num2;

        System.out.println("\n--- Resultados ---");
        System.out.println("Soma: " + num1 + " + " + num2 + " = " + soma);
        System.out.println("Produto: " + num1 + " * " + num2 + " = " + produto);
        System.out.println("Subtracao: " + num1 + " - " + num2 + " = " + subtracao);

        // Verificação para evitar divisão por zero
        if (num2 != 0) {
            double divisao = num1 / num2;
            System.out.println("Divisao: " + num1 + " / " + num2 + " = " + divisao);
        } else {
            System.out.println("Divisao: Nao eh possivel dividir por zero!");
        }

        scanner.close();
    }
}
