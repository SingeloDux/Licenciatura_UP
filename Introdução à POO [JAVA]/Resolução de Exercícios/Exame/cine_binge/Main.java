package cine_binge;

import java.util.Scanner;

/**
 * Classe principal com interface do usuário
 * Demonstra uso dos conceitos de POO na prática
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Maratona maratona = new Maratona("");
    
    public static void main(String[] args) {
        System.out.println("BEM-VINDO AO CINE BINGE!");
        System.out.println("Sistema de Gestão de Maratonas\n");
        
        
        adicionarConteudosDefault();
        exibirMenuPrincipal();
    }

    private static void adicionarConteudosDefault() {
        System.out.println("Adicionando conteúdos default...\n");
        
        // Séries
        maratona.adicionarConteudo(new Serie("Sword Art Online", "Anime", 4));
        maratona.adicionarConteudo(new Serie("Black Mirror", "Ficção Científica", 6));
        
        // Filmes
        maratona.adicionarConteudo(new Filme("Steins;Gate: The Movie", "Ficção Científica", 90));
        maratona.adicionarConteudo(new Filme("The Matrix", "Ficção Científica", 136));
        maratona.adicionarConteudo(new Filme("The Dark Knight", "Ação", 152));
        
        System.out.println("5 conteúdos default adicionados!\n");
    }

    private static void exibirMenuPrincipal() {
        while (true) {
            System.out.println("=" .repeat(40));
            System.out.println("MENU PRINCIPAL");
            System.out.println("=" .repeat(40));
            System.out.println("1. Adicionar Filme");
            System.out.println("2. Adicionar Serie");
            System.out.println("3. Avaliar Conteudo");
            System.out.println("4. Ver Relatorio");
            System.out.println("5. Sair");
            System.out.print("\nEscolha uma opcao: ");
            
            int opcao = lerInteiro();
            
            switch (opcao) {
                case 1:
                    adicionarFilme();
                    break;
                case 2:
                    adicionarSerie();
                    break;
                case 3:
                    avaliarConteudo();
                    break;
                case 4:
                    maratona.exibirRelatorio();
                    break;
                case 5:
                    System.out.println("\nObrigado por usar Cine Binge! Ate a proxima maratona!");
                    return;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        }
    }
    
    private static void adicionarFilme() {
        System.out.println("\nADICIONAR FILME");
        System.out.println("-" .repeat(20));
        
        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();
        
        System.out.print("Genero: ");
        String genero = scanner.nextLine();
        
        System.out.print("Duracao (minutos): ");
        int duracao = lerInteiro();
        
        Filme filme = new Filme(titulo, genero, duracao);
        maratona.adicionarConteudo(filme);
    }
    
    private static void adicionarSerie() {
        System.out.println("\nADICIONAR SERIE");
        System.out.println("-" .repeat(20));
        
        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();
        
        System.out.print("Genero: ");
        String genero = scanner.nextLine();
        
        System.out.print("Temporadas assistidas: ");
        int temporadas = lerInteiro();
        
        Serie serie = new Serie(titulo, genero, temporadas);
        maratona.adicionarConteudo(serie);
    }
    
private static void avaliarConteudo() {
    System.out.println("\nAVALIAR CONTEUDO");
    System.out.println("-".repeat(20));
    
    if (maratona.getTotalConteudos() == 0) {
        System.out.println("Nenhum conteudo para avaliar. Adicione conteudos primeiro!");
        return;
    }
    
    // Listar conteúdos disponíveis para avaliar
    System.out.println("Conteudos cadastrados:");
    int index = 1;
    for (Conteudo conteudo : maratona.getConteudos()) {
        String tipo = (conteudo instanceof Serie) ? "Serie" : "Filme";
        System.out.println(index + ". " + conteudo.getTitulo() + " (" + tipo + ")");
        index++;
    }
    
    System.out.print("\nEscolha o numero do conteudo: ");
    int escolha = lerInteiro();
    
    if (escolha < 1 || escolha > maratona.getTotalConteudos()) {
        System.out.println("Numero invalido!");
        return;
    }
    
    System.out.print("Nota (0-5 estrelas): ");
    int nota = lerInteiro();
    
    if (nota < 0 || nota > 5) {
        System.out.println("Nota deve ser entre 0 e 5!");
        return;
    }
    
    // Pegar o conteúdo escolhido
    Conteudo conteudoEscolhido = maratona.getConteudos().get(escolha - 1);
    maratona.avaliarConteudo(conteudoEscolhido.getTitulo(), nota);
}
    
    private static int lerInteiro() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Por favor, digite um numero valido: ");
            }
        }
    }
}