package banco;

/*
 * Actividade 3: Sistema de banco
 * Crie um sistema bancário com:
 * - Classe Conta (abstrata) com encapsulamento
 * - Classes ContaCorrente e ContaPoupanca que herdam de Conta
 * - Interface Tributavel para contas que pagam impostos
 * - Polimorfismo para gerenciar diferentes tipos de conta
 */
 
// Classe abstrata Conta com encapsulamento
abstract class Conta {
    // Atributos privados - encapsulamento
    private String numeroConta;
    private String titular;
    private double saldo;
    private String agencia;
    
    // Construtor
    public Conta(String numeroConta, String titular, double saldo, String agencia) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
    }
    
    // Getters e Setters com validações
    public String getNumeroConta() { return numeroConta; }
    
    public void setNumeroConta(String numeroConta) {
        if(numeroConta != null && !numeroConta.isEmpty()) {
            this.numeroConta = numeroConta;
        }
    }
    
    public String getTitular() { return titular; }
    
    public void setTitular(String titular) {
        if(titular != null && !titular.isEmpty()) {
            this.titular = titular;
        }
    }
    
    public double getSaldo() { return saldo; }
    
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getAgencia() { return agencia; }
    
    public void setAgencia(String agencia) {
        if(agencia != null && !agencia.isEmpty()) {
            this.agencia = agencia;
        }
    }
    
    // Métodos abstratos - polimorfismo obrigatório
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void aplicarTaxaMensal();
    
    // Métodos concretos
    public void transferir(double valor, Conta destino) {
        if(valor > 0 && valor <= saldo && destino != null) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada para " + 
                             destino.getTitular());
        } else {
            System.out.println("Transferência não realizada. Verifique o valor ou conta destino.");
        }
    }
    
    public void exibirExtrato() {
        System.out.println("=== Extrato da Conta ===");
        System.out.println("Titular: " + titular);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$" + String.format("%.2f", saldo));
    }
}