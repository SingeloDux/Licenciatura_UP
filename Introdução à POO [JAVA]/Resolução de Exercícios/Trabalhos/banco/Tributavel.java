package banco;

// Interface para contas que pagam impostos
interface Tributavel {
    double calcularTributo();
    double calcularTaxaManutencao();
    void aplicarTributo();
}