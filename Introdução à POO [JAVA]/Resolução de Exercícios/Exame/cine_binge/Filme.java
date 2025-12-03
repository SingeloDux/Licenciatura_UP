package cine_binge;

/**
 * Representa um filme na maratona
 * Demonstra: Herança e Polimorfismo com implementação diferente
 */
public class Filme extends Conteudo {
    private int duracaoMinutos;
    
    public Filme(String titulo, String genero, int duracaoMinutos) {
        super(titulo, genero);
        this.duracaoMinutos = duracaoMinutos;
    }
    
    /**
     * Polimorfismo: converte minutos para horas
     */
    @Override
    public double calcularDuracaoTotal() {
        return duracaoMinutos / 60.0;
    }
    
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - " + duracaoMinutos + " min";
    }
}