package gestao_contas;

import java.time.LocalDate;

// Herança - ContaPagar herda de Conta
public class ContaPagar extends Conta {
    private double multaAtraso;
    private double jurosDia;
    
    public ContaPagar(String codigo, String descricao, double valor, 
                     LocalDate dataVencimento, String categoria) {
        super(codigo, descricao, valor, dataVencimento, categoria);
        this.multaAtraso = 0.02; // 2% de multa
        this.jurosDia = 0.001; // 0.1% ao dia
    }
    
    public ContaPagar(String codigo, String descricao, double valor, 
                     LocalDate dataVencimento, String categoria,
                     double multaAtraso, double jurosDia) {
        super(codigo, descricao, valor, dataVencimento, categoria);
        this.multaAtraso = multaAtraso;
        this.jurosDia = jurosDia;
    }
    
    // Getters e Setters
    public double getMultaAtraso() { return multaAtraso; }
    
    public void setMultaAtraso(double multaAtraso) {
        if (multaAtraso >= 0) {
            this.multaAtraso = multaAtraso;
        }
    }
    
    public double getJurosDia() { return jurosDia; }
    
    public void setJurosDia(double jurosDia) {
        if (jurosDia >= 0) {
            this.jurosDia = jurosDia;
        }
    }
    
    // Implementação dos métodos abstratos - polimorfismo
    @Override
    public String getTipo() {
        return "CONTA A PAGAR";
    }
    
    @Override
    public double calcularValorFinal() {
        double valorBase = getValor();
        
        if (isAtrasada() && !isPaga()) {
            long diasAtraso = getDiasAtraso();
            double multa = valorBase * multaAtraso;
            double juros = valorBase * jurosDia * diasAtraso;
            return valorBase + multa + juros;
        }
        
        return valorBase;
    }
    
    @Override
    public boolean isAtrasada() {
        return !isPaga() && LocalDate.now().isAfter(getDataVencimento());
    }
    
    // Método específico para contas a pagar
    public double calcularEconomiaPossivel() {
        if (LocalDate.now().isBefore(getDataVencimento())) {
            return calcularValorFinal() - getValor();
        }
        return 0;
    }
    
    @Override
    public void exibirDetalhes() {
        System.out.println("=== CONTA A PAGAR ===");
        super.exibirDetalhes();
        
        if (isAtrasada() && !isPaga()) {
            System.out.println("Multa por atraso: " + String.format("%.2f", getValor() * multaAtraso) + " MT");
            System.out.println("Juros totais: " + String.format("%.2f", getValor() * jurosDia * getDiasAtraso()) + " MT");
        }
    }
}
