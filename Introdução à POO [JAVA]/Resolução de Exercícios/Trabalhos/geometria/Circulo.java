package geometria;

// Herança e polimorfismo - Círculo
class Circulo extends Forma {
    private double raio;
    
    public Circulo(String cor, boolean preenchido, double raio) {
        super(cor, preenchido);
        this.raio = raio;
    }
    
    public double getRaio() { 
        return raio; 
    }
    
    public void setRaio(double raio) { 
        if(raio > 0) {
            this.raio = raio;
        }
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Círculo ===");
        super.exibirInformacoes();
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
        System.out.println("Diâmetro: " + String.format("%.2f", 2 * raio));
    }
    
    // Método específico do Círculo
    public double calcularDiametro() {
        return 2 * raio;
    }
}