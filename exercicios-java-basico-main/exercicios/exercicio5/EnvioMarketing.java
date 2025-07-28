package exercicio5;
// Exercício 5.1 - Envio de mensagens de marketing
interface Mensageiro {
    void enviar(String mensagem);
}

class SMS implements Mensageiro {
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}

class Email implements Mensageiro {
    public void enviar(String mensagem) {
        System.out.println("E-mail enviado: " + mensagem);
    }
}

class RedeSocial implements Mensageiro {
    public void enviar(String mensagem) {
        System.out.println("Mensagem em Rede Social: " + mensagem);
    }
}

class WhatsApp implements Mensageiro {
    public void enviar(String mensagem) {
        System.out.println("WhatsApp enviado: " + mensagem);
    }
}

public class EnvioMarketing {
    public static void main(String[] args) {
        Mensageiro[] servicos = {
            new SMS(), new Email(), new RedeSocial(), new WhatsApp()
        };
        String mensagem = "Promoção imperdível!";
        for (Mensageiro m : servicos) {
            m.enviar(mensagem);
        }
    }
}
