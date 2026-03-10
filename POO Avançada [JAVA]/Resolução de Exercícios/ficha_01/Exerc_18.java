// 18.  Crie um programa que mostre a tabuada do 5.
public class Exerc_18 {
    public static void main(String[] args) {
        
        System.out.println("=== TABUADA DO 5 ===\n");
        
        int numero = 5;
        
        System.out.println("Tabuada de multiplicacao do " + numero + ":\n");
        
        for (int i = 1; i <= 12; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        System.out.println("\n=== FIM DA TABUADA ===");
    }
}