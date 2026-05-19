public class Tarifario {
    private float valorHora = 10;
    public float calcularValor(int horas) {
        return horas * valorHora;
    }
}