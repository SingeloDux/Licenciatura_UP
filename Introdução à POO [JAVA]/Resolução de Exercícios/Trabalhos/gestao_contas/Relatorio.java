package gestao_contas;

// Interface para geração de relatórios
public interface Relatorio {
    void gerarRelatorio();
    double calcularTotal();
    double calcularMedia();
    String getTituloRelatorio();
}