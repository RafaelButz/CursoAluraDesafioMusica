public class Principal {
    public static void main(String[] args) {
        Musicas novasMusicas = new Musicas();
        novasMusicas.cricao("Musicas para Sofrer", "Sertanejo","Bruno & Marrone", 20);
        novasMusicas.imprimi();

        PodCasts novoPodCast = new PodCasts();
        novoPodCast.cricao("Aulas", "Historia", "Brasil, 2000 AC", 10);
        novoPodCast.imprimi();

        Faixas novaFaixaMusica1 = new Faixas();
        novaFaixaMusica1.criaFaixa(novasMusicas, "Cavalgada",  1, 3.42);

        Faixas novaFaixaMusica2 = new Faixas();
        novaFaixaMusica2.criaFaixa(novasMusicas, "Duas Vezes Você",  2, 3.47);


    }
}
