package gestao_contas;

// Enum para categorias de contas
public enum Categoria {
    ALIMENTACAO("Alimentação"),
    TRANSPORTE("Transporte"),
    MORADIA("Moradia"),
    SAUDE("Saúde"),
    EDUCACAO("Educação"),
    ENTRETENIMENTO("Entretenimento"),
    SALARIO("Salário"),
    VENDAS("Vendas"),
    SERVICOS("Serviços"),
    OUTROS("Outros");
    
    private final String descricao;
    
    Categoria(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}