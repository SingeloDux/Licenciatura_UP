import java.util.ArrayList;
import java.util.Scanner;

// Classe BASE (superclasse)
class Participante {
    protected String nome;
    protected int idade;
    
    // CONSTRUTOR da classe base
    public Participante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

// Classe DERIVADA 1 - Candidato (herda de Participante)
class Candidato extends Participante {
    private int numero;
    private String partido;
    private int votos;
    
    // CONSTRUTOR da classe derivada
    public Candidato(String nome, int idade, int numero, String partido) {
        super(nome, idade); // Chamando o construtor da classe base
        this.numero = numero;
        this.partido = partido;
        this.votos = 0;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public int getVotos() {
        return votos;
    }
    
    public String getPartido() {
        return partido;
    }

    public void adicionarVoto() {
        this.votos++;
    }
    
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("   Candidato - Número: " + numero + ", Partido: " + partido + ", Votos: " + votos);
    }
}

// Classe DERIVADA 2 - Voto (herda de... nada, mas vamos criar uma classe separada)
class Voto {
    private int codigo;
    private String descricao;
    private boolean isNulo;
    private boolean isBranco;
    
    // CONSTRUTOR para voto em candidato
    public Voto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.isNulo = false;
        this.isBranco = false;
    }
    
    // CONSTRUTOR para voto nulo ou branco
    public Voto(int codigo, String descricao, boolean isNulo, boolean isBranco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.isNulo = isNulo;
        this.isBranco = isBranco;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public boolean isNulo() {
        return isNulo;
    }
    
    public boolean isBranco() {
        return isBranco;
    }
}

// Classe principal
public class EleicaoPresidencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando candidatos usando a classe Candidato (que herda de Participante)
        ArrayList<Candidato> candidatos = new ArrayList<>();
        candidatos.add(new Candidato("Joao Cossa", 45, 1, "Partido A"));
        candidatos.add(new Candidato("Maria Tembe", 52, 2, "Partido B"));
        candidatos.add(new Candidato("Pedro Macie", 38, 3, "Partido C"));
        candidatos.add(new Candidato("Ana Matavel", 41, 4, "Partido D"));
        
        // Listas para armazenar os votos
        ArrayList<Voto> votosRegistrados = new ArrayList<>();
        int nulos = 0;
        int brancos = 0;
        int total = 0;
        int voto;
        
        System.out.println("=== ELEICAO PRESIDENCIAL ===\n");
        System.out.println("Candidatos:");
        for (Candidato c : candidatos) {
            System.out.println(c.getNumero() + " - " + c.getNome() + " (" + c.getPartido() + ")");
        }
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("0 - Sair\n");
        
        do {
            System.out.print("Digite seu voto: ");
            voto = scanner.nextInt();
            
            if (voto != 0) {
                switch (voto) {
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4:
                        // Encontrar o candidato correspondente
                        for (Candidato c : candidatos) {
                            if (c.getNumero() == voto) {
                                c.adicionarVoto();
                                votosRegistrados.add(new Voto(voto, c.getNome()));
                                System.out.println("Voto registrado para " + c.getNome());
                                break;
                            }
                        }
                        break;
                        
                    case 5:
                        nulos++;
                        votosRegistrados.add(new Voto(voto, "Nulo", true, false));
                        System.out.println("Voto nulo registrado!");
                        break;
                        
                    case 6:
                        brancos++;
                        votosRegistrados.add(new Voto(voto, "Branco", false, true));
                        System.out.println("Voto em branco registrado!");
                        break;
                        
                    default:
                        System.out.println("Codigo inválido! Use 1-6 ou 0 para sair.");
                        continue;
                }
                total++;
            }
            
        } while (voto != 0);
        
        // Cálculo dos percentuais
        double percNulos = (total > 0) ? (nulos * 100.0) / total : 0;
        double percBrancos = (total > 0) ? (brancos * 100.0) / total : 0;
        
        // Resultados
        System.out.println("\n=== RESULTADOS DA ELEICAO ===\n");
        
        System.out.println("--- Votos por Candidato (usando HERANCA) ---");
        for (Candidato c : candidatos) {
            c.exibirInfo(); // Método da classe base + método sobrescrito
        }
        
        System.out.println("\n--- Votos Nulos e Brancos ---");
        System.out.println("Nulos: " + nulos + " (" + String.format("%.1f", percNulos) + "%)");
        System.out.println("Brancos: " + brancos + " (" + String.format("%.1f", percBrancos) + "%)");
        System.out.println("Total de votos: " + total);
        
        System.out.println("\n--- Todos os votos registrados (demonstrando CONSTRUTORES) ---");
        for (Voto v : votosRegistrados) {
            System.out.println("Voto: " + v.getDescricao() + " (Codigo: " + v.getCodigo() + ")");
        }
        
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