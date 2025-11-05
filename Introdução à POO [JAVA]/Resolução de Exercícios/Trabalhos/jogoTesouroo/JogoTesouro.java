package jogoTesouroo;

import java.util.Scanner;
import java.util.Random;

// Classe que representa o tabuleiro
class Tabuleiro {
    private int linhas;
    private int colunas;
    private int tesouroLinha;
    private int tesouroColuna;

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        // Tesouro aleatório
        Random rand = new Random();
        this.tesouroLinha = rand.nextInt(linhas);
        this.tesouroColuna = rand.nextInt(colunas);
    }

    // Checa se a jogada acertou o tesouro
    public boolean verificarTesouro(int linha, int coluna) {
        return (linha == tesouroLinha && coluna == tesouroColuna);
    }

    //Dá dica da distância para o tesouro
    public String darDica(int linha, int coluna) {
        if (linha < tesouroLinha) return "Mais para baixo!";
        if (linha > tesouroLinha) return "Mais para cima!";
        if (coluna < tesouroColuna) return "Mais para a direita!";
        if (coluna > tesouroColuna) return "Mais para a esquerda!";
        return "";
    }

    public int getLinhas() { return linhas; }
    public int getColunas() { return colunas; }
}

// Classe que representa o jogador
class Jogador {
    private String nome;
    private int tentativas;

    public Jogador(String nome) {
        this.nome = nome;
        this.tentativas = 0;
    }

    public void incrementarTentativa() {
        tentativas++;
    }

    public int getTentativas() {
        return tentativas;
    }

    public String getNome() {
        return nome;
    }
}

// Classe principal que controla o jogo
public class JogoTesouro {
    private Tabuleiro tabuleiro;
    private Jogador jogador;

    public JogoTesouro(String nomeJogador, int linhas, int colunas) {
        tabuleiro = new Tabuleiro(linhas, colunas);
        jogador = new Jogador(nomeJogador);
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean encontrado = false;

        System.out.println("Bem-vindo ao jogo do Tesouro, " + jogador.getNome() + "!");
        System.out.println("Tente encontrar o tesouro no tabuleiro de " +
                            tabuleiro.getLinhas() + "x" + tabuleiro.getColunas() + ".");

        while (!encontrado) {
            System.out.print("Digite a linha (0 a " + (tabuleiro.getLinhas()-1) + "): ");
            int linha = scanner.nextInt();

            System.out.print("Digite a coluna (0 a " + (tabuleiro.getColunas()-1) + "): ");
            int coluna = scanner.nextInt();

            jogador.incrementarTentativa();

            if (tabuleiro.verificarTesouro(linha, coluna)) {
                System.out.println("Parabéns! Você encontrou o tesouro em " + jogador.getTentativas() + " tentativas!");
                encontrado = true;
            } else {
                System.out.println("Nada aqui. Dica: " + tabuleiro.darDica(linha, coluna));
            }
        }

        scanner.close();
    }

    // Método main para rodar o jogo
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            JogoTesouro jogo = new JogoTesouro(nome, 5, 5); // Tabuleiro 5x5
            jogo.iniciar();
        }
    }
}
