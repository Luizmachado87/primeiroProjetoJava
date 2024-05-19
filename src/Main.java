public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("O Jogo da Imitação");

        int yearFilm = 2014;
        System.out.println("O Ano de lançamento desse filme foi em " + yearFilm + "!");
        boolean incluidePlan = true;
        double scoreTheFilm = 8.1;

        double avaregeTheFilm = (9.8 + 7.3 + 8.0) / 3;
        System.out.println(avaregeTheFilm);
        String sinopse;
        sinopse = """
                Filme com Alla Turing.
                Pai da Matemática.
                Baseados em fatos reais.
                Filme de história sobre a Segunda Guerra Mundial de 1940! Lançado em: """ + yearFilm;
        System.out.println(sinopse);

        int classification = (int) (avaregeTheFilm /2);
        System.out.println(classification);
    }
}