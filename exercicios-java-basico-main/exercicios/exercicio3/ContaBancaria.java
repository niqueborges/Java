package exercicio3;
// Exercício 3.1 - Conta Bancária com menu interativo
import java.util.Scanner;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        if (saldoInicial <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = saldoInicial * 0.5;
        }
    }
    public void consultarSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }
    public void consultarChequeEspecial() {
        System.out.println("Cheque especial: R$" + chequeEspecial);
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado!");
    }
    public void sacar(double valor) {
        if (valor <= saldo + chequeEspecial) {
            saldo -= valor;
            if (saldo < 0) {
                double usado = -saldo;
                saldo = 0;
                chequeEspecial -= usado;
                System.out.println("Usou cheque especial! Taxa de 20% será cobrada.");
                chequeEspecial -= usado * 0.2;
            }
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    public void pagarBoleto(double valor) {
        sacar(valor);
    }
    public void verificarChequeEspecial() {
        System.out.println(chequeEspecial < 50 ? "Usando cheque especial" : "Não está usando cheque especial");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe saldo inicial: ");
        double saldoInicial = sc.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);
        while (true) {
            System.out.println("\nMenu: 1-Consultar saldo 2-Consultar cheque especial 3-Depositar 4-Sacar 5-Pagar boleto 6-Verificar cheque especial 0-Sair");
            int op = sc.nextInt();
            if (op == 0) break;
            switch (op) {
                case 1: conta.consultarSaldo(); break;
                case 2: conta.consultarChequeEspecial(); break;
                case 3: System.out.print("Valor: "); conta.depositar(sc.nextDouble()); break;
                case 4: System.out.print("Valor: "); conta.sacar(sc.nextDouble()); break;
                case 5: System.out.print("Valor: "); conta.pagarBoleto(sc.nextDouble()); break;
                case 6: conta.verificarChequeEspecial(); break;
                default: System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}
