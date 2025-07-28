package exercicio4;
// Exercício 4.1 - Hierarquia de classes para tipos de ingresso
public class Ingresso {
    protected double valor;
    protected String filme;
    protected boolean dublado;
    public Ingresso(double valor, String filme, boolean dublado) {
        this.valor = valor;
        this.filme = filme;
        this.dublado = dublado;
    }
    public double getValorReal() { return valor; }
}
class MeiaEntrada extends Ingresso {
    public MeiaEntrada(double valor, String filme, boolean dublado) {
        super(valor, filme, dublado);
    }
    @Override
    public double getValorReal() { return valor / 2; }
}
class IngressoFamilia extends Ingresso {
    private int pessoas;
    public IngressoFamilia(double valor, String filme, boolean dublado, int pessoas) {
        super(valor, filme, dublado);
        this.pessoas = pessoas;
    }
    @Override
    public double getValorReal() {
        double total = valor * pessoas;
        if (pessoas > 3) total *= 0.95;
        return total;
    }
}
