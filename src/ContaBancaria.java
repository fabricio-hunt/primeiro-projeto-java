import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        // Inicialização das variáveis
        String nome = "Fabrício Macedo Baraúna";
        String tipoDeConta = "Corrente";
        double saldoDaConta = 4599.95;
        int opcao = 0;

        Scanner scanner = new Scanner(System.in);

        // Exibindo os dados do cliente e da conta
        System.out.println("**********************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.printf("Saldo da conta: R$ %.2f%n", saldoDaConta);
        System.out.println("**********************************");

        // Menu de opções
        String menu = """
                      
                      *** Digite a Opção ***
                      
                      1- Consultar Saldo
                      2- Transferência
                      3- Saque
                      4- Sair
                      """;

        do {
            // Exibindo o menu
            System.out.println(menu);

            // Capturando a entrada do usuário
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            // Processando a escolha do usuário
            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$ %.2f%n", saldoDaConta);
                    break;
                case 2:
                    System.out.print("Digite o valor para transferência: ");
                    double valorTransferencia = scanner.nextDouble();
                    if (valorTransferencia <= saldoDaConta && valorTransferencia > 0) {
                        saldoDaConta -= valorTransferencia;
                        System.out.printf("Transferência de R$ %.2f realizada com sucesso!%n", valorTransferencia);
                        System.out.printf("Seu saldo atual é: R$ %.2f%n", saldoDaConta);
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldoDaConta && valorSaque > 0) {
                        saldoDaConta -= valorSaque;
                        System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valorSaque);
                        System.out.printf("Seu saldo atual é: R$ %.2f%n", saldoDaConta);
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo... Obrigado por usar nossos serviços!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (opcao != 4);

        // Fechando o scanner
        scanner.close();
    }
}
