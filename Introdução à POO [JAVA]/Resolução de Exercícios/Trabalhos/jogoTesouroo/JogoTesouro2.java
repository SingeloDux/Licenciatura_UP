package jogoTesouroo;
import java.util.Scanner;
import java.util.Random;

// Classe que representa o tabuleiro do jogo
class Tabuleiro {
    private int linhas;
    private int colunas;
    private int tesouroLinha;
    private int tesouroColuna;

    // Construtor que inicializa o tabuleiro
    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        Random rand = new Random();
        this.tesouroLinha = rand.nextInt(linhas); 
        this.tesouroColuna = rand.nextInt(colunas);
    }

    public boolean verificarTesouro(int linha, int coluna) {
        return (linha == tesouroLinha && coluna == tesouroColuna);
    }

    public String darDica(int linha, int coluna) {
        if (linha < tesouroLinha) return "Mais para baixo!";
        if (linha > tesouroLinha) return "Mais para cima!";
        if (coluna < tesouroColuna) return "Mais para a direita!";
        if (coluna > tesouroColuna) return "Mais para a esquerda!";
        return "";
    }

    // Métodos de acesso (getters)
    public int getLinhas() { return linhas; }
    public int getColunas() { return colunas; }
}

// Classe que representa o jogador
class Jogador {
    private String nome;
    private int tentativas;

    // Construtor define o nome e zera tentativas
    public Jogador(String nome) {
        this.nome = nome;
        this.tentativas = 0;
    }

    // Método para contar mais uma tentativa
    public void incrementarTentativa() {
        tentativas++;
    }

    // Getters → acesso controlado aos atributos privados
    public int getTentativas() {
        return tentativas;
    }

    public String getNome() {
        return nome;
    }
}

// Classe auxiliar para exibir pontuação final
class Pontuacao {
    public void mostrarResultado(Jogador jogador) {
        System.out.println("Parabéns " + jogador.getNome() +
                "! Você encontrou o tesouro em " +
                jogador.getTentativas() + " tentativas.");
    }
}

// Classe principal que controla o jogo
public class JogoTesouro2 {
    private Tabuleiro tabuleiro;
    private Jogador jogador;
    private Pontuacao pontuacao;

    // Construtor da classe principal
    public JogoTesouro2(String nomeJogador, int linhas, int colunas) {
        tabuleiro = new Tabuleiro(linhas, colunas);
        jogador = new Jogador(nomeJogador);
        pontuacao = new Pontuacao();
    }

    // Método que inicia o jogo
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean encontrado = false;

        System.out.println("Bem-vindo ao jogo do Tesouro, " + jogador.getNome() + "!");
        System.out.println("Tente encontrar o tesouro no tabuleiro de " +
                tabuleiro.getLinhas() + "x" + tabuleiro.getColunas() + ".");

        // Laço até o jogador encontrar o tesouro
        while (!encontrado) {
            System.out.print("Digite a linha (0 a " + (tabuleiro.getLinhas() - 1) + "): ");
            int linha = scanner.nextInt();

            System.out.print("Digite a coluna (0 a " + (tabuleiro.getColunas() - 1) + "): ");
            int coluna = scanner.nextInt();

            jogador.incrementarTentativa(); // registra a tentativa

            if (tabuleiro.verificarTesouro(linha, coluna)) {
                // Usa a classe Pontuacao para exibir o resultado final
                pontuacao.mostrarResultado(jogador);
                encontrado = true;
            } else {
                System.out.println("Nada aqui. Dica: " + tabuleiro.darDica(linha, coluna));
            }
        }

        scanner.close();
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            JogoTesouro2 jogo = new JogoTesouro2(nome, 4, 4);
            jogo.iniciar();
        }
    }
}
