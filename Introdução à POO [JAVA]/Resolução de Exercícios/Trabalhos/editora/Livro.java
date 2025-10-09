/*
2. Classe Derivada: Livro (herança simples)
- Herdare Publicacao.
- Novo atributo privado: autor (String).

Construtores:
- Reaproveitar construtores da superclasse com super(...).
-  Um que inicialize titulo, ano e autor.

- Sobrescrever exibirInfo() para mostrar título, ano e autor.
 */
package editora;

public class Livro extends Publicacao {
    // Atributo específico da classe Livro
    private String autor;
    
    // SOBRECARGA DE CONSTRUTORES - diferentes formas de criar um Livro
    // Construtor 1: apenas título e autor (ano assume valor padrão)
    public Livro(String titulo, String autor) {
        super(titulo);  // Reaproveita construtor da superclasse
        this.autor = autor;
    }
    
    // Construtor 2: título, ano e autor (forma completa)
    public Livro(String titulo, int ano, String autor) {
        super(titulo, ano);  // Reaproveita outro construtor da superclasse
        this.autor = autor;
    }
    
    // Getters e Setters para o atributo específico
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    
    // POLIMORFISMO: sobrescreve método para adicionar informação do autor
    @Override
    public void exibirInfo() {
        super.exibirInfo();    // Mantém comportamento da classe pai
        System.out.println("Autor: " + autor);  // Adiciona informação específica
    }
}