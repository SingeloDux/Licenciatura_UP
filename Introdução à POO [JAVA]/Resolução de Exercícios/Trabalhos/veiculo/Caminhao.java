package veiculo;

// Herança - Caminhão herda de Veiculo e implementa VeiculoCarga
class Caminhao extends Veiculo implements VeiculoCarga {
    private double capacidadeCarga; // em toneladas
    private int numeroEixos;
    private String tipoCarga;
    
    public Caminhao(String marca, String modelo, int ano, double preco,
                   double capacidadeCarga, int numeroEixos, String tipoCarga) {
        super(marca, modelo, ano, preco);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
        this.tipoCarga = tipoCarga;
    }
    
    // Encapsulamento
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    
    public void setCapacidadeCarga(double capacidadeCarga) {
        if(capacidadeCarga > 0) {
            this.capacidadeCarga = capacidadeCarga;
        }
    }
    
    public int getNumeroEixos() {
        return numeroEixos;
    }
    
    public void setNumeroEixos(int numeroEixos) {
        if(numeroEixos >= 2 && numeroEixos <= 10) {
            this.numeroEixos = numeroEixos;
        }
    }
    
    // Implementação da interface VeiculoCarga
    @Override
    public double calcularCapacidadeCarga() {
        return capacidadeCarga * 1000; // Converte para kg
    }
    
    @Override
    public boolean verificarLimiteCarga(double peso) {
        return peso <= calcularCapacidadeCarga();
    }
    
    @Override
    public String getTipoCarga() {
        return tipoCarga;
    }
    
    public void setTipoCarga(String tipoCarga) {
        if(tipoCarga != null && !tipoCarga.isEmpty()) {
            this.tipoCarga = tipoCarga;
        }
    }
    
    // Polimorfismo - sobrescrevendo o método
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas" +
                         ", Eixos: " + numeroEixos +
                         ", Tipo de Carga: " + tipoCarga);
    }
    
    @Override
    public double calcularImposto() {
        double impostoBase = super.calcularImposto();
        // Caminhões pagam imposto adicional baseado no número de eixos
        double impostoAdicional = numeroEixos * 100;
        return impostoBase + impostoAdicional;
    }
    
    // Método específico para caminhões
    public void carregar(double peso) {
        if(verificarLimiteCarga(peso)) {
            System.out.println("Carga de " + peso + " kg colocada no caminhão.");
        } else {
            System.out.println("ERRO: Peso excede a capacidade máxima de " + 
                             calcularCapacidadeCarga() + " kg.");
        }
    }
}