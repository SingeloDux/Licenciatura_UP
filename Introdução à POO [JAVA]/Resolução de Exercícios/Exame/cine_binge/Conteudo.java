package cine_binge;

/**
 * Classe abstrata que representa um conteúdo audiovisual
 * Demonstra conceitos de: classe abstrata, encapsulamento
 */
public abstract class Conteudo {
    private String titulo;
    private String genero;
    private int nota; // 0 a 5 estrelas
    
    public Conteudo(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.nota = 0;
    }
    
    /**
     * Método abstrato - cada subclasse implementa sua própria lógica
     * Demonstra polimorfismo
     */
    public abstract double calcularDuracaoTotal();
    
    // GETTERS E SETTERS - encapsulamento
    public String getTitulo() {
        return titulo;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public int getNota() {
        return nota;
    }
    
    public void setNota(int nota) {
        if(nota >= 0 && nota <= 5) {
            this.nota = nota;
        }
    }
    
    @Override
    public String toString() {
        String estrelas = "★".repeat(nota) + "☆".repeat(5 - nota);
        return titulo + " (" + genero + ") - " + estrelas;
    }
}