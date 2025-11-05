package funcionario;

// Herança - Diretor herda de Gerente e implementa Autenticavel
class Diretor extends Gerente implements Autenticavel {
    private double participacaoLucros;
    private String usuario;
    private String senha;
    private double performance; // 0.0 a 1.0 (0% a 100%)
    
    public Diretor(String nome, String cpf, double salarioBase,
                  double bonusAnual, String departamento,
                  double participacaoLucros, String usuario, String senha) {
        super(nome, cpf, salarioBase, bonusAnual, departamento);
        this.participacaoLucros = participacaoLucros;
        this.usuario = usuario;
        this.senha = senha;
        this.performance = 0.8; // Performance inicial de 80%
    }
    
    public double getParticipacaoLucros() { return participacaoLucros; }
    public void setParticipacaoLucros(double participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }
    
    public double getPerformance() { return performance; }
    public void setPerformance(double performance) {
        if(performance >= 0.0 && performance <= 1.0) {
            this.performance = performance;
        }
    }
    
    // Implementação da interface Autenticavel
    @Override
    public boolean autenticar(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }
    
    @Override
    public void alterarSenha(String novaSenha) {
        if(novaSenha != null && novaSenha.length() >= 6) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        }
    }
    
    @Override
    public String getUsuario() {
        return usuario;
    }
    
    @Override
    public double calcularBonusPerformance() {
        // Bônus baseado na performance (0% a 50% do salário base)
        return getSalarioBase() * performance * 0.5;
    }
    
    // Polimorfismo - sobrescrevendo calcularSalario
    @Override
    public double calcularSalario() {
        double salarioGerente = super.calcularSalario();
        double bonusPerformance = calcularBonusPerformance();
        return salarioGerente + participacaoLucros + bonusPerformance;
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Diretor, Participação nos Lucros: R$" + participacaoLucros +
                         ", Performance: " + (performance * 100) + "%" +
                         ", Bônus Performance: R$" + calcularBonusPerformance());
    }
    
    // Método específico do Diretor
    public void definirEstrategia(String estrategia) {
        System.out.println("Diretor " + getNome() + " definiu a estratégia: " + estrategia);
    }
}
