package exercicio5;
// Exercício 5.3 - Cálculo de área de figuras geométricas
interface Figura {
    double getArea();
}

class Quadrado implements Figura {
    private double lado;
    public Quadrado(double lado) { this.lado = lado; }
    public double getArea() { return lado * lado; }
}

class Retangulo implements Figura {
    private double base, altura;
    public Retangulo(double base, double altura) { this.base = base; this.altura = altura; }
    public double getArea() { return base * altura; }
}

class Circulo implements Figura {
    private double raio;
    public Circulo(double raio) { this.raio = raio; }
    public double getArea() { return Math.PI * raio * raio; }
}

public class CalculoArea {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Quadrado(4),
            new Retangulo(5, 3),
            new Circulo(2)
        };
        for (Figura f : figuras) {
            System.out.printf("Figura: %s, Área: %.2f\n",
                f.getClass().getSimpleName(), f.getArea());
        }
    }
}
