package geometria;

// Classe abstrata implementando parte da interface
abstract class Forma implements FormaGeometrica {
    private String cor;
    private boolean preenchido;
    
    public Forma(String cor, boolean preenchido) {
        this.cor = cor;
        this.preenchido = preenchido;
    }
    
    public String getCor() { 
        return cor; 
    }
    
    public void setCor(String cor) { 
        this.cor = cor; 
    }
    
    public boolean isPreenchido() { 
        return preenchido; 
    }
    
    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido; 
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("Cor: " + cor + ", Preenchido: " +
                         (preenchido ? "Sim" : "Não"));
    }
}