import java.util.Scanner;

public class OtherLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Qual a sua avalição para esse filme ou digite -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1){
                mediaAvaliacao += nota;
                totalNotas ++;
            }else{
                System.out.println("Nota não informada!");

            }




        }
        System.out.println("Média de avaliações " + mediaAvaliacao / totalNotas);

    }
}
