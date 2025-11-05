package banco;

// Herança - ContaPoupanca herda de Conta
class ContaPoupanca extends Conta {
    private double taxaRendimento;
    private int diaAniversario;
    
    public ContaPoupanca(String numeroConta, String titular, double saldo,
                        String agencia, double taxaRendimento, int diaAniversario) {
        super(numeroConta, titular, saldo, agencia);
        this.taxaRendimento = taxaRendimento;
        this.diaAniversario = diaAniversario;
    }
    
    // Getters e Setters
    public double getTaxaRendimento() { return taxaRendimento; }
    
    public void setTaxaRendimento(double taxaRendimento) {
        if(taxaRendimento >= 0) {
            this.taxaRendimento = taxaRendimento;
        }
    }
    
    public int getDiaAniversario() { return diaAniversario; }
    
    public void setDiaAniversario(int diaAniversario) {
        if(diaAniversario >= 1 && diaAniversario <= 31) {
            this.diaAniversario = diaAniversario;
        }
    }
    
    // Implementação dos métodos abstratos
    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado. Saldo: R$" + 
                             String.format("%.2f", getSaldo()));
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }
    
    @Override
    public void depositar(double valor) {
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito de R$" + valor + " realizado. Saldo: R$" + 
                             String.format("%.2f", getSaldo()));
        }
    }
    
    @Override
    public void aplicarTaxaMensal() {
        // Poupança rende juros no aniversário
        double rendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento aplicado: R$" + rendimento);
    }
    
    // Método específico da poupança
    public void simularRendimento(int meses) {
        double saldoSimulado = getSaldo();
        System.out.println("=== Simulação de Rendimento ===");
        System.out.println("Saldo atual: R$" + saldoSimulado);
        
        for(int i = 1; i <= meses; i++) {
            double rendimento = saldoSimulado * taxaRendimento;
            saldoSimulado += rendimento;
            System.out.println("Mês " + i + ": R$" + String.format("%.2f", saldoSimulado) + 
                             " (Rendimento: R$" + String.format("%.2f", rendimento) + ")");
        }
    }
    
    @Override
    public void exibirExtrato() {
        super.exibirExtrato();
        System.out.println("Tipo: Conta Poupança");
        System.out.println("Taxa de Rendimento: " + (taxaRendimento * 100) + "%");
        System.out.println("Dia do Aniversário: " + diaAniversario);
    }
}