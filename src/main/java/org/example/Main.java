import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Estacionamento estacionamento = new Estacionamento(10);

        int opcao;

        do {
            System.out.println("\n===== ESTACIONAMENTO =====");
            System.out.println("1 - Entrada");
            System.out.println("2 - Saída");
            System.out.println("3 - Vagas Livres");
            System.out.println("4 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.print("Placa: ");
                String placa = scanner.nextLine();

                System.out.print("Modelo: ");
                String modelo = scanner.nextLine();

                System.out.print("Hora entrada: ");
                int horaEntrada = scanner.nextInt();

                Veiculo v = new Veiculo(placa, modelo);

                estacionamento.registrarEntrada(v, horaEntrada);
            }
            else if (opcao == 2) {
                System.out.print("Placa: ");
                String placa = scanner.nextLine();

                System.out.print("Hora saída: ");
                int horaSaida = scanner.nextInt();

                estacionamento.registrarSaida(placa, horaSaida);
            }
            else if (opcao == 3) {
                estacionamento.exibirVagasLivres();
            }
        } while (opcao != 4);
        scanner.close();
    }
}
