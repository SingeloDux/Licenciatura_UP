// Exercício 1: Sistema de Veículos (Encapsulamento e Herança)

// Classe base Veiculo com encapsulamento
class Veiculo {
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

// Interface VeiculoCarga
interface VeiculoCarga {
    double calcularCapacidadeCarga();
    boolean verificarLimiteCarga(double peso);
    String getTipoCarga();
}

// Classe Caminhao
class Caminhao extends Veiculo implements VeiculoCarga {
    private double capacidadeCarga;
    private int numeroEixos;
    private String tipoCarga;
    
    public Caminhao(String marca, String modelo, int ano, double preco,
                   double capacidadeCarga, int numeroEixos, String tipoCarga) {
        super(marca, modelo, ano, preco);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
        this.tipoCarga = tipoCarga;
    }
    
    public double getCapacidadeCarga() { return capacidadeCarga; }
    
    public void setCapacidadeCarga(double capacidadeCarga) {
        if(capacidadeCarga > 0) {
            this.capacidadeCarga = capacidadeCarga;
        }
    }
    
    public int getNumeroEixos() { return numeroEixos; }
    
    public void setNumeroEixos(int numeroEixos) {
        if(numeroEixos >= 2 && numeroEixos <= 10) {
            this.numeroEixos = numeroEixos;
        }
    }
    
    // Implementação da interface VeiculoCarga
    @Override
    public double calcularCapacidadeCarga() {
        return capacidadeCarga * 1000;
    }
    
    @Override
    public boolean verificarLimiteCarga(double peso) {
        return peso <= calcularCapacidadeCarga();
    }
    
    @Override
    public String getTipoCarga() {
        return tipoCarga;
    }
    
    public void setTipoCarga(String tipoCarga) {
        if(tipoCarga != null && !tipoCarga.isEmpty()) {
            this.tipoCarga = tipoCarga;
        }
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas" +
                         ", Eixos: " + numeroEixos +
                         ", Tipo de Carga: " + tipoCarga);
    }
    
    @Override
    public double calcularImposto() {
        double impostoBase = super.calcularImposto();
        double impostoAdicional = numeroEixos * 100;
        return impostoBase + impostoAdicional;
    }
    
    public void carregar(double peso) {
        if(verificarLimiteCarga(peso)) {
            System.out.println("Carga de " + peso + " kg colocada no caminhão.");
        } else {
            System.out.println("ERRO: Peso excede a capacidade máxima de " + 
                             calcularCapacidadeCarga() + " kg.");
        }
    }
}

// Herança - Carro herda de Veiculo
class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;
    
    public Carro(String marca, String modelo, int ano, double preco,
                int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano, preco);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }
    
    // Encapsulamento
    public int getNumeroPortas() {
        return numeroPortas;
    }
    
    public void setNumeroPortas(int numeroPortas) {
        if(numeroPortas >= 2 && numeroPortas <= 5) {
            this.numeroPortas = numeroPortas;
        }
    }
    
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    
    public void setTipoCombustivel(String tipoCombustivel) {
        if(tipoCombustivel != null &&
           (tipoCombustivel.equals("Gasolina") ||
            tipoCombustivel.equals("Álcool") ||
            tipoCombustivel.equals("Diesel") ||
            tipoCombustivel.equals("Elétrico"))) {
            this.tipoCombustivel = tipoCombustivel;
        }
    }
    
    // Polimorfismo - sobrescrevendo o método
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Portas: " + numeroPortas + ", Combustível: " + tipoCombustivel);
    }
    
    @Override
    public double calcularImposto() {
        double impostoBase = super.calcularImposto();
        if(tipoCombustivel.equals("Elétrico")) {
            return impostoBase * 0.5;
        }
        return impostoBase;
    }
}

// Herança - Moto herda de Veiculo
class Moto extends Veiculo {
    private int cilindradas;
    private boolean partidaEletrica;
    
    public Moto(String marca, String modelo, int ano, double preco,
               int cilindradas, boolean partidaEletrica) {
        super(marca, modelo, ano, preco);
        this.cilindradas = cilindradas;
        this.partidaEletrica = partidaEletrica;
    }
    
    // Getters e Setters
    public int getCilindradas() {
        return cilindradas;
    }
    
    public void setCilindradas(int cilindradas) {
        if(cilindradas > 0) {
            this.cilindradas = cilindradas;
        }
    }
    
    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }
    
    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
    
    // Polimorfismo
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas + "cc, Partida Elétrica: " +
                         (partidaEletrica ? "Sim" : "Não"));
    }
    
    @Override
    public double calcularImposto() {
        double impostoBase = super.calcularImposto();
        if(cilindradas <= 150) {
            return impostoBase * 0.7;
        }
        return impostoBase;
    }
}

// Exercício 2: Sistema de Funcionários (Herança e Polimorfismo)

// Interface Autenticavel
interface Autenticavel {
    boolean autenticar(String usuario, String senha);
    void alterarSenha(String novaSenha);
    String getUsuario();
    double calcularBonusPerformance();
}

// Classe abstrata Funcionario
abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;
    
    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }
    
    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { 
        this.salarioBase = salarioBase; 
    }
    
    // Método abstrato - polimorfismo obrigatório
    public abstract double calcularSalario();
    
    // Método concreto
    public void exibirDados() {
        System.out.println("Nome: " + nome + ", CPF: " + cpf +
                         ", Salário Base: R$" + salarioBase);
    }
}

// Herança - Gerente
class Gerente extends Funcionario {
    private double bonusAnual;
    private String departamento;
    
    public Gerente(String nome, String cpf, double salarioBase,
                  double bonusAnual, String departamento) {
        super(nome, cpf, salarioBase);
        this.bonusAnual = bonusAnual;
        this.departamento = departamento;
    }
    
    public double getBonusAnual() { return bonusAnual; }
    public void setBonusAnual(double bonusAnual) { this.bonusAnual = bonusAnual; }
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    
    // Polimorfismo - implementação do método abstrato
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (bonusAnual / 12);
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Gerente, Departamento: " + departamento +
                         ", Bônus Anual: R$" + bonusAnual +
                         ", Salário Total: R$" + calcularSalario());
    }
}

// Classe Diretor
class Diretor extends Gerente implements Autenticavel {
    private double participacaoLucros;
    private String usuario;
    private String senha;
    private double performance;
    
    public Diretor(String nome, String cpf, double salarioBase,
                  double bonusAnual, String departamento,
                  double participacaoLucros, String usuario, String senha) {
        super(nome, cpf, salarioBase, bonusAnual, departamento);
        this.participacaoLucros = participacaoLucros;
        this.usuario = usuario;
        this.senha = senha;
        this.performance = 0.8;
    }
    
    public double getParticipacaoLucros() { return participacaoLucros; }
    public void setParticipacaoLucros(double participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }
    
    public double getPerformance() { return performance; }
    public void setPerformance(double performance) {
        if(performance >= 0.0 && performance <= 1.0) {
            this.performance = performance;
        }
    }
    
    // Implementação da interface Autenticavel
    @Override
    public boolean autenticar(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }
    
    @Override
    public void alterarSenha(String novaSenha) {
        if(novaSenha != null && novaSenha.length() >= 6) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        }
    }
    
    @Override
    public String getUsuario() {
        return usuario;
    }
    
    @Override
    public double calcularBonusPerformance() {
        return getSalarioBase() * performance * 0.5;
    }
    
    @Override
    public double calcularSalario() {
        double salarioGerente = super.calcularSalario();
        double bonusPerformance = calcularBonusPerformance();
        return salarioGerente + participacaoLucros + bonusPerformance;
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Diretor, Participação nos Lucros: R$" + participacaoLucros +
                         ", Performance: " + (performance * 100) + "%" +
                         ", Bônus Performance: R$" + calcularBonusPerformance());
    }
    
    public void definirEstrategia(String estrategia) {
        System.out.println("Diretor " + getNome() + " definiu a estratégia: " + estrategia);
    }
}

// Herança - Desenvolvedor
class Desenvolvedor extends Funcionario {
    private String linguagem;
    private int horasExtras;
    private double valorHoraExtra;
    
    public Desenvolvedor(String nome, String cpf, double salarioBase,
                        String linguagem, double valorHoraExtra) {
        super(nome, cpf, salarioBase);
        this.linguagem = linguagem;
        this.valorHoraExtra = valorHoraExtra;
        this.horasExtras = 0;
    }
    
    public String getLinguagem() { return linguagem; }
    public void setLinguagem(String linguagem) { this.linguagem = linguagem; }
    public int getHorasExtras() { return horasExtras; }
    public void setHorasExtras(int horasExtras) { this.horasExtras = horasExtras; }
    public double getValorHoraExtra() { return valorHoraExtra; }
    public void setValorHoraExtra(double valorHoraExtra) { this.valorHoraExtra = valorHoraExtra; }
    
    public void adicionarHoraExtra(int horas) {
        if(horas > 0) {
            this.horasExtras += horas;
        }
    }
    
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtras * valorHoraExtra);
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Desenvolvedor, Linguagem: " + linguagem +
                         ", Horas Extras: " + horasExtras +
                         ", Salário Total: R$" + calcularSalario());
    }
}

// Herança - Estagiario
class Estagiario extends Funcionario {
    private String instituicaoEnsino;
    private int horasTrabalho;
    
    public Estagiario(String nome, String cpf, double salarioBase,
                     String instituicaoEnsino, int horasTrabalho) {
        super(nome, cpf, salarioBase);
        this.instituicaoEnsino = instituicaoEnsino;
        this.horasTrabalho = horasTrabalho;
    }
    
    public String getInstituicaoEnsino() { return instituicaoEnsino; }
    public void setInstituicaoEnsino(String instituicaoEnsino) { this.instituicaoEnsino = instituicaoEnsino; }
    public int getHorasTrabalho() { return horasTrabalho; }
    public void setHorasTrabalho(int horasTrabalho) { this.horasTrabalho = horasTrabalho; }
    
    @Override
    public double calcularSalario() {
        return (getSalarioBase() / 160) * horasTrabalho;
    }
    
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Estagiário, Instituição: " + instituicaoEnsino +
                         ", Horas Trabalho: " + horasTrabalho +
                         ", Salário Total: R$" + calcularSalario());
    }
}

// Exercício 3: Sistema de Formas Geométricas (Polimorfismo)

// Interface para formas geométricas
interface FormaGeometrica {
    double calcularArea();
    double calcularPerimetro();
    void exibirInformacoes();
}

// Classe abstrata implementando parte da interface
abstract class Forma implements FormaGeometrica {
    private String cor;
    private boolean preenchido;
    
    public Forma(String cor, boolean preenchido) {
        this.cor = cor;
        this.preenchido = preenchido;
    }
    
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
    public boolean isPreenchido() { return preenchido; }
    public void setPreenchido(boolean preenchido) { this.preenchido = preenchido; }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("Cor: " + cor + ", Preenchido: " + (preenchido ? "Sim" : "Não"));
    }
}

// Herança e polimorfismo - Círculo
class Circulo extends Forma {
    private double raio;
    
    public Circulo(String cor, boolean preenchido, double raio) {
        super(cor, preenchido);
        this.raio = raio;
    }
    
    public double getRaio() { return raio; }
    public void setRaio(double raio) { 
        if(raio > 0) {
            this.raio = raio;
        }
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Círculo ===");
        super.exibirInformacoes();
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
    }
    
    public double calcularDiametro() {
        return 2 * raio;
    }
}

// Herança e polimorfismo - Retângulo
class Retangulo extends Forma {
    private double largura;
    private double altura;
    
    public Retangulo(String cor, boolean preenchido, double largura, double altura) {
        super(cor, preenchido);
        this.largura = largura;
        this.altura = altura;
    }
    
    public double getLargura() { return largura; }
    public void setLargura(double largura) { 
        if(largura > 0) {
            this.largura = largura;
        }
    }
    
    public double getAltura() { return altura; }
    public void setAltura(double altura) { 
        if(altura > 0) {
            this.altura = altura;
        }
    }
    
    @Override
    public double calcularArea() {
        return largura * altura;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Retângulo ===");
        super.exibirInformacoes();
        System.out.println("Largura: " + largura + ", Altura: " + altura);
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
    }
    
    public double calcularDiagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }
    
    public boolean isQuadrado() {
        return largura == altura;
    }
}

// Herança e polimorfismo - Triângulo
class Triangulo extends Forma {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(String cor, boolean preenchido, double base, double altura,
                    double lado1, double lado2, double lado3) {
        super(cor, preenchido);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public double getBase() { return base; }
    public void setBase(double base) { 
        if(base > 0) {
            this.base = base;
        }
    }
    
    public double getAltura() { return altura; }
    public void setAltura(double altura) { 
        if(altura > 0) {
            this.altura = altura;
        }
    }
    
    public double getLado1() { return lado1; }
    public void setLado1(double lado1) { 
        if(lado1 > 0) {
            this.lado1 = lado1;
        }
    }
    
    public double getLado2() { return lado2; }
    public void setLado2(double lado2) { 
        if(lado2 > 0) {
            this.lado2 = lado2;
        }
    }
    
    public double getLado3() { return lado3; }
    public void setLado3(double lado3) { 
        if(lado3 > 0) {
            this.lado3 = lado3;
        }
    }
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Triângulo ===");
        super.exibirInformacoes();
        System.out.println("Base: " + base + ", Altura: " + altura);
        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
    }
    
    public String determinarTipoTriangulo() {
        if(lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    
    public boolean isTrianguloValido() {
        return (lado1 + lado2 > lado3) && 
               (lado1 + lado3 > lado2) && 
               (lado2 + lado3 > lado1);
    }
}

// Exercício 4: Sistema Bancário

// Interface Tributavel
interface Tributavel {
    double calcularTributo();
    double calcularTaxaManutencao();
    void aplicarTributo();
}

// Classe abstrata Conta
abstract class Conta {
    private String numeroConta;
    private String titular;
    private double saldo;
    private String agencia;
    
    public Conta(String numeroConta, String titular, double saldo, String agencia) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
    }
    
    public String getNumeroConta() { return numeroConta; }
    
    public void setNumeroConta(String numeroConta) {
        if(numeroConta != null && !numeroConta.isEmpty()) {
            this.numeroConta = numeroConta;
        }
    }
    
    public String getTitular() { return titular; }
    
    public void setTitular(String titular) {
        if(titular != null && !titular.isEmpty()) {
            this.titular = titular;
        }
    }
    
    public double getSaldo() { return saldo; }
    
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getAgencia() { return agencia; }
    
    public void setAgencia(String agencia) {
        if(agencia != null && !agencia.isEmpty()) {
            this.agencia = agencia;
        }
    }
    
    // Métodos abstratos
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void aplicarTaxaMensal();
    
    // Métodos concretos
    public void transferir(double valor, Conta destino) {
        if(valor > 0 && valor <= saldo && destino != null) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada para " + 
                             destino.getTitular());
        } else {
            System.out.println("Transferência não realizada. Verifique o valor ou conta destino.");
        }
    }
    
    public void exibirExtrato() {
        System.out.println("=== Extrato da Conta ===");
        System.out.println("Titular: " + titular);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$" + String.format("%.2f", saldo));
    }
}

// ContaCorrente
class ContaCorrente extends Conta implements Tributavel {
    private double limiteChequeEspecial;
    private int transacoesGratuitas;
    private int transacoesRealizadas;
    
    public ContaCorrente(String numeroConta, String titular, double saldo, 
                        String agencia, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, agencia);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.transacoesGratuitas = 5;
        this.transacoesRealizadas = 0;
    }
    
    public double getLimiteChequeEspecial() { return limiteChequeEspecial; }
    
    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        if(limiteChequeEspecial >= 0) {
            this.limiteChequeEspecial = limiteChequeEspecial;
        }
    }
    
    public int getTransacoesGratuitas() { return transacoesGratuitas; }
    public int getTransacoesRealizadas() { return transacoesRealizadas; }
    
    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= (getSaldo() + limiteChequeEspecial)) {
            setSaldo(getSaldo() - valor);
            transacoesRealizadas++;
            System.out.println("Saque de R$" + valor + " realizado. Saldo: R$" + 
                             String.format("%.2f", getSaldo()));
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }
    
    @Override
    public void depositar(double valor) {
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
            transacoesRealizadas++;
            System.out.println("Depósito de R$" + valor + " realizado. Saldo: R$" + 
                             String.format("%.2f", getSaldo()));
        }
    }
    
    @Override
    public void aplicarTaxaMensal() {
        if(transacoesRealizadas > transacoesGratuitas) {
            double taxa = (transacoesRealizadas - transacoesGratuitas) * 0.50;
            setSaldo(getSaldo() - taxa);
            System.out.println("Taxa de manutenção: R$" + taxa);
        }
        transacoesRealizadas = 0;
    }
    
    // Implementação da interface Tributavel
    @Override
    public double calcularTributo() {
        return getSaldo() * 0.0025;
    }
    
    @Override
    public double calcularTaxaManutencao() {
        return Math.max(0, (transacoesRealizadas - transacoesGratuitas)) * 0.50;
    }
    
    @Override
    public void aplicarTributo() {
        double tributo = calcularTributo();
        setSaldo(getSaldo() - tributo);
        System.out.println("Tributo aplicado: R$" + tributo);
    }
    
    public void usarChequeEspecial(double valor) {
        if(valor > 0 && valor <= limiteChequeEspecial) {
            setSaldo(getSaldo() - valor);
            System.out.println("Uso do cheque especial: R$" + valor);
        }
    }
    
    @Override
    public void exibirExtrato() {
        super.exibirExtrato();
        System.out.println("Tipo: Conta Corrente");
        System.out.println("Limite Cheque Especial: R$" + limiteChequeEspecial);
        System.out.println("Transações realizadas: " + transacoesRealizadas + 
                         "/" + transacoesGratuitas + " gratuitas");
        System.out.println("Tributo mensal: R$" + String.format("%.2f", calcularTributo()));
    }
}

// ContaPoupanca
class ContaPoupanca extends Conta {
    private double taxaRendimento;
    private int diaAniversario;
    
    public ContaPoupanca(String numeroConta, String titular, double saldo,
                        String agencia, double taxaRendimento, int diaAniversario) {
        super(numeroConta, titular, saldo, agencia);
        this.taxaRendimento = taxaRendimento;
        this.diaAniversario = diaAniversario;
    }
    
    public double getTaxaRendimento() { return taxaRendimento; }
    
    public void setTaxaRendimento(double taxaRendimento) {
        if(taxaRendimento >= 0) {
            this.taxaRendimento = taxaRendimento;
        }
    }
    
    public int getDiaAniversario() { return diaAniversario; }
    
    public void setDiaAniversario(int diaAniversario) {
        if(diaAniversario >= 1 && diaAniversario <= 31) {
            this.diaAniversario = diaAniversario;
        }
    }
    
    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado. Saldo: R$" + 
                             String.format("%.2f", getSaldo()));
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }
    
    @Override
    public void depositar(double valor) {
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito de R$" + valor + " realizado. Saldo: R$" + 
                             String.format("%.2f", getSaldo()));
        }
    }
    
    @Override
    public void aplicarTaxaMensal() {
        double rendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento aplicado: R$" + rendimento);
    }
    
    public void simularRendimento(int meses) {
        double saldoSimulado = getSaldo();
        System.out.println("=== Simulação de Rendimento ===");
        System.out.println("Saldo atual: R$" + saldoSimulado);
        
        for(int i = 1; i <= meses; i++) {
            double rendimento = saldoSimulado * taxaRendimento;
            saldoSimulado += rendimento;
            System.out.println("Mês " + i + ": R$" + String.format("%.2f", saldoSimulado) + 
                             " (Rendimento: R$" + String.format("%.2f", rendimento) + ")");
        }
    }
    
    @Override
    public void exibirExtrato() {
        super.exibirExtrato();
        System.out.println("Tipo: Conta Poupança");
        System.out.println("Taxa de Rendimento: " + (taxaRendimento * 100) + "%");
        System.out.println("Dia do Aniversário: " + diaAniversario);
    }
}

// Exercício 5: Classe Principal para Testes
public class TestePOO {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA COMPLETO DE POO ===");
        
        // Teste Sistema de Veículos
        System.out.println("\n=== TESTE SISTEMA DE VEÍCULOS ===");
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
        
        // Teste Sistema de Funcionários
        System.out.println("\n=== TESTE SISTEMA DE FUNCIONÁRIOS ===");
        Funcionario[] funcionarios = {
            new Gerente("João Silva", "123.456.789-00", 8000, 12000, "TI"),
            new Desenvolvedor("Maria Santos", "987.654.321-00", 5000, "Java", 50),
            new Estagiario("Pedro Oliveira", "111.222.333-44", 2000, "UFMG", 120),
            new Diretor("Carlos Oliveira", "456.789.123-00", 15000, 30000, 
                       "Operações", 20000, "coliveira", "senha123")
        };
        
        ((Desenvolvedor)funcionarios[1]).adicionarHoraExtra(10);
        ((Diretor)funcionarios[3]).setPerformance(0.9);
        
        for (Funcionario func : funcionarios) {
            func.exibirDados();
            System.out.println("---");
        }
        
        // Teste Sistema de Formas Geométricas
        System.out.println("\n=== TESTE SISTEMA DE FORMAS GEOMÉTRICAS ===");
        FormaGeometrica[] formas = {
            new Circulo("Vermelho", true, 5.0),
            new Retangulo("Azul", false, 4.0, 6.0),
            new Triangulo("Verde", true, 8.0, 6.0, 8.0, 6.0, 10.0)
        };
        
        double areaTotal = 0;
        double perimetroTotal = 0;
        for (FormaGeometrica forma : formas) {
            forma.exibirInformacoes();
            areaTotal += forma.calcularArea();
            perimetroTotal += forma.calcularPerimetro();
            System.out.println("---");
        }
        System.out.println("Área Total: " + String.format("%.2f", areaTotal));
        System.out.println("Perímetro Total: " + String.format("%.2f", perimetroTotal));
        
        // Teste Sistema Bancário
        System.out.println("\n=== TESTE SISTEMA BANCÁRIO ===");
        Conta[] contas = {
            new ContaCorrente("12345-6", "João Silva", 1500.0, "001", 1000.0),
            new ContaPoupanca("78901-2", "Maria Santos", 5000.0, "001", 0.005, 15)
        };
        
        for (Conta conta : contas) {
            conta.exibirExtrato();
            conta.depositar(200.0);
            conta.sacar(100.0);
            System.out.println("---");
        }
        
        // Teste de Encapsulamento
        System.out.println("\n=== TESTE ENCAPSULAMENTO ===");
        Carro meuCarro = new Carro("Ford", "Fiesta", 2018, 45000, 4, "Gasolina");
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        meuCarro.setAno(1700);
        System.out.println("Ano após tentativa inválida: " + meuCarro.getAno());
        meuCarro.setPreco(-1000);
        System.out.println("Preço após tentativa inválida: " + meuCarro.getPreco());
        
        System.out.println("\n=== FIM DOS TESTES ===");
    }
}