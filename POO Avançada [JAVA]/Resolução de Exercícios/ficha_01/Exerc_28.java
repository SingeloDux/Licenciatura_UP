// 28.	 Em uma eleição presidencial, existem quatro candidatos. Os votos são informados através de código. Os códigos utilizados são: 1, 2, 3, 4 votos para os respectivos candidatos; 5 voto nulo; 6 voto em branco. Escreva um Programa que calcule e imprima:
// •	total de votos para cada candidato;
// •	total de votos nulos;
// •	total de votos em branco;
// •	percentagem de votos nulos sobre o total de votos;
// •	percentagem de votos em branco sobre o total de votos.
// Para finalizar o conjunto de votos, tem-se o valor zero.

import java.util.Scanner;

public class Exerc_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE VOTACAO PRESIDENCIAL ===\n");
        
        System.out.println("Tabela de codigos:");
        System.out.println("1 - Candidato 1");
        System.out.println("2 - Candidato 2");
        System.out.println("3 - Candidato 3");
        System.out.println("4 - Candidato 4");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("0 - Encerrar votacao\n");
        
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulos = 0;
        int votosBranco = 0;
        int totalVotos = 0;
        int codigo;
        
        // Loop para ler os votos até que seja digitado 0
        do {
            System.out.print("Digite o codigo do voto (0 para encerrar): ");
            codigo = scanner.nextInt();
            
            switch (codigo) {
                case 1:
                    votosCandidato1++;
                    totalVotos++;
                    System.out.println("Voto registrado para Candidato 1.\n");
                    break;
                    
                case 2:
                    votosCandidato2++;
                    totalVotos++;
                    System.out.println("Voto registrado para Candidato 2.\n");
                    break;
                    
                case 3:
                    votosCandidato3++;
                    totalVotos++;
                    System.out.println("Voto registrado para Candidato 3.\n");
                    break;
                    
                case 4:
                    votosCandidato4++;
                    totalVotos++;
                    System.out.println("Voto registrado para Candidato 4.\n");
                    break;
                    
                case 5:
                    votosNulos++;
                    totalVotos++;
                    System.out.println("Voto Nulo registrado.\n");
                    break;
                    
                case 6:
                    votosBranco++;
                    totalVotos++;
                    System.out.println("Voto em Branco registrado.\n");
                    break;
                    
                case 0:
                    System.out.println("Encerrando a votacao...\n");
                    break;
                    
                default:
                    System.out.println("Codigo invalido! Use apenas 1-6 ou 0 para encerrar.\n");
            }
            
        } while (codigo != 0);
        
        // Calcular percentagens
        double percentualNulos = (totalVotos > 0) ? (votosNulos * 100.0 / totalVotos) : 0;
        double percentualBranco = (totalVotos > 0) ? (votosBranco * 100.0 / totalVotos) : 0;
        
        System.out.println("=== RESULTADO DA VOTACAO ===\n");
        
        if (totalVotos == 0) {
            System.out.println("Nenhum voto foi registrado.");
        } else {
            System.out.println("TOTAL DE VOTOS: " + totalVotos + "\n");
            
            System.out.println("VOTOS POR CANDIDATO:");
            System.out.println("Candidato 1: " + votosCandidato1 + " votos");
            System.out.println("Candidato 2: " + votosCandidato2 + " votos");
            System.out.println("Candidato 3: " + votosCandidato3 + " votos");
            System.out.println("Candidato 4: " + votosCandidato4 + " votos\n");
            
            System.out.println("VOTOS NULOS: " + votosNulos);
            System.out.println("VOTOS EM BRANCO: " + votosBranco + "\n");
            
            System.out.println("PERCENTAGENS:");
            System.out.printf("Votos Nulos: %.2f%%\n", percentualNulos);
            System.out.printf("Votos em Branco: %.2f%%\n", percentualBranco);
            
            // Determinar o vencedor (opcional)
            System.out.println("\n--- ANALISE DOS RESULTADOS ---");
            int maxVotos = Math.max(Math.max(votosCandidato1, votosCandidato2), 
                                    Math.max(votosCandidato3, votosCandidato4));
            
            if (maxVotos > 0) {
                System.out.println("Candidato(s) com mais votos:");
                if (votosCandidato1 == maxVotos) System.out.println("- Candidato 1");
                if (votosCandidato2 == maxVotos) System.out.println("- Candidato 2");
                if (votosCandidato3 == maxVotos) System.out.println("- Candidato 3");
                if (votosCandidato4 == maxVotos) System.out.println("- Candidato 4");
            }
        }
        
        scanner.close();
    }
}