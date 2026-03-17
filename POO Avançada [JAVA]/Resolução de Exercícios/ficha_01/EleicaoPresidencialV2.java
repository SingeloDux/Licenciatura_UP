
/*
 * EleicaoPresidencialV2.java
 * Evolucao de EleicaoPresidencial.java
 *
 * O que foi adicionado nesta versao:
 *
 * INTERFACES
 *   - Exibivel  → define exibirInfo()
 *   - Votavel   → define adicionarVoto(), getVotos(), getNome(), getCodigo()
 *
 * POLIMORFISMO
 *   1. ArrayList<Votavel> todosVotaveis
 *      Contem Candidato e TipoVoto juntos. No loop de votacao,
 *      chamamos v.adicionarVoto() e v.getCodigo() sem saber qual
 *      tipo e — isso e polimorfismo.
 *
 *   2. ArrayList<Exibivel> todosExibiveis
 *      Chamamos e.exibirInfo() e cada objeto exibe de forma diferente:
 *      Candidato mostra nome + partido + votos;
 *      TipoVoto mostra apenas o tipo e os votos.
 */

import java.util.ArrayList;
import java.util.Scanner;

// =============================================================
// INTERFACES - definem um "contrato" que as classes devem cumprir
// =============================================================
// Interface Exibivel: qualquer classe que a implemente DEVE ter o método exibirInfo()

interface Exibivel {
    void exibirInfo();
}

// Interface Votavel: define o contrato de tudo que pode receber votos
// (candidatos, voto nulo, voto em branco - todos são "votáveis")
interface Votavel {
    void adicionarVoto();
    int getVotos();
    String getNome();
    int getCodigo(); // numero do candidato OU código do tipo de voto
}

// =============================================================
// CLASSE BASE
// =============================================================

// Participante implementa Exibivel → é obrigado a ter exibirInfo()
class Participante implements Exibivel {
    protected String nome;
    protected int idade;

    public Participante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

// =============================================================
// CLASSE DERIVADA - herda de Participante E implementa Votavel
// =============================================================

// Candidato herda tudo de Participante (incluindo a interface Exibivel)
// E TAMBÉM implementa Votavel → pode receber votos
class Candidato extends Participante implements Votavel {
    private int numero;
    private String partido;
    private int votos;

    public Candidato(String nome, int idade, int numero, String partido) {
        super(nome, idade); // chama o construtor de Participante
        this.numero = numero;
        this.partido = partido;
        this.votos = 0;
    }

    @Override
    public int getCodigo() {
        return numero; // para Candidato, o "código" é o número dele
    }

    @Override
    public int getVotos() {
        return votos;
    }

    public String getPartido() {
        return partido;
    }

    @Override
    public void adicionarVoto() {
        this.votos++;
    }

    // Sobrescrita (Override) do método exibirInfo de Participante
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // exibe nome e idade (da classe pai)
        System.out.println("   Candidato nº " + numero + " | Partido: " + partido + " | Votos: " + votos);
    }
}

// =============================================================
// CLASSE TIPO DE VOTO - implementa Votavel e Exibivel diretamente
// =============================================================

// TipoVoto representa Voto Nulo e Voto em Branco.
// Também implementa Votavel → é tratado IGUAL a um candidato na contagem!
// Isso é POLIMORFISMO: mesma interface, comportamentos diferentes
class TipoVoto implements Votavel, Exibivel {
    private String nome;
    private int codigo;
    private int votos;

    public TipoVoto(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.votos = 0;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public void adicionarVoto() {
        this.votos++;
    }

    @Override
    public int getVotos() {
        return votos;
    }

    @Override
    public void exibirInfo() {
        System.out.println(nome + ": " + votos + " votos");
    }
}

// =============================================================
// CLASSE PRINCIPAL
// =============================================================

public class EleicaoPresidencialV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando os candidatos
        ArrayList<Candidato> candidatos = new ArrayList<>();
        candidatos.add(new Candidato("Joao Cossa",   45, 1, "Partido A"));
        candidatos.add(new Candidato("Maria Tembe",  52, 2, "Partido B"));
        candidatos.add(new Candidato("Pedro Macie",  38, 3, "Partido C"));
        candidatos.add(new Candidato("Ana Matavel",  41, 4, "Partido D"));

        // Criando os tipos especiais de voto
        TipoVoto votoNulo   = new TipoVoto("Voto Nulo",   5);
        TipoVoto votoBranco = new TipoVoto("Voto Branco", 6);

        // =========================================================
        // POLIMORFISMO em acão: lista do tipo INTERFACE (Votavel)
        // Ela aceita QUALQUER objeto que implemente Votavel,
        // seja ele Candidato ou TipoVoto — ambos são tratados igual!
        // =========================================================
        ArrayList<Votavel> todosVotaveis = new ArrayList<>();
        for (Candidato c : candidatos) {
            todosVotaveis.add(c);   // Candidato é Votavel
        }
        todosVotaveis.add(votoNulo);    // TipoVoto também é Votavel
        todosVotaveis.add(votoBranco);

        int total = 0;

        // Exibir menu
        System.out.println("=== ELEICAO PRESIDENCIAL v2 (com Interfaces e Polimorfismo) ===\n");
        System.out.println("Candidatos:");
        for (Candidato c : candidatos) {
            System.out.println("  " + c.getCodigo() + " - " + c.getNome() + " (" + c.getPartido() + ")");
        }
        System.out.println("  5 - Voto Nulo");
        System.out.println("  6 - Voto em Branco");
        System.out.println("  0 - Encerrar votacao\n");

        // Loop de votação
        int voto;
        do {
            System.out.print("Digite seu voto: ");
            voto = scanner.nextInt();

            if (voto == 0) break;

            // POLIMORFISMO: percorremos a lista de Votaveis e chamamos
            // adicionarVoto() — não importa se é Candidato ou TipoVoto!
            boolean votoValido = false;
            for (Votavel v : todosVotaveis) {
                if (v.getCodigo() == voto) {
                    v.adicionarVoto(); // <-- mesmo chamado, comportamento polimórfico
                    System.out.println("Voto registrado: " + v.getNome());
                    total++;
                    votoValido = true;
                    break;
                }
            }

            if (!votoValido) {
                System.out.println("Codigo invalido! Use 1-6 ou 0 para encerrar.");
            }

        } while (true);

        // =========================================================
        // POLIMORFISMO via interface Exibivel
        // Lista que aceita tanto Candidato (que herda Exibivel via Participante)
        // quanto TipoVoto (que implementa Exibivel diretamente)
        // =========================================================
        ArrayList<Exibivel> todosExibiveis = new ArrayList<>();
        for (Candidato c : candidatos) {
            todosExibiveis.add(c);
        }
        todosExibiveis.add(votoNulo);
        todosExibiveis.add(votoBranco);

        // Exibir resultados
        System.out.println("\n=== RESULTADOS DA ELEICAO ===\n");
        System.out.println("--- Detalhes (POLIMORFISMO via interface Exibivel) ---");
        for (Exibivel e : todosExibiveis) {
            e.exibirInfo(); // cada objeto exibe de forma diferente, mas a chamada é igual
        }

        System.out.println("\nTotal de votos: " + total);

        // Determinar o vencedor
        System.out.println("\n--- VENCEDOR ---");
        Candidato vencedor = candidatos.get(0);
        for (Candidato c : candidatos) {
            if (c.getVotos() > vencedor.getVotos()) {
                vencedor = c;
            }
        }

        if (vencedor.getVotos() > 0) {
            System.out.println("O vencedor eh " + vencedor.getNome() +
                               " com " + vencedor.getVotos() + " votos!");
        } else {
            System.out.println("Nenhum candidato recebeu votos!");
        }

        scanner.close();
    }
}
