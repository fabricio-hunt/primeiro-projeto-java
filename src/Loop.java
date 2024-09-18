import java.text.DecimalFormat;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.0");
        double mediAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Digite sua avaliação para o Filme: ");
            nota = leitura.nextDouble();
            mediAvaliacao += nota;
        }

        System.out.println("Média de avaliações: " + mediAvaliacao/3);
    }
}
