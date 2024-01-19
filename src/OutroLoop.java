import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota !=-1) { //while: enquanto essa condição ser verdadeira ele faz o que estou solicitando
            System.out.println("Qual a sua avaliação para o filme? Ou digite -1 para encerrar ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas ++;
            }

        }
        System.out.println("Média de avaliações: " + mediaAvaliacao / totalDeNotas);


        leitura.close();
    }
}
