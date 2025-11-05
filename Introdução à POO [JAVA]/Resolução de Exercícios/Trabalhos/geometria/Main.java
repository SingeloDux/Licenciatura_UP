package geometria;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE SISTEMA DE FORMAS GEOMÉTRICAS ===");
        
        // Polimorfismo com formas geométricas
        FormaGeometrica[] formas = {
            new Circulo("Vermelho", true, 5.0),
            new Retangulo("Azul", false, 4.0, 6.0),
            new Triangulo("Verde", true, 8.0, 6.0, 8.0, 6.0, 10.0),
            new Quadrado("Amarelo", true, 5.0),
            new Circulo("Roxo", false, 3.5)
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
        
        // Demonstração de métodos específicos
        System.out.println("\n=== MÉTODOS ESPECÍFICOS DAS FORMAS ===");
        
        for (FormaGeometrica forma : formas) {
            if (forma instanceof Circulo) {
                Circulo circulo = (Circulo) forma;
                System.out.println("Círculo - Diâmetro: " + String.format("%.2f", circulo.calcularDiametro()));
            } else if (forma instanceof Retangulo) {
                Retangulo retangulo = (Retangulo) forma;
                System.out.println("Retângulo - Diagonal: " + String.format("%.2f", retangulo.calcularDiagonal()) +
                                 ", É quadrado? " + retangulo.isQuadrado());
            } else if (forma instanceof Triangulo) {
                Triangulo triangulo = (Triangulo) forma;
                System.out.println("Triângulo - Tipo: " + triangulo.determinarTipoTriangulo() +
                                 ", Válido? " + triangulo.isTrianguloValido());
            }
        }
        
        // Teste de encapsulamento
        System.out.println("\n=== TESTE ENCAPSULAMENTO GEOMETRIA ===");
        Circulo circuloTeste = new Circulo("Laranja", true, 7.0);
        
        // Acessando através dos getters (encapsulamento)
        System.out.println("Cor do círculo: " + circuloTeste.getCor());
        System.out.println("Raio inicial: " + circuloTeste.getRaio());
        
        // Tentativa de setar valores inválidos
        circuloTeste.setRaio(-5); // Não deve funcionar (valor negativo)
        System.out.println("Raio após tentativa inválida: " + circuloTeste.getRaio());
        
        circuloTeste.setRaio(10); // Deve funcionar
        System.out.println("Raio após modificação válida: " + circuloTeste.getRaio());
        System.out.println("Nova área: " + String.format("%.2f", circuloTeste.calcularArea()));
    }
}