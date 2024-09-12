public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2014;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 4.2;

        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022) {
            System.out.println("Lançamentos");
        } else {
            System.out.println("Fimes Antigos");
        }

        if(incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Alugue o Filme!");
        };
    }
}
