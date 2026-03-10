//  14.  Determine o salário bruto e Liquido de cada funcionário de uma Escola tendo em conta que o,          os Engenherosauferem10.900 Mt/h, Doutores 15.400 Mt/h e Técnico 5.000 Mt/h. O programa devera solicitar as horas de trabalho.

import java.util.Scanner;

public class Exerc_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULO SALARIAL - FUNCIONARIOS DA ESCOLA ===\n");
        
        System.out.println("Categorias de funcionarios e valores por hora:");
        System.out.println("1 - Engenheiro   - 10.900,00 MT/h");
        System.out.println("2 - Doutor       - 15.400,00 MT/h");
        System.out.println("3 - Tecnico      - 5.000,00 MT/h\n");
        
        System.out.print("Digite o numero da categoria do funcionario (1-3): ");
        int categoria = scanner.nextInt();
        
        System.out.print("Digite o numero de horas trabalhadas: ");
        double horas = scanner.nextDouble();
        
        double valorHora = 0;
        String nomeCategoria = "";
        
        // Definir o valor por hora com base na categoria
        switch (categoria) {
            case 1:
                valorHora = 10900.00;
                nomeCategoria = "Engenheiro";
                break;
            case 2:
                valorHora = 15400.00;
                nomeCategoria = "Doutor";
                break;
            case 3:
                valorHora = 5000.00;
                nomeCategoria = "Tecnico";
                break;
            default:
                System.out.println("\nCATEGORIA INVALIDA!");
                System.out.println("Digite um numero entre 1 e 3.");
                scanner.close();
                return;
        }
        
        // Calcular salarios
        double salarioBruto = valorHora * horas;
        
        // Descontos (exemplo: INSS 30% como no exercício 6)
        double descontoINSS = salarioBruto * 0.30;
        double salarioLiquido = salarioBruto - descontoINSS;
        
        System.out.println("\n=== DEMONSTRATIVO SALARIAL ===\n");
        System.out.println("Categoria: " + nomeCategoria);
        System.out.println("Valor por hora: " + String.format("%,.2f", valorHora) + " MT");
        System.out.println("Horas trabalhadas: " + horas + " horas\n");
        
        System.out.println("Salario Bruto: " + String.format("%,.2f", salarioBruto) + " MT");
        System.out.println("Desconto INSS (30%): " + String.format("%,.2f", descontoINSS) + " MT");
        System.out.println("SALARIO LIQUIDO: " + String.format("%,.2f", salarioLiquido) + " MT");
        
        scanner.close();
    }
}