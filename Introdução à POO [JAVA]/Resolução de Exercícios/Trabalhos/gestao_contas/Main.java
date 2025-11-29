package gestao_contas;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static GestorContas gestor;
    private static Scanner scanner;
    
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        gestor = new GestorContas("SINGELO DUX LDA");
        
        System.out.println("=== SISTEMA DE GESTÃO DE CONTAS A PAGAR/RECEBER ===");
        System.out.println("Desenvolvido com Programação Orientada a Objetos");
        
        // Adicionar algumas contas de exemplo
        adicionarContasExemplo();
        
        int opcao;
        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");
            processarOpcao(opcao);
        } while (opcao != 0);
        
        scanner.close();
        System.out.println("Sistema encerrado. Obrigado!");
    }
    
    private static void exibirMenu() {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("1. Adicionar Conta a Pagar");
        System.out.println("2. Adicionar Conta a Receber");
        System.out.println("3. Listar Todas as Contas");
        System.out.println("4. Listar Contas Pendentes");
        System.out.println("5. Listar Contas Atrasadas");
        System.out.println("6. Pagar Conta");
        System.out.println("7. Receber Conta");
        System.out.println("8. Buscar Conta");
        System.out.println("9. Gerar Relatório Completo");
        System.out.println("10. Estatísticas Financeiras");
        System.out.println("0. Sair");
    }
    
    private static void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                adicionarContaPagar();
                break;
            case 2:
                adicionarContaReceber();
                break;
            case 3:
                listarTodasContas();
                break;
            case 4:
                listarContasPendentes();
                break;
            case 5:
                listarContasAtrasadas();
                break;
            case 6:
                pagarConta();
                break;
            case 7:
                receberConta();
                break;
            case 8:
                buscarConta();
                break;
            case 9:
                gestor.gerarRelatorio();
                break;
            case 10:
                exibirEstatisticas();
                break;
            case 0:
                System.out.println("Encerrando sistema...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
    
    private static void adicionarContaPagar() {
        System.out.println("\n--- NOVA CONTA A PAGAR ---");
        
        String codigo = lerString("Código: ");
        String descricao = lerString("Descrição: ");
        double valor = lerDouble("Valor: ");
        LocalDate vencimento = lerData("Vencimento (dd/mm/aaaa): ");
        String categoria = lerString("Categoria: ");
        
        ContaPagar conta = new ContaPagar(codigo, descricao, valor, vencimento, categoria);
        gestor.adicionarConta(conta);
    }
    
    private static void adicionarContaReceber() {
        System.out.println("\n--- NOVA CONTA A RECEBER ---");
        
        String codigo = lerString("Código: ");
        String descricao = lerString("Descrição: ");
        double valor = lerDouble("Valor: ");
        LocalDate vencimento = lerData("Vencimento (dd/mm/aaaa): ");
        String categoria = lerString("Categoria: ");
        
        ContaReceber conta = new ContaReceber(codigo, descricao, valor, vencimento, categoria);
        gestor.adicionarConta(conta);
    }
    
    private static void listarTodasContas() {
        System.out.println("\n--- TODAS AS CONTAS ---");
        List<Conta> contas = gestor.getContas();
        
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }
        
        for (Conta conta : contas) {
            conta.exibirDetalhes();
            System.out.println("---");
        }
    }
    
    private static void listarContasPendentes() {
        System.out.println("\n--- CONTAS PENDENTES ---");
        List<Conta> pendentes = gestor.getContasPendentes();
        
        if (pendentes.isEmpty()) {
            System.out.println("Nenhuma conta pendente.");
            return;
        }
        
        for (Conta conta : pendentes) {
            conta.exibirDetalhes();
            System.out.println("---");
        }
    }
    
    private static void listarContasAtrasadas() {
        System.out.println("\n--- CONTAS ATRASADAS ---");
        List<Conta> atrasadas = gestor.getContasAtrasadas();
        
        if (atrasadas.isEmpty()) {
            System.out.println("Nenhuma conta em atraso.");
            return;
        }
        
        for (Conta conta : atrasadas) {
            conta.exibirDetalhes();
            System.out.println("---");
        }
    }
    
    private static void pagarConta() {
        String codigo = lerString("Código da conta a pagar: ");
        gestor.pagarConta(codigo);
    }
    
    private static void receberConta() {
        String codigo = lerString("Código da conta a receber: ");
        gestor.receberConta(codigo);
    }
    
    private static void buscarConta() {
        String codigo = lerString("Código da conta: ");
        Conta conta = gestor.buscarConta(codigo);
        
        if (conta != null) {
            conta.exibirDetalhes();
        } else {
            System.out.println("Conta não encontrada!");
        }
    }
    
private static void exibirEstatisticas() {
    System.out.println("\n=== ESTATÍSTICAS FINANCEIRAS ===");
    System.out.println("Total de Contas: " + gestor.getContas().size());
    System.out.println("Média por Conta: " + String.format("%.2f", gestor.calcularMedia()) + " MT");
    System.out.println("Saldo Atual: " + String.format("%.2f", gestor.calcularSaldo()) + " MT");
    System.out.println("Total a Pagar Pendente: " + 
        String.format("%.2f", gestor.calcularTotalPagarPendente()) + " MT");
    System.out.println("Total a Receber Pendente: " + 
        String.format("%.2f", gestor.calcularTotalReceberPendente()) + " MT");
}
    
    // Métodos auxiliares para leitura de dados
    private static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }
    
    private static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número inteiro válido.");
            }
        }
    }
    
    private static double lerDouble(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um valor válido.");
            }
        }
    }
    
    private static LocalDate lerData(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                String[] partes = scanner.nextLine().split("/");
                int dia = Integer.parseInt(partes[0]);
                int mes = Integer.parseInt(partes[1]);
                int ano = Integer.parseInt(partes[2]);
                return LocalDate.of(ano, mes, dia);
            } catch (Exception e) {
                System.out.println("Data inválida! Use o formato dd/mm/aaaa.");
            }
        }
    }
    
    private static void adicionarContasExemplo() {
        // Adiciona algumas contas de exemplo para demonstração
        ContaPagar conta1 = new ContaPagar(
            "AL001", "Aluguel", 1500.00, 
            LocalDate.of(2025, 11, 5), "Moradia"
        );
        
        ContaPagar conta2 = new ContaPagar(
            "LU002", "Energia Elétrica", 250.00, 
            LocalDate.of(2025, 10, 20), "Moradia"
        );
        conta2.setObservacoes("Conta em atraso!");
        
        ContaReceber conta3 = new ContaReceber(
            "VD001", "Venda Produto A", 5000.00, 
            LocalDate.of(2025, 11, 15), "Vendas"
        );
        
        ContaReceber conta4 = new ContaReceber(
            "SC002", "Serviço Consultoria", 3000.00, 
            LocalDate.of(2025, 10, 25), "Serviços"
        );
        
        gestor.adicionarConta(conta1);
        gestor.adicionarConta(conta2);
        gestor.adicionarConta(conta3);
        gestor.adicionarConta(conta4);
        
        System.out.println("Contas de exemplo adicionadas!");
    }
}