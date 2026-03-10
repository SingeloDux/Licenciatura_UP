// 23. Desenvolver um programa que efectue a soma de todos os números ímpares e que se encontram no conjunto dos números de 1 até 500.

public class Exerc_23 {
    public static void main(String[] args) {
        
        System.out.println("=== SOMA DOS NUMEROS IMPARES DE 1 A 500 ===\n");
        
        int soma = 0;
        int i = 1;
        
        while (i <= 500) {
            if (i % 2 != 0) {
                soma += i;
            }
            i++;
        }
        
        System.out.println("Soma de todos os numeros impares de 1 a 500: " + soma);
    }
}