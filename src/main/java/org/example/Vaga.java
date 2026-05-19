public class Vaga {
    private int numero;
    private boolean ocupada;
    private Veiculo veiculoEstacionado;
    public Vaga(int numero) {
        this.numero = numero;
        this.ocupada = false;
    }
    public void estacionar(Veiculo carro) {

        this.veiculoEstacionado = carro;
        this.ocupada = true;
    }
    public void liberar() {

        this.veiculoEstacionado = null;
        this.ocupada = false;
    }
    public int getNumero() {
        return numero;
    }
    public boolean isOcupada() {
        return ocupada;
    }
    public Veiculo getVeiculoEstacionado() {
        return veiculoEstacionado;
    }
}