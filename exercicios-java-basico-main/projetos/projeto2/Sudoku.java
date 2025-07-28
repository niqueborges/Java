package projeto2;
// Projeto 2 - Jogo de Sudoku com menu interativo
import java.util.Scanner;

public class Sudoku {
    private int[][] tabuleiro = new int[9][9];
    private boolean[][] fixos = new boolean[9][9];
    private boolean iniciado = false;

    public Sudoku(String[] args) {
        // args: formato "linha,coluna,valor" para números fixos
        for (String arg : args) {
            String[] partes = arg.split(",");
            if (partes.length == 3) {
                int l = Integer.parseInt(partes[0]);
                int c = Integer.parseInt(partes[1]);
                int v = Integer.parseInt(partes[2]);
                tabuleiro[l][c] = v;
                fixos[l][c] = true;
            }
        }
    }

    public void iniciarJogo() {
        iniciado = true;
        System.out.println("Jogo iniciado!");
        exibirTabuleiro();
    }

    public void colocarNumero(int l, int c, int v) {
        if (fixos[l][c] || tabuleiro[l][c] != 0) {
            System.out.println("Posição já preenchida!");
            return;
        }
        tabuleiro[l][c] = v;
    }

    public void removerNumero(int l, int c) {
        if (fixos[l][c]) {
            System.out.println("Não pode remover número fixo!");
            return;
        }
        tabuleiro[l][c] = 0;
    }

    public void exibirTabuleiro() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(tabuleiro[i][j] == 0 ? ". " : tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void limpar() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!fixos[i][j]) tabuleiro[i][j] = 0;
            }
        }
        System.out.println("Números do usuário removidos!");
    }

    public boolean completo() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (tabuleiro[i][j] == 0) return false;
        return true;
    }

    public boolean temErro() {
        // Verifica linhas, colunas e blocos
        for (int i = 0; i < 9; i++) {
            boolean[] linha = new boolean[10];
            boolean[] coluna = new boolean[10];
            for (int j = 0; j < 9; j++) {
                int vL = tabuleiro[i][j];
                int vC = tabuleiro[j][i];
                if (vL != 0) {
                    if (linha[vL]) return true;
                    linha[vL] = true;
                }
                if (vC != 0) {
                    if (coluna[vC]) return true;
                    coluna[vC] = true;
                }
            }
        }
        // Blocos 3x3
        for (int bi = 0; bi < 9; bi += 3) {
            for (int bj = 0; bj < 9; bj += 3) {
                boolean[] bloco = new boolean[10];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int v = tabuleiro[bi + i][bj + j];
                        if (v != 0) {
                            if (bloco[v]) return true;
                            bloco[v] = true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void status() {
        if (!iniciado) {
            System.out.println("Status: não iniciado, sem erro");
        } else if (!completo()) {
            System.out.println("Status: incompleto" + (temErro() ? ", com erro" : ", sem erro"));
        } else {
            System.out.println("Status: completo" + (temErro() ? ", com erro" : ", sem erro"));
        }
    }

    public void finalizar() {
        if (completo() && !temErro()) {
            System.out.println("Jogo encerrado! Parabéns!");
        } else {
            System.out.println("Preencha todos os espaços corretamente antes de finalizar.");
        }
    }

    public static void main(String[] args) {
        Sudoku jogo = new Sudoku(args);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Iniciar novo jogo");
            System.out.println("2. Colocar número");
            System.out.println("3. Remover número");
            System.out.println("4. Verificar jogo");
            System.out.println("5. Verificar status");
            System.out.println("6. Limpar");
            System.out.println("7. Finalizar jogo");
            System.out.println("0. Sair");
            int op = sc.nextInt();
            if (op == 0) break;
            switch (op) {
                case 1:
                    jogo.iniciarJogo();
                    break;
                case 2:
                    System.out.print("Linha: "); int l = sc.nextInt();
                    System.out.print("Coluna: "); int c = sc.nextInt();
                    System.out.print("Valor: "); int v = sc.nextInt();
                    jogo.colocarNumero(l, c, v);
                    break;
                case 3:
                    System.out.print("Linha: "); l = sc.nextInt();
                    System.out.print("Coluna: "); c = sc.nextInt();
                    jogo.removerNumero(l, c);
                    break;
                case 4:
                    jogo.exibirTabuleiro();
                    break;
                case 5:
                    jogo.status();
                    break;
                case 6:
                    jogo.limpar();
                    break;
                case 7:
                    jogo.finalizar();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}
