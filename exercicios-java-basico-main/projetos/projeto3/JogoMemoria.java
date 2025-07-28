package projeto3;
// Projeto 3 - Jogo da Memória com menu interativo
import java.util.Scanner;

public class JogoMemoria {
    // Coleções, estado do jogo, etc.
    // TODO: Implementar classes Colecao, Carta, Jogo, persistência em arquivo

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Criar coleção de cartas");
            System.out.println("2. Iniciar novo jogo");
            System.out.println("3. Continuar jogo pausado");
            System.out.println("0. Sair");
            int op = sc.nextInt();
            if (op == 0) break;
            switch (op) {
                case 1:
                    // TODO: Criar coleção
                    break;
                case 2:
                    // TODO: Iniciar novo jogo
                    break;
                case 3:
                    // TODO: Continuar jogo pausado
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
    // TODO: Implementar submenu do jogo, persistência, embaralhamento, etc.
}
