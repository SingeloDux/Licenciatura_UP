/*
 3. Classe Derivada: Revista (herança simples)
- Herdar Publicacao.

Novo atributo privado: edicao (int).

Construtores:
- Inicializar titulo, ano e edicao.
- Sobrescrever exibirInfo() para mostrar título, ano e edição.-

 */
package editora;

public class Revista extends Publicacao {
    // Atributo específico da Revista - não existe na classe Publicacao
    private int edicao;
    
    // Construtor específico para Revista - usa super() para herdar título e ano
    public Revista(String titulo, int ano, int edicao) {
        super(titulo, ano);  // Chama construtor da classe pai (Publicacao)
        this.edicao = edicao;  // Inicializa atributo específico da Revista
    }
    
    // Getters e Setters - encapsulamento do atributo específico
    public int getEdicao() { return edicao; }
    public void setEdicao(int edicao) { this.edicao = edicao; }
    
    // SOBRESCRITA (Override) - especializa o comportamento da classe pai
    @Override
    public void exibirInfo() {
        super.exibirInfo();  // Reaproveita o comportamento da classe pai
        System.out.println("Edição: " + edicao);  // Adiciona informação específica
    }
}