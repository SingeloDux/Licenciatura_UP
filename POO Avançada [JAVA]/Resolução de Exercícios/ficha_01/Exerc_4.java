// 4. Faça um programa que leia dois valores inteiros A e B se os valores forem iguais deverá se somar os dois, caso contrário multiplique A por B ao final do cálculo atribuir o valor para uma variável C.

import java.util.Scanner;

public class Exerc_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.print("Digite o valor de A (inteiro): ");
        int a = scanner.nextInt();
        
        System.out.print("Digite o valor de B (inteiro): ");
        int b = scanner.nextInt();
        
        int c;
        
        // Verifica se os valores são iguais
        if (a == b) {
            c = a + b;  // Se iguais, soma
            System.out.println("\nOs valores sao IGUAIS, portanto foi realizada a SOMA.");
        } else {
            c = a * b;  // Se diferentes, multiplica
            System.out.println("\nOs valores sao DIFERENTES, portanto foi realizada a MULTIPLICACAO.");
        }
        
        System.out.println("\n--- Resultado Final ---");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        
        scanner.close();
    }
}