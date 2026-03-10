// 11.  Em uma loja de CD´s existem apenas quatro tipos de preços que estão associados a cores. 
// Assim os CD´s que ficam na loja não são marcados por preços mas sim por cores.
// a. Desenvolva o algoritmo que a partir da entrada da cor o software mostre o preço. 
// A loja está atualmente com a seguinte tabela de preços.
// Cor Preço
// Verde 10,00
// Azul 20,00
// Amarelo 30,00
// Vermelho 40,00

import java.util.Scanner;

public class Exerc_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== LOJA DE CD'S - TABELA DE PRECOS POR COR ===\n");
        
        System.out.println("Opcoes disponiveis:");
        System.out.println("1 - Verde ");
        System.out.println("2 - Azul ");
        System.out.println("3 - Amarelo");
        System.out.println("4 - Vermelho\n");
        
        System.out.print("Digite o numero da cor desejada (1-4): ");
        int opcao = scanner.nextInt();
        
        System.out.println("\n=== RESULTADO ===\n");
        
        // Verificar a opção e mostrar a cor e preço correspondentes
        switch (opcao) {
            case 1:
                System.out.println("Cor selecionada: Verde");
                System.out.println("Preco: 10,00 MT");
                break;
                
            case 2:
                System.out.println("Cor selecionada: Azul");
                System.out.println("Preco: 20,00 MT");
                break;
                
            case 3:
                System.out.println("Cor selecionada: Amarelo");
                System.out.println("Preco: 30,00 MT");
                break;
                
            case 4:
                System.out.println("Cor selecionada: Vermelho");
                System.out.println("Preco: 40,00 MT");
                break;
                
            default:
                System.out.println("OPCAO INVALIDA!");
                System.out.println("Digite um numero entre 1 e 4.");
        }
        
        scanner.close();
    }
}