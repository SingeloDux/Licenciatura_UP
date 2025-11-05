package veiculo;

// Herança - Moto herda de Veiculo
class Moto extends Veiculo {
    private int cilindradas;
    private boolean partidaEletrica;
    
    public Moto(String marca, String modelo, int ano, double preco,
               int cilindradas, boolean partidaEletrica) {
        super(marca, modelo, ano, preco);
        this.cilindradas = cilindradas;
        this.partidaEletrica = partidaEletrica;
    }
    
    // Getters e Setters
    public int getCilindradas() {
        return cilindradas;
    }
    
    public void setCilindradas(int cilindradas) {
        if(cilindradas > 0) {
            this.cilindradas = cilindradas;
        }
    }
    
    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }
    
    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
    
    // Polimorfismo
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas + "cc, Partida Elétrica: " +
                         (partidaEletrica ? "Sim" : "Não"));
    }
    
    @Override
    public double calcularImposto() {
        double impostoBase = super.calcularImposto();
        if(cilindradas <= 150) {
            return impostoBase * 0.7; // 30% de desconto para motos pequenas
        }
        return impostoBase;
    }
}