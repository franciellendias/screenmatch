public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2023;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamentos que os clientes estão curtindo!");
        }else{
            System.out.println("Filme retrô que vale a pena assistir!");
    }
        if (incluidoNoPlano && tipoPlano.equals("plus")){ //qdo é String usa-se equals() ao inves de ==
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Precisa pagar a locação!");
        }
    }
}
