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
                2- Receber Valor
                3- Transferir valor
                4- Sair
                
                Digite sua opção:
                """;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leia.nextInt();
        }
    }
}
