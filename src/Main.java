import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Marcio Henrique";
        String conta = "Corrente";
        double saldo = 10500;
        int opcao = 0;

        System.out.println("************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome do cliente:   " + nome);
        System.out.println("Tipo de conta:     " + conta);
        System.out.println("Saldo atual:       R$ " + saldo);
        System.out.println("************************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir PIX
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor para transferir: ");
                    double transferencia = leitura.nextDouble();
                    if (transferencia <= saldo) {
                        saldo -= transferencia;
                        System.out.println("Transferência realizada. Saldo atual: R$ " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor para receber: ");
                    double recebido = leitura.nextDouble();
                    saldo += recebido;
                    System.out.println("Saldo atualizado: R$ " + saldo);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
