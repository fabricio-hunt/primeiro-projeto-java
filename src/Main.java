//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int anoDeLancamento = 2014;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 4.2;
        double media = (9.5 + 8.5 + 7.5)/3; /*Calcular média do filme */

        String sinopse;
        sinopse = """
                    \n
                    John Wick é um lendário assassino de aluguel aposentado, lidando com o luto após perder o 
                    grande amor de sua vida. Quando um gângster invade sua casa, 
                    mata seu cachorro e rouba seu carro, ele é forçado 
                    a voltar à ativa e inicia sua vingança.
                    
                """;
        //casting
        int classificacao = (int) (media/2);


        // Output
        System.out.println("**** Esse é o Screen Match **** \n");
        System.out.println("Filme: John Wick");
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Nota do Filme " + notaDoFilme);
        System.out.println("A média do filme é: "+ media);
        System.out.println("Classificação do Filme: " + classificacao);
        System.out.println("Sinopse do Fileme: " + sinopse);

    }
}