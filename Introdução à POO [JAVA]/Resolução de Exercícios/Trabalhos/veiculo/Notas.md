# Roteiro para Videoaula - Sistema de Veículos

## 📋 Estrutura do Roteiro (10-15 minutos)

### 🎯 **Introdução (2 minutos)**

**Objetivos do vídeo:**

- "Olá! Meu nome é [Seu Nome] e neste vídeo vou explicar o sistema de veículos que desenvolvi em Java"
- "Vamos abordar: Encapsulamento, Herança, Polimorfismo e Interfaces"
- "O sistema gerencia diferentes tipos de veículos com características específicas"

### 🔧 **1. Encapsulamento na Classe Veiculo (3 minutos)**

**Demonstração prática:**

- "Aqui temos a classe base Veiculo com atributos privados"
- "Mostrar os getters e setters com validações"

```java
private String marca;  // Atributo privado
public void setAno(int ano) {
    if(ano > 1885 && ano <= 2024) {  // Validação
        this.ano = ano;
    }
}
```

**Explicar:**

- "Encapsulamento protege os dados com acesso controlado"
- "Validações garantem integridade dos dados"

### 👨‍👩‍👧‍👦 **2. Herança - Carro e Moto (3 minutos)**

**Mostrar código:**

```java
class Carro extends Veiculo {  // Herança
    // Atributos específicos
}
```

**Pontos-chave:**

- "Carro e Moto herdam de Veiculo usando 'extends'"
- "super() chama o construtor da classe pai"
- "Reutilização de código e hierarquia lógica"

### 🎭 **3. Polimorfismo (2 minutos)**

**Demonstrar:**

```java
@Override
public void exibirInformacoes() {
    super.exibirInformacoes();  // Chama método da superclasse
    // Adiciona comportamento específico
}
```

**Explicar:**

- "Métodos sobrescritos com @Override"
- "Cada classe tem sua implementação específica"
- "calcularImposto() tem comportamentos diferentes"

### 📦 **4. Interface VeiculoCarga (3 minutos)**

**Mostrar implementação:**

```java
interface VeiculoCarga {  // Interface
    double calcularCapacidadeCarga();
}

class Caminhao extends Veiculo implements VeiculoCarga {
    // Implementa os métodos da interface
}
```

**Explicar:**

- "Interface define contrato que deve ser implementado"
- "Caminhão implementa VeiculoCarga além de herdar de Veiculo"
- "Múltiplos comportamentos através de interfaces"

### 🚀 **5. Demonstração Prática (2 minutos)**

**Executar código:**

```java
public static void main(String[] args) {
    Caminhao caminhao = new Caminhao(...);
    caminhao.exibirInformacoes();
    caminhao.carregar(15000);
}
```

**Mostrar:**

- "Criando instâncias de cada tipo"
- "Chamando métodos específicos"
- "Resultados das validações"

### 📝 **Conclusão (1 minuto)**

**Resumo:**

- "Sistema demonstra os 4 pilares da OOP em Java"
- "Encapsulamento: proteção de dados"
- "Herança: reutilização e hierarquia"
- "Polimorfismo: flexibilidade comportamental"
- "Interfaces: contratos e múltiplas funcionalidades"

## 💡 **Dicas para a Gravação**

### 🎬 **Preparação Técnica:**

- Use um editor com syntax highlighting (VS Code, IntelliJ)
- Mostre o código em tela cheia quando explicar
- Execute o programa para demonstrar funcionamento
- Fale pausadamente e com clareza

### 🔍 **Pontos para Enfatizar:**

- Diferença entre extends (herança) e implements (interface)
- Importância do @Override
- Como super() funciona
- Vantagens do encapsulamento

### ⏱️ **Timing Sugerido:**

- 0-2min: Introdução
- 2-5min: Encapsulamento
- 5-8min: Herança
- 8-10min: Polimorfismo
- 10-13min: Interfaces
- 13-15min: Demonstração e conclusão

## 🗣️ **Frases Úteis:**

- "Como podemos ver aqui..."
- "A vantagem disso é..."
- "Note que..."
- "Isso permite que..."
- "Diferente da herança, a interface..."

Quer que eu detalhe mais alguma parte específica do roteiro?
