package exercicio3;
// Exercício 3 - Menu interativo para chamar funções
import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(1000);
        Carro carro = new Carro();
        while (true) {
            System.out.println("1-Conta Bancária 2-Carro 0-Sair");
            int op = sc.nextInt();
            if (op == 0) break;
            if (op == 1) ContaBancaria.main(new String[]{});
            if (op == 2) Carro.main(new String[]{});
        }
        sc.close();
    }
}
