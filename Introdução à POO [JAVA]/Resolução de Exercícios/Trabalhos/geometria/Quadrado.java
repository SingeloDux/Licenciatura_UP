package geometria;

// Herança - Quadrado é um tipo especial de Retângulo
class Quadrado extends Retangulo {
    
    public Quadrado(String cor, boolean preenchido, double lado) {
        super(cor, preenchido, lado, lado); // Largura e altura iguais
    }
    
    public double getLado() {
        return getLargura(); // Em um quadrado, largura = altura = lado
    }
    
    public void setLado(double lado) {
        if(lado > 0) {
            setLargura(lado);
            setAltura(lado);
        }
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Quadrado ===");
        super.exibirInformacoes();
        System.out.println("Lado: " + getLado());
    }
}