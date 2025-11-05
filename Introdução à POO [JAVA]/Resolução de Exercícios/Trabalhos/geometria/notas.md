# 🎬 **Roteiro para Videoaula - Sistema de Formas Geométricas**

## 📋 **Estrutura do Vídeo (10-12 minutos)**

### 🎯 **Introdução (1 minuto)**

"Olá! Neste vídeo vou explicar o sistema de formas geométricas que demonstra polimorfismo, herança e interfaces de forma prática e visual."

### 📐 **1. Interface FormaGeometrica (2 minutos)**

**Mostrar contrato:**

```java
interface FormaGeometrica {
    double calcularArea();
    double calcularPerimetro();
    void exibirInformacoes();
}
```

**Explicar:**

- "Interface define o que todas as formas devem fazer"
- "Contrato comum para diferentes formas geométricas"
- "Garante consistência no sistema"

### 🎨 **2. Classe Abstrata Forma (2 minutos)**

**Demonstrar:**

```java
abstract class Forma implements FormaGeometrica {
    // Atributos comuns a todas as formas
    // Implementação parcial da interface
}
```

**Pontos-chave:**

- "Classe abstrata fornece código comum"
- "Implementa parte da interface (exibirInformacoes)"
- "Deixa métodos de cálculo para as subclasses"

### 🔵 **3. Herança - Círculo, Retângulo, Triângulo (3 minutos)**

**Mostrar diferenças:**

```java
class Circulo extends Forma {
    // Especialização com raio
    @Override calcularArea() { return Math.PI * raio * raio; }
}

class Retangulo extends Forma {
    // Especialização com largura e altura
    @Override calcularArea() { return largura * altura; }
}
```

**Explicar:**

- "Cada forma tem sua fórmula específica de área e perímetro"
- "@Override indica sobrescrita de método"
- "super() para acessar construtor da classe pai"

### 🔄 **4. Polimorfismo em Ação (2 minutos)**

**Demonstrar poder:**

```java
FormaGeometrica[] formas = {new Circulo(), new Retangulo(), new Triangulo()};
for(FormaGeometrica forma : formas) {
    forma.calcularArea(); // Cada um calcula de forma diferente!
}
```

**Pontos-chave:**

- "Array trata diferentes formas de maneira uniforme"
- "Cada forma mantém seu comportamento específico"
- "Cálculos automáticos baseados no tipo real"

### 🚀 **5. Demonstração Prática (2 minutos)**

**Executar:**

- Criar diversas formas geométricas
- Mostrar cálculos automáticos de área e perímetro
- Demonstrar métodos específicos de cada forma
- Exibir resumo geral com polimorfismo

### 📝 **Conclusão (1 minuto)**

**Resumo:**

- "Sistema demonstra hierarquia clara de formas geométricas"
- "Interface garante comportamento consistente"
- "Classe abstrata elimina duplicação de código"
- "Polimorfismo permite tratamento unificado"

## 💡 **Dicas para Gravação**

### 🎬 **Ênfases Visuais:**

- Mostre as fórmulas matemáticas de cada forma
- Destaque as diferenças nos cálculos de área
- Mostre o output formatado dos resultados
- Use cores diferentes para cada forma

### 🔍 **Pontos Técnicos para Destacar:**

- "Por que Forma é abstrata? Porque não faz sentido instanciar uma 'forma genérica'"
- "Interface vs Classe Abstrata: Interface diz 'o que', Abstrata fornece 'como' parcial"
- "Encapsulamento: atributos privados com acesso controlado"
- "Validações nos setters previnem dados inválidos"

### 📊 **Exemplos Práticos para Mostrar:**

- Círculo: área = πr², perímetro = 2πr
- Retângulo: área = base × altura, perímetro = 2(b+h)
- Triângulo: área = (base × altura)/2, perímetro = soma dos lados

### 🎯 **Diferenciais do Sistema:**

- "Métodos específicos em cada classe (calcularDiagonal, determinarTipoTriangulo)"
- "Validações para garantir formas válidas"
- "Flexibilidade para adicionar novas formas facilmente"

**Pronto! Agora você tem todos os 4 sistemas completos e organizados com seus respectivos roteiros para videoaula. Cada um demonstra aspectos diferentes da POO de forma prática e aplicada.** 🎉

Quer que eu ajuste alguma coisa específica no sistema de formas geométricas?
