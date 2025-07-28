package exercicio6;
// Exercício 6.3 - Conversão para JSON, XML e YAML
import java.util.Scanner;

public class ConversorDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os campos no formato NOME;VALOR;TIPO (um por linha, vazio para sair):");
        StringBuilder json = new StringBuilder("{\n");
        StringBuilder xml = new StringBuilder("<dados>\n");
        StringBuilder yaml = new StringBuilder("");
        while (true) {
            String linha = sc.nextLine();
            if (linha.trim().isEmpty()) break;
            String[] partes = linha.split(";");
            if (partes.length < 3) continue;
            String nome = partes[0].trim();
            String valor = partes[1].trim();
            String tipo = partes[2].trim();
            json.append("  \"").append(nome).append("\": \"").append(valor).append("\",\n");
            xml.append("  <").append(nome).append(">" + valor + "</" + nome + ">\n");
            yaml.append(nome).append(": ").append(valor).append(" # ").append(tipo).append("\n");
        }
        json.append("}");
        xml.append("</dados>");
        System.out.println("\nJSON:\n" + json);
        System.out.println("\nXML:\n" + xml);
        System.out.println("\nYAML:\n" + yaml);
        sc.close();
    }
}
