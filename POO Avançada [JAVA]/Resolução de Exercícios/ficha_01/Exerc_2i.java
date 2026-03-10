// i. Programa que lê as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
import java.util.Scanner;

public class Exerc_2i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Calculo da Area de um Rectangulo ===\n");
        
        System.out.print("Digite a base do rectangulo (em metros): ");
        double base = scanner.nextDouble();
        
        System.out.print("Digite a altura do rectangulo (em metros): ");
        double altura = scanner.nextDouble();
        
        // Cálculo da área: base × altura
        double area = base * altura;
        
        System.out.println("\n--- Resultado ---");
        System.out.println("Base: " + base + " m");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Area do rectangulo: " + area + " m²");
        
        scanner.close();
    }
}