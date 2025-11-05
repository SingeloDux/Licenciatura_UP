package gestao_contas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Classe abstrata base para todas as contas
public abstract class Conta {
    // Atributos encapsulados
    private String codigo;
    private String descricao;
    private double valor;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private String categoria;
    private String observacoes;
    
    // Construtor
    public Conta(String codigo, String descricao, double valor, 
                LocalDate dataVencimento, String categoria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.categoria = categoria;
        this.observacoes = "";
    }
    
    // Getters e Setters com validações
    public String getCodigo() { return codigo; }
    
    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        }
    }
    
    public String getDescricao() { return descricao; }
    
    public void setDescricao(String descricao) {
        if (descricao != null && !descricao.trim().isEmpty()) {
            this.descricao = descricao;
        }
    }
    
    public double getValor() { return valor; }
    
    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        }
    }
    
    public LocalDate getDataVencimento() { return dataVencimento; }
    
    public void setDataVencimento(LocalDate dataVencimento) {
        if (dataVencimento != null) {
            this.dataVencimento = dataVencimento;
        }
    }
    
    public LocalDate getDataPagamento() { return dataPagamento; }
    
    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    public String getCategoria() { return categoria; }
    
    public void setCategoria(String categoria) {
        if (categoria != null && !categoria.trim().isEmpty()) {
            this.categoria = categoria;
        }
    }
    
    public String getObservacoes() { return observacoes; }
    
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    // Métodos abstratos - polimorfismo obrigatório
    public abstract String getTipo();
    public abstract double calcularValorFinal();
    public abstract boolean isAtrasada();
    
    // Métodos concretos
    public void pagar() {
        this.dataPagamento = LocalDate.now();
    }
    
    public boolean isPaga() {
        return dataPagamento != null;
    }
    
    public long getDiasAtraso() {
        if (isPaga() || LocalDate.now().isBefore(dataVencimento)) {
            return 0;
        }
        return java.time.temporal.ChronoUnit.DAYS.between(dataVencimento, LocalDate.now());
    }
    
    public void exibirDetalhes() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Tipo: " + getTipo());
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
        System.out.println("Valor Final: R$ " + String.format("%.2f", calcularValorFinal()));
        System.out.println("Categoria: " + categoria);
        System.out.println("Vencimento: " + dataVencimento.format(formatter));
        System.out.println("Status: " + (isPaga() ? "PAGA" : "PENDENTE"));
        
        if (isPaga()) {
            System.out.println("Pagamento: " + dataPagamento.format(formatter));
        }
        
        if (isAtrasada()) {
            System.out.println("DIAS EM ATRASO: " + getDiasAtraso());
        }
        
        if (!observacoes.isEmpty()) {
            System.out.println("Observações: " + observacoes);
        }
    }
}