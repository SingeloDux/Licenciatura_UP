/*
4. Classe Biblioteca
- Contém um array de objetos Publicacao (pode armazenar livros e revistas).

Métodos:
- Adicionar(Publicacao p) → adiciona uma publicação no array.
- listar() → exibe todas as publicações armazenadas.
- buscarPorTitulo(String titulo) → retorna a publicação correspondente (ou null).-
 */
package editora;

public class Biblioteca {
    // Array que demonstra POLIMORFISMO: pode armazenar Livro E Revista
    private Publicacao[] publicacoes;
    private int quantidade;  // Controla quantas publicações foram adicionadas
    
    // Construtor inicializa o array com tamanho máximo
    public Biblioteca(int tamanhoMaximo) {
        publicacoes = new Publicacao[tamanhoMaximo];
        quantidade = 0;
    }
    
    // Método que aceita qualquer tipo de Publicacao (Livro ou Revista)
    public void adicionar(Publicacao p) {
        if (quantidade < publicacoes.length) {
            publicacoes[quantidade] = p;
            quantidade++;
        }
        // Poderia lançar exceção ou retornar boolean se array estiver cheio
    }
    
    // Demonstra POLIMORFISMO: exibirInfo() se comporta diferente para cada tipo
    public void listar() {
        System.out.println("\n=== LISTA DE TODAS AS PUBLICAÇÕES ===");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\n--- Publicação " + (i + 1) + " ---");
            publicacoes[i].exibirInfo();  // Chama método específico de cada classe
        }
    }
    
    // Busca ignorando maiúsculas/minúsculas
    public Publicacao buscarPorTitulo(String titulo) {
        for (int i = 0; i < quantidade; i++) {
            // equalsIgnoreCase torna a busca case-insensitive
            if (publicacoes[i].getTitulo().equalsIgnoreCase(titulo)) {
                return publicacoes[i];  // Retorna a primeira ocorrência encontrada
            }
        }
        return null;  // Convenção Java: retornar null quando não encontra
    }
}