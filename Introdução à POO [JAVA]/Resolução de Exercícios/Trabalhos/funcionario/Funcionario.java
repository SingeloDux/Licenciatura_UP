package funcionario;

// Exercício 2: Sistema de Funcionários (Herança e Polimorfismo)
// Classe abstrata Funcionario
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;
    
    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    
    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { 
        this.salarioBase = salarioBase; 
    }
    
    // Método abstrato - polimorfismo obrigatório
    public abstract double calcularSalario();
    
    // Método concreto
    public void exibirDados() {
        System.out.println("Nome: " + nome + ", CPF: " + cpf +
                         ", Salário Base: R$" + salarioBase);
    }
}