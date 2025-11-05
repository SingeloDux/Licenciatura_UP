/**
 *Actividade Adicional
Actividade 1: Melhore o sistema de veículos
· Adicione uma classe Caminhão que herde de Veículo
· Implemente métodos específicos para caminhões
· Crie uma interface VeiculoCarga com métodos para calcular capacidade de carga

 **/
package veiculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE SISTEMA DE VEÍCULOS ===");
        
        // Polimorfismo - tratando diferentes veículos como Veiculo
        Veiculo[] veiculos = {
            new Carro("Toyota", "Corolla", 2022, 120000, 4, "Gasolina"),
            new Carro("Tesla", "Model 3", 2023, 250000, 4, "Elétrico"),
            new Moto("Honda", "CB 500", 2021, 35000, 500, true),
            new Moto("Yamaha", "Factor 150", 2020, 15000, 150, false),
            new Caminhao("Volvo", "FH 540", 2023, 350000, 25.0, 6, "Granel")
        };
        
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirInformacoes();
            System.out.println("Imposto: R$" + veiculo.calcularImposto());
            System.out.println("---");
        }
        
        // Teste de encapsulamento
        System.out.println("=== TESTE ENCAPSULAMENTO ===");
        Carro meuCarro = new Carro("Ford", "Fiesta", 2018, 45000, 4, "Gasolina");
        
        // Acessando através dos getters (encapsulamento)
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        
        // Tentativa de setar valores inválidos
        meuCarro.setAno(1700); // Não deve funcionar
        System.out.println("Ano após tentativa inválida: " + meuCarro.getAno());
        
        meuCarro.setPreco(-1000); // Não deve funcionar
        System.out.println("Preço após tentativa inválida: " + meuCarro.getPreco());
        
        // Testando métodos específicos do caminhão
        System.out.println("\n=== TESTE MÉTODOS ESPECÍFICOS ===");
        Caminhao caminhao = new Caminhao("Scania", "R500", 2023, 400000, 30.0, 6, "Container");
        caminhao.carregar(15000); // Dentro do limite
        caminhao.carregar(35000); // Fora do limite
    }
}