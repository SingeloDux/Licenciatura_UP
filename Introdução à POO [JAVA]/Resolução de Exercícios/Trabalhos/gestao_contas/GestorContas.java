package gestao_contas;

import java.util.ArrayList;
import java.util.List;

// Classe que gerencia todas as contas e implementa Relatorio
public class GestorContas implements Relatorio {
    private List<Conta> contas;
    private String nomeEmpresa;
    
    public GestorContas(String nomeEmpresa) {
        this.contas = new ArrayList<>();
        this.nomeEmpresa = nomeEmpresa;
    }
    
    // Métodos de gerenciamento
    public void adicionarConta(Conta conta) {
        if (conta != null) {
            contas.add(conta);
            System.out.println("Conta " + conta.getCodigo() + " adicionada com sucesso!");
        }
    }
    
    public void removerConta(String codigo) {
        Conta conta = buscarConta(codigo);
        if (conta != null) {
            contas.remove(conta);
            System.out.println("Conta " + codigo + " removida com sucesso!");
        } else {
            System.out.println("Conta não encontrada!");
        }
    }
    
    public Conta buscarConta(String codigo) {
        for (Conta conta : contas) {
            if (conta.getCodigo().equals(codigo)) {
                return conta;
            }
        }
        return null;
    }
    
    public void pagarConta(String codigo) {
        Conta conta = buscarConta(codigo);
        if (conta != null && conta instanceof ContaPagar) {
            conta.pagar();
            System.out.println("Conta " + codigo + " paga com sucesso!");
        } else {
            System.out.println("Conta não encontrada ou não é uma conta a pagar!");
        }
    }
    
    public void receberConta(String codigo) {
        Conta conta = buscarConta(codigo);
        if (conta != null && conta instanceof ContaReceber) {
            conta.pagar(); // Reutiliza o método pagar para marcar como recebida
            System.out.println("Conta " + codigo + " recebida com sucesso!");
        } else {
            System.out.println("Conta não encontrada ou não é uma conta a receber!");
        }
    }
    
    // Métodos de consulta
    public List<Conta> getContasPendentes() {
        List<Conta> pendentes = new ArrayList<>();
        for (Conta conta : contas) {
            if (!conta.isPaga()) {
                pendentes.add(conta);
            }
        }
        return pendentes;
    }
    
    public List<Conta> getContasAtrasadas() {
        List<Conta> atrasadas = new ArrayList<>();
        for (Conta conta : contas) {
            if (conta.isAtrasada()) {
                atrasadas.add(conta);
            }
        }
        return atrasadas;
    }
    
    public List<Conta> getContasPorCategoria(String categoria) {
        List<Conta> resultado = new ArrayList<>();
        for (Conta conta : contas) {
            if (conta.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(conta);
            }
        }
        return resultado;
    }
    
    // Implementação da interface Relatorio
    @Override
    public void gerarRelatorio() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("RELATÓRIO FINANCEIRO - " + nomeEmpresa.toUpperCase());
        System.out.println("=".repeat(60));
        
        System.out.println("\n--- RESUMO GERAL ---");
        System.out.println("Total de Contas: " + contas.size());
        System.out.println("Contas Pendentes: " + getContasPendentes().size());
        System.out.println("Contas Atrasadas: " + getContasAtrasadas().size());
        System.out.println("Saldo Total: R$ " + String.format("%.2f", calcularSaldo()));
        
        System.out.println("\n--- CONTAS A PAGAR ---");
        double totalPagar = calcularTotalPagar();
        double totalPagarPendente = calcularTotalPagarPendente();
        System.out.println("Total a Pagar: R$ " + String.format("%.2f", totalPagar));
        System.out.println("Pendentes: R$ " + String.format("%.2f", totalPagarPendente));
        
        System.out.println("\n--- CONTAS A RECEBER ---");
        double totalReceber = calcularTotalReceber();
        double totalReceberPendente = calcularTotalReceberPendente();
        System.out.println("Total a Receber: R$ " + String.format("%.2f", totalReceber));
        System.out.println("Pendentes: R$ " + String.format("%.2f", totalReceberPendente));
        
        System.out.println("\n--- CONTAS ATRASADAS ---");
        List<Conta> atrasadas = getContasAtrasadas();
        if (atrasadas.isEmpty()) {
            System.out.println("Nenhuma conta em atraso!");
        } else {
            for (Conta conta : atrasadas) {
                System.out.println("- " + conta.getDescricao() + 
                                 " (Venceu: " + conta.getDataVencimento() + 
                                 ", Dias: " + conta.getDiasAtraso() + ")");
            }
        }
        
        System.out.println("=".repeat(60));
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Conta conta : contas) {
            total += conta.calcularValorFinal();
        }
        return total;
    }
    
    @Override
    public double calcularMedia() {
        if (contas.isEmpty()) return 0;
        return calcularTotal() / contas.size();
    }
    
    @Override
    public String getTituloRelatorio() {
        return "Relatório Financeiro - " + nomeEmpresa;
    }
    
    // Métodos específicos do gestor
    public double calcularTotalPagar() {
        double total = 0;
        for (Conta conta : contas) {
            if (conta instanceof ContaPagar) {
                total += conta.calcularValorFinal();
            }
        }
        return total;
    }
    
    public double calcularTotalReceber() {
        double total = 0;
        for (Conta conta : contas) {
            if (conta instanceof ContaReceber) {
                total += conta.calcularValorFinal();
            }
        }
        return total;
    }
    
    public double calcularTotalPagarPendente() {
        double total = 0;
        for (Conta conta : contas) {
            if (conta instanceof ContaPagar && !conta.isPaga()) {
                total += conta.calcularValorFinal();
            }
        }
        return total;
    }
    
    public double calcularTotalReceberPendente() {
        double total = 0;
        for (Conta conta : contas) {
            if (conta instanceof ContaReceber && !conta.isPaga()) {
                total += conta.calcularValorFinal();
            }
        }
        return total;
    }
    
    public double calcularSaldo() {
        return calcularTotalReceber() - calcularTotalPagar();
    }
    
    // Getters
    public List<Conta> getContas() { return contas; }
    public String getNomeEmpresa() { return nomeEmpresa; }
}