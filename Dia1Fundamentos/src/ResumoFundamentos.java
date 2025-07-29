import java.util.ArrayList;

public class ResumoFundamentos {
    public static void main(String[] args) {
        // Tipos primitivos
        byte b = 100;
        short s = 10000;
        int i = 1000000;
        long l = 10000000000L; // L no final indica que é um long
        float f = 5.75f; // f no final indica que é um float
        double d = 19.99; // por padrão, números decimais são double
        boolean gostaDeJava = true;
        char letra = 'A'; // um único caractere
        String nome = "Fernanda"; // uma sequência de caracteres

        int idade = 25; // Adicionado para evitar erro de compilação

        // Array/Lista/Vetor
        String[] frutas = {"Maçã", "Banana", "Laranja"};
        System.out.println("Frutas disponíveis:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        ArrayList<String> listaDeFrutas = new ArrayList<>();
        listaDeFrutas.add("Maçã");
        listaDeFrutas.add("Banana");
        listaDeFrutas.add("Laranja");
        System.out.println("Lista de frutas:");
        for (String fruta : listaDeFrutas) {
            System.out.println(fruta);
        }

        // Condicional
        if (idade > 18) {
            System.out.println(nome + " é maior de idade.");
        } else {
            System.out.println(nome + " é menor de idade.");
        }

        // Repetição/Loop
        System.out.println("Contando até 5:");
        for (int contador = 1; contador <= 5; contador++) {
            System.out.println(contador);
        }

        // Método externo sendo chamado
        saudacao(nome);
    }

    // Método fora do main
    public static void saudacao(String nome) {
        System.out.println("Bem-vinda ao mundo Java, " + nome + "!");
    }
}

