# 🎬 **Roteiro para Videoaula - Sistema de Funcionários**

## 📋 **Estrutura do Vídeo (12-15 minutos)**

### 🎯 **Introdução (2 minutos)**

"Olá! Neste vídeo vou explicar o sistema de funcionários que expande conceitos de POO com herança múltipla, interfaces e sistema de bônus por performance."

### 🔧 **1. Classe Abstrata Funcionario (2 minutos)**

**Mostrar:**

```java
abstract class Funcionario {
    public abstract double calcularSalario();
}
```

**Explicar:**

- "Classe abstrata não pode ser instanciada"
- "Método abstrato força implementação nas subclasses"
- "Encapsulamento com atributos privados"

### 👨‍💼 **2. Herança - Gerente e Desenvolvedor (2 minutos)**

**Demonstrar:**

```java
class Gerente extends Funcionario {
    // Atributos específicos
}
```

**Pontos-chave:**

- "extends para herança"
- "super() para construtor da superclasse"
- "Cada classe tem cálculo de salário específico"

### 🏢 **3. NOVA CLASSE: Diretor (3 minutos)**

**Mostrar inovação:**

```java
class Diretor extends Gerente implements Autenticavel {
    // Herda de Gerente E implementa interface
}
```

**Explicar:**

- "Herança múltipla através de herança + interface"
- "Diretor é um Gerente com funcionalidades adicionais"
- "Mantém hierarquia corporativa real"

### 🔐 **4. NOVA INTERFACE: Autenticavel (2 minutos)**

**Demonstrar contrato:**

```java
interface Autenticavel {
    boolean autenticar(String usuario, String senha);
    double calcularBonusPerformance();
}
```

**Pontos-chave:**

- "Interface define 'o que' deve fazer, não 'como'"
- "Múltiplas classes podem implementar a mesma interface"
- "Sistema de autenticação padronizado"

### 💰 **5. Sistema de Bônus por Performance (2 minutos)**

**Mostrar cálculo:**

```java
public double calcularBonusPerformance() {
    return getSalarioBase() * performance * 0.5;
}
```

**Explicar:**

- "Bônus variável baseado em performance"
- "Flexibilidade no cálculo de remuneração"
- "Incentivo por resultados"

### 🚀 **6. Demonstração Prática (2 minutos)**

**Executar:**

- Criar instâncias de cada tipo
- Mostrar polimorfismo em ação
- Testar autenticação do Diretor
- Demonstrar cálculos diferentes

### 📝 **Conclusão (1 minuto)**

**Resumo:**

- "Sistema demonstra herança em múltiplos níveis"
- "Interfaces para comportamentos transversais"
- "Sistema flexível de remuneração"
- "Modelagem realista de hierarquia corporativa"

## 💡 **Dicas para Gravação**

### 🎬 **Ênfases Importantes:**

- Diferença entre "extends" (herança) e "implements" (interface)
- Como o Diretor herda de Gerente E implementa interface
- Sistema de bônus como exemplo do mundo real
- Polimorfismo com calcularSalario()

### 🔍 **Pontos Técnicos para Destacar:**

- "Diretor herda tudo de Gerente, que herda tudo de Funcionario"
- "Interface permite que outras classes também sejam autenticáveis"
- "Performance é um conceito novo específico para Diretor"
- "Método abstrato garante consistência no sistema"

Quer que eu detalhe mais alguma parte específica deste sistema?
