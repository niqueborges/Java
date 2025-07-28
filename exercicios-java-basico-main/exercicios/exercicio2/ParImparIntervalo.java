package exercicio2;
// Exercício 2.3 - Números pares/ímpares em intervalo
import java.util.Scanner;

public class ParImparIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiro = sc.nextInt();
        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int segundo = sc.nextInt();
        System.out.print("Digite 'par' ou 'impar': ");
        String escolha = sc.next();
        for (int i = segundo; i >= primeiro; i--) {
            if ("par".equalsIgnoreCase(escolha) && i % 2 == 0) {
                System.out.println(i);
            } else if ("impar".equalsIgnoreCase(escolha) && i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
