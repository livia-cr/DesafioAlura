import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //Dados do Cliente
        String nome = "Bernardo Souza";
        String conta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome: "+nome);
        System.out.println("Tipo conta: "+conta);
        System.out.printf("Saldo inicial: %.2f%n",saldo);
        System.out.println("\n***********************");

        //Menu de opções
        String menu = """
                \n** Opções:
                1- Consutar saldos
                2- Transferir valor
                3- Receber Valor
                4- Sair
                
                Digite sua opção:
                """;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leia.nextInt();

            if (opcao == 1) {
                //Visualização do saldo
                System.out.println("O saldo atualizado é "+ saldo);
            } else if (opcao == 2) {
                //Valor enviado
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leia.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo "+ saldo);
                }
            } else if (opcao == 3) {
                //Valor recebido
                System.out.println("Valor recebido: ");
                double valor = leia.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo "+ saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
