// 25. Fazer um programa que calcule a média aritmética de n números digitados pelo teclado. Até que o usuário informe o valor zero.

import java.util.Scanner;

public class Exerc_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULO DE MEDIA ARITMETICA ===\n");
        System.out.println("Digite varios numeros para calcular a media.");
        System.out.println("Para encerrar e calcular a media, digite 0.\n");
        
        double soma = 0;
        int contador = 0;
        double numero;
        
        // Loop para ler números até que o usuário digite 0
        do {
            System.out.print("Digite um numero (0 para sair): ");
            numero = scanner.nextDouble();
            
            if (numero != 0) {
                soma += numero;
                contador++;
                System.out.println("Numero adicionado. Total parcial: " + soma);
            }
            
        } while (numero != 0);
        
        System.out.println("\n=== RESULTADO FINAL ===\n");
        
        // Verificar se pelo menos um número foi digitado
        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Quantidade de numeros digitados: " + contador);
            System.out.println("Soma total: " + soma);
            System.out.printf("Media aritmetica: %.2f\n", media);
        } else {
            System.out.println("Nenhum numero foi digitado alem do zero.");
            System.out.println("Nao e possivel calcular a media.");
        }
        
        scanner.close();
    }
}