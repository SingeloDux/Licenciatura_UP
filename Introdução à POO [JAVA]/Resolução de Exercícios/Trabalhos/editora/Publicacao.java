/*
1. Classe Base: Publicacao
  - Atributos privados: titulo (String), ano (int).

Construtores:
- Um que recebe apenas titulo;
-  Um que recebe titulo e ano;
- Copy constructor.

Métodos getters e setters
Método exibirInfo() que mostra título e ano.-
 */

package editora;

public class Publicacao {
    // ENCAPSULAMENTO: atributos privados para controle de acesso
    private String titulo;
    private int ano;
    
    // SOBRECARGA DE CONSTRUTORES - diferentes formas de criar objetos
    // Construtor 1: apenas título (ano assume valor padrão 0)
    public Publicacao(String titulo) {
        this.titulo = titulo;
        this.ano = 0;  // Valor padrão indica "não informado"
    }
    
    // Construtor 2: título e ano (forma completa)
    public Publicacao(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }
    
    // COPY CONSTRUCTOR - cria uma cópia independente de outra Publicacao
    public Publicacao(Publicacao outra) {
        this.titulo = outra.titulo;  // Copia título
        this.ano = outra.ano;        // Copia ano
    }
    
    // GETTERS e SETTERS - controle de acesso aos atributos privados
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
    
    // Método que será SOBRESCRITO pelas classes filhas (polimorfismo)
    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        // Operador ternário para tratamento de valor padrão
        System.out.println("Ano: " + (ano == 0 ? "Não informado" : ano));
    }
}
