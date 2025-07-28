package exercicio6;
// Exercício 6.1 - Calculadora de soma e subtração com entrada separada por vírgulas
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os números separados por vírgula: ");
        String entrada = sc.nextLine();
        String[] numeros = entrada.split(",");
        int soma = 0;
        for (String n : numeros) {
            soma += Integer.parseInt(n.trim());
        }
        System.out.println("Soma: " + soma);
        System.out.print("Digite os números para subtração separados por vírgula: ");
        entrada = sc.nextLine();
        numeros = entrada.split(",");
        int resultado = Integer.parseInt(numeros[0].trim());
        for (int i = 1; i < numeros.length; i++) {
            resultado -= Integer.parseInt(numeros[i].trim());
        }
        System.out.println("Subtração: " + resultado);
        sc.close();
    }
}
