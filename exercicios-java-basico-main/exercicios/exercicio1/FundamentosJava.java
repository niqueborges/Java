package exercicio1;
// Exercício 1
// 1. Recebe nome e ano de nascimento, imprime idade
// 2. Calcula área de quadrado
// 3. Calcula área de retângulo
// 4. Diferença de idade entre duas pessoas
import java.time.Year;
import java.util.Scanner;

public class FundamentosJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu ano de nascimento: ");
        int ano = sc.nextInt();
        int idade = Year.now().getValue() - ano;
        System.out.println("Olá '" + nome + "' você tem '" + idade + "' anos");
        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = sc.nextDouble();
        System.out.println("A área do quadrado é: " + (lado * lado));
        System.out.print("Digite a base do retângulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();
        System.out.println("A área do retângulo é: " + (base * altura));
        sc.nextLine();
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é: " + Math.abs(idade1 - idade2) + " anos");
        sc.close();
    }
}
