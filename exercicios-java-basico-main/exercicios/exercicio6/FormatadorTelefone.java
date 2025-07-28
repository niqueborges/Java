package exercicio6;
// Exercício 6.2 - Formatação de telefone fixo e celular
import java.util.Scanner;

public class FormatadorTelefone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de telefone: ");
        String entrada = sc.nextLine().replaceAll("\D", "");
        String tipo = "Inválido";
        String formatado = entrada;
        if (entrada.length() == 8) {
            formatado = entrada.substring(0,4) + "-" + entrada.substring(4);
            tipo = "Fixo sem DDD";
        } else if (entrada.length() == 10) {
            formatado = "(" + entrada.substring(0,2) + ")" + entrada.substring(2,6) + "-" + entrada.substring(6);
            tipo = "Fixo com DDD";
        } else if (entrada.length() == 9) {
            formatado = entrada.substring(0,5) + "-" + entrada.substring(5);
            tipo = "Celular sem DDD";
        } else if (entrada.length() == 11) {
            formatado = "(" + entrada.substring(0,2) + ")" + entrada.substring(2,7) + "-" + entrada.substring(7);
            tipo = "Celular com DDD";
        }
        System.out.println("Tipo: " + tipo);
        System.out.println("Formatado: " + formatado);
        sc.close();
    }
}
