public class Condicional {

    public static void main(String[] args) {
        int yearFilm = 2014;
        boolean incluidePlan = true;
        double scoreTheFilm = 8.1;
        String tipoPlano = "plus";

        if (yearFilm >= 2014) {
            System.out.println("Lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô vale à pena assistir!");
        }

        if (incluidePlan == true || tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado para o cliente.");
        } else {
            System.out.println("Cliente deverá locar o filme.");
        }

    }
}
