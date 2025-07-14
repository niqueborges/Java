public class ResumoFundamentos {
    public static void main(String[] args) {
        // Tipos de dados
        int idade = 28;
        double altura = 1.72;
        boolean gostaDeJava = true;
        String nome = "Monique";

        // Condicional
        if (idade > 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " é menor de idade.");
        }

        // Repetição
        System.out.println("Contando até 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Método externo sendo chamado
        saudacao(nome);
    }

    // Método fora do main
    public static void saudacao(String nome) {
        System.out.println("Bem-vinda ao mundo Java, " + nome + "!");
    }
}
