package exercicio4;
// Exercício 4 - Menu interativo para chamar funções de herança
import java.util.Scanner;

public class MenuHeranca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Ingresso 2-Usuário 3-Relógio 0-Sair");
        int op = sc.nextInt();
        // Aqui você pode chamar métodos de teste para cada classe
        sc.close();
    }
}
