package banco;

// Herança - ContaCorrente herda de Conta e implementa Tributavel
class ContaCorrente extends Conta implements Tributavel {
    private double limiteChequeEspecial;
    private int transacoesGratuitas;
    private int transacoesRealizadas;
    
    public ContaCorrente(String numeroConta, String titular, double saldo, 
                        String agencia, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, agencia);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.transacoesGratuitas = 5;
        this.transacoesRealizadas = 0;
    }
    
    // Getters e Setters
    public double getLimiteChequeEspecial() { return limiteChequeEspecial; }
    
    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        if(limiteChequeEspecial >= 0) {
            this.limiteChequeEspecial = limiteChequeEspecial;
        }
    }
    
    public int getTransacoesGratuitas() { return transacoesGratuitas; }
    public int getTransacoesRealizadas() { return transacoesRealizadas; }
    
    // Implementação dos métodos abstratos
    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= (getSaldo() + limiteChequeEspecial)) {
            setSaldo(getSaldo() - valor);
            transacoesRealizadas++;
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
            transacoesRealizadas++;
            System.out.println("Depósito de R$" + valor + " realizado. Saldo: R$" + 
                             String.format("%.2f", getSaldo()));
        }
    }
    
    @Override
    public void aplicarTaxaMensal() {
        // Conta corrente paga taxa de manutenção após transações gratuitas
        if(transacoesRealizadas > transacoesGratuitas) {
            double taxa = (transacoesRealizadas - transacoesGratuitas) * 0.50;
            setSaldo(getSaldo() - taxa);
            System.out.println("Taxa de manutenção: R$" + taxa);
        }
        transacoesRealizadas = 0; // Reset mensal
    }
    
    // Implementação da interface Tributavel
    @Override
    public double calcularTributo() {
        // Conta corrente paga tributo sobre o saldo
        return getSaldo() * 0.0025; // 0.25%
    }
    
    @Override
    public double calcularTaxaManutencao() {
        return Math.max(0, (transacoesRealizadas - transacoesGratuitas)) * 0.50;
    }
    
    @Override
    public void aplicarTributo() {
        double tributo = calcularTributo();
        setSaldo(getSaldo() - tributo);
        System.out.println("Tributo aplicado: R$" + tributo);
    }
    
    // Método específico da conta corrente
    public void usarChequeEspecial(double valor) {
        if(valor > 0 && valor <= limiteChequeEspecial) {
            setSaldo(getSaldo() - valor);
            System.out.println("Uso do cheque especial: R$" + valor);
        }
    }
    
    @Override
    public void exibirExtrato() {
        super.exibirExtrato();
        System.out.println("Tipo: Conta Corrente");
        System.out.println("Limite Cheque Especial: R$" + limiteChequeEspecial);
        System.out.println("Transações realizadas: " + transacoesRealizadas + 
                         "/" + transacoesGratuitas + " gratuitas");
        System.out.println("Tributo mensal: R$" + String.format("%.2f", calcularTributo()));
    }
}