package funcionario;

// Herança - Estagiario
class Estagiario extends Funcionario {
    private String instituicaoEnsino;
    private int horasTrabalho;
    
    public Estagiario(String nome, String cpf, double salarioBase,
                     String instituicaoEnsino, int horasTrabalho) {
        super(nome, cpf, salarioBase);
        this.instituicaoEnsino = instituicaoEnsino;
        this.horasTrabalho = horasTrabalho;
    }
    
    public String getInstituicaoEnsino() { return instituicaoEnsino; }
    public void setInstituicaoEnsino(String instituicaoEnsino) { 
        this.instituicaoEnsino = instituicaoEnsino; 
    }
    
    public int getHorasTrabalho() { return horasTrabalho; }
    public void setHorasTrabalho(int horasTrabalho) { 
        this.horasTrabalho = horasTrabalho; 
    }
    
    @Override
    public double calcularSalario() {
        // Estagiário recebe proporcional às horas
        return (getSalarioBase() / 160) * horasTrabalho; // 160 horas mensais base
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Estagiário, Instituição: " + instituicaoEnsino +
                         ", Horas Trabalho: " + horasTrabalho +
                         ", Salário Total: R$" + calcularSalario());
    }
}