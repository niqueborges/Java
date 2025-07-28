# Exercícios 

1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

// Solução 1
import java.util.Scanner;

class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        sc.close();
    }
}

2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
   - Se for menor ou igual a 18,5 "Abaixo do peso";
   - se for entre 18,6 e 24,9 "Peso ideal";
   - Se for entre 25,0 e 29,9 "Levemente acima do peso";
   - Se for entre 30,0 e 34,9 "Obesidade Grau I";
   - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
   - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

// Solução 2
class CalculaIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura (m): ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é %.2f\n", imc);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }
        sc.close();
    }
}

3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;

// Solução 3
class ParImparIntervalo {
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

4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de  0 na divisão, números menores que o primeiro número devem ser ignorados

// Solução 4
class DivisaoContinua {
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
