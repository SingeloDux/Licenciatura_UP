// 5. Desenvolva um programa que calcule o consumo de combustível de um automóvel em uma determinada viagem. O programa deve solicitar as seguintes informações ao utilizador:
// a.       Quantos quilómetros têm a viagem?
// b.      Quantos quilómetros o carro faz por litro?
// c.       Qual o preço do litro do combustível?
// d.      O processamento do programa deve mostrar:
// e.       Quantos litros de combustível serão gastos com a viagem.
// f.       Quanto dinheiro será gasto com combustível.

import java.util.Scanner;

public class Exerc_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA DE CONSUMO DE COMBUSTIVEL ===\n");
        
        // Solicitando as informações ao usuário
        System.out.print("Quantos quilometros tem a viagem? (km): ");
        double distancia = scanner.nextDouble();
        
        System.out.print("Quantos quilometros o carro faz por litro? (km/l): ");
        double kmPorLitro = scanner.nextDouble();
        
        System.out.print("Qual o preco do litro do combustivel? (MT): ");
        double precoLitro = scanner.nextDouble();
        
        // Cálculos
        double litrosGastos = distancia / kmPorLitro;
        double dinheiroGasto = litrosGastos * precoLitro;
        
        System.out.println("\n=== RESULTADOS DA VIAGEM ===\n");
        System.out.println("INFORMACOES FORNECIDAS:");
        System.out.println("Distancia da viagem: " + distancia + " km");
        System.out.println("Consumo do veiculo: " + kmPorLitro + " km/l");
        System.out.println("Preco do combustivel: " + precoLitro + " MT/litro\n");
        
        System.out.println("RESULTADOS CALCULADOS:");
        System.out.printf("Litros de combustivel gastos: %.2f litros%n", litrosGastos);
        System.out.printf("Dinheiro gasto com combustivel: %.2f MT%n", dinheiroGasto);
        
        scanner.close();
    }
}