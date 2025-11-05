package geometria;

// Herança e polimorfismo - Retângulo
class Retangulo extends Forma {
    private double largura;
    private double altura;
    
    public Retangulo(String cor, boolean preenchido, double largura, double altura) {
        super(cor, preenchido);
        this.largura = largura;
        this.altura = altura;
    }
    
    public double getLargura() { 
        return largura; 
    }
    
    public void setLargura(double largura) { 
        if(largura > 0) {
            this.largura = largura;
        }
    }
    
    public double getAltura() { 
        return altura; 
    }
    
    public void setAltura(double altura) { 
        if(altura > 0) {
            this.altura = altura;
        }
    }
    
    @Override
    public double calcularArea() {
        return largura * altura;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Retângulo ===");
        super.exibirInformacoes();
        System.out.println("Largura: " + largura + ", Altura: " + altura);
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
        System.out.println("Diagonal: " + String.format("%.2f", calcularDiagonal()));
    }
    
    // Método específico do Retângulo
    public double calcularDiagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }
    
    // Verificar se é um quadrado
    public boolean isQuadrado() {
        return largura == altura;
    }
}