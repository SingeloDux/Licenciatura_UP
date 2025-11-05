# 🎬 **Roteiro para Videoaula - Sistema Bancário**

## 📋 **Estrutura do Vídeo (12-15 minutos)**

### 🎯 **Introdução (2 minutos)**

"Olá! Neste vídeo vou explicar o sistema bancário completo que implementa conceitos avançados de POO como classes abstratas, interfaces e polimorfismo para gerenciar diferentes tipos de conta."

### 🏦 **1. Classe Abstrata Conta (3 minutos)**

**Mostrar:**

```java
abstract class Conta {
    private String numeroConta; // Encapsulamento
    public abstract void sacar(double valor); // Método abstrato
}
```

**Explicar:**

- "Classe abstrata define estrutura comum para todas as contas"
- "Encapsulamento protege dados sensíveis"
- "Métodos abstratos garantem implementação específica"

### 💳 **2. ContaCorrente com Interface Tributavel (3 minutos)**

**Demonstrar:**

```java
class ContaCorrente extends Conta implements Tributavel {
    // Herda de Conta E implementa Tributavel
}
```

**Pontos-chave:**

- "extends para herança + implements para interface"
- "ContaCorrente tem características específicas: cheque especial, taxas"
- "Implementa Tributavel - paga impostos"

### 🐖 **3. ContaPoupanca com Rendimentos (2 minutos)**

**Mostrar:**

```java
class ContaPoupanca extends Conta {
    // Herda apenas de Conta
    // Não implementa Tributavel - não paga impostos
}
```

**Explicar:**

- "Herança simples de Conta"
- "Características específicas: rendimentos, aniversário"
- "Diferente da corrente: não tem taxas, não é tributável"

### 🔄 **4. Polimorfismo no Sistema (2 minutos)**

**Demonstrar:**

```java
Conta[] contas = {
    new ContaCorrente(...),
    new ContaPoupanca(...)
};
// Todas tratadas como Conta, mas com comportamentos diferentes
```

**Pontos-chave:**

- "Array de Conta armazena diferentes tipos"
- "Cada uma mantém seu comportamento específico"
- "Métodos comuns executados de forma polimórfica"

### 💰 **5. Interface Tributavel (2 minutos)**

**Mostrar contrato:**

```java
interface Tributavel {
    double calcularTributo();
    void aplicarTributo();
}
```

**Explicar:**

- "Interface define 'capacidade' de ser tributado"
- "Somente ContaCorrente implementa (por enquanto)"
- "Sistema pode tributar qualquer objeto Tributavel"

### 🚀 **6. Demonstração Prática (2 minutos)**

**Executar:**

- Criar contas correntes e poupanças
- Mostrar operações bancárias
- Demonstrar transferências
- Exibir diferenças nos cálculos

### 📝 **Conclusão (1 minuto)**

**Resumo:**

- "Sistema demonstra hierarquia realista de contas bancárias"
- "Classe abstrata para código comum"
- "Interfaces para comportamentos opcionais"
- "Polimorfismo para gerenciamento unificado"

## 💡 **Dicas para Gravação**

### 🎬 **Ênfases Importantes:**

- Diferença entre herança (é-um) e interface (faz-um)
- Por que ContaPoupanca não implementa Tributavel
- Vantagens do polimorfismo no gerenciamento
- Encapsulamento protegendo saldo e dados

### 🔍 **Pontos Técnicos para Destacar:**

- "protected setSaldo() - apenas subclasses podem modificar"
- "instanceof para verificar tipo em tempo de execução"
- "Casting seguro quando necessário"
- "Métodos específicos de cada tipo de conta"

### 📊 **Comparações para Mostrar:**

- ContaCorrente: tem limite, paga taxas, é tributável
- ContaPoupanca: rende juros, não tem taxas, não é tributável
- Ambas: sacam, depositam, transferem (polimorfismo)

Quer que eu ajuste alguma parte específica do sistema bancário ou do roteiro?
