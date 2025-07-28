package projeto1;
// Projeto 1 - Calculadora com menu interativo
import java.util.Scanner;

public class CalculadoraInterativa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Potência");
            System.out.println("6. Sair");
            int op = sc.nextInt();
            if (op == 6) break;
            double resultado = 0;
            if (op >= 1 && op <= 5) {
                System.out.print("Informe o primeiro número: ");
                double n1 = sc.nextDouble();
                System.out.print("Informe o segundo número: ");
                double n2 = sc.nextDouble();
                switch (op) {
                    case 1:
                        resultado = n1 + n2;
                        submenu(sc, resultado, true);
                        break;
                    case 2:
                        resultado = n1 - n2;
                        submenu(sc, resultado, false);
                        break;
                    case 3:
                        resultado = n1 * n2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        if (n2 != 0) {
                            System.out.println("Divisão: " + (n1 / n2));
                            System.out.println("Resto: " + (n1 % n2));
                        } else {
                            System.out.println("Não é possível dividir por zero!");
                        }
                        break;
                    case 5:
                        resultado = Math.pow(n1, n2);
                        System.out.println("Resultado: " + resultado);
                        break;
                }
            } else {
                System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
    private static void submenu(Scanner sc, double resultado, boolean soma) {
        while (true) {
            System.out.println("1. Informar mais números\n2. Sair da operação");
            int op = sc.nextInt();
            if (op == 2) {
                System.out.println("Resultado final: " + resultado);
                break;
            }
            if (op == 1) {
                System.out.print("Informe o próximo número: ");
                double n = sc.nextDouble();
                resultado = soma ? resultado + n : resultado - n;
                System.out.println("Novo resultado: " + resultado);
            }
        }
    }
}
