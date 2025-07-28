package exercicio5;
// Exercício 5.2 - Cálculo de tributos de produtos
interface Produto {
    double getImposto();
    double getValor();
}

class Alimentacao implements Produto {
    private double valor;
    public Alimentacao(double valor) { this.valor = valor; }
    public double getValor() { return valor; }
    public double getImposto() { return valor * 0.01; }
}

class SaudeBemEstar implements Produto {
    private double valor;
    public SaudeBemEstar(double valor) { this.valor = valor; }
    public double getValor() { return valor; }
    public double getImposto() { return valor * 0.015; }
}

class Vestuario implements Produto {
    private double valor;
    public Vestuario(double valor) { this.valor = valor; }
    public double getValor() { return valor; }
    public double getImposto() { return valor * 0.025; }
}

class Cultura implements Produto {
    private double valor;
    public Cultura(double valor) { this.valor = valor; }
    public double getValor() { return valor; }
    public double getImposto() { return valor * 0.04; }
}

public class CalculoTributos {
    public static void main(String[] args) {
        Produto[] produtos = {
            new Alimentacao(100),
            new SaudeBemEstar(200),
            new Vestuario(150),
            new Cultura(80)
        };
        for (Produto p : produtos) {
            System.out.printf("Produto: %s, Valor: %.2f, Imposto: %.2f\n",
                p.getClass().getSimpleName(), p.getValor(), p.getImposto());
        }
    }
}
