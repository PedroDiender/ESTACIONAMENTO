package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // Inicializa o Scanner para ler as informações que o usuário digitar no console
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do{
            // Exibição do Menu
            System.out.println("\n--- MENU ESTACIONAMENTO ---");
            System.out.println("1. Registrar Entrada");
            System.out.println("2. Registrar Saída");
            System.out.println("3. Exibir Vagas Livres");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a opção escolhida pelo usuário
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome o "Enter" que sobra no buffer do Scanner
            System.out.println(" usuariuo digitou a opção: "+ opcao);
        } while (opcao != 4); // O sistema continua rodando enquanto a opção não for 4 (Sair)
        System.out.println("Usuraio saiu do sistema");
    }
}
