public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3; //colocar parenteses para ordem das operaçoes - precedencia.
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filmes Top Gun
                Filme de aventura com galã dos anos 80
                Ano de lançamento: 
                """ + anoDeLancamento;
        System.out.println("Sinopse: " + sinopse);

        int classificacao = (int) (media / 2);
        System.out.println("Classificação: " + classificacao);


    }
}
