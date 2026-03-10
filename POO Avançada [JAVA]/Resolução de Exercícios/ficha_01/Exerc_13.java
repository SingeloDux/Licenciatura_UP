// 13.	 A secretária de Meio Ambiente que controla o índice de poluição mantém 3 grupos que são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. 
// Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas actividades, se o índice crescer para 0,4 as indústrias do 1º e 2º grupo são intimadas a suspenderem suas actividades, se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas                actividades. 
// Faça um algoritmo que leia o índice de poluição medido e emita a notificação                    adequada aos diferentes grupos de empresas.

import java.util.Scanner;

public class Exerc_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE CONTROLE DE POLUICAO ===\n");
        System.out.println("Indice de poluicao aceitavel: 0,05 a 0,25\n");
        System.out.println("Grupos de industrias:");
        System.out.println("Grupo 1 - Industrias altamente poluentes");
        System.out.println("Grupo 2 - Industrias moderadamente poluentes");
        System.out.println("Grupo 3 - Industrias pouco poluentes\n");
        
        System.out.print("Digite o indice de poluicao medido: ");
        double indice = scanner.nextDouble();
        
        System.out.println("\n=== NOTIFICACAO ===\n");
        System.out.println("Indice de poluicao medido: " + indice);
        
        // Verificar o índice e emitir a notificação adequada
        if (indice < 0.05) {
            System.out.println("INDICE ABAIXO DO MINIMO ACEITAVEL");
            System.out.println("Situacao: Normal. Nenhuma acao necessaria.");
        } 
        else if (indice >= 0.05 && indice <= 0.25) {
            System.out.println("INDICE DENTRO DOS PARAMETROS ACEITAVEIS");
            System.out.println("Situacao: Normal. Todas as industrias podem operar.");
        } 
        else if (indice > 0.25 && indice < 0.3) {
            System.out.println("INDICE ACIMA DO ACEITAVEL MAS ABAIXO DO LIMITE DE ALERTA");
            System.out.println("Situacao: Monitoramento. Nenhuma suspensao necessaria ainda.");
            System.out.println("Recomendacao: Industrias devem reduzir emissoes.");
        }
        else if (indice >= 0.3 && indice < 0.4) {
            System.out.println("ALERTA NIVEL 1 - INDICE DE POLUICAO: " + indice);
            System.out.println("\nNOTIFICACAO:");
            System.out.println("Industrias do GRUPO 1 devem suspender suas atividades imediatamente!");
            System.out.println("Industrias dos GRUPOS 2 e 3 podem continuar operando.");
            System.out.println("\nMotivo: Indice atingiu nivel critico para o grupo mais poluente.");
        } 
        else if (indice >= 0.4 && indice < 0.5) {
            System.out.println("ALERTA NIVEL 2 - INDICE DE POLUICAO: " + indice);
            System.out.println("\nNOTIFICACAO:");
            System.out.println("Industrias dos GRUPOS 1 e 2 devem suspender suas atividades imediatamente!");
            System.out.println("Industrias do GRUPO 3 podem continuar operando.");
            System.out.println("\nMotivo: Indice atingiu nivel critico para os grupos mais poluentes.");
        } 
        else if (indice >= 0.5) {
            System.out.println("ALERTA NIVEL 3 - INDICE DE POLUICAO: " + indice);
            System.out.println("\nNOTIFICACAO:");
            System.out.println("TODOS OS GRUPOS (1, 2 e 3) devem suspender suas atividades imediatamente!");
            System.out.println("PARALISACAO GERAL DAS INDUSTRIAS!");
            System.out.println("\nMotivo: Indice de poluicao atingiu nivel critico generalizado.");
            System.out.println("Autoridades ambientais devem ser acionadas.");
        }
        
        scanner.close();
    }
}