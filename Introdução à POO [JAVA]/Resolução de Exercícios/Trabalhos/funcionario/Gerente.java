package funcionario;

// Herança - Gerente
class Gerente extends Funcionario {
    private double bonusAnual;
    private String departamento;
    
    public Gerente(String nome, String cpf, double salarioBase,
                  double bonusAnual, String departamento) {
        super(nome, cpf, salarioBase);
        this.bonusAnual = bonusAnual;
        this.departamento = departamento;
    }
    
    public double getBonusAnual() { return bonusAnual; }
    public void setBonusAnual(double bonusAnual) { 
        this.bonusAnual = bonusAnual; 
    }
    
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { 
        this.departamento = departamento; 
    }
    
    // Polimorfismo - implementação do método abstrato
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (bonusAnual / 12);
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Gerente, Departamento: " + departamento +
                         ", Bônus Anual: R$" + bonusAnual +
                         ", Salário Total: R$" + calcularSalario());
    }
}
