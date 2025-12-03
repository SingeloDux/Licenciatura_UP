package cine_binge;

/**
 * Representa uma série na maratona
 * Demonstra: Herança e Polimorfismo
 */
public class Serie extends Conteudo {
    private int temporadas;
    
    public Serie(String titulo, String genero, int temporadas) {
        super(titulo, genero);
        this.temporadas = temporadas;
    }
    
    /**
     * Polimorfismo: calcula baseado em temporadas
     */
    @Override
    public double calcularDuracaoTotal() {
        return temporadas * 10; // 10 horas por temporada
    }
    
    public int getTemporadas() {
        return temporadas;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - " + temporadas + " temporadas";
    }
}