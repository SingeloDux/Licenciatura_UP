package funcionario;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE SISTEMA DE FUNCIONÁRIOS ===");
        
        // Polimorfismo com funcionários
        Funcionario[] funcionarios = {
            new Gerente("João Silva", "123.456.789-00", 8000, 12000, "TI"),
            new Desenvolvedor("Maria Santos", "987.654.321-00", 5000, "Java", 50),
            new Estagiario("Pedro Oliveira", "111.222.333-44", 2000, "UFMG", 120),
            new Diretor("Ana Costa", "555.666.777-88", 15000, 25000, 
                       "Financeiro", 18000, "acosta", "senha456")
        };
        
        // Adicionando horas extras para o desenvolvedor
        ((Desenvolvedor)funcionarios[1]).adicionarHoraExtra(10);
        
        // Configurando performance do diretor
        ((Diretor)funcionarios[3]).setPerformance(0.85);
        
        for (Funcionario func : funcionarios) {
            func.exibirDados();
            System.out.println("Salário calculado: R$" + func.calcularSalario());
            
            // Testar autenticação para Diretor
            if (func instanceof Diretor) {
                Diretor diretor = (Diretor) func;
                boolean autenticado = diretor.autenticar("acosta", "senha456");
                System.out.println("Autenticação do diretor: " + autenticado);
                diretor.definirEstrategia("Otimização de processos internos");
            }
            System.out.println("---");
        }
        
        // Teste de encapsulamento com funcionários
        System.out.println("=== TESTE ENCAPSULAMENTO FUNCIONÁRIOS ===");
        Desenvolvedor devTeste = new Desenvolvedor("Carlos Souza", "999.888.777-66", 
                                                  6000, "Python", 60);
        
        System.out.println("Salário base: " + devTeste.getSalarioBase());
        System.out.println("Linguagem: " + devTeste.getLinguagem());
        
        // Testando adição de horas extras
        devTeste.adicionarHoraExtra(5);
        System.out.println("Horas extras após adição: " + devTeste.getHorasExtras());
        System.out.println("Salário com horas extras: R$" + devTeste.calcularSalario());
    }
}