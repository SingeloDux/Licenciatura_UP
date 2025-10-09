/***
Caro estudante, aplicando os conceitos de 
- encapsulamento, 
- Array de objecto, 
- constructor
- herança simples 
Implementem um sistema em Java para gerenciar uma biblioteca. O sistema deve conter:

5. Classe Principal Main
- Criar objetos Livro e Revista usando diferentes construtores.

- Usar o copy constructor para duplicar uma publicação.
- Inserir todas em um array de Publicacao dentro da Biblioteca.
- Listar todas as publicações.
- Buscar um título específico e exibir suas informações.
 */

package editora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║     SISTEMA DE GESTÃO DE BIBLIOTECA  ║");
        System.out.println("╚══════════════════════════════════════╝");
        
        Biblioteca biblioteca = new Biblioteca(20);
        
        System.out.println("\n INICIALIZANDO BIBLIOTECA COM PUBLICAÇÕES...");
        
        // Criando publicações usando diferentes construtores
        Livro livro1 = new Livro("Jogador Numero 1", "Ernest Cline");
        Livro livro2 = new Livro("Cyberstorm", "Matthew Mather");
        Livro livro3 = new Livro("A Varanda do Frangipani", "Mia Couto");
        Livro livro4 = new Livro("O Código Da Vinci", 2003, "Dan Brown");
        Livro livro5 = new Livro("Eu Estive Aqui", "Gayle Forman");
        
        Revista revista1 = new Revista("Geek Verso", 2023, 2);
        Revista revista2 = new Revista("Jovem Geek", 2025, 45);
        
        // Adicionando à biblioteca
        biblioteca.adicionar(livro1);
        biblioteca.adicionar(livro2);
        biblioteca.adicionar(livro3);
        biblioteca.adicionar(livro4);
        biblioteca.adicionar(livro5);
        biblioteca.adicionar(revista1);
        biblioteca.adicionar(revista2);
        
        // USANDO COPY CONSTRUCTOR
        System.out.println("\n CRIANDO CÓPIA DE PUBLICAÇÃO...");
        Publicacao copiaLivro = new Publicacao(livro1);
        biblioteca.adicionar(copiaLivro);
        System.out.println("Cópia de '" + livro1.getTitulo() + "' adicionada!");
        
        // LISTAGEM ORGANIZADA
        System.out.println("\n" + "═".repeat(50));
        System.out.println("LISTAGEM COMPLETA DA BIBLIOTECA");
        System.out.println("═".repeat(50));
        biblioteca.listar();
        
        // BUSCA INTERATIVA VIA INPUT DO USUÁRIO
        System.out.println("\n" + "═".repeat(50));
        System.out.println("🔍 SISTEMA DE BUSCA INTERATIVA");
        System.out.println("═".repeat(50));
        
        boolean continuarBusca = true;
        while (continuarBusca) {
            System.out.print("\nDigite o título para buscar (ou 'sair' para encerrar): ");
            String tituloBusca = scanner.nextLine();
            
            if (tituloBusca.equalsIgnoreCase("sair")) {
                continuarBusca = false;
                System.out.println("Encerrando busca...");
            } else if (tituloBusca.trim().isEmpty()) {
                System.out.println("Por favor, digite um título válido.");
            } else {
                Publicacao resultado = biblioteca.buscarPorTitulo(tituloBusca);
                if (resultado != null) {
                    System.out.println("\nPUBLICAÇÃO ENCONTRADA!");
                    System.out.println("─".repeat(30));
                    resultado.exibirInfo();
                    System.out.println("─".repeat(30));
                } else {
                    System.out.println("Publicação '" + tituloBusca + "' não encontrada na biblioteca.");
                }
            }
        }
        
        // ESTATÍSTICAS DINÂMICAS
        System.out.println("\n" + "═".repeat(50));
        System.out.println("ESTATÍSTICAS DA BIBLIOTECA");
        System.out.println("═".repeat(50));
        
        System.out.println("• Total de Publicações: 9");
        System.out.println("• Livros: 5");
        System.out.println("• Revistas: 2");
        System.out.println("• Autores internacionais: Matthew Mather, Dan Brown, Ernest Cline, Gayle Forman");
        System.out.println("• Autores lusófonos: Mia Couto");
        
        System.out.println("\n" + "=".repeat(25));
        System.out.println("BIBLIOTECA CONFIGURADA COM SUCESSO!");
        System.out.println("=".repeat(25));
        
        scanner.close();
    }
}