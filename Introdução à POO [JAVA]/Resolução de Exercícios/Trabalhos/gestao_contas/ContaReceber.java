package gestao_contas;

import java.time.LocalDate;

// Herança - ContaReceber herda de Conta
public class ContaReceber extends Conta {
    private double descontoAntecipado;
    
    public ContaReceber(String codigo, String descricao, double valor, 
                       LocalDate dataVencimento, String categoria) {
        super(codigo, descricao, valor, dataVencimento, categoria);
        this.descontoAntecipado = 0.05; // 5% de desconto
    }
    
    public ContaReceber(String codigo, String descricao, double valor, 
                       LocalDate dataVencimento, String categoria,
                       double descontoAntecipado) {
        super(codigo, descricao, valor, dataVencimento, categoria);
        this.descontoAntecipado = descontoAntecipado;
    }
    
    // Getters e Setters
    public double getDescontoAntecipado() { return descontoAntecipado; }
    
    public void setDescontoAntecipado(double descontoAntecipado) {
        if (descontoAntecipado >= 0 && descontoAntecipado <= 1) {
            this.descontoAntecipado = descontoAntecipado;
        }
    }
    
    // Implementação dos métodos abstratos - polimorfismo
    @Override
    public String getTipo() {
        return "CONTA A RECEBER";
    }
    
    @Override
    public double calcularValorFinal() {
        double valorBase = getValor();
        
        // Aplica desconto se pagamento antecipado
        if (!isPaga() && LocalDate.now().isBefore(getDataVencimento())) {
            return valorBase * (1 - descontoAntecipado);
        }
        
        return valorBase;
    }
    
    @Override
    public boolean isAtrasada() {
        return !isPaga() && LocalDate.now().isAfter(getDataVencimento());
    }
    
    // Método específico para contas a receber
    public double calcularPerdaPorAtraso() {
        if (isAtrasada()) {
            return getValor() * 0.1; // Estima 10% de perda por atraso
        }
        return 0;
    }
    
    @Override
    public void exibirDetalhes() {
        System.out.println("=== CONTA A RECEBER ===");
        super.exibirDetalhes();
        
        if (!isPaga() && LocalDate.now().isBefore(getDataVencimento())) {
            System.out.println("Desconto disponível: R$ " + 
                String.format("%.2f", getValor() * descontoAntecipado));
        }
        
        if (isAtrasada()) {
            System.out.println("Perda estimada por atraso: R$ " + 
                String.format("%.2f", calcularPerdaPorAtraso()));
        }
    }
}