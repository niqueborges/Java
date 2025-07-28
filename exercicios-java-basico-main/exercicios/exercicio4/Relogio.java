package exercicio4;
// Exercício 4.3 - Hierarquia de relógios
class Relogio {
    protected int hora, minuto, segundo;
    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public String getHoraFormatada() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
    public void setHorario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
}
class RelogioAmericano extends Relogio {
    public RelogioAmericano(int hora, int minuto, int segundo) {
        super(hora > 12 ? hora - 12 : hora, minuto, segundo);
    }
    // Métodos específicos do relógio americano
}
class RelogioBrasileiro extends Relogio {
    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }
    // Métodos específicos do relógio brasileiro
}
