import br.curso.alura.desafio.formasde.Musicas;
import br.curso.alura.desafio.formasde.PodCasts;
import br.curso.alura.desafio.formasde.TempoAlbum;
import br.cursoalurajava.desafio.forma.Faixas;
import br.cursoalurajava.desafio.forma.SuaClassificacao;

public class Principal {
    public static void main(String[] args) {


        SuaClassificacao oQueAMediaDiz = new SuaClassificacao();
        TempoAlbum somaTempo = new TempoAlbum();

        Musicas novasMusicas = new Musicas();
        novasMusicas.cricao("Musicas para Sofrer", "Sertanejo","Bruno & Marrone", 20);
        novasMusicas.setAvalia(10);
        novasMusicas.setAvalia(10);
        novasMusicas.setAvalia(10);
        novasMusicas.setAvalia(10);


        novasMusicas.imprimi();
        oQueAMediaDiz.fazAlgo(novasMusicas);


        Faixas novaFaixaMusica1 = new Faixas();
        novaFaixaMusica1.criaFaixa(novasMusicas, "Cavalgada",  1, 3.42);
        Faixas novaFaixaMusica2 = new Faixas();
        novaFaixaMusica2.criaFaixa(novasMusicas, "Duas Vezes Você",  2, 3.47);
        somaTempo.somadorDeDuracao(novaFaixaMusica1);
        somaTempo.somadorDeDuracao(novaFaixaMusica2);

        somaTempo.somadorDeDuracao(novaFaixaMusica1);
        somaTempo.somadorDeDuracao(novaFaixaMusica2);
        System.out.println(String.format("Duração: %.1f ", somaTempo.getSomaDuracao()));

        novaFaixaMusica1.imprimiFaixa();
        novaFaixaMusica2.imprimiFaixa();


        System.out.println("========================================================================================");
        System.out.println("========================================================================================");
        System.out.println("========================================================================================");

        //============================================================================================================
        //============================================================================================================
        TempoAlbum somaTempo2 = new TempoAlbum();
        PodCasts novoPodCast = new PodCasts();
        novoPodCast.cricao("Aulas", "Historia", "Brasil, 10.000 AC", 10);
        novoPodCast.setAvalia(10);
        novoPodCast.setAvalia(9);
        novoPodCast.setAvalia(5);
        novoPodCast.setAvalia(8);

        novoPodCast.imprimi();
        oQueAMediaDiz.fazAlgo(novoPodCast);

        Faixas novaFaixaPodCast1 = new Faixas();
        novaFaixaPodCast1.criaFaixa(novoPodCast, "Descobrimento", 1, 125);

        Faixas novaFaixaPodCast2 = new Faixas();
        novaFaixaPodCast2.criaFaixa(novoPodCast, "Ciencia e Tecnologia", 2, 100);

        Faixas novaFaixaPodCast3 = new Faixas();
        novaFaixaPodCast3.criaFaixa(novoPodCast, "Culinaria e Antropofagia", 3, 145);
        somaTempo2.somadorDeDuracao(novaFaixaPodCast1);
        somaTempo2.somadorDeDuracao(novaFaixaPodCast2);
        somaTempo2.somadorDeDuracao(novaFaixaPodCast3);
        System.out.println(String.format("Duração: %.1f ", somaTempo2.getSomaDuracao()));

        novaFaixaPodCast1.imprimiFaixa();
        novaFaixaPodCast2.imprimiFaixa();
        novaFaixaPodCast3.imprimiFaixa();


    }
}
