package exercicio4;
// Exercício 4.2 - Hierarquia de classes para tipos de usuário
class Usuario {
    protected String nome, email, senha;
    protected boolean administrador;
    public Usuario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }
}
class Gerente extends Usuario {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }
    // Métodos específicos do gerente
}
class Vendedor extends Usuario {
    private int vendas;
    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.vendas = 0;
    }
    public void realizarVenda() { vendas++; }
    // Métodos específicos do vendedor
}
class Atendente extends Usuario {
    private double caixa;
    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.caixa = 0;
    }
    public void receberPagamento(double valor) { caixa += valor; }
    // Métodos específicos do atendente
}
