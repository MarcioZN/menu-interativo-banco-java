import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class MesmaSituracaoComIf {
    public static void main(String[] args) {
        String nome = "Andressa do Nascimento";
        String conta = "Corrente";
        double saldo = 30000;
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

            if (opcao == 1) {
                System.out.println("Saldo atual: R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("Transferencia realizada. Saldo atual: R$ ");
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor para receber: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado: R$ " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida.");
            } else {
                System.out.println("Saindo...");
            }
        }
    }
}