package geometria;

// Herança e polimorfismo - Triângulo
class Triangulo extends Forma {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(String cor, boolean preenchido, double base,
                    double altura, double lado1, double lado2, double lado3) {
        super(cor, preenchido);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    // Getters e Setters
    public double getBase() { 
        return base; 
    }
    
    public void setBase(double base) { 
        if(base > 0) {
            this.base = base;
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
    
    public double getLado1() { 
        return lado1; 
    }
    
    public void setLado1(double lado1) { 
        if(lado1 > 0) {
            this.lado1 = lado1;
        }
    }
    
    public double getLado2() { 
        return lado2; 
    }
    
    public void setLado2(double lado2) { 
        if(lado2 > 0) {
            this.lado2 = lado2;
        }
    }
    
    public double getLado3() { 
        return lado3; 
    }
    
    public void setLado3(double lado3) { 
        if(lado3 > 0) {
            this.lado3 = lado3;
        }
    }
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Triângulo ===");
        super.exibirInformacoes();
        System.out.println("Base: " + base + ", Altura: " + altura);
        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
        System.out.println("Tipo: " + determinarTipoTriangulo());
    }
    
    // Métodos específicos do Triângulo
    public String determinarTipoTriangulo() {
        if(lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    
    public boolean isTrianguloValido() {
        return (lado1 + lado2 > lado3) && 
               (lado1 + lado3 > lado2) && 
               (lado2 + lado3 > lado1);
    }
    
    // Calcular área usando fórmula de Heron (alternativa)
    public double calcularAreaHeron() {
        double s = calcularPerimetro() / 2; // semiperímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}