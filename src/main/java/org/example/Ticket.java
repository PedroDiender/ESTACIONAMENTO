public class Ticket {
    private Veiculo carro;
    private int horaEntrada;
    private int horaSaida;
    public Ticket(Veiculo carro, int horaEntrada) {
        this.carro = carro;
        this.horaEntrada = horaEntrada;
    }
    public void registrarSaida(int horaSaida) {

        this.horaSaida = horaSaida;
    }
    public int calcularTempoEmHoras() {
        int total = horaSaida - horaEntrada;
        if (total <= 0) {
            total = 1;
        }
        return total;
    }
    public Veiculo getCarro() {
        return carro;
    }
}