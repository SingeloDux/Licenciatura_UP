package veiculo;

// Herança - Carro herda de Veiculo
class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;
    
    public Carro(String marca, String modelo, int ano, double preco,
                int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano, preco); // Chamada ao construtor da superclasse
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }
    
    // Encapsulamento
    public int getNumeroPortas() {
        return numeroPortas;
    }
    
    public void setNumeroPortas(int numeroPortas) {
        if(numeroPortas >= 2 && numeroPortas <= 5) {
            this.numeroPortas = numeroPortas;
        }
    }
    
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    
    public void setTipoCombustivel(String tipoCombustivel) {
        if(tipoCombustivel != null && 
           (tipoCombustivel.equals("Gasolina") ||
            tipoCombustivel.equals("Álcool") ||
            tipoCombustivel.equals("Diesel") ||
            tipoCombustivel.equals("Elétrico"))) {
            this.tipoCombustivel = tipoCombustivel;
        }
    }
    
    // Polimorfismo - sobrescrevendo o método
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Portas: " + numeroPortas + ", Combustível: " + tipoCombustivel);
    }
    
    @Override
    public double calcularImposto() {
        double impostoBase = super.calcularImposto();
        if(tipoCombustivel.equals("Elétrico")) {
            return impostoBase * 0.5; // 50% de desconto para elétricos
        }
        return impostoBase;
    }
}