package projeto4;
// Projeto 4 - Board de Gerenciamento de Tarefas
import java.util.Scanner;

public class BoardTarefas {
    // TODO: Implementar classes Board, Coluna, Card, conexão MySQL, persistência

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Criar novo board");
            System.out.println("2. Selecionar board");
            System.out.println("3. Excluir board");
            System.out.println("0. Sair");
            int op = sc.nextInt();
            if (op == 0) break;
            switch (op) {
                case 1:
                    // TODO: Criar novo board
                    break;
                case 2:
                    // TODO: Selecionar board e abrir menu de manipulação
                    break;
                case 3:
                    // TODO: Excluir board
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
    // TODO: Implementar menu de manipulação do board, conexão MySQL, relatórios, etc.
}
