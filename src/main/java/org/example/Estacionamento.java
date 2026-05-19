import java.util.ArrayList;

public class Estacionamento {

    private ArrayList<Vaga> vagas;
    private ArrayList<Ticket> ticketsAbertos;
    private Tarifario tarifario;
    public Estacionamento(int totalDeVagas) {
        vagas = new ArrayList<>();
        ticketsAbertos = new ArrayList<>();
        tarifario = new Tarifario();
        for (int i = 1; i <= totalDeVagas; i++) {
            vagas.add(new Vaga(i));
        }
    }
    public void registrarEntrada(Veiculo carro, int horaEntrada) {

        for (Vaga vaga : vagas) {

            if (!vaga.isOcupada()) {

                vaga.estacionar(carro);

                Ticket ticket = new Ticket(carro, horaEntrada);

                ticketsAbertos.add(ticket);

                System.out.println("Carro estacionado na vaga " + vaga.getNumero());

                return;
            }
        }
        System.out.println("Estacionamento lotado.");
    }
    public void registrarSaida(String placa, int horaSaida) {
        Ticket ticketEncontrado = null;
        for (Ticket ticket : ticketsAbertos) {

            if (ticket.getCarro().getPlaca().equals(placa)) {

                ticketEncontrado = ticket;
                break;
            }
        }
        if (ticketEncontrado == null) {
            System.out.println("Veículo não encontrado.");
            return;
        }
        ticketEncontrado.registrarSaida(horaSaida);
        int horas = ticketEncontrado.calcularTempoEmHoras();
        float valor = tarifario.calcularValor(horas);

        for (Vaga vaga : vagas) {

            if (vaga.isOcupada()) {

                if (vaga.getVeiculoEstacionado().getPlaca().equals(placa)) {

                    vaga.liberar();
                    break;
                }
            }
        }
        ticketsAbertos.remove(ticketEncontrado);
        System.out.println("Veículo removido.");
        System.out.println("Tempo: " + horas + " hora(s)");
        System.out.println("Valor a pagar: R$ " + valor);
    }
    public void exibirVagasLivres() {
        int contador = 0;
        System.out.println("\n--- VAGAS LIVRES ---");
        for (Vaga vaga : vagas) {

            if (!vaga.isOcupada()) {

                System.out.println("Vaga " + vaga.getNumero());
                contador++;
            }
        }
        System.out.println("Total livres: " + contador);
    }
}