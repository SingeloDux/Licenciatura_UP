import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Classe Aluno: Representa um aluno com matrícula e nome.
 */
class Aluno {
    private String matricula;
    private String nome;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nome: " + nome;
    }

    // Sobrescrever equals e hashCode para garantir que a matrícula seja a chave única.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula.equals(aluno.matricula); 
    }

    @Override
    public int hashCode() {
        return matricula.hashCode();
    }
}

/**
 * Classe GerenciadorPresencas: Contém a lógica de negócio para
 * cadastrar alunos e gerenciar o total de faltas.
 */
class GerenciadorPresencas {
    private List<Aluno> listaAlunos;
    private Map<Aluno, Integer> totalFaltas;

    public GerenciadorPresencas() {
        listaAlunos = new ArrayList<>();
        totalFaltas = new HashMap<>();
    }

    /**
     * Adiciona um novo aluno ao sistema e inicializa com 0 faltas.
     */
    public void adicionarAluno(String matricula, String nome) {
        if (buscarAlunoPorMatricula(matricula) != null) {
            System.err.println("Erro: Aluno com matrícula " + matricula + " já está cadastrado.");
            return;
        }

        Aluno novoAluno = new Aluno(matricula, nome);
        listaAlunos.add(novoAluno);
        totalFaltas.put(novoAluno, 0);
        System.out.println("Aluno " + nome + " cadastrado com sucesso.");
    }

    /**
     * Registra uma falta para um aluno pela matrícula e incrementa o contador.
     */
    public void registrarFalta(String matricula) {
        Aluno alunoEncontrado = buscarAlunoPorMatricula(matricula);

        if (alunoEncontrado != null) {
            int faltasAtuais = totalFaltas.get(alunoEncontrado);
            totalFaltas.put(alunoEncontrado, faltasAtuais + 1);
            System.out.println("Falta registrada para: " + alunoEncontrado.getNome() + ". Total atual: " + (faltasAtuais + 1));
        } else {
            System.err.println("Erro: Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

    /**
     * Exibe o relatório de faltas de todos os alunos.
     */
    public void exibirRelatorioFaltas() {
        System.out.println("\n--- Relatório de Faltas ---");
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (Aluno aluno : listaAlunos) {
            int faltas = totalFaltas.get(aluno);
            System.out.println(aluno.getNome() + " (" + aluno.getMatricula() + "): " + faltas + " falta(s).");
        }
        System.out.println("---------------------------");
    }

    /**
     * Método auxiliar privado para buscar um aluno pela matrícula na lista.
     */
    private Aluno buscarAlunoPorMatricula(String matricula) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }
}

/**
 * Classe principal para execução (Menu de console).
 */
 class GestaoPresencas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GerenciadorPresencas gerenciador = new GerenciadorPresencas();
            int opcao;

            // Dados iniciais para teste
            System.out.println("Sistema inicializado com alunos de demonstracao:");
            gerenciador.adicionarAluno("2023001", "Alice Silva");
            gerenciador.adicionarAluno("2023002", "Bruno Costa");
            gerenciador.adicionarAluno("2023003", "Carla Dantas");

            do {
                System.out.println("\n===== Menu de Gestao de Presencas =====");
                System.out.println("1. Registrar Falta");
                System.out.println("2. Adicionar Novo Aluno");
                System.out.println("3. Exibir Relatorio de Faltas");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opcao: ");

                String input = scanner.nextLine();
                try {
                    opcao = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    opcao = -1; // Opção inválida
                }

                switch (opcao) {
                    case 1:
                        System.out.print("Digite a matricula do aluno para registrar falta: ");
                        String matFalta = scanner.nextLine();
                        gerenciador.registrarFalta(matFalta);
                        break;
                    case 2:
                        System.out.print("Digite a nova matricula: ");
                        String novaMat = scanner.nextLine();
                        System.out.print("Digite o nome do aluno: ");
                        String novoNome = scanner.nextLine();
                        gerenciador.adicionarAluno(novaMat, novoNome);
                        break;
                    case 3:
                        gerenciador.exibirRelatorioFaltas();
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema. Ate mais!");
                        break;
                    default:
                        System.out.println("Opcao invalida. Tente novamente.");
                }
            } while (opcao != 0);
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}