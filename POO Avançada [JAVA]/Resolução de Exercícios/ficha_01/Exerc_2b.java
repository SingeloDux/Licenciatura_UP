// b.      Programa que lê o seu nome completo, morada, telefone e exibe na tela do monitor;

import java.util.Scanner;

public class Exerc_2b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua morada: ");
        String morada = scanner.nextLine();

        System.out.print("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("\n--- Informações Pessoais ---");
        System.out.println("Nome: " + nome);
        System.out.println("Morada: " + morada);
        System.out.println("Telefone: " + telefone);

        scanner.close();
    }
}
