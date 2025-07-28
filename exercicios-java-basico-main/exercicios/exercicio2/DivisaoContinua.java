package exercicio2;
// Exercício 2.4 - Divisão contínua
import java.util.Scanner;

public class DivisaoContinua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número inicial: ");
        int inicial = sc.nextInt();
        while (true) {
            System.out.print("Digite um número: ");
            int n = sc.nextInt();
            if (n < inicial) {
                System.out.println("Número ignorado (menor que o inicial)");
                continue;
            }
            if (n % inicial != 0) {
                System.out.println("Execução encerrada. Resto diferente de 0.");
                break;
            }
            System.out.println("Número válido: " + n);
        }
        sc.close();
    }
}
