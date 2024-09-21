import java.util.Scanner;

public class ContaBancaria {
    private static java.lang.String String;
/*  Inicialização do cliente
    Menu de opções
    Visuaçizações de Dados
    Enviar Valor
    Receber Valor
 */
    public static void main(String[] args) {
        //variables
        String nome = "Fabrício Macedo Baraúna";
        String  tipodeConta = "Tipo de conta: Corrente";
        double  saldoDaConta = 4599.95;
        int opcao = 0;

        Scanner leitura = new Scanner(System.in);

        String menu = """
               *** Digite a Opção Que Desejar ***\n
               1- Consultar Saldo
               2- Transferência
               3- Saque
               4- Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

        }
    }
}
