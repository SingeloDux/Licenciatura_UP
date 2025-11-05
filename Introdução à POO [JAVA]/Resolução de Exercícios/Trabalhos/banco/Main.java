package banco;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE SISTEMA BANCÁRIO ===");
        
        // Polimorfismo com contas bancárias
        Conta[] contas = {
            new ContaCorrente("12345-6", "João Silva", 1500.0, "001", 1000.0),
            new ContaPoupanca("78901-2", "Maria Santos", 5000.0, "001", 0.005, 15),
            new ContaCorrente("34567-8", "Pedro Oliveira", 800.0, "002", 500.0),
            new ContaPoupanca("90123-4", "Ana Costa", 3000.0, "002", 0.004, 10)
        };
        
        // Testando operações com polimorfismo
        for (Conta conta : contas) {
            System.out.println("=== OPERAÇÕES DA CONTA ===");
            conta.exibirExtrato();
            
            // Operações bancárias básicas
            conta.depositar(200.0);
            conta.sacar(100.0);
            
            // Operações específicas por tipo
            if (conta instanceof ContaCorrente) {
                ContaCorrente cc = (ContaCorrente) conta;
                System.out.println("Tributo: R$" + String.format("%.2f", cc.calcularTributo()));
                cc.aplicarTributo();
                
                // Testando cheque especial
                System.out.println("--- Testando Cheque Especial ---");
                cc.sacar(1800.0); // Deve usar cheque especial
            } else if (conta instanceof ContaPoupanca) {
                ContaPoupanca cp = (ContaPoupanca) conta;
                cp.aplicarTaxaMensal(); // Simular rendimento
                
                // Simulação de rendimento
                System.out.println("--- Simulação de Rendimento ---");
                cp.simularRendimento(2);
            }
            
            System.out.println("---");
        }
        
        // Testando transferência entre contas
        System.out.println("=== TRANSFERÊNCIA ENTRE CONTAS ===");
        if (contas.length >= 2) {
            contas[0].transferir(300.0, contas[1]);
            System.out.println("--- Após Transferência ---");
            contas[0].exibirExtrato();
            contas[1].exibirExtrato();
        }
        
        // Testando interface Tributavel
        System.out.println("\n=== CONTAS TRIBUTÁVEIS ===");
        for (Conta conta : contas) {
            if (conta instanceof Tributavel) {
                Tributavel tributavel = (Tributavel) conta;
                System.out.println("Conta de " + conta.getTitular() + 
                                 " - Tributo: R$" + String.format("%.2f", tributavel.calcularTributo()));
            }
        }
        
        // Teste de encapsulamento
        System.out.println("\n=== TESTE ENCAPSULAMENTO BANCÁRIO ===");
        ContaCorrente contaTeste = new ContaCorrente("99999-9", "Teste Silva", 2000.0, "003", 800.0);
        
        System.out.println("Saldo inicial: R$" + contaTeste.getSaldo());
        System.out.println("Titular: " + contaTeste.getTitular());
        
        // Tentativa de operações inválidas
        contaTeste.depositar(-100); // Não deve funcionar
        contaTeste.sacar(-50); // Não deve funcionar
        contaTeste.sacar(3000); // Não deve funcionar (ultrapassa limite)
        
        System.out.println("Saldo final: R$" + contaTeste.getSaldo());
    }
}