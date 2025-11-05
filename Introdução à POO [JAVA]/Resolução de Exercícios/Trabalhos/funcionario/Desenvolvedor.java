package funcionario;

// Herança - Desenvolvedor
class Desenvolvedor extends Funcionario {
    private String linguagem;
    private int horasExtras;
    private double valorHoraExtra;
    
    public Desenvolvedor(String nome, String cpf, double salarioBase,
                        String linguagem, double valorHoraExtra) {
        super(nome, cpf, salarioBase);
        this.linguagem = linguagem;
        this.valorHoraExtra = valorHoraExtra;
        this.horasExtras = 0;
    }
    
    public String getLinguagem() { return linguagem; }
    public void setLinguagem(String linguagem) { 
        this.linguagem = linguagem; 
    }
    
    public int getHorasExtras() { return horasExtras; }
    public void setHorasExtras(int horasExtras) { 
        this.horasExtras = horasExtras; 
    }
    
    public double getValorHoraExtra() { return valorHoraExtra; }
    public void setValorHoraExtra(double valorHoraExtra) { 
        this.valorHoraExtra = valorHoraExtra; 
    }
    
    public void adicionarHoraExtra(int horas) {
        if(horas > 0) {
            this.horasExtras += horas;
        }
    }
    
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtras * valorHoraExtra);
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Desenvolvedor, Linguagem: " + linguagem +
                         ", Horas Extras: " + horasExtras +
                         ", Salário Total: R$" + calcularSalario());
    }
}