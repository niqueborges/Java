package exercicio3;
// Exercício 3.2 - Controle de funções de um carro
import java.util.Scanner;

public class Carro {
    private boolean ligado = false;
    private int marcha = 0;
    private int velocidade = 0;
    public void ligar() { ligado = true; System.out.println("Carro ligado!"); }
    public void desligar() { ligado = false; velocidade = 0; marcha = 0; System.out.println("Carro desligado!"); }
    public void acelerar() {
        if (!ligado || marcha == 0) { System.out.println("Não pode acelerar!"); return; }
        if (velocidade < 120) velocidade++;
        System.out.println("Velocidade: " + velocidade);
    }
    public void diminuir() {
        if (!ligado) { System.out.println("Carro desligado!"); return; }
        if (velocidade > 0) velocidade--;
        System.out.println("Velocidade: " + velocidade);
    }
    public void virar(String direcao) {
        if (!ligado) { System.out.println("Carro desligado!"); return; }
        System.out.println("Virou para " + direcao);
    }
    public void trocarMarcha(int novaMarcha) {
        if (!ligado) { System.out.println("Carro desligado!"); return; }
        if (Math.abs(novaMarcha - marcha) != 1) { System.out.println("Não pode pular marcha!"); return; }
        if (novaMarcha < 0 || novaMarcha > 6) { System.out.println("Marcha inválida!"); return; }
        marcha = novaMarcha;
        System.out.println("Marcha: " + marcha);
    }
    public void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu: 1-Ligar 2-Desligar 3-Acelerar 4-Diminuir 5-Virar 6-Trocar marcha 0-Sair");
            int op = sc.nextInt();
            if (op == 0) break;
            switch (op) {
                case 1: ligar(); break;
                case 2: desligar(); break;
                case 3: acelerar(); break;
                case 4: diminuir(); break;
                case 5: System.out.print("Direção (esquerda/direita): "); virar(sc.next()); break;
                case 6: System.out.print("Nova marcha: "); trocarMarcha(sc.nextInt()); break;
                default: System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
    public static void main(String[] args) { new Carro().menu(); }
}
