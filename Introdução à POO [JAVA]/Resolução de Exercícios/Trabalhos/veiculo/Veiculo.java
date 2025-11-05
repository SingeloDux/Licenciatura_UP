package veiculo;

//Exercício 1: Sistema de Veículos (Encapsulamento e Herança)

// Classe base Veiculo com encapsulamento
public class Veiculo {
    // Atributos privados - encapsulamento
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    
    // Construtor
    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }
    
    // Getters e Setters - controle de acesso
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        if(marca != null && !marca.isEmpty()) {
            this.marca = marca;
        }
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        if(modelo != null && !modelo.isEmpty()) {
            this.modelo = modelo;
        }
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        if(ano > 1885 && ano <= 2024) { // Validação
            this.ano = ano;
        }
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        if(preco > 0) {
            this.preco = preco;
        }
    }
    
    // Método que será sobrescrito - polimorfismo
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo +
                         ", Ano: " + ano + ", Preço: R$" + preco);
    }
    
    public double calcularImposto() {
        return preco * 0.03; // 3% de imposto padrão
    }
}

