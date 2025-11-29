package cine_binge;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que gerencia uma maratona de conteúdos
 * Demonstra: Composição, Polimorfismo e Encapsulamento
 */
public class Maratona {
    private String nome;
    private List<Conteudo> conteudos;
    
    public Maratona(String nome) {
        this.nome = nome;
        this.conteudos = new ArrayList<>();
    }
    
    /**
     * Adiciona qualquer tipo de Conteudo (Série ou Filme)
     * Demonstra polimorfismo através da herança
     */
    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
        System.out.println(" + " + conteudo.getTitulo() + " adicionado à maratona!");
    }
    
    /**
     * Calcula tempo total - demonstra polimorfismo
     * Chama calcularDuracaoTotal() de cada objeto
     */
    public double calcularTempoTotal() {
        double total = 0;
        for (Conteudo conteudo : conteudos) {
            total += conteudo.calcularDuracaoTotal();
        }
        return total;
    }
    
    /**
     * Avalia um conteúdo pelo título
     * Demonstra encapsulamento através dos setters
     */
    public boolean avaliarConteudo(String titulo, int nota) {
    for (Conteudo conteudo : conteudos) {
        if (conteudo.getTitulo().equalsIgnoreCase(titulo)) {
            conteudo.setNota(nota);
            System.out.println(titulo + " avaliado com " + nota + " estrelas!");
            return true;
        }
    }
    System.out.println("Conteudo nao encontrado: " + titulo);
    return false;
}
    
    /**
     * Exibe relatório completo da maratona
     * Demonstra polimorfismo e instanceof
     */
    public void exibirRelatorio() {
        System.out.println("\nMIINHA MARATONA" + nome);
        System.out.println("Total de conteúdos: " + conteudos.size());
        System.out.println("Tempo total: " + String.format("%.2f", calcularTempoTotal()) + " horas");
        System.out.println("\nConteúdos:");
        
        if (conteudos.isEmpty()) {
            System.out.println("   Nenhum conteúdo adicionado ainda...");
            return;
        }
        
        for (int i = 0; i < conteudos.size(); i++) {
            Conteudo c = conteudos.get(i);
            String tipo = (c instanceof Serie) ? "Série" : "Filme";
            String detalhes = (c instanceof Serie) ? 
                ((Serie) c).getTemporadas() + " temporadas" : 
                ((Filme) c).getDuracaoMinutos() + " minutos";
            
            System.out.println("   " + (i + 1) + ". " + tipo + ": " + c.getTitulo());
            System.out.println("      Gênero: " + c.getGenero());
            System.out.println("      " + detalhes);
            System.out.println("      Avaliação: " + "★".repeat(c.getNota()) + "☆".repeat(5 - c.getNota()));
            System.out.println("      Tempo: " + String.format("%.2f", c.calcularDuracaoTotal()) + " horas\n");
        }
    }
    
    // GETTERS
    public String getNome() {
        return nome;
    }
    
    public List<Conteudo> getConteudos() {
        return new ArrayList<>(conteudos); // Retorna cópia para encapsulamento
    }
    
    public int getTotalConteudos() {
        return conteudos.size();
    }
}