package veiculo;

// Interface para veículos de carga
interface VeiculoCarga {
    double calcularCapacidadeCarga();
    boolean verificarLimiteCarga(double peso);
    String getTipoCarga();
}